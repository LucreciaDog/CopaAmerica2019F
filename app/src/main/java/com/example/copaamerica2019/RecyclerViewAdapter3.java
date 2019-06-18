package com.example.copaamerica2019;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter3 extends RecyclerView.Adapter<RecyclerViewAdapter3.MyViewHolder> {

    public static TextView resultTextView;

    Context mContext;
    List<Jugador> mData;

    public RecyclerViewAdapter3(Context mContext, List<Jugador> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter3.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_jugador,viewGroup,false);
        RecyclerViewAdapter3.MyViewHolder vHolder = new RecyclerViewAdapter3.MyViewHolder(v);

         resultTextView = (TextView) v.findViewById(R.id.result_id);

        Button scan_btn = (Button) v.findViewById(R.id.bnt_qr_id);
        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(mContext,Main3Activity.class);
                mContext.startActivity(myintent);

            }
        });


        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter3.MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_nombre.setText(mData.get(i).getNombre());
        myViewHolder.tv_numero.setText(mData.get(i).getNumero());
        myViewHolder.tv_nombreEquipo.setText(mData.get(i).getNombreEquipo());
        myViewHolder.tv_PhotoEquipo.setImageResource(mData.get(i).getPhotoEquipo());
        myViewHolder.tv_PhotoEscudo.setImageResource(mData.get(i).getPhotoEscudo());
        myViewHolder.tv_PhotoJugador.setImageResource(mData.get(i).getPhotoJugador());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_nombre;
        private TextView tv_numero;
        private TextView tv_nombreEquipo;
        private ImageView tv_PhotoEquipo;
        private ImageView tv_PhotoEscudo;
        private ImageView tv_PhotoJugador;
        //Apuntador
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_nombre = (TextView) itemView.findViewById(R.id.nombre_id);
            tv_numero = (TextView) itemView.findViewById(R.id.numero_id);
            tv_nombreEquipo = (TextView) itemView.findViewById(R.id.nombre_equipo_id);
            tv_PhotoEquipo = (ImageView) itemView.findViewById(R.id.foto_seleccion_id);
            tv_PhotoEscudo = (ImageView) itemView.findViewById(R.id.escudo_id);
            tv_PhotoJugador = (ImageView) itemView.findViewById(R.id.foto_cap_id);
        }
    }
}

