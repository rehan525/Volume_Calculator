package com.example.volume_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    ArrayList<Shapes> shapesArrayList;

    MyCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridView);

        shapesArrayList=new ArrayList<>();

        Shapes s1=new Shapes(R.drawable.sphere,"Sphere");
        Shapes s2=new Shapes(R.drawable.cylinder,"Cylinder");
        Shapes s3=new Shapes(R.drawable.cube,"Cube");
        Shapes s4=new Shapes(R.drawable.prism,"Prism");

        shapesArrayList.add(s1);
        shapesArrayList.add(s2);
        shapesArrayList.add(s3);
        shapesArrayList.add(s4);

        adapter=new MyCustomAdapter(shapesArrayList,getApplicationContext());

        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                if(i==0) {
                    intent = new Intent(getApplicationContext(), Sphere.class);
                }else if(i==1){
                    intent=new Intent(getApplicationContext(), Cylinder_activity.class);
                }else if(i==2){
                    intent=new Intent(getApplicationContext(), Cube.class);
                }else if(i==3){
                    intent=new Intent(getApplicationContext(), Prism.class);
                }else{
                    return;
                }
                startActivity(intent);
            }
        });



    }
}