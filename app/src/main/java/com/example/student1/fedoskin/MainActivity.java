package com.example.student1.fedoskin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText a = this.findViewById(R.id.a);
        EditText b = this.findViewById(R.id.b);
        EditText c = this.findViewById(R.id.c);
        Uravnenie u = new Uravnenie(a, b, c);
        Button bt = this.findViewById(R.id.bt);
        KekListener listener= new KekListener(this, u);
        bt.setOnClickListener(listener);
    }

}
