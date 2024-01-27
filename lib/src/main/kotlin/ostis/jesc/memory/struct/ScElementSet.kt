package ostis.jesc.memory.struct

import ostis.jesc.memory.ScMemory
import ostis.jesc.memory.element.BaseScElement
import ostis.jesc.memory.element.ScElement

interface ScElementSet: ScElement, MutableSet<ScElement> {
    val node: ScElement
}

class ScElementSetImpl(memory: ScMemory, override val node: ScElement): BaseScElement(memory, node.addr), ScElementSet {

    override fun add(element: ScElement): Boolean {
        TODO("Not yet implemented")
    }

    override fun addAll(elements: Collection<ScElement>): Boolean {
        TODO("Not yet implemented")
    }

    override fun clear() {
        TODO("Not yet implemented")
    }

    override fun iterator(): MutableIterator<ScElement> {
        TODO("Not yet implemented")
    }

    override fun remove(element: ScElement): Boolean {
        TODO("Not yet implemented")
    }

    override fun removeAll(elements: Collection<ScElement>): Boolean {
        TODO("Not yet implemented")
    }

    override fun retainAll(elements: Collection<ScElement>): Boolean {
        TODO("Not yet implemented")
    }

    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: ScElement): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<ScElement>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

}
