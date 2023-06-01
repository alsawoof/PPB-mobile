package com.example.tugasmenumakanan;
//AlifiaSalwaS
//A11.2021.13245
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.recMakanan);
        initData();

        recMakanan.setAdapter(new MakananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initData(){
        listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Ayam Geprek Keju", "Ayam geprek dengan keju mozarella yang dilelehkan di atasnya", 20000, R.drawable.ayam_geprek_keju));
        listMakanan.add(new Makanan("Pecel Lele", "Pecel lele dengan sambal khasnya dan lele dua ekor", 20000, R.drawable.pecel_lele));
        listMakanan.add(new Makanan("Nasi Goreng Spesial", "Nasi goreng yang dapat disesuaikan sendiri dengan selera masing-masing", 25000, R.drawable.nasi_goreng));
        listMakanan.add(new Makanan("Kari Ayam Indonesia", "Kari Ayam dengan saus bumbu rempah khas Indonesia", 25000, R.drawable.kari_ayam));
        listMakanan.add(new Makanan("Mendoan", "Tempe dengan balutan tepung dengan bumbu rumahan. (Seporsi isi 7)", 10000, R.drawable.mendoan));
        listMakanan.add(new Makanan("Tahu Bulat", "Tahu bulat yang terkenal dengan sebiji 500 an kini hadir dalam bentuk satu porsi isi 10", 5000, R.drawable.tahu_bulat));
        listMakanan.add(new Makanan("Salad Buah", "Salad buah-buahan yang selalu fresh setiap harinya", 25000, R.drawable.salad_buah));
        listMakanan.add(new Makanan("Lemon Tea", "Teh dengan Lemon yang tersedia dalam dua pilihan (Hot/Iced)", 8000, R.drawable.lemon_tea));
        listMakanan.add(new Makanan("Hot Tea", "Teh hangat yang menjadi best seller tiap kali hujan", 6000, R.drawable.hot_tea));
        listMakanan.add(new Makanan("Ocean Blue", "Minuman squash dengan soda yang disukai banyak anak muda", 12000, R.drawable.ocean_blue));
        listMakanan.add(new Makanan("Air Mineral", "Air Mineral yang juga disediakan", 5000, R.drawable.air_mineral));

    }
}