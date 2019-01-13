package com.beyazidyargici.pokeinfo.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by beyazid on 12.01.2019.
 */
@Entity(tableName = "dummy")
public class DummyEntity {

    @PrimaryKey(autoGenerate = false)
    private int id = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
