package com.colegioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btnSesion, btnRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnSesion = (Button)findViewById(R.id.btnSesion);
        btnRegist = (Button)findViewById(R.id.btnRegist);

        btnSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sesion1 = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(sesion1);

            }

        });
        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regis1 = new Intent(Main2Activity.this, Main4Activity.class);
                startActivity(regis1);

            }
        });
    }
}
