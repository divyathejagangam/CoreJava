package com.edu;
class AreaFigures
{
    //calculate area of reac
   void area(int l, int b){ 
        int ar=l*b;
        System.out.println("Area of reactangle "+ar);
  }
void area(int side){
    int ar=side*side;
    System.out.println("Area of square "+ar);
 }
void area(float r){
   float ar;
   ar=3.14159f*r*r;
   System.out.println("Area of a circle"+ar);
 }
void area(float b, float h){
     float ar;
    ar=(b*h)*0.5f;
   System.out.println("Area of a triangle "+ar);
 
}
}

public class AreaMain{
public static void main(String args[]){
  AreaFigures ob = new AreaFigures();
  ob.area(5);
  ob.area(6,8);
  ob.area(9.8f);
  ob.area(2.3f,5.6f);
}
}

