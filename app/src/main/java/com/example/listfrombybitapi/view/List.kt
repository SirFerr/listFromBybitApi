package com.example.listfrombybitapi.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.listfrombybitapi.viewmodel.BybitViewModel

@Composable
fun list(bybitViewModel: BybitViewModel) {

    val announcements by bybitViewModel.announcement.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LazyColumn() {
            announcements.result.list.forEach {
                item {
                    listItem(it)
                    Divider(color = Color.Black, thickness = 1.dp)
                }
            }


        }
    }
    DisposableEffect(Unit) {
        bybitViewModel.getAnnouncements()
        onDispose {}
    }
}