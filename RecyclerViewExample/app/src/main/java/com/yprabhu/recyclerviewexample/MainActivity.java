package com.yprabhu.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private static final String MOCK_URL = "https://unsplash.it/200/200?image=";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // specify an adapter
        adapter = new MyRecyclerAdapter(getFakeData(), R.layout.view_item);
        recyclerView.setAdapter(adapter);

        // use a linear layout manager
        layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    private List<ViewModel> getFakeData() {
        List<ViewModel> items = new ArrayList<ViewModel>();
        String url;
        for (int i = 20; i < 33; i++) {
            url = MOCK_URL + i;
            Log.d(MainActivity.class.getSimpleName(), "URL: " +url);
            items.add(new ViewModel(i, "Image " + (i + 1), url));
        }
        return items;
    }

}
