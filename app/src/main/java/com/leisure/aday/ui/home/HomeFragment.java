package com.leisure.aday.ui.home;

import android.app.Service;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.leisure.aday.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    SwitchCompat switch00;
    SwitchCompat switch01;
    SwitchCompat switch02;
    SwitchCompat switch03;
    SwitchCompat switch04;
    SwitchCompat switch05;
    SwitchCompat switch06;
    SwitchCompat switch07;
    SwitchCompat switch08;
    SwitchCompat switch09;
    SwitchCompat switch10;
    SwitchCompat switch11;
    SwitchCompat switch12;
    SwitchCompat switch13;
    SwitchCompat switch14;
    SwitchCompat switch15;
    SwitchCompat switch16;
    SwitchCompat switch17;
    SwitchCompat switch18;
    SwitchCompat switch19;
    SwitchCompat switch20;
    SwitchCompat switch21;
    SwitchCompat switch22;
    SwitchCompat switch23;
    SwitchCompat switch24;
    SwitchCompat switch25;
    SwitchCompat switch26;
    SwitchCompat switch27;
    SwitchCompat switch28;
    SwitchCompat switch29;
    SwitchCompat switch30;
    SwitchCompat switch31;
    SwitchCompat switch32;
    SwitchCompat switch33;
    SwitchCompat switch34;
    SwitchCompat switch35;

    String[] names;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        findViews(root);
        setOnCheckedChangeListeners();

        Resources res = getResources();
        names = res.getStringArray(R.array.names);

        return root;
    }

    private final CompoundButton.OnCheckedChangeListener switchListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            int randomSwitch = (int) (Math.random() * 36);
            int randomNameID = (int) (Math.random() * 36);

            isChecked = Math.random() < 0.3;
            switch (randomSwitch) {
                case 0:
                    switch00.setText(names[randomNameID]);
                    switch00.setChecked(isChecked);
                    break;
                case 1:
                    switch01.setText(names[randomNameID]);
                    switch01.setChecked(isChecked);
                    break;
                case 2:
                    switch02.setText(names[randomNameID]);
                    switch02.setChecked(isChecked);
                    break;
                case 3:
                    switch03.setText(names[randomNameID]);
                    switch03.setChecked(isChecked);
                    break;
                case 4:
                    switch04.setText(names[randomNameID]);
                    switch04.setChecked(isChecked);
                    break;
                case 5:
                    switch05.setText(names[randomNameID]);
                    switch05.setChecked(isChecked);
                    break;
                case 6:
                    switch06.setText(names[randomNameID]);
                    switch06.setChecked(isChecked);
                    break;
                case 7:
                    switch07.setText(names[randomNameID]);
                    switch07.setChecked(isChecked);
                    break;
                case 8:
                    switch08.setText(names[randomNameID]);
                    switch08.setChecked(isChecked);
                    break;
                case 9:
                    switch09.setText(names[randomNameID]);
                    switch09.setChecked(isChecked);
                    break;
                case 10:
                    switch10.setText(names[randomNameID]);
                    switch10.setChecked(isChecked);
                    break;
                case 11:
                    switch11.setText(names[randomNameID]);
                    switch11.setChecked(isChecked);
                    break;
                case 12:
                    switch12.setText(names[randomNameID]);
                    switch12.setChecked(isChecked);
                    break;
                case 13:
                    switch13.setText(names[randomNameID]);
                    switch13.setChecked(isChecked);
                    break;
                case 14:
                    switch14.setText(names[randomNameID]);
                    switch14.setChecked(isChecked);
                    break;
                case 15:
                    switch15.setText(names[randomNameID]);
                    switch15.setChecked(isChecked);
                    break;
                case 16:
                    switch16.setText(names[randomNameID]);
                    switch16.setChecked(isChecked);
                    break;
                case 17:
                    switch17.setText(names[randomNameID]);
                    switch17.setChecked(isChecked);
                    break;
                case 18:
                    switch18.setText(names[randomNameID]);
                    switch18.setChecked(isChecked);
                    break;
                case 19:
                    switch19.setText(names[randomNameID]);
                    switch19.setChecked(isChecked);
                    break;
                case 20:
                    switch20.setText(names[randomNameID]);
                    switch20.setChecked(isChecked);
                    break;
                case 21:
                    switch21.setText(names[randomNameID]);
                    switch21.setChecked(isChecked);
                    break;
                case 22:
                    switch22.setText(names[randomNameID]);
                    switch22.setChecked(isChecked);
                    break;
                case 23:
                    switch23.setText(names[randomNameID]);
                    switch23.setChecked(isChecked);
                    break;
                case 24:
                    switch24.setText(names[randomNameID]);
                    switch24.setChecked(isChecked);
                    break;
                case 25:
                    switch25.setText(names[randomNameID]);
                    switch25.setChecked(isChecked);
                    break;
                case 26:
                    switch26.setText(names[randomNameID]);
                    switch26.setChecked(isChecked);
                    break;
                case 27:
                    switch27.setText(names[randomNameID]);
                    switch27.setChecked(isChecked);
                    break;
                case 28:
                    switch28.setText(names[randomNameID]);
                    switch28.setChecked(isChecked);
                    break;
                case 29:
                    switch29.setText(names[randomNameID]);
                    switch29.setChecked(isChecked);
                    break;
                case 30:
                    switch30.setText(names[randomNameID]);
                    switch30.setChecked(isChecked);
                    break;
                case 31:
                    switch31.setText(names[randomNameID]);
                    switch31.setChecked(isChecked);
                    break;
                case 32:
                    switch32.setText(names[randomNameID]);
                    switch32.setChecked(isChecked);
                    break;
                case 33:
                    switch33.setText(names[randomNameID]);
                    switch33.setChecked(isChecked);
                    break;
                case 34:
                    switch34.setText(names[randomNameID]);
                    switch34.setChecked(isChecked);
                    break;
                case 35:
                    switch35.setText(names[randomNameID]);
                    switch35.setChecked(isChecked);
            }

            buttonView.setText(R.string.nav_header_title);

            Vibrator v = (Vibrator) requireActivity().getSystemService(Service.VIBRATOR_SERVICE);
            v.vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE));
        }
    };

    private void setOnCheckedChangeListeners() {
        switch00.setOnCheckedChangeListener(switchListener);
        switch01.setOnCheckedChangeListener(switchListener);
        switch02.setOnCheckedChangeListener(switchListener);
        switch03.setOnCheckedChangeListener(switchListener);
        switch04.setOnCheckedChangeListener(switchListener);
        switch05.setOnCheckedChangeListener(switchListener);
        switch06.setOnCheckedChangeListener(switchListener);
        switch07.setOnCheckedChangeListener(switchListener);
        switch08.setOnCheckedChangeListener(switchListener);
        switch09.setOnCheckedChangeListener(switchListener);
        switch10.setOnCheckedChangeListener(switchListener);
        switch11.setOnCheckedChangeListener(switchListener);
        switch12.setOnCheckedChangeListener(switchListener);
        switch13.setOnCheckedChangeListener(switchListener);
        switch14.setOnCheckedChangeListener(switchListener);
        switch15.setOnCheckedChangeListener(switchListener);
        switch16.setOnCheckedChangeListener(switchListener);
        switch17.setOnCheckedChangeListener(switchListener);
        switch18.setOnCheckedChangeListener(switchListener);
        switch19.setOnCheckedChangeListener(switchListener);
        switch20.setOnCheckedChangeListener(switchListener);
        switch21.setOnCheckedChangeListener(switchListener);
        switch22.setOnCheckedChangeListener(switchListener);
        switch23.setOnCheckedChangeListener(switchListener);
        switch24.setOnCheckedChangeListener(switchListener);
        switch25.setOnCheckedChangeListener(switchListener);
        switch26.setOnCheckedChangeListener(switchListener);
        switch27.setOnCheckedChangeListener(switchListener);
        switch28.setOnCheckedChangeListener(switchListener);
        switch29.setOnCheckedChangeListener(switchListener);
        switch30.setOnCheckedChangeListener(switchListener);
        switch31.setOnCheckedChangeListener(switchListener);
        switch32.setOnCheckedChangeListener(switchListener);
        switch33.setOnCheckedChangeListener(switchListener);
        switch34.setOnCheckedChangeListener(switchListener);
        switch35.setOnCheckedChangeListener(switchListener);
    }

    private void findViews(View root) {
        switch00 = root.findViewById(R.id.switch00);
        switch01 = root.findViewById(R.id.switch01);
        switch02 = root.findViewById(R.id.switch02);
        switch03 = root.findViewById(R.id.switch03);
        switch04 = root.findViewById(R.id.switch04);
        switch05 = root.findViewById(R.id.switch05);
        switch06 = root.findViewById(R.id.switch06);
        switch07 = root.findViewById(R.id.switch07);
        switch08 = root.findViewById(R.id.switch08);
        switch09 = root.findViewById(R.id.switch09);
        switch10 = root.findViewById(R.id.switch10);
        switch11 = root.findViewById(R.id.switch11);
        switch12 = root.findViewById(R.id.switch12);
        switch13 = root.findViewById(R.id.switch13);
        switch14 = root.findViewById(R.id.switch14);
        switch15 = root.findViewById(R.id.switch15);
        switch16 = root.findViewById(R.id.switch16);
        switch17 = root.findViewById(R.id.switch17);
        switch18 = root.findViewById(R.id.switch18);
        switch19 = root.findViewById(R.id.switch19);
        switch20 = root.findViewById(R.id.switch20);
        switch21 = root.findViewById(R.id.switch21);
        switch22 = root.findViewById(R.id.switch22);
        switch23 = root.findViewById(R.id.switch23);
        switch24 = root.findViewById(R.id.switch24);
        switch25 = root.findViewById(R.id.switch25);
        switch26 = root.findViewById(R.id.switch26);
        switch27 = root.findViewById(R.id.switch27);
        switch28 = root.findViewById(R.id.switch28);
        switch29 = root.findViewById(R.id.switch29);
        switch30 = root.findViewById(R.id.switch30);
        switch31 = root.findViewById(R.id.switch31);
        switch32 = root.findViewById(R.id.switch32);
        switch33 = root.findViewById(R.id.switch33);
        switch34 = root.findViewById(R.id.switch34);
        switch35 = root.findViewById(R.id.switch35);
    }


}