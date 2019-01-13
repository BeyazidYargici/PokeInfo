package com.beyazidyargici.pokeinfo.util

import androidx.room.TypeConverter
import com.beyazidyargici.pokeinfo.data.response.PokemonResult
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.*

/**
 *  Created by beyazid on 12.01.2019.
 */
class Converter {
    private val gson = Gson()
    @TypeConverter
    fun stringToList(data: String?): List<PokemonResult> {
        if (data == null) {
            return Collections.emptyList()
        }

        val listType = object : TypeToken<List<PokemonResult>>() {

        }.type

        return gson.fromJson<List<PokemonResult>>(data, listType)
    }

    @TypeConverter
    fun listToString(someObjects: List<PokemonResult>): String {
        return gson.toJson(someObjects)
    }

}