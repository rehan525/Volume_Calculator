package com.example.volume_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    TextView result;
    EditText Base;
    EditText Height;
    Button Btn;

    Button goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        Btn=findViewById(R.id.Btn);
        result=findViewById(R.id.Reslut);
        Base=findViewById(R.id.Base);
        Height=findViewById(R.id.Height);
        goback=findViewById(R.id.goback);


        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringbase=Base.getText().toString();
                int base=Integer.parseInt(stringbase);

                String stringheight=Height.getText().toString();
                int height=Integer.parseInt(stringheight);


                int volume=base*height;

                result.setText("V="+volume+"m^3");
            }
        });

        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
            }
        });

    }
}