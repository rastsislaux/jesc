package ostis.jesc.client.model.response

import com.fasterxml.jackson.annotation.JsonInclude
import ostis.jesc.client.model.response.payload.ScResponsePayload

@JsonInclude(JsonInclude.Include.NON_NULL)
open class ScResponseImpl<T: ScResponsePayload>(
    override val id: Long,
    override val status: Boolean,
    override val event: Boolean,
    override val payload: T?,
) : ScResponse<T>