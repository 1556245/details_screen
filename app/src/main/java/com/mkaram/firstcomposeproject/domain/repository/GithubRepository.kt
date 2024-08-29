package com.mkaram.firstcomposeproject.domain.repository

import com.mkaram.firstcomposeproject.domain.model.GithubReposDomainModel

interface GithubRepository {

    fun fetchGithubRepos(): List<GithubReposDomainModel>

}