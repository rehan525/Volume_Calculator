package com.example.volume_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder_activity extends AppCompatActivity {

    EditText radius;
    EditText height;
    TextView result;

    Button Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        height=findViewById(R.id.height);
        radius=findViewById(R.id.radius);
        result=findViewById(R.id.result);
        Btn=findViewById(R.id.btn);


        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringht=height.getText().toString();
                int ht=Integer.parseInt(stringht);

                String stringrd=radius.getText().toString();
                int rd=Integer.parseInt(stringrd);

                double cylinder_volume = 3.14*(rd*rd)*ht;

                result.setText("V= "+(int) cylinder_volume+"m^3");
            }
        });

    }
}