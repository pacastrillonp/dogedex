package co.pacastrillonp.dogedex.common.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DogsResponse(
    val message: String,
    @Json(name = "is_success") val isSuccess: Boolean,
    val data: Data
)