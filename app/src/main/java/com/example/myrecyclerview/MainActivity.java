package com.example.myrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FamilyAdapter adapter;
    private ArrayList<Family> familyArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        adapter = new FamilyAdapter(familyArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        familyArrayList = new ArrayList<>();
        familyArrayList.add(new Family("Sadeli", "Ayah","03 November 1961" , R.drawable.daddy));
        familyArrayList.add(new Family("Supianah", "Ibu", "28 July 1964" , R.drawable.mom));
        familyArrayList.add(new Family("Eva Fatma Nadiana", "Kakak", "01 Agustus 1992" , R.drawable.sister));
        familyArrayList.add(new Family("Erviansyah Fadly", "Saya", "15 Mei 1999" , R.drawable.me));
    }
}
