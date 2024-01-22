package ostis.jesc.client.model.request

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import ostis.jesc.client.model.request.payload.ScRequestPayload

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonInclude(JsonInclude.Include.NON_NULL)
class ScRequestImpl<T: ScRequestPayload>(
    override val id: Long,
    override val type: ScRequestType,
    override val payload: T
) : ScRequest<T>