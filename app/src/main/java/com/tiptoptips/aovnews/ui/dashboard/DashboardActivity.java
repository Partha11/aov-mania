package com.tiptoptips.aovnews.ui.dashboard;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.tiptoptips.aovnews.R;
import com.tiptoptips.aovnews.adapter.HeroAdapter;
import com.tiptoptips.aovnews.model.Hero;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashboardActivity extends AppCompatActivity {

    @BindView(R.id.hero_recycler_view)
    RecyclerView heroRecyclerView;

    private DashboardViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);

        final HeroAdapter adapter = new HeroAdapter();
        heroRecyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        heroRecyclerView.setItemAnimator(new DefaultItemAnimator());
        heroRecyclerView.setAdapter(adapter);

        viewModel = ViewModelProviders.of(this).get(DashboardViewModel.class);
        viewModel.getHeroList().observe(this, adapter::setHeroList);
    }
}
