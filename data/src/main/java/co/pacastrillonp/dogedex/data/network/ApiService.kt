package co.pacastrillonp.dogedex.data.network

import co.pacastrillonp.dogedex.common.environment.Constants.Api.DOGS
import co.pacastrillonp.dogedex.common.network.DogsResponse
import retrofit2.http.GET

interface ApiService {
    @GET(DOGS)
    suspend fun getAllDogs(): DogsResponse
}