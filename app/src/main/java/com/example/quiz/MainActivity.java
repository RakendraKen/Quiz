package com.example.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rgJawaban1,rgJawaban2,rgJawaban3,rgJawaban4,rgJawaban5,rgJawaban6,rgJawaban7,rgJawaban8,rgJawaban9,rgJawaban10;
    private Button proses;
    private RadioButton val1,val2,val3,val4,val5,val6,val7,val8,val9,val10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgJawaban1 = findViewById(R.id.rgJawaban1);
        rgJawaban2 = findViewById(R.id.rgJawaban2);
        rgJawaban3 = findViewById(R.id.rgJawaban3);
        rgJawaban4 = findViewById(R.id.rgJawaban4);
        rgJawaban5 = findViewById(R.id.rgJawaban5);
        rgJawaban6 = findViewById(R.id.rgJawaban6);
        rgJawaban7 = findViewById(R.id.rgJawaban7);
        rgJawaban8 = findViewById(R.id.rgJawaban8);
        rgJawaban9 = findViewById(R.id.rgJawaban9);
        rgJawaban10 = findViewById(R.id.rgJawaban10);

        proses = findViewById(R.id.pol);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int pnta = rgJawaban1.getCheckedRadioButtonId();
                val1 = (RadioButton) findViewById(pnta);

                int pntb = rgJawaban2.getCheckedRadioButtonId();
                val1 = (RadioButton) findViewById(pntb);

                int pntc = rgJawaban3.getCheckedRadioButtonId();
                val1 = (RadioButton) findViewById(pntc);

                int pntd = rgJawaban4.getCheckedRadioButtonId();
                val1 = (RadioButton) findViewById(pntd);

                int pnte = rgJawaban5.getCheckedRadioButtonId();
                val1 = (RadioButton) findViewById(pnte);

                int pntf = rgJawaban6.getCheckedRadioButtonId();
                val1 = (RadioButton) findViewById(pntf);

                int pntg = rgJawaban7.getCheckedRadioButtonId();
                val1 = (RadioButton) findViewById(pntg);

                int pnth = rgJawaban8.getCheckedRadioButtonId();
                val1 = (RadioButton) findViewById(pnth);

                int pnti = rgJawaban9.getCheckedRadioButtonId();
                val1 = (RadioButton) findViewById(pnti);

                int pntj = rgJawaban10.getCheckedRadioButtonId();
                val1 = (RadioButton) findViewById(pntj);

                int nilai = 0;

                if (val1.getText().toString().toLowerCase().equals("2")){
                    nilai += 10;
                }

                if (val1.getText().toString().toLowerCase().equals("17agustus")){
                    nilai += 10;
                }

                if (val1.getText().toString().toLowerCase().equals("ketuhanan yang maha esa")){
                    nilai += 10;
                }

                if (val1.getText().toString().toLowerCase().equals("soekarno")){
                    nilai += 10;
                }

                if (val1.getText().toString().toLowerCase().equals("bintang")){
                    nilai += 10;
                }

                if (val1.getText().toString().toLowerCase().equals("110")){
                    nilai += 10;
                }

                if (val1.getText().toString().toLowerCase().equals("1100")){
                    nilai += 10;
                }

                if (val1.getText().toString().toLowerCase().equals("6400")){
                    nilai += 10;
                }

                if (val1.getText().toString().toLowerCase().equals("persatuan indonesia")){
                    nilai += 10;
                }

                if (val1.getText().toString().toLowerCase().equals("12.230")){
                    nilai += 10;
                }
                Toast.makeText(getApplicationContext(), "nilai= "+ nilai, Toast.LENGTH_SHORT).show();

            }
        });


    }
}