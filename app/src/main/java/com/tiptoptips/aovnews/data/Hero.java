package com.tiptoptips.aovnews.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.tiptoptips.aovnews.constants.Constants;

@Entity
public class Hero {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = Constants.HERO_AVATAR)
    private String heroAvatar;
    @ColumnInfo(name = Constants.HERO_NAME)
    private String heroName;
    @ColumnInfo(name = Constants.HERO_TYPE)
    private String heroType;
    @ColumnInfo(name = Constants.HERO_BASE_HP)
    private int baseHp;
    @ColumnInfo(name = Constants.HERO_BASE_ATTACK)
    private int baseAttack;
    @ColumnInfo(name = Constants.HERO_BASE_DEFENSE)
    private int baseDefense;
    @ColumnInfo(name = Constants.HERO_BASE_RESISTANCE)
    private int baseResistance;
    @ColumnInfo(name = Constants.HERO_GROWTH_HP)
    private int growthHp;
    @ColumnInfo(name = Constants.HERO_GROWTH_ATTACK)
    private int growthAttack;
    @ColumnInfo(name = Constants.HERO_GROWTH_DEFENSE)
    private int growthDefense;
    @ColumnInfo(name = Constants.HERO_GROWTH_RESISTANCE)
    private int growthResistance;
    @ColumnInfo(name = Constants.HERO_LORE)
    private String heroLore;

    public int getId() {
        return id;
    }

    public String getHeroAvatar() {
        return heroAvatar;
    }

    public void setHeroAvatar(String heroAvatar) {
        this.heroAvatar = heroAvatar;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroType() {
        return heroType;
    }

    public void setHeroType(String heroType) {
        this.heroType = heroType;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(int baseHp) {
        this.baseHp = baseHp;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public int getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(int baseDefense) {
        this.baseDefense = baseDefense;
    }

    public int getBaseResistance() {
        return baseResistance;
    }

    public void setBaseResistance(int baseResistance) {
        this.baseResistance = baseResistance;
    }

    public int getGrowthHp() {
        return growthHp;
    }

    public void setGrowthHp(int growthHp) {
        this.growthHp = growthHp;
    }

    public int getGrowthAttack() {
        return growthAttack;
    }

    public void setGrowthAttack(int growthAttack) {
        this.growthAttack = growthAttack;
    }

    public int getGrowthDefense() {
        return growthDefense;
    }

    public void setGrowthDefense(int growthDefense) {
        this.growthDefense = growthDefense;
    }

    public int getGrowthResistance() {
        return growthResistance;
    }

    public void setGrowthResistance(int growthResistance) {
        this.growthResistance = growthResistance;
    }

    public String getHeroLore() {
        return heroLore;
    }

    public void setHeroLore(String heroLore) {
        this.heroLore = heroLore;
    }
}
