package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity12 extends AppCompatActivity {

    ImageButton back12;
    Button logoutbtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        back12 = findViewById(R.id.home12);
        logoutbtn = findViewById(R.id.logout_btn);

        back12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity12.this, MainActivity3.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity12.this, "Logout Successful!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity12.this, MainActivity2.class);
                startActivity(i);
            }
        });

    }

//    private void setLocal(Activity activity, String langCode) {
//        Locale locale = new Locale(langCode);
//        Locale.setDefault(locale);
//        Configuration config = new Configuration();
//        config.setLocale(locale);
//        getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
//    }

}