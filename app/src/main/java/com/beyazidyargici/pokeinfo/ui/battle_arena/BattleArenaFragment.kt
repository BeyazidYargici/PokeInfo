package com.beyazidyargici.pokeinfo.ui.battle_arena

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.beyazidyargici.pokeinfo.R
import com.beyazidyargici.pokeinfo.base.ScopedFragment

class BattleArenaFragment : ScopedFragment() {

    companion object {
        fun newInstance() = BattleArenaFragment()
    }

    private lateinit var viewModel: BattleArenaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fr_battle_arena, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BattleArenaViewModel::class.java)
    }

}
