package com.moises.androidcoursetecnm.characters.domain.repository

import com.moises.androidcoursetecnm.characters.domain.model.Character

interface CharactersRepository {
    suspend fun retrieveAllCharacters(): List<Character>
}