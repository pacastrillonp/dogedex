package co.pacastrillonp.dogedex.presentables.mappers

import co.pacastrillonp.dogedex.common.network.DogsResponse
import co.pacastrillonp.dogedex.presentables.Dog

fun DogsResponse.dogsResponseToDogs(): List<Dog> {
    return this.data.dogs.map {
        Dog(
            id = it.id,
            index = it.index,
            name = it.nameEn,
            type = it.dogType,
            heightFemale = it.heightFemale,
            heightMale = it.heightMale,
            imageUrl = it.imageUrl,
            lifeExpectancy = it.lifeExpectancy,
            temperament = it.temperament,
            weightFemale = it.weightFemale,
            weightMale = it.weightMale,
        )
    }
}