package com.moises.androidcoursetecnm.characters.framework.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.moises.androidcoursetecnm.R
import com.moises.androidcoursetecnm.characters.framework.presentation.CharactersViewModel
import com.moises.androidcoursetecnm.core.ui.viewBinding
import com.moises.androidcoursetecnm.databinding.FragmentCharactersBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharactersFragment : Fragment(R.layout.fragment_characters) {

    private val dashboardViewModel: CharactersViewModel by viewModels()
    private val binding: FragmentCharactersBinding by viewBinding(FragmentCharactersBinding::bind)

}