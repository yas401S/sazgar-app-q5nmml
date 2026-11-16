package com.magic.editor.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val ObsidianPrimary = Color(0xFF6366F1)
val ObsidianSecondary = Color(0xFFA855F7)
val ObsidianBackground = Color(0xFF0F172A)
val ObsidianSurface = Color(0xFF1E293B)
val ObsidianText = Color(0xFFF8FAFC)

private val DarkColorScheme = darkColorScheme(
    primary = ObsidianPrimary,
    secondary = ObsidianSecondary,
    background = ObsidianBackground,
    surface = ObsidianSurface,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = ObsidianText,
    onSurface = ObsidianText
)

@Composable
fun MagicEditorTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}
