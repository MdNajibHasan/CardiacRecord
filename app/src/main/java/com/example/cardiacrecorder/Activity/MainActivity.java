package com.example.cardiacrecorder.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.cardiacrecorder.Adapter.recyclerAdapter;
import com.example.cardiacrecorder.Model.RecordModel;
import com.example.cardiacrecorder.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<RecordModel> usersList;
    private RecyclerView recyclerView;
    private ImageButton AddNewRecord;
    private String userName,userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        userName = b.get("UserName").toString();
        userId = b.get("UserId").toString();









        recyclerView = findViewById(R.id.recyclerView);
        AddNewRecord = findViewById(R.id.addNewRecord);


        usersList = new ArrayList<>();
        setUserInfo();
        setAdapter();


        AddNewRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AddDetailsActivity.class);
                intent.putExtra("UserName",userName);
                intent.putExtra("UserId",userId);

                startActivity(intent);

            }
        });


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