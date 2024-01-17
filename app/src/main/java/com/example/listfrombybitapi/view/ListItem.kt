package com.example.listfrombybitapi.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.listfrombybitapi.model.Item


@Composable
fun listItem(item: Item) {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = item.title, modifier = Modifier.padding(10.dp))
        Text(text = item.description, modifier = Modifier.padding(10.dp))
        Text(text = item.url, modifier = Modifier.padding(10.dp))

    }
}