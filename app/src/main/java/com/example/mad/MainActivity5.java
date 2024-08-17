package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity5 extends AppCompatActivity {

    ImageButton home_screen1;
    LinearLayout events_sublayout10;
    LinearLayout events_sublayout20;
    LinearLayout events_sublayout30;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        home_screen1 = findViewById(R.id.home1);
        events_sublayout10 = findViewById(R.id.events_sublayout1);
        registerForContextMenu(events_sublayout10);
        events_sublayout20 = findViewById(R.id.events_sublayout2);
        registerForContextMenu(events_sublayout20);
        events_sublayout30 = findViewById(R.id.events_sublayout3);
        registerForContextMenu(events_sublayout30);


        home_screen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity5.this, MainActivity3.class);
                startActivity(i);

            }
        });
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater= new MenuInflater(this);
        menuInflater.inflate(R.menu.menu_context, menu);

    }
}