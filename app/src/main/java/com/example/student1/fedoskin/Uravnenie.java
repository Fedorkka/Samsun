package com.example.student1.fedoskin;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class Uravnenie{
    EditText a;
    EditText b;
    EditText c;
    Uravnenie(EditText a, EditText b, EditText c){
        this.a = a;
        this.b= b;
        this.c= c;
    }
    public String getOtv(){
        double a_o = Double.parseDouble(a.getText().toString());
        double b_o = Double.parseDouble(b.getText().toString());
        double c_o = Double.parseDouble(c.getText().toString());
        double d= b_o*b_o-4*a_o*c_o;
        String otv="";
        if(d> 0){
            double x1 = (-b_o+sqrt(d))/(2*a_o);
            double x2 = (-b_o-sqrt(d))/(2*a_o);
            otv = x1+"  ;  "+x2;
        }
        if(d== 0){
            double x1 = (-b_o+sqrt(d))/(2*a_o);
            double x2 = (-b_o-sqrt(d))/(2*a_o);
            otv = x1+"";
        }
        if(d<0){
            otv = "Нет решений";
        }
        return otv;
    }
}
