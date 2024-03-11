package co.pacastrillonp.dogedex.common.network

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Data(
    val dogs: List<DogResponse>
)