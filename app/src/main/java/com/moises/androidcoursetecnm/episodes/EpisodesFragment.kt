package com.moises.androidcoursetecnm.episodes

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.moises.androidcoursetecnm.R
import com.moises.androidcoursetecnm.core.ui.viewBinding
import com.moises.androidcoursetecnm.databinding.FragmentEpisodesBinding

class EpisodesFragment : Fragment(R.layout.fragment_episodes) {
    private val episodesViewModel: EpisodesViewModel by viewModels()
    private val binding: FragmentEpisodesBinding by viewBinding(FragmentEpisodesBinding::bind)
}