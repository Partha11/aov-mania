package com.tiptoptips.aovnews.data;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.tiptoptips.aovnews.constants.Constants;
import com.tiptoptips.aovnews.model.Ability;
import com.tiptoptips.aovnews.model.Hero;
import com.tiptoptips.aovnews.model.Item;

@Database(entities = {Hero.class, Item.class, Ability.class}, version = Constants.DATABASE_VERSION, exportSchema = false)
public abstract class GameDatabase extends RoomDatabase {

    private static GameDatabase instance;
    public abstract GameDao gameDao();
    private static Callback callback = new RoomDatabase.Callback() {

        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {

            super.onCreate(db);
            new PopulateAsync(instance).execute();
        }
    };

    static synchronized GameDatabase getInstance(Context context) {

        if (instance == null) {

            instance = Room.databaseBuilder(context, GameDatabase.class, Constants.DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return instance;
    }

    private static class PopulateAsync extends AsyncTask<Void, Void, Void> {

        private final GameDao gameDao;

        private PopulateAsync(GameDatabase gameDatabase) {

            this.gameDao = gameDatabase.gameDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            Hero hero = new Hero();

            hero.setHeroName("Airi");
            hero.setHeroSkinName("The Kunichi");
            gameDao.insertHero(hero);

            return null;
        }
    }
}
