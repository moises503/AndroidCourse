package com.moises.androidcoursetecnm.characters.data

import com.moises.androidcoursetecnm.characters.domain.model.Character

interface CharactersDataSource {
    suspend fun attemptToRetrieveCharacters(): List<Character>
}