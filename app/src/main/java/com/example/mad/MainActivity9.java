package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity9 extends AppCompatActivity {

    ImageButton home_screen5;
    private TextView madTotalTextView;
    private TextView madPercentageTextView;
    private TextView wtTotalTextView;
    private TextView wtPercentageTextView;
    private Button madButton;
    private Button wtButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        home_screen5 = findViewById(R.id.home5);

        home_screen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity9.this, MainActivity3.class);
                startActivity(i);
            }
        });

        madTotalTextView = findViewById(R.id.mad_total);
        madPercentageTextView = findViewById(R.id.mad_percentage);
        wtTotalTextView = findViewById(R.id.wt_total);
        wtPercentageTextView = findViewById(R.id.wt_percentage);
        madButton = findViewById(R.id.mad_sub);
        wtButton = findViewById(R.id.wt_sub);
        // Find the button

        // Set values for MAD
        int madTotalValue = 20;
        double madPercentageValue = 80;
        madTotalTextView.setText(getString(R.string.total) + ": " + madTotalValue); // Set total value
        madPercentageTextView.setText(getString(R.string.per) + ": " + String.format("%.1f%%", madPercentageValue)); // Set percentage value

        // Set values for WT
        int wtTotalValue = 18;
        double wtPercentageValue = 72;
        wtTotalTextView.setText(getString(R.string.total) + ": " + wtTotalValue); // Set total value
        wtPercentageTextView.setText(getString(R.string.per) + ": " + String.format("%.1f%%", madPercentageValue)); // Set percentage value
// Set percentage value

        // Set OnClickListener for the "madButton"
        madButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the calendar_mad_activity when "madButton" is clicked
                Intent intent = new Intent(MainActivity9.this, MainActivity10.class);
                startActivity(intent);
            }
        });
        wtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the calendar_mad_activity when "madButton" is clicked
                Intent intent = new Intent(MainActivity9.this, MainActivity11.class);
                startActivity(intent);
            }
        });
    }
}