package com.moises.androidcoursetecnm.characters.framework.presentation

import com.moises.androidcoursetecnm.characters.domain.model.Character

sealed class CharactersViewState {
    object Loading : CharactersViewState()
    data class Success(val list : List<Character>): CharactersViewState()
    data class Error(val error: String): CharactersViewState()
}