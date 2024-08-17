package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    ImageButton home_screen3;
    Button lay2;
    Button lay3;
    Button lay4;
    Button lay5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        home_screen3 = findViewById(R.id.home3);
        lay2 = findViewById(R.id.lay_2);
        lay3 = findViewById(R.id.lay_3);
        lay4 = findViewById(R.id.lay_4);
        lay5 = findViewById(R.id.lay_5);

        home_screen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity7.this, MainActivity3.class);
                startActivity(i);

            }
        });

        lay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity7.this, "Fees= 51,000Rs", Toast.LENGTH_LONG).show();
            }
        });
        lay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity7.this, "Fees= 51,500Rs", Toast.LENGTH_LONG).show();
            }
        });
        lay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity7.this, "Fees= 52,000Rs", Toast.LENGTH_LONG).show();
            }
        });
        lay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity7.this, "Fees= 52,500Rs", Toast.LENGTH_LONG).show();
            }
        });
    }
}