package com.mbairo.hospitalpequenoprincipe.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.mbairo.hospitalpequenoprincipe.fragments.DietaFragment;
import com.mbairo.hospitalpequenoprincipe.fragments.OrientacoesFragment;
import com.mbairo.hospitalpequenoprincipe.fragments.SintomasFragment;

public class MyPagerAdapter extends FragmentStateAdapter {
    public MyPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new SintomasFragment();
            case 2:
                return new DietaFragment();
        }
        return new OrientacoesFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
