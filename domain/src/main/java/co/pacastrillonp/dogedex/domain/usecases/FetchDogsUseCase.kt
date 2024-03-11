package co.pacastrillonp.dogedex.domain.usecases

import co.pacastrillonp.dogedex.common.network.DogsResponse
import co.pacastrillonp.dogedex.domain.repository.ApiRepository
import javax.inject.Inject

class FetchDogsUseCase @Inject constructor(
    private val apiRepository: ApiRepository
) : BaseUseCase<DogsResponse>() {
    override suspend fun execute(): DogsResponse {
        return apiRepository.getAllDogs()
    }
}