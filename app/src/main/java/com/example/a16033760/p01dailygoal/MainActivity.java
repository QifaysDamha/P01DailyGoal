package com.example.a16033760.p01dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.Q1);
        TextView tv2 = (TextView) findViewById(R.id.Q2);
        TextView tv3 = (TextView) findViewById(R.id.Q3);
        TextView tv4 = (TextView) findViewById(R.id.Q4);

        TextView rb1 = (TextView) findViewById(R.id.RB1);
        TextView rb2 = (TextView) findViewById(R.id.RB2);
        TextView rb3 = (TextView) findViewById(R.id.RB3);

        tv1.setText("Read up on materials before class");
        tv2.setText("Arrive on time so as not to miss important part of the lesson");
        tv3.setText("Attempt the problem myself");
        tv4.setText("My personal reflection today");

        rb1.setText("Did i achieve this goal today?");
        rb2.setText("Did i achieve this goal today?");
        rb3.setText("Did i achieve this goal today?");

        Button btnOK = (Button)findViewById(R.id.buttonOK);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etRJ = (EditText) findViewById(R.id.editTextRJ);

                RadioGroup rg1 = (RadioGroup) findViewById(R.id.RG1);
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.RG2);
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.RG3);

                int selectedBtn1 = rg1.getCheckedRadioButtonId();
                int selectedBtn2 = rg2.getCheckedRadioButtonId();
                int selectedBtn3 = rg3.getCheckedRadioButtonId();

                RadioButton opt1 = (RadioButton) findViewById(selectedBtn1);
                RadioButton opt2 = (RadioButton) findViewById(selectedBtn2);
                RadioButton opt3 = (RadioButton) findViewById(selectedBtn3);

                String[] info = {opt1.getText().toString(), opt2.getText().toString(), opt3.getText().toString(), etRJ.getText().toString()};

                Intent intent = new Intent(MainActivity.this, Summary.class);
                intent.putExtra("info", info);
                startActivity(intent);
            }
        });
    }
}
