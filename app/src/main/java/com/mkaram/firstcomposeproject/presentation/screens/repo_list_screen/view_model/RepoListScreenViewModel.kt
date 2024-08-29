package com.mkaram.firstcomposeproject.presentation.screens.repo_list_screen.view_model

import androidx.lifecycle.ViewModel
import com.mkaram.firstcomposeproject.domain.usecase.FetchGithubReposListUseCase
import javax.inject.Inject


class RepoListScreenViewModel @Inject constructor(
    private val fetchGithubReposUseCase : FetchGithubReposListUseCase
):ViewModel() {
    fun requestGithubRepoList (){
        //loading
        val data = fetchGithubReposUseCase.invoke()
        //result

    }
}