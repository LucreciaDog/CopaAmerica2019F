package com.example.copaamerica2019;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class FragmentPlay extends Fragment {
    View v;





    //Adaptando el RecyclerView para el partido vs #1
    private RecyclerView myrecyclerview;
    private List<Partidos> lstPartidos;

    public FragmentPlay() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.play_fragment,container,false);

        //Pasando Datos #3
        myrecyclerview = (RecyclerView) v.findViewById(R.id.play_recyclerview_id);
        
        //json metodos
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstPartidos);

      myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
       myrecyclerview.setAdapter(recyclerViewAdapter);

        return v;

    }

    private TextView mTextViewResult;
    private RequestQueue mQueue;


    //Adaptamos el recyclerView Para el partido #2
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Agragando Datos
       lstPartidos = new ArrayList<>();
        lstPartidos.add(new Partidos("COLOMBIA VS MEXICO","3:1","Hoy 2pm, Estadio Maracana",R.drawable.colombia,R.drawable.argentina));
        mQueue = Volley.newRequestQueue(getContext());

        jsonParse();
    }

    private void jsonParse() {
        String url = "https://api.myjson.com/bins/809mt";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        JSONObject jsonObject = null;
                        for (int i = 0; i <= response.length(); i++) {
                            try {
                                JSONArray jsonArray = response.getJSONArray("partidos");
                                JSONObject partidos = jsonArray.getJSONObject(i);
                                String versus = partidos.getString("urlversus");
                                String marcador = partidos.getString("urlmarcador");
                                String estadio = partidos.getString("estadio");
                                lstPartidos.add(new Partidos( versus, marcador, estadio,R.drawable.colombia, R.drawable.argentina));

                                Log.i("info", "valor " + versus);
                                Log.i("info", "valor " + lstPartidos.toArray());

                                RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstPartidos);

                                myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
                                myrecyclerview.setAdapter(recyclerViewAdapter);
                                Log.i("info", "valor " + myrecyclerview);

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }// etiquta on response
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mQueue.add(request);
    }
}
