package com.yprabhu.recyclerviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button listButton;
    private Button gridButton;
    private Button staggeredGridButton;

    public static final String TYPE = "type";
    public static final String LIST = "type";
    public static final String GRID = "grid";
    public static final String STAGGERED_GRID = "staggered_grid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listButton = (Button) findViewById(R.id.list_button);
        gridButton = (Button) findViewById(R.id.grid_button);
        staggeredGridButton = (Button) findViewById(R.id.staggered_button);

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecyclerActivity.class);
                intent.putExtra(TYPE, LIST);
                startActivity(intent);
            }
        });

        gridButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecyclerActivity.class);
                intent.putExtra(TYPE, GRID);
                startActivity(intent);
            }
        });

        staggeredGridButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RecyclerActivity.class);
                intent.putExtra(TYPE, STAGGERED_GRID);
                startActivity(intent);
            }
        });
    }
}
