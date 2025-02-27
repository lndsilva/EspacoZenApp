package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MeditarFragment extends Fragment {

    RecyclerView idFragMeditar;
    List<Meditar> lstMeditar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_meditar, container, false);

        idFragMeditar = view.findViewById(R.id.idFragMeditar);

        AdapterFragMeditar adapterFragMeditar = new AdapterFragMeditar(getContext(),lstMeditar);

        lstMeditar = new ArrayList<>();
        lstMeditar.add(
                new Meditar("Meditação Zazen", "@string/medita_o_zazen", R.drawable.mulher_meditando)

        );
        lstMeditar.add(
                new Meditar("Meditação Zazen", "@string/medita_o_zazen", R.drawable.mulher_meditando)

        );
        lstMeditar.add(
                new Meditar("Meditação Zazen", "@string/medita_o_zazen", R.drawable.mulher_meditando)

        );
        lstMeditar.add(
                new Meditar("Meditação Zazen", "@string/medita_o_zazen", R.drawable.mulher_meditando)

        );
        lstMeditar.add(
                new Meditar("Meditação Zazen", "@string/medita_o_zazen", R.drawable.mulher_meditando)

        );
        lstMeditar.add(
                new Meditar("Meditação Zazen", "@string/medita_o_zazen", R.drawable.mulher_meditando)

        );
        lstMeditar.add(
                new Meditar("Meditação Zazen", "@string/medita_o_zazen", R.drawable.mulher_meditando)

        );

        adapterFragMeditar





        return view;
    }
}