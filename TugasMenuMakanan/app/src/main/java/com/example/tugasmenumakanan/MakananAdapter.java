package com.example.tugasmenumakanan;
//AlifiaSalwaS
//A11.2021.13245
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MamViewHolder> {

    private ArrayList<Makanan> listMakanan;

    public MakananAdapter(ArrayList<Makanan> listMakanan) {
        this.listMakanan = listMakanan;
    }

    @NonNull
    @Override
    public MamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from((parent.getContext()));
        MamViewHolder holder = new MamViewHolder(inflater.inflate(R.layout.list_item,parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MamViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Makanan makanan = listMakanan.get(position);

        holder.txt_nama.setText(listMakanan.get(position).getNama());
        //holder.txt_desc.setText(listMakanan.get(position).getDesc());
        holder.txt_price.setText("Rp. "+listMakanan.get(position).getHarga());
        holder.imgfood.setImageResource(listMakanan.get(position).getGambar());

        holder.mainlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(view.getContext(), makanan.desc, Toast.LENGTH_LONG).show();
                Intent it = new Intent(view.getContext(), DetailActivity.class);
                //it.putExtra("kuliner", kuliner);
                it.putExtra("nama_makanan", listMakanan.get(position).getNama());
                it.putExtra("desc_makanan", listMakanan.get(position).getDesc());
                it.putExtra("harga_makanan", listMakanan.get(position).getHarga());
                it.putExtra("gambar_makanan", listMakanan.get(position).getGambar());

                view.getContext().startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class MamViewHolder extends RecyclerView.ViewHolder {
        public TextView txt_nama, txt_price, txt_desc;
        public ImageView imgfood;
        public ConstraintLayout mainlay;

        public MamViewHolder(@NonNull View itemView){
            super(itemView);

            txt_nama = (TextView) itemView.findViewById(R.id.txt_nama);
            //txt_desc = (TextView) itemView.findViewById(R.id.txtDeskripsi);
            txt_price = (TextView) itemView.findViewById(R.id.txt_price);
            imgfood = (ImageView) itemView.findViewById(R.id.imgfood);
            mainlay = (ConstraintLayout) itemView.findViewById(R.id.mainLayout);
        }
    }
}

