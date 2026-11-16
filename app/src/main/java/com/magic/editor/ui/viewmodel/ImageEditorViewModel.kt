package com.magic.editor.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.magic.editor.data.AppDatabase
import com.magic.editor.data.EditHistoryEntity
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class ImageEditorViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = AppDatabase.getDatabase(application).editHistoryDao()

    val historyList: StateFlow<List<EditHistoryEntity>> = dao.getAllHistory()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    fun saveEdit(originalUrl: String, editedUrl: String, promptText: String) {
        viewModelScope.launch {
            val entity = EditHistoryEntity(
                originalImageUrl = originalUrl,
                editedImageUrl = editedUrl,
                prompt = promptText
            )
            dao.insertEdit(entity)
        }
    }

    fun deleteEdit(edit: EditHistoryEntity) {
        viewModelScope.launch {
            dao.deleteEdit(edit)
        }
    }

    fun clearAllHistory() {
        viewModelScope.launch {
            dao.clearHistory()
        }
    }
}
