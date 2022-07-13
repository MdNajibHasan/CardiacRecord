package com.example.cardiacrecorder.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardiacrecorder.Adapter.recyclerAdapter;
import com.example.cardiacrecorder.Model.RecordModel;
import com.example.cardiacrecorder.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<RecordModel> usersList;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        usersList = new ArrayList<>();
        setUserInfo();
        setAdapter();
    }

    private void setAdapter() {
        recyclerAdapter adapter = new recyclerAdapter(usersList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setUserInfo() {
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
        usersList.add(new RecordModel("23-12-1999", "80"));
    }
}