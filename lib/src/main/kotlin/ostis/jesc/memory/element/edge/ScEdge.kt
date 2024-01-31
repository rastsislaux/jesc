package ostis.jesc.memory.element.edge

import ostis.jesc.memory.common.ScTriplet
import ostis.jesc.memory.element.ScElement

interface ScEdge: ScElement {
    fun getSource(): ScElement
    fun getTarget(): ScElement
    fun getTriplet(): ScTriplet
}