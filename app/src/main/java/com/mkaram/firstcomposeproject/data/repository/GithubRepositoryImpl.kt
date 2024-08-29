package com.mkaram.firstcomposeproject.data.repository

import com.mkaram.firstcomposeproject.data.data_source.remote.GithubRemoteDataSource
import com.mkaram.firstcomposeproject.domain.model.GithubReposDomainModel
import com.mkaram.firstcomposeproject.domain.repository.GithubRepository

class GithubRepositoryImpl(
    private val githubRemoteDataSource : GithubRemoteDataSource
):GithubRepository {
    override fun fetchGithubRepos(): List<GithubReposDomainModel> {
        return emptyList()
    }
}