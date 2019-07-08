package com.example.submitapk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Car> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(CarData.getListData());
        showList();
    }


    private void showList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(this);
        listAdapter.setListPresident(list);
        rvCategory.setAdapter(listAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedArray(list.get(position));

            }
        });

    }

    private void showSelectedArray(Car car) {
        Intent x = new Intent(MainActivity.this, IntentDetail.class);
        x.putExtra(IntentDetail.Array_Num, car.getArrayNum());
        x.putExtra(IntentDetail.Title, car.getModel());
        x.putExtra(IntentDetail.Pic, car.getImg());
        startActivity(x);
    }

}

