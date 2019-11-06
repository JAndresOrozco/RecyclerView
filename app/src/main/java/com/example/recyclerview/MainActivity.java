package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pais> listaPaises;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    listaPaises = new ArrayList<>();
    recyclerView = findViewById(R.id.rv);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));

    llenarPaises();

    AdapterCountry adapter = new AdapterCountry(listaPaises);
    recyclerView.setAdapter(adapter);
    }

    private void llenarPaises(){
        listaPaises.add(new Pais("Android", "Lorem", R.drawable.ic_launcher_background));
        listaPaises.add(new Pais("GitHub", "Lorem", R.drawable.gitt));
    }
}
