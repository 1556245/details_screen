package com.mkaram.firstcomposeproject.presentation.screens.issues_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mkaram.firstcomposeproject.R
import com.mkaram.firstcomposeproject.presentation.commonComponents.RepoAppBar
import com.mkaram.firstcomposeproject.presentation.screens.issues_screen.components.SingleIssueDesign
import com.mkaram.firstcomposeproject.presentation.screens.issues_screen.components.issueList
import com.mkaram.firstcomposeproject.ui.theme.FirstComposeProjectTheme

@Composable
fun AllIssueScreen(
    onClickBack : ()->Unit
) {

    Column {
        RepoAppBar(title = R.string.issues_appbar_title,
            onBackButtonClicked = onClickBack
            )
        LazyColumn(
            modifier = Modifier.padding(dimensionResource(id = R.dimen.lazy_column_padding)),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ){
            items(issueList){
                SingleIssueDesign(issue = it, modifier = Modifier)
            }
        }
    }
}







@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewAllIssueScreen() {
    FirstComposeProjectTheme {
        AllIssueScreen(onClickBack = {})
    }
}