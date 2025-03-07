package com.example.speedychat;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvListChat;

    private ArrayList<ModelChat> data = new
            ArrayList<>();

    ModelChat modelChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvListChat = findViewById(R.id.rv_tugas6);
        rvListChat.setHasFixedSize(true);
        data.addAll(DataChat.ambilDataChat());
        tampilDataCard();

    }

    private void tampilDataCard() {
        rvListChat.setLayoutManager(new
                LinearLayoutManager(this));
        AdapterChat colokanChat = new AdapterChat(data);
        rvListChat.setAdapter(colokanChat);
    }
}