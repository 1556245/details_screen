package com.mkaram.firstcomposeproject.domain.usecase

import com.mkaram.firstcomposeproject.domain.model.GithubReposDomainModel
import com.mkaram.firstcomposeproject.domain.repository.GithubRepository
import javax.inject.Inject

class FetchGithubReposListUseCase @Inject constructor(
    private val githubRepository: GithubRepository
) {
    operator fun invoke ():List<GithubReposDomainModel>{
        return githubRepository.fetchGithubRepos()
    }
}