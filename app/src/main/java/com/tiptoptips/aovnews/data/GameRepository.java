package com.tiptoptips.aovnews.data;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.tiptoptips.aovnews.model.Hero;

import java.util.List;

public class GameRepository {

    private GameDao gameDao;
    private LiveData<List<Hero>> heroList;

    public GameRepository(Application application) {

        GameDatabase database = GameDatabase.getInstance(application);
        gameDao = database.gameDao();
        heroList = gameDao.getHeroList();
    }

    public void insertHero(Hero... heroes) {

        new InsertHero(gameDao).execute(heroes);
    }

    public LiveData<List<Hero>> getHeroList() {

        return heroList;
    }

    private static class InsertHero extends AsyncTask<Hero, Void, Void> {

        private GameDao gameDao;

        private InsertHero(GameDao gameDao) {

            this.gameDao = gameDao;
        }

        @Override
        protected final Void doInBackground(Hero... heroes) {

            gameDao.insertHero(heroes);
            return null;
        }
    }
}
