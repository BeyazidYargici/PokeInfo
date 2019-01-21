package com.beyazidyargici.pokeinfo.ui.battle_arena

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.beyazidyargici.pokeinfo.R
import com.beyazidyargici.pokeinfo.base.ScopedFragment
import javax.inject.Inject

class BattleArenaFragment : ScopedFragment() {

    companion object {
        fun newInstance() = BattleArenaFragment()
    }

    @Inject
    private lateinit var battleArenaVMFactory: BattleArenaVMFactory
    private lateinit var viewModel: BattleArenaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fr_battle_arena, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, this.battleArenaVMFactory).get(BattleArenaViewModel::class.java)
    }

}
