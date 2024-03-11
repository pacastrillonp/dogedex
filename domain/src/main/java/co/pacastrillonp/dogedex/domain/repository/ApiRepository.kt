package co.pacastrillonp.dogedex.domain.repository

import co.pacastrillonp.dogedex.common.network.DogsResponse

interface ApiRepository {

    suspend fun getAllDogs(): DogsResponse
}