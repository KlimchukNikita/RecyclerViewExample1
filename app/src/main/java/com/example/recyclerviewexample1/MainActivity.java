package com.example.recyclerviewexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList <String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls. add("");
        mNames.add("1");

        mImageUrls. add("");
        mNames.add("2");

        mImageUrls. add("");
        mNames.add("3");

        mImageUrls. add("");
        mNames.add("4");

        mImageUrls. add("");
        mNames.add("5");

        mImageUrls. add("");
        mNames.add("6");

        mImageUrls. add("");
        mNames.add("7");

        mImageUrls. add("");
        mNames.add("8");

        mImageUrls. add("");
        mNames.add("9");

        mImageUrls. add("");
        mNames.add("10");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
