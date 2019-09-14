package com.tiptoptips.aovnews.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.tiptoptips.aovnews.constants.Constants;

@Entity
public class Item {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = Constants.ITEM_NAME)
    private String itemName;
}
