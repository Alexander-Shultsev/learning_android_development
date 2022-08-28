package com.example.layoutmusicapp.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.layoutmusicapp.ui.component.MainTopAppBar
import com.example.layoutmusicapp.ui.component.TabWidget
import com.example.layoutmusicapp.ui.theme.LayoutMusicAppTheme
import com.example.layoutmusicapp.viewmodel.AddSongsViewModel

@Composable
fun AddSongsScreen(addSongsViewModel: AddSongsViewModel = viewModel()) {
    val selectedTab by addSongsViewModel.selectedTab.observeAsState(0)

    LayoutMusicAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            LazyColumn {
                item { MainTopAppBar() }
                item {
                    TabWidget(
                        items = addSongsViewModel.tabElem,
                        addSongsViewModel = addSongsViewModel)
                }
                item {
                    when(selectedTab) {
                        0 -> Text("0")
                        1 -> Text("1")
                        2 -> Text("2")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LayoutMusicAppTheme {
        AddSongsScreen()
    }
}