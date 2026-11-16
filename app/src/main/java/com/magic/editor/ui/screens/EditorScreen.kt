package com.magic.editor.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditorScreen() {
    var prompt by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("ویرایشگر جادویی عکس") })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            OutlinedTextField(
                value = prompt,
                onValueChange = { prompt = it },
                label = { Text("دستور خود را برای ویرایش عکس وارد کنید...") },
                modifier = Modifier.fillMaxWidth()
            )
            Button(
                onClick = { /* اجرای هوش مصنوعی */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("تولید و اعمال تغییرات")
            }
        }
    }
}