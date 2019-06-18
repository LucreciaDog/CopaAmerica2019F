package com.example.copaamerica2019;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.MyViewHolder> {

    Context mContext;
    List<Equipos> mData;

    public RecyclerViewAdapter2(Context mContext, List<Equipos> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_equipos,viewGroup,false);
        RecyclerViewAdapter2.MyViewHolder vHolder = new RecyclerViewAdapter2.MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter2.MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_grupo.setText(mData.get(i).getGrupo());
        myViewHolder.tv_equipo1.setText(mData.get(i).getEquipo1());
        myViewHolder.tv_equipo2.setText(mData.get(i).getEquipo2());
        myViewHolder.tv_equipo3.setText(mData.get(i).getEquipo3());
        myViewHolder.tv_equipo4.setText(mData.get(i).getEquipo4());

        myViewHolder.tv_puntos1.setText(mData.get(i).getPuntos1());
        myViewHolder.tv_puntos2.setText(mData.get(i).getPuntos2());
        myViewHolder.tv_puntos3.setText(mData.get(i).getPuntos3());
        myViewHolder.tv_puntos4.setText(mData.get(i).getPuntos4());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_grupo;
        private TextView tv_equipo1;
        private TextView tv_equipo2;
        private TextView tv_equipo3;
        private TextView tv_equipo4;
        private TextView tv_puntos1;
        private TextView tv_puntos2;
        private TextView tv_puntos3;
        private TextView tv_puntos4;
        //Apuntador
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_grupo = (TextView) itemView.findViewById(R.id.grupo_id);
            tv_equipo1 = (TextView) itemView.findViewById(R.id.equipo1_id);
            tv_equipo2 = (TextView) itemView.findViewById(R.id.equipo2_id);
            tv_equipo3 = (TextView) itemView.findViewById(R.id.equipo3_id);
            tv_equipo4 = (TextView) itemView.findViewById(R.id.equipo4_id);

            tv_puntos1 = (TextView) itemView.findViewById(R.id.puntos1_id);
            tv_puntos2 = (TextView) itemView.findViewById(R.id.puntos2_id);
            tv_puntos3 = (TextView) itemView.findViewById(R.id.puntos3_id);
            tv_puntos4 = (TextView) itemView.findViewById(R.id.puntos4_id);
        }
    }
}
