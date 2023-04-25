package com.example.cultupaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Empezar extends AppCompatActivity {
    Button btn_empezar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empezar);
        btn_empezar = findViewById(R.id.btn_empezar);

        btn_empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irsiguiente=new Intent(Empezar.this, Terminos_Y_Condiciones.class);
                startActivity(irsiguiente);
            }
        });
    }
}



