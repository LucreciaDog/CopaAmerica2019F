package com.example.copaamerica2019;

import android.content.Intent;
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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FragmentJugador extends Fragment {
    TextView resultTextView;
    Button scan_btn;
    View v;
    //Adaptando el RecyclerView para el partido vs #1
    private RecyclerView myrecyclerview;
    private List<Jugador> lstJugador;

    public FragmentJugador() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jugador_fragment,container,false);
        //Pasando Datos #3
        myrecyclerview = (RecyclerView) v.findViewById(R.id.jugador_recyclerview_id);
        RecyclerViewAdapter3 recyclerViewAdapter3 = new RecyclerViewAdapter3(getContext(),lstJugador);

        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter3);


        return v;
    }
    //Adaptamos el recyclerView Para el partido #2
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Agragando Datos
        lstJugador = new ArrayList<>();
        lstJugador.add(new Jugador("Lio Messi","11 Delantero","Argentina",R.drawable.argentina_equipo,R.drawable.argentina,R.drawable.messi));

    }
}

