package com.example.layoutmusicapp.ui.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutmusicapp.R

@Composable
fun MainTopAppBar() {
    TopAppBar(
        title = { Title1("Add Songs") },
        navigationIcon = {
            IconButton(
                onClick = { /* doSomething() */ },
                content = {
                    Icon(
                        painterResource(id = R.drawable.ic_back),
                        contentDescription = null,
                        modifier = Modifier.size(22.dp))
                })
        },
        actions = {
            IconButton(
                onClick = { /* doSomething() */ },
                content = {
                    Icon(
                        painterResource(id = R.drawable.ic_search),
                        contentDescription = null,
                        modifier = Modifier.size(22.dp))
                })
        },
        modifier = Modifier
            .height(60.dp),
        backgroundColor = Color.White,
        contentColor = Color.Black,
        elevation = 0.dp
    )
}
