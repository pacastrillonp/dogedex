package co.pacastrillonp.dogedex.data.di

import co.pacastrillonp.dogedex.data.network.ApiService
import co.pacastrillonp.dogedex.data.repositoryImplementation.ApiRepositoryImpl
import co.pacastrillonp.dogedex.domain.repository.ApiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideApiRepository(apiService: ApiService): ApiRepository {
        return ApiRepositoryImpl(apiService)
    }

}