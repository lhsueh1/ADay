package com.leisure.aday;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class SwitchActivity extends AppCompatActivity {

    SwitchCompat switch00;
    SwitchCompat switch01;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);


        switch00 = findViewById(R.id.switch00);
        //switch00.setChecked(true);



        /*switch00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch01.setChecked(switch00.isChecked());
                System.out.println("test");
            }
        });*/








        switch01 = findViewById(R.id.switch01);


    }



}
