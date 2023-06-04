package com.example.tugasbiodataalifiass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton btnTelepon, btnEmail;
    Button btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTelepon = findViewById(R.id.btn_imgtel);
        btnMap = findViewById(R.id.alamatmap);
        btnEmail = findViewById(R.id.btn_email);

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmapsalamat = Uri.parse("https://goo.gl/maps/Gs7rqHygAg7sggTC8");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmapsalamat);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        btnTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor="088*******19";
                Intent panggil = new Intent(Intent.ACTION_DIAL);
                panggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(panggil);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] addr={"als.salsa27@gmail.com"};
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("message/rtc822");
                email.putExtra(Intent.EXTRA_EMAIL, addr);
                startActivity(email);
            }
        });

    }
}