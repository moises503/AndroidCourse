package com.moises.androidcoursetecnm.characters.domain.repository

import com.moises.androidcoursetecnm.characters.data.CharactersDataSource
import com.moises.androidcoursetecnm.characters.domain.model.Character
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(private val charactersDataSource: CharactersDataSource) : CharactersRepository {
    override suspend fun retrieveAllCharacters(): List<Character> =
            charactersDataSource.attemptToRetrieveCharacters()
}