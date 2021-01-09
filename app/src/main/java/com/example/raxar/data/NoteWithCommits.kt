package com.example.raxar.data

import androidx.room.Embedded
import androidx.room.Relation

data class NoteWithCommits(
    @Embedded val note: Note,
    @Relation(
        parentColumn = "id",
        entityColumn = "noteId"
    )
    val noteCommits: List<NoteCommit>
)