package com.tiptoptips.aovnews.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.tiptoptips.aovnews.constants.Constants;
import com.tiptoptips.aovnews.model.Ability;
import com.tiptoptips.aovnews.model.Hero;
import com.tiptoptips.aovnews.model.Item;

import java.util.List;

@Dao
public interface GameDao {

    @Insert
    void insertHero(Hero... heroes);

    @Insert
    void insertItem(List<Item> itemList);

    @Insert
    void insertAbility(List<Ability> abilityList);

    @Query("SELECT * FROM " + Constants.HERO_TABLE)
    LiveData<List<Hero>> getHeroList();

    @Query("SELECT * FROM " + Constants.HERO_TABLE + " WHERE id = :id")
    Hero getHero(int id);
}
