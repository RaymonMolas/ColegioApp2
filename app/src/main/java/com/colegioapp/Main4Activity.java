package com.colegioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    Button  btnVolver, btnSgte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnVolver = (Button)findViewById(R.id.btnVolver);
        btnSgte = (Button)findViewById(R.id.btnSgte);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent volver1 = new Intent(Main4Activity.this, Main2Activity.class);
                startActivity(volver1);

            }
        });
        btnSgte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sgte1 = new Intent(Main4Activity.this, MainActivity.class);
                finish();

            }
        });
    }
}
