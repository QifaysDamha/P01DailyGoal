package com.example.a16033760.p01dailygoal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Summary extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_activity);

        Intent intent = getIntent();

        String[] info = intent.getStringArrayExtra("info");

        TextView tvSummary = (TextView)findViewById(R.id.textViewSummary);

        tvSummary.setText("Q1) " + info[0] + "\nQ2) " + info[1] + "\nQ3) " + info[2] + "\nQ4) " + info[3]);
    }
}
