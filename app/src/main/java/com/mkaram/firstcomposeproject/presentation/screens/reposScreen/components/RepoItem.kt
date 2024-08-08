package com.mkaram.firstcomposeproject.presentation.screens.reposScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mkaram.firstcomposeproject.R

@Composable
fun RepoItem() {
    Row(
        Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(12.dp))

    ) {

        Image(
            painter = painterResource(id = R.drawable.ruby),
            contentDescription = "this is Ruby",
            modifier = Modifier
                .size(50.dp)
                .padding(8.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Column(

        ) {
            Row(
                Modifier
                    .padding(end = 6.dp)
                    .fillMaxWidth(),

                verticalAlignment = Alignment.CenterVertically,

                ) {
                Text(
                    text = "ruby", modifier = Modifier
                        .weight(1f)
                        .padding(top = 4.dp), color = Color.Red
                )
                Text(text = "20981", modifier = Modifier.padding(top = 4.dp, end = 4.dp))
                Image(
                    painter = painterResource(id = R.drawable.star_ic),
                    contentDescription = "this is star icon",
                    modifier = Modifier.size(30.dp),
                    colorFilter = ColorFilter.tint(Color.Yellow)
                )

            }
            Text(text = "Repo owner", Modifier.padding(top = 6.dp))
            Text(
                text = "ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby ruby",
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(top = 6.dp, end = 6.dp)
            )

        }
    }
}

@Preview
@Composable
fun PreviewRepoItem() {
    RepoItem()
}