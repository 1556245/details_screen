package com.mkaram.firstcomposeproject.presentation.screens.reposScreen.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RepoDetailsItem(
    title : String,
    icon: @Composable () -> Unit
) {
    Row {
        Text(text = title, modifier = Modifier.padding(end = 16.dp))
        icon()
    }
}