package com.example.examen1android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.btnloggin);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Disculpa demaciada gente intentando entrar..", Toast.LENGTH_SHORT).show();
            }
        });

        b = findViewById(R.id.btncreate);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {
                Toast.makeText(MainActivity.this, "Lo sentimos se a suspendido la creacion de cuentas", Toast.LENGTH_SHORT).show();
            }
        });

    }


}