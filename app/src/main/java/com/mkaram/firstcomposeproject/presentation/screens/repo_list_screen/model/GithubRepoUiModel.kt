package com.mkaram.firstcomposeproject.presentation.screens.repo_list_screen.model

data class GithubRepoUiModel(
    val id : Int ,
    val name : String,
    val avatar : String,
    val description : String,
    val stars : String,
    val owner : String
)