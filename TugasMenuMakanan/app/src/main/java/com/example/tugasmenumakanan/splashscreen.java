package com.example.tugasmenumakanan;
//AlifiaSalwaS
//A11.2021.13245
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splashscreen extends AppCompatActivity {
    private int load=3000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(splashscreen.this, MainActivity.class );
                startActivity(home);
                finish();
            }
        }, load);
    }
}
