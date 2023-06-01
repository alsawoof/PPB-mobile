package com.example.tugasmenumakanan;
//AlifiaSalwaS
//A11.2021.13245
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    ImageView imgGambar;
    TextView txtNama, txtDeskripsi, txtHarga;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgGambar = findViewById(R.id.imgGambar);
        txtNama = findViewById(R.id.txtNama);
        txtDeskripsi = findViewById(R.id.txtDeskripsi);
        txtHarga = findViewById(R.id.txtHarga);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Detail");


        String namaMakanan = getIntent().getStringExtra("nama_makanan");
        String descMakanan = getIntent().getStringExtra("desc_makanan");
        int hargaMakanan = getIntent().getIntExtra("harga_makanan", 0);
        txtNama.setText(namaMakanan);
        txtDeskripsi.setText(descMakanan);
        txtHarga.setText("Rp. "+hargaMakanan);
        imgGambar.setImageResource(getIntent().getIntExtra("gambar_makanan", 0));



    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;

    }
}
