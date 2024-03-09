package co.pacastrillonp.dogedex.presentables

data class Dog(
    val id: Int,
    val index: Int,
    val name: String,
    val type: String,
    val heightFemale: Double,
    val heightMale: Double,
    val imageUrl: String,
    val lifeExpectancy: String,
    val temperature: String,
    val weightFemale: Double,
    val weightMale: Double
)