package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;
import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;
    Button googlebtn;

    Spinner spinner;
    public static final String[] Languages = {"Select Languages", "English", "French"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        getSupportActionBar().setTitle("hello");



        username = findViewById(R.id.username_input);
        password = findViewById(R.id.password_input);
        loginButton = findViewById(R.id.loginButton);
        googlebtn = findViewById(R.id.loginButton2);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedLang = parent.getItemAtPosition(position).toString();
                if (selectedLang.equals("English")) {
                    setLocal(MainActivity2.this, "en");
                    finish();
                    startActivity(getIntent());
                } else if (selectedLang.equals("French")) {
                    setLocal(MainActivity2.this, "fr");
                    finish();
                    startActivity(getIntent());
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        googlebtn.setOnClickListener(view -> {
            // Creating a toast to display the message
            Toast.makeText(MainActivity2.this, "Welcome to Google", Toast.LENGTH_SHORT).show();
            String url = "https://www.google.com/";
            Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse(url));
            startActivity(i);
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity2.this, "Login Successful!", Toast.LENGTH_SHORT).show();
//                    Intent broadcastIntent = new Intent("com.example.mad.ACTION_SEND_BROADCAST");
//                    broadcastIntent.putExtra("broadcast_message", "Login Successful!");
//                    sendBroadcast(broadcastIntent);
                    Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(i);

                } else {
                    Toast.makeText(MainActivity2.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void setLocal(Activity activity, String langCode) {
        Locale locale = new Locale(langCode);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.setLocale(locale);
        getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
    }
}