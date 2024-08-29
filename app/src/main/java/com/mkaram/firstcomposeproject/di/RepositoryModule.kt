package com.mkaram.firstcomposeproject.di

import com.mkaram.firstcomposeproject.data.data_source.remote.GithubRemoteDataSource
import com.mkaram.firstcomposeproject.data.repository.GithubRepositoryImpl
import com.mkaram.firstcomposeproject.domain.repository.GithubRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideGithubRepository (
       remoteDataSource: GithubRemoteDataSource
    ):GithubRepository{
        return GithubRepositoryImpl(remoteDataSource)
    }
}