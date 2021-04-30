package com.moises.androidcoursetecnm.characters.framework.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moises.androidcoursetecnm.characters.domain.repository.CharactersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

@HiltViewModel
class CharactersViewModel(private val charactersRepository: CharactersRepository)
    : ViewModel() {
    private var _charactersViewState = MutableLiveData<CharactersViewState>()
    val charactersViewState: LiveData<CharactersViewState> get() = _charactersViewState

    fun getAllCharacters() {
        _charactersViewState.postValue(CharactersViewState.Loading)
        viewModelScope.launch {
            runCatching {
                charactersRepository.retrieveAllCharacters()
            }.onSuccess { characters ->
                _charactersViewState.postValue(CharactersViewState.Success(characters))
            }.onFailure {
                _charactersViewState.postValue(CharactersViewState.Error(it.localizedMessage
                        ?: "Couldn't retrieve characters information"))
            }
        }
    }
}