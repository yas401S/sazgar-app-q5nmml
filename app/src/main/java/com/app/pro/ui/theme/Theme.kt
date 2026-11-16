package com.app.pro.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val AppColorScheme = darkColorScheme(
    primary = BrandPrimary,
    secondary = BrandSecondary,
    background = BrandBackground,
    surface = BrandSurface,
    onBackground = BrandTextPrimary,
    onSurface = BrandTextPrimary
)

@Composable
fun AppBrandTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        content = content
    )
}