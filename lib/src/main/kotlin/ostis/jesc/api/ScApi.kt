package ostis.jesc.api

import ostis.jesc.api.builder.*
import ostis.jesc.client.ScClient
import java.io.Closeable

interface ScApi: Closeable {
    val client: ScClient
    fun makeId(): Long

    fun createElements(): CreateElementsBuilder
    fun checkElements(): CheckElementsBuilder
    fun deleteElements(): DeleteElementsBuilder
    fun searchByTemplate(): SearchByTemplateBuilder
    fun events(): EventsBuilder
    fun keynodes(): KeynodesBuilder
    fun content(): ContentBuilderImpl
}