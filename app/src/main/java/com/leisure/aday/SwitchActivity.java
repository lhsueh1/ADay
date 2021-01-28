package com.leisure.aday;

import android.os.Bundle;
import android.widget.Switch;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SwitchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        Switch switch00 = findViewById(R.id.switch00);
        Switch switch01 = findViewById(R.id.switch01);
    }
}
