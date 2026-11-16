package com.magic.editor.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "edit_history")
data class EditHistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val originalImageUrl: String,
    val editedImageUrl: String,
    val prompt: String,
    val timestamp: Long = System.currentTimeMillis()
)
