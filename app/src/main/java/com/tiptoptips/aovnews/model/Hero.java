package com.tiptoptips.aovnews.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tiptoptips.aovnews.constants.Constants;

@Entity(tableName = Constants.HERO_TABLE)
public class Hero {

    @SerializedName("id")
    @Expose
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = Constants.HERO_AVATAR)
    @SerializedName("hero_avatar")
    @Expose
    private String heroAvatar;
    @ColumnInfo(name = Constants.HERO_NAME)
    @SerializedName("hero_name")
    @Expose
    private String heroName;
    @ColumnInfo(name = Constants.HERO_SKIN_NAME)
    @SerializedName("hero_skin_name")
    @Expose
    private String heroSkinName;
    @ColumnInfo(name = Constants.HERO_TYPE)
    @SerializedName("hero_type")
    @Expose
    private String heroType;
    @ColumnInfo(name = Constants.HERO_BASE_HP)
    @SerializedName("hero_base_hp")
    @Expose
    private int heroBaseHp;
    @ColumnInfo(name = Constants.HERO_BASE_ATTACK)
    @SerializedName("hero_base_attack")
    @Expose
    private int heroBaseAttack;
    @ColumnInfo(name = Constants.HERO_BASE_DEFENSE)
    @SerializedName("hero_base_defense")
    @Expose
    private int heroBaseDefense;
    @ColumnInfo(name = Constants.HERO_BASE_RESISTANCE)
    @SerializedName("hero_base_resistance")
    @Expose
    private int heroBaseResistance;
    @ColumnInfo(name = Constants.HERO_GROWTH_HP)
    @SerializedName("hero_growth_hp")
    @Expose
    private double heroGrowthHp;
    @ColumnInfo(name = Constants.HERO_GROWTH_ATTACK)
    @SerializedName("hero_growth_attack")
    @Expose
    private double heroGrowthAttack;
    @ColumnInfo(name = Constants.HERO_GROWTH_DEFENSE)
    @SerializedName("hero_growth_defense")
    @Expose
    private double heroGrowthDefense;
    @ColumnInfo(name = Constants.HERO_GROWTH_RESISTANCE)
    @SerializedName("hero_growth_resistance")
    @Expose
    private double heroGrowthResistance;
    @ColumnInfo(name = Constants.HERO_LORE)
    @SerializedName("hero_lore")
    @Expose
    private String heroLore;
    @ColumnInfo(name = Constants.HERO_MOVEMENT_SPEED)
    @SerializedName("hero_movement_speed")
    @Expose
    private int heroMovementSpeed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getHeroSkinName() {
        return heroSkinName;
    }

    public void setHeroSkinName(String heroSkinName) {
        this.heroSkinName = heroSkinName;
    }

    public String getHeroType() {
        return heroType;
    }

    public void setHeroType(String heroType) {
        this.heroType = heroType;
    }

    public int getHeroBaseHp() {
        return heroBaseHp;
    }

    public void setHeroBaseHp(int heroBaseHp) {
        this.heroBaseHp = heroBaseHp;
    }

    public int getHeroBaseAttack() {
        return heroBaseAttack;
    }

    public void setHeroBaseAttack(int heroBaseAttack) {
        this.heroBaseAttack = heroBaseAttack;
    }

    public int getHeroBaseDefense() {
        return heroBaseDefense;
    }

    public void setHeroBaseDefense(int heroBaseDefense) {
        this.heroBaseDefense = heroBaseDefense;
    }

    public int getHeroBaseResistance() {
        return heroBaseResistance;
    }

    public void setHeroBaseResistance(int heroBaseResistance) {
        this.heroBaseResistance = heroBaseResistance;
    }

    public double getHeroGrowthHp() {
        return heroGrowthHp;
    }

    public void setHeroGrowthHp(double heroGrowthHp) {
        this.heroGrowthHp = heroGrowthHp;
    }

    public double getHeroGrowthAttack() {
        return heroGrowthAttack;
    }

    public void setHeroGrowthAttack(double heroGrowthAttack) {
        this.heroGrowthAttack = heroGrowthAttack;
    }

    public double getHeroGrowthDefense() {
        return heroGrowthDefense;
    }

    public void setHeroGrowthDefense(double heroGrowthDefense) {
        this.heroGrowthDefense = heroGrowthDefense;
    }

    public double getHeroGrowthResistance() {
        return heroGrowthResistance;
    }

    public void setHeroGrowthResistance(double heroGrowthResistance) {
        this.heroGrowthResistance = heroGrowthResistance;
    }

    public String getHeroLore() {
        return heroLore;
    }

    public void setHeroLore(String heroLore) {
        this.heroLore = heroLore;
    }

    public int getHeroMovementSpeed() {
        return heroMovementSpeed;
    }

    public void setHeroMovementSpeed(int heroMovementSpeed) {
        this.heroMovementSpeed = heroMovementSpeed;
    }
}
