package com.example.volume_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {


    EditText sphere_radius;
    TextView title,result;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);


        sphere_radius=findViewById(R.id.editText_sphere);
        result=findViewById(R.id.result);
        title=findViewById(R.id.textView3);
        btn=findViewById(R.id.sphereButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius=sphere_radius.getText().toString();

                int r=Integer.parseInt(radius);

                double volume=(4/3)*3.14159*r*r*r;

                result.setText("V ="+volume+"m^3");
            }
        });

    }
}