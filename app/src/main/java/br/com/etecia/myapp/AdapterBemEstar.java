package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterBemEstar extends FragmentStateAdapter {
    public AdapterBemEstar(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new MeditarFragment();
            case 1:
                return new ZazenFragment();
            case 2:
                return new MusicasFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
