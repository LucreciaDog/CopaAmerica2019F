package com.example.copaamerica2019;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FragmentEquipos extends Fragment {


    View v;
    //Adaptando el RecyclerView para el partido vs #1
    private RecyclerView myrecyclerview;
    private List<Equipos> lstEquipos;

    public FragmentEquipos() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.equipos_fragment,container,false);


        //Pasando Datos #3
        myrecyclerview = (RecyclerView) v.findViewById(R.id.equipos_recyclerview_id);
        RecyclerViewAdapter2 recyclerViewAdapter2 = new RecyclerViewAdapter2(getContext(),lstEquipos);

        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter2);
        return v;
    }
    //Adaptamos el recyclerView Para el partido #2
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Agragando Datos
        lstEquipos = new ArrayList<>();
        lstEquipos.add(new Equipos("GRUPOA","COLOMBIA","PERU","ARGENTINA","MEXICO","3","3","3","3"));
        lstEquipos.add(new Equipos("GRUPOA","COLOMBIA","PERU","ARGENTINA","MEXICO","3","3","3","3"));
        lstEquipos.add(new Equipos("GRUPOA","COLOMBIA","PERU","ARGENTINA","MEXICO","3","3","3","3"));
        lstEquipos.add(new Equipos("GRUPOA","COLOMBIA","PERU","ARGENTINA","MEXICO","3","3","3","3"));

    }
}
