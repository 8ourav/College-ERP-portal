package com.example.mad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity11 extends AppCompatActivity {

    private List<String> attendanceDates = new ArrayList<>();
    ImageButton back4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        back4=findViewById(R.id.home7);

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity11.this, MainActivity9.class);
                startActivity(i);
            }
        });

        populateAttendanceDates();

        // Find the CalendarView
        CalendarView calendarView = findViewById(R.id.calendar_view1);

        // Set a listener to handle date selection
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                // Convert the selected date to a string representation
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String selectedDate = sdf.format(new Date(year - 1900, month, dayOfMonth));
                Log.d("SelectedDate", selectedDate);

                // Check if the selected date is in the list of attendance dates
                if (attendanceDates.contains(selectedDate)) {
                    showToast("Attendance for " + selectedDate + ": Present");
                } else {
                    showToast("Attendance for " + selectedDate + ": Absent");
                }

                // Log the dates in the attendanceDates list
                Log.d("AttendanceDates", attendanceDates.toString());
            }
        });
    }

    // Helper method to populate the list of attendance dates
    private void populateAttendanceDates() {
        // Add example attendance dates to the list
        attendanceDates.add("2024-04-01"); // Present
        attendanceDates.add("2024-04-05"); // Present
        // Add more dates as needed
    }

    // Helper method to show toast message
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}