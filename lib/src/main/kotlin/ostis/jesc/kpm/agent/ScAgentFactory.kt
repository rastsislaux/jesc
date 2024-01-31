package ostis.jesc.kpm.agent

import ostis.jesc.memory.ScMemory

fun interface ScAgentFactory {
    fun make(ctx: ScMemory): ScAgent
}