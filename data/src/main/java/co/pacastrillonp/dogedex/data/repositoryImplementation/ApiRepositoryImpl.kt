package co.pacastrillonp.dogedex.data.repositoryImplementation

import co.pacastrillonp.dogedex.common.network.DogsResponse
import co.pacastrillonp.dogedex.data.network.ApiService
import co.pacastrillonp.dogedex.domain.repository.ApiRepository
import javax.inject.Singleton

@Singleton
class ApiRepositoryImpl(private val apiService: ApiService) : ApiRepository {
    override suspend fun getAllDogs(): DogsResponse {
        return apiService.getAllDogs()
    }
}