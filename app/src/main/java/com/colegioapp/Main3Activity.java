package com.colegioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button btnVolver, btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnVolver = (Button)findViewById(R.id.btnVolver);
        btnInicio = (Button)findViewById(R.id.btnInicio);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent volver1 = new Intent(Main3Activity.this, Main2Activity.class );
                startActivity(volver1);

            }
        });
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inicio1 = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(inicio1);

            }
        });
    }
}
