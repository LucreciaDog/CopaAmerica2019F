package com.example.copaamerica2019;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mContext;
    List<Partidos> mData;

    RequestOptions options;

    //version Dialog 2
    Dialog myDialog;

    public RecyclerViewAdapter(Context mContext, List<Partidos> mData) {
        this.mContext = mContext;
        this.mData = mData;

        options = new RequestOptions().centerCrop().placeholder(R.drawable.black_rectangle).error(R.drawable.black_rectangle);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_play,viewGroup,false);
         final MyViewHolder vHolder = new MyViewHolder(v);
        //version Dialog 4
        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_play);

        //Dialog version 6
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//version Dialog 3
         vHolder.item_play.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(mContext,"Test Click"+String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                 //version Dialog 4b
                 //Dialog Version 4b
                 final TextView dialog_marcador_tv = (TextView) myDialog.findViewById(R.id.dialog_marcador_id);
                 final TextView dilog_vs_tv = (TextView) myDialog.findViewById(R.id.dialog_vs_id);
                 final TextView dialog_estadio_tv = (TextView) myDialog.findViewById(R.id.dialog_estadio_id);
                 ImageView dialog_equipoLocal_img = (ImageView) myDialog.findViewById(R.id.dialog_equipoLocal_img);
                 ImageView dialog_Visitante_img = (ImageView) myDialog.findViewById(R.id.dialog_equipoVisitante_img);

                 //Gestion Boton Share

                 Button dialog_button = (Button) myDialog.findViewById(R.id.dialog_bnt_share_id);
                 dialog_button.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Intent mShareIntent = new Intent(Intent.ACTION_SEND);
                         mShareIntent.setType("text/plain");
                         mShareIntent.putExtra(Intent.EXTRA_SUBJECT,"Resulatados Copa America 2019 "+dilog_vs_tv.getText());
                         mShareIntent.putExtra(Intent.EXTRA_TEXT," "+dialog_estadio_tv.getText()+" Marcador "+dialog_marcador_tv.getText());
                         mContext.startActivity(Intent.createChooser(mShareIntent,"Compartir"));
                     }
                 });

                 Button dialog_button_act= (Button) myDialog.findViewById(R.id.dialog_activity2);
                 dialog_button_act.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         Toast.makeText(mContext,"Test Click"+String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                         Intent myintent = new Intent(mContext,Main2Activity.class);
                         mContext.startActivity(myintent);

                     }
                 });


                 dialog_marcador_tv.setText(mData.get(vHolder.getAdapterPosition()).getMarcador());
                 dilog_vs_tv.setText(mData.get(vHolder.getAdapterPosition()).getVersus());
                 dialog_estadio_tv.setText(mData.get(vHolder.getAdapterPosition()).getEstadio());
                 dialog_equipoLocal_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhotoBanderaL());
                 dialog_Visitante_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhotoBanderaV());


                 //Dialog version 5
                 myDialog.show();

             }
         });
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_versus.setText(mData.get(i).getVersus());
        myViewHolder.tv_marcador.setText(mData.get(i).getMarcador());
        myViewHolder.tv_estadio.setText(mData.get(i).getEstadio());
        myViewHolder.tv_imgL.setImageResource(mData.get(i).getPhotoBanderaL());
        myViewHolder.tv_imgV.setImageResource(mData.get(i).getPhotoBanderaV());

        //Para Cargar imagenes
     //   Glide.with(mContext).load(mData.get(i).getPhotoBanderaL()).apply(options).into(myViewHolder.tv_imgL);
       // Glide.with(mContext).load(mData.get(i).getPhotoBanderaV()).apply(options).into(myViewHolder.tv_imgV);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        //version Dialog
        private LinearLayout item_play;

        private TextView tv_versus;
        private TextView tv_marcador;
        private TextView tv_estadio;
        private ImageView tv_imgL;
        private ImageView tv_imgV;
        //Apuntador
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_play = (LinearLayout) itemView.findViewById(R.id.play_item_id);

            tv_versus = (TextView) itemView.findViewById(R.id.partido_vs_id);
            tv_marcador = (TextView) itemView.findViewById(R.id.marcador_id);
            tv_estadio = (TextView) itemView.findViewById(R.id.estadio_id);
            tv_imgL = (ImageView) itemView.findViewById(R.id.img_bandera_1);
            tv_imgV = (ImageView) itemView.findViewById(R.id.img_bandera_2);
        }
    }
}
