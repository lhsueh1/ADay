package com.leisure.aday.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.leisure.aday.R;
import com.leisure.aday.ui.SlideshowRecyclerViewAdapter;

import java.util.ArrayList;

public class SlideshowFragment extends Fragment implements SlideshowRecyclerViewAdapter.ItemClickListener {

    private SlideshowViewModel slideshowViewModel;

    EditText editedText;
    RecyclerView recyclerView;
    Button addButton;

    SlideshowRecyclerViewAdapter adapter;
    ArrayList<String> animalNames = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        editedText = root.findViewById(R.id.editText);
        addButton = root.findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animalNames.add(editedText.getText().toString());
                System.out.println(editedText.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        // data to populate the RecyclerView with
        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");

        // set up the RecyclerView
        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new SlideshowRecyclerViewAdapter(getActivity(), animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(getActivity(), "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}