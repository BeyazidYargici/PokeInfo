package com.beyazidyargici.pokeinfo.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.beyazidyargici.pokeinfo.data.response.PokemonResult
import com.beyazidyargici.pokeinfo.util.Converter
import com.google.gson.annotations.SerializedName
import org.threeten.bp.Instant
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneId
import org.threeten.bp.ZonedDateTime

const val ALL_POKE_ID = 0

@Entity(tableName = "pokemon_table")
data class AllPokemonEntity(

	@field:SerializedName("next")
	val next: String? = null,

	@field:SerializedName("previous")
	val previous: String? = null,

	@field:SerializedName("count")
	val count: Int? = null,

	@TypeConverters(Converter::class)
	@field:SerializedName("results")
	public var results: List<PokemonResult> = listOf()
){
	@PrimaryKey(autoGenerate = false)
	var id: Int = ALL_POKE_ID

	val zonedDatedTime : ZonedDateTime
		get() {
			return ZonedDateTime.ofInstant(Instant.EPOCH, ZoneId.systemDefault())
		}

}