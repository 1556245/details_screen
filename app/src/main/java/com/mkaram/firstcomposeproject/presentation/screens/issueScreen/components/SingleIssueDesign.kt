package com.mkaram.firstcomposeproject.presentation.screens.issueScreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.mkaram.firstcomposeproject.R
import com.mkaram.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import com.mkaram.firstcomposeproject.ui.theme.shapes

@Composable
fun SingleIssueDesign(
    issue: Issue
) {
    Card(
        shape = shapes.large,
        elevation = CardDefaults.cardElevation(dimensionResource(id = R.dimen.padding_10dp)),
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),



    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_8dp))
        ) {
            // custom icon
            IssueIcon(vector = issue.icon, modifier = Modifier)

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = dimensionResource(id = R.dimen.padding_8dp))

            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        modifier = Modifier.weight(3f),
                        text = issue.title,
                        style = MaterialTheme.typography.titleLarge,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    Text(
                        text = stringResource(id = R.string.open),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.End
                    )
                }

                Text(
                    text = issue.subtitle,
                    modifier = Modifier.padding(vertical = dimensionResource(id = R.dimen.padding_16dp))
                )

                Row {

                    Text(
                        text = stringResource(id = R.string.created_at),
                        fontWeight = FontWeight.Bold
                    )

                    Text(text = issue.date)
                }

            }

        }
    }
}

@Composable
fun IssueIcon(vector: ImageVector, modifier: Modifier) {
    Icon(
        imageVector = vector,
        contentDescription = stringResource(id = R.string.icon_description),
        modifier.size(dimensionResource(id = R.dimen.icon_size))
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewSingleIssueDesign() {
    FirstComposeProjectTheme {
        SingleIssueDesign(issueList[0])
    }
}