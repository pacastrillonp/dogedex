package co.pacastrillonp.dogedex.common.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DogResponse(
    val id: Int,
    @Json(name = "dog_type") val dogType: String,
    @Json(name = "height_female") val heightFemale: String,
    @Json(name = "height_male") val heightMale: String,
    @Json(name = "image_url") val imageUrl: String,
    val index: Int,
    @Json(name = "life_expectancy") val lifeExpectancy: String,
    @Json(name = "name_en") val nameEn: String,
    @Json(name = "name_es") val nameEs: String,
    val temperament: String,
    @Json(name = "temperament_en") val temperamentEn: String,
    @Json(name = "weight_female") val weightFemale: String,
    @Json(name = "weight_male") val weightMale: String,
    @Json(name = "created_at") val createdAt: String,
    @Json(name = "updated_at") val updatedAt: String,
    @Json(name = "ml_id") val mlId: String
)