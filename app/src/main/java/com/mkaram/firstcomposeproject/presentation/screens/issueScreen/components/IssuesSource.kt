package com.mkaram.firstcomposeproject.presentation.screens.issueScreen.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.ui.graphics.vector.ImageVector

data class Issue(
    val icon: ImageVector,
    val title : String,
    val subtitle : String,
    val date : String
)

val issueList = listOf(
    Issue(icon = Icons.Outlined.CheckCircle,title = "Bump payarrow from 74483", subtitle = "NONE", date = "2023-9-20,3:10"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "Francis", subtitle = "NONE", date = "2023-9-22,5:10"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "Bump werkzueg from 74483", subtitle = "NONE", date = "2023-10-2,3:10"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "Bump urllib3 from 74483", subtitle = "NONE", date = "2023-10-18,4:10"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "ARQA fine tuning with 38283", subtitle = "NONE", date = "2023-11-27,5:16"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "Bump pillow from 9.2", subtitle = "NONE", date = "2023-11-29,8:40"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "T", subtitle = "NONE", date = "2023-12-2,8:50"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "German", subtitle = "NONE", date = "2023-12-12,1:40"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "Bump payarrow from 74483", subtitle = "NONE", date = "2023-9-20,3:10"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "Francis", subtitle = "NONE", date = "2023-9-22,5:10"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "Bump werkzueg from 74483", subtitle = "NONE", date = "2023-10-2,3:10"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "Bump urllib3 from 74483", subtitle = "NONE", date = "2023-10-18,4:10"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "ARQA fine tuning with 38283", subtitle = "NONE", date = "2023-11-27,5:16"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "Bump pillow from 9.2", subtitle = "NONE", date = "2023-11-29,8:40"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "T", subtitle = "NONE", date = "2023-12-2,8:50"),
    Issue(icon = Icons.Outlined.CheckCircle,title = "German", subtitle = "NONE", date = "2023-12-12,1:40"),
)