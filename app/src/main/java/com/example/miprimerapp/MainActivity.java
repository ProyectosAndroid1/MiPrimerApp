package com.example.miprimerapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int producto_1 = 5;
        int producto_2 = 5;
        int producto_3 = 5;
        int total = 0;

        total = (producto_1 + producto_2 + producto_3) / 3;

        if (total >= 6){
            Toast.makeText( this, "Consumo promedio", Toast.LENGTH_SHORT).show();
        } else if (total <= 5){
            Toast.makeText( this, "Consumo minimo", Toast.LENGTH_SHORT).show();
        }
    }
}