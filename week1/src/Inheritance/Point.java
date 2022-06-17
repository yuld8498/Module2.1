package Inheritance;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;
    public Point(float x,float y){
        this.x =x;
        this.y =y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x= x;
        this.y =y;
    }
    public float[] getXY(){
        float[] array = {x,y};
        return array;
    }
    public String toString(){
        return Arrays.toString(getXY());
    }
}
