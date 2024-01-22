package ostis.jesc.api

import ostis.jesc.api.builder.*
import ostis.jesc.client.ScClient
import java.util.concurrent.atomic.AtomicLong

class ScApiImpl(
    override val client: ScClient
): ScApi {

    private val idCounter = AtomicLong(0)

    override fun makeId(): Long = idCounter.incrementAndGet()

    override fun createElements() = CreateElementsBuilderImpl(this)
    override fun searchByTemplate() = SearchByTemplateBuilderImpl(this)
    override fun events() = EventsBuilderImpl(this)
    override fun checkElements() = CheckElementsBuilderImpl(this)
    override fun deleteElements() = DeleteElementsBuilderImpl(this)
    override fun keynodes() = KeynodesBuilderImpl(this)
    override fun content() = ContentBuilderImpl(this)

    override fun close() {
        client.close()
    }

}