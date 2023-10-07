package com.example.volume_calculator;

import android.widget.ImageView;

public class Shapes {
    int shapeImg;
    String shapeName;

    public Shapes(int shapeImg,String shapeName){
        this.shapeImg=shapeImg;
        this.shapeName=shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getShapeImg() {
        return shapeImg;
    }

    public void setShapeImg(int shapeImg) {
        this.shapeImg = shapeImg;
    }
}
