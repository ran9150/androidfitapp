package com.example.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppScreen() {
    Scaffold(
        topBar = { SmallTopAppBar(title = { Text("Fitness Pro") }) }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding).padding(16.dp)) {
            item { Text("Your Training Programs", style = MaterialTheme.typography.headlineMedium) }
            item { Spacer(modifier = Modifier.height(16.dp)) }
            items(3) { index ->
                Card(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Program ${index + 1}", style = MaterialTheme.typography.titleLarge)
                        Text("Focus: Strength & Conditioning", style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}