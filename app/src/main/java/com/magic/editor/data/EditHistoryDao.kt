package com.magic.editor.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface EditHistoryDao {
    @Query("SELECT * FROM edit_history ORDER BY timestamp DESC")
    fun getAllHistory(): Flow<List<EditHistoryEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEdit(edit: EditHistoryEntity)

    @Delete
    suspend fun deleteEdit(edit: EditHistoryEntity)

    @Query("DELETE FROM edit_history")
    suspend fun clearHistory()
}
