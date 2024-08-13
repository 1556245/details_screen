package com.mkaram.firstcomposeproject.presentation.screens.repoListScreen

data class GithubRepoUiModel(
    val id : Int ,
    val name : String,
    val avatar : String,
    val description : String,
    val stars : String,
    val owner : String
)
