package co.pacastrillonp.dogedex.common.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data(
    @Json(name = "dogs") val dogs: List<Dog>
)