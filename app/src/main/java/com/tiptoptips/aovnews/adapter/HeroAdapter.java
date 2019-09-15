package com.tiptoptips.aovnews.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.tiptoptips.aovnews.R;
import com.tiptoptips.aovnews.model.Hero;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroHolder> {

    private List<Hero> heroList;

    @NonNull
    @Override
    public HeroHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hero_model, parent, false);
        return new HeroHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroHolder holder, int position) {

        holder.heroName.setText(heroList.get(position).getHeroName());
    }

    @Override
    public int getItemCount() {

        return heroList == null ? 0 : heroList.size();
    }

    public void setHeroList(List<Hero> heroList) {

        this.heroList = heroList;
        notifyDataSetChanged();
    }

    class HeroHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.hero_image)
        CircleImageView heroImage;
        @BindView(R.id.hero_name)
        AppCompatTextView heroName;

        HeroHolder(@NonNull View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
