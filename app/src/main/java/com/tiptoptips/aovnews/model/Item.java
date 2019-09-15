package com.tiptoptips.aovnews.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.tiptoptips.aovnews.constants.Constants;

@Entity(tableName = Constants.ITEM_TABLE)
public class Item {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = Constants.ITEM_NAME)
    private String itemName;
    @ColumnInfo(name = Constants.ITEM_RECIPE)
    private String itemRecipe;
    @ColumnInfo(name = Constants.ITEM_BUILDS_INTO)
    private String itemBuildsInto;
    @ColumnInfo(name = Constants.ITEM_GOLD)
    private int itemGold;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemRecipe() {
        return itemRecipe;
    }

    public void setItemRecipe(String itemRecipe) {
        this.itemRecipe = itemRecipe;
    }

    public String getItemBuildsInto() {
        return itemBuildsInto;
    }

    public void setItemBuildsInto(String itemBuildsInto) {
        this.itemBuildsInto = itemBuildsInto;
    }

    public int getItemGold() {
        return itemGold;
    }

    public void setItemGold(int itemGold) {
        this.itemGold = itemGold;
    }
}
