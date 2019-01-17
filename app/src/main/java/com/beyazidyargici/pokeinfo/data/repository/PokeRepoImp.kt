package com.beyazidyargici.pokeinfo.data.repository

import androidx.lifecycle.LiveData
import com.beyazidyargici.pokeinfo.data.dao.AllPokemonDao
import com.beyazidyargici.pokeinfo.data.data_source.PokemonDataSource
import com.beyazidyargici.pokeinfo.data.db.entity.AllPokemonEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.threeten.bp.ZonedDateTime
import javax.inject.Inject
import javax.inject.Singleton

/**
 *  Created by beyazid on 12.01.2019.
 */
@Singleton
class PokeRepoImp @Inject constructor(private val allPokemonDao: AllPokemonDao, private val pokemonDataSource: PokemonDataSource) : PokeRepo {

    override suspend fun getAllPoke(): LiveData<AllPokemonEntity> {
        return withContext(Dispatchers.IO){
            initPokeData()
            allPokemonDao.getAll()
        }
    }

    init {
        //observeForever because PokeRepoImp has no lifecycle
        pokemonDataSource.fetchedAllPoke.observeForever { recentlyFetched->
            //persist
            persistFetchedPoke(recentlyFetched)
        }
    }

    private suspend fun initPokeData() {
        val lastFetchAllPoke = allPokemonDao.getAll().value

        //todo add time difference to condition
        if (lastFetchAllPoke == null) {
            fetchAllPoke()
            return
        }

//        if (isFetchNeeded(lastFetchAllPoke.zonedDatedTime)) {
//            getAllPoke()
//        }
    }

    private suspend fun fetchAllPoke(){
        pokemonDataSource.fetchCurrentAllPoke()
    }

    private fun isFetchNeeded(lastFetchedTime: ZonedDateTime) : Boolean{
        val thirtyMinsAgo = ZonedDateTime.now().minusMinutes(30)
        return lastFetchedTime.isBefore(thirtyMinsAgo)
    }

    private fun persistFetchedPoke(allPokemonEntity: AllPokemonEntity) {
        // GlobalScope for coroutine. We use GlobalScope because this class different from fragments. This class has no lifecycle
        GlobalScope.launch(Dispatchers.IO) {
            allPokemonDao.upsert(allPokemonEntity)
        }
    }

}