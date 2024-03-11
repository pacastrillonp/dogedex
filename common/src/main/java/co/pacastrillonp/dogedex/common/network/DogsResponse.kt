package co.pacastrillonp.dogedex.common.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DogsResponse(
    @Json(name = "data") val data: Data,
    @Json(name = "is_success") val isSuccess: Boolean,
    @Json(name = "message") val message: String
)