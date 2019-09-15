package com.tiptoptips.aovnews.ui.dashboard;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.tiptoptips.aovnews.data.GameRepository;
import com.tiptoptips.aovnews.model.Hero;

import java.util.List;

public class DashboardViewModel extends AndroidViewModel {

    private GameRepository repository;
    private LiveData<List<Hero>> heroList;

    public DashboardViewModel(@NonNull Application application) {

        super(application);
        repository = new GameRepository(application);
        heroList = repository.getHeroList();
    }

    public void insertHero(Hero... heroes) {

        repository.insertHero(heroes);
    }

    public LiveData<List<Hero>> getHeroList() {

        return heroList;
    }
}
