package com.tiptoptips.aovnews.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.tiptoptips.aovnews.constants.Constants;

@Entity(tableName = Constants.ABILITY_TABLE)
public class Ability {

    @PrimaryKey
    private int id;
    @ColumnInfo(name = Constants.PASSIVE)
    private String passive;
    @ColumnInfo(name = Constants.SKILL_ONE)
    private String skillOne;
    @ColumnInfo(name = Constants.SKILL_TWO)
    private String skillTwo;
    @ColumnInfo(name = Constants.SKILL_THREE)
    private String skillThree;
    @ColumnInfo(name = Constants.SKILL_FOUR)
    private String skillFour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassive() {
        return passive;
    }

    public void setPassive(String passive) {
        this.passive = passive;
    }

    public String getSkillOne() {
        return skillOne;
    }

    public void setSkillOne(String skillOne) {
        this.skillOne = skillOne;
    }

    public String getSkillTwo() {
        return skillTwo;
    }

    public void setSkillTwo(String skillTwo) {
        this.skillTwo = skillTwo;
    }

    public String getSkillThree() {
        return skillThree;
    }

    public void setSkillThree(String skillThree) {
        this.skillThree = skillThree;
    }

    public String getSkillFour() {
        return skillFour;
    }

    public void setSkillFour(String skillFour) {
        this.skillFour = skillFour;
    }
}
