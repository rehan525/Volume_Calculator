package com.example.volume_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    TextView result;
    EditText len;
    Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        result=findViewById(R.id.result);
        len=findViewById(R.id.length);
        Btn=findViewById(R.id.Btn);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String l=len.getText().toString();
                int leng=Integer.parseInt(l);

                int volume=leng*leng*leng;

                result.setText("V="+volume+"m^3");

            }
        });

    }
}