package com.example.student1.fedoskin;

import android.view.View;
import android.widget.TextView;

public class KekListener implements View.OnClickListener {
    MainActivity w;
    Uravnenie u;
    KekListener(MainActivity w, Uravnenie u){
        this.w= w;
        this.u= u;
    }
    @Override
    public void onClick(View view) {
        TextView tv = w.findViewById(R.id.otv);
        tv.setText(u.getOtv());
    }
}
