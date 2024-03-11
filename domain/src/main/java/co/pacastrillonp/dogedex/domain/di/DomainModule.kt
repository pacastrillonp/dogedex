package co.pacastrillonp.dogedex.domain.di

import co.pacastrillonp.dogedex.domain.repository.ApiRepository
import co.pacastrillonp.dogedex.domain.usecases.FetchDogsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    fun provideFetchDogsUseCase(
        apiRepository: ApiRepository
    ): FetchDogsUseCase {
        return FetchDogsUseCase(
            apiRepository
        )
    }
}