package ostis.jesc.kpm.agent

import ostis.jesc.kpm.ScResult
import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.element.ScElement
import ostis.jesc.memory.element.edge.ScEdge
import ostis.jesc.memory.element.edge.ScEdgeType
import ostis.jesc.memory.element.node.ScNode
import ostis.jesc.memory.struct.ScElementSet

abstract class FinalizedScAgent(protected val memory: ScMemory): ScAgent {

    open val name = this::class.qualifiedName

    override fun trigger(listenElement: ScElement, edge: ScEdge, otherElement: ScElement) {
        val result = onEvent(listenElement, edge, otherElement)
        finalize(otherElement, result)
    }

    abstract fun onEvent(listenElement: ScElement, edge: ScEdge, otherElement: ScElement): ScAgentResult

    private fun finalize(questionNode: ScNode, result: ScResult) {
        memory.get().node("question_finished")
            .edges().create().to(questionNode, ScEdgeType.ACCESS_CONST_POS_PERM)

        memory.get().node(if (result.isSuccess) "question_finished_successfully" else "question_finished_unsuccessfully")
            .edges().create().to(questionNode, ScEdgeType.ACCESS_CONST_POS_PERM)
    }

    private fun finalize(questionNode: ScNode, answerElements: ScElementSet, result: ScResult) {
        val nrelAnswer = memory.get().node("nrel_answer")

        val edgeToAnswer = questionNode.edges().create().to(answerElements, ScEdgeType.D_COMMON_CONST)
        nrelAnswer.edges().create().to(edgeToAnswer, ScEdgeType.ACCESS_CONST_POS_PERM)

        finalize(questionNode, result)
    }

    private fun finalize(questionNode: ScElement, result: ScAgentResult) {
        if (questionNode !is ScNode) {
            return
        }

        if (result.answerElements == null) {
            finalize(questionNode, result.result)
        } else {
            finalize(questionNode, result.answerElements, result.result)
        }
    }

    data class ScAgentResult(
        val result: ScResult,
        val answerElements: ScElementSet? = null
    )

}
