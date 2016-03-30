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
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private static final String FAKE_URL = "https://unsplash.it/200/200?image=";
    private static final int GRID_SPAN = 2;
    private static final int STAGGERED_GRID_SPAN = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_layout);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        Intent intent = getIntent();
        String type = intent.getStringExtra(MainActivity.TYPE);

        List<String> items = getFakeStaggeredData();

        if (type.equals(MainActivity.GRID)) {
            adapter = new RecyclerAdapter(getFakeData(), R.layout.grid_view_item, new RecyclerAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(ViewModel item) {
                    Toast.makeText(getApplicationContext(), "Item Clicked", Toast.LENGTH_LONG).show();
                }
            });
            recyclerView.setAdapter(adapter);
            layoutManager = new GridLayoutManager(this, GRID_SPAN);
        } else if (type.equals(MainActivity.STAGGERED_GRID)) {
            adapter = new StaggeredRecyclerAdapter(items, R.layout.text_view_item);
            recyclerView.setAdapter(adapter);
            layoutManager = new StaggeredGridLayoutManager(STAGGERED_GRID_SPAN, StaggeredGridLayoutManager.VERTICAL);

        } else {
            adapter = new RecyclerAdapter(getFakeData(), R.layout.list_view_item, new RecyclerAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(ViewModel item) {
                    Toast.makeText(getApplicationContext(), "Item Clicked", Toast.LENGTH_LONG).show();
                }
            });
            recyclerView.setAdapter(adapter);
            layoutManager = new LinearLayoutManager(this);
        }
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    private List<ViewModel> getFakeData() {
        List<ViewModel> items = new ArrayList<>();
        String url;
        for (int i = 10; i < 20; i++) {
            url = FAKE_URL + i;
            Log.d(MainActivity.class.getSimpleName(), "URL: " +url);
            items.add(new ViewModel(i, "Image " + (i - 9), url));
        }
        return items;
    }

    private List<String> getFakeStaggeredData() {
        List<String> items = new ArrayList<>();
        items.add("Cheese");
        items.add("Cheese strings babybel cheese on toast. Roquefort fromage frais dolcelatte taleggio chalk");
        items.add("Blue castello cheese on toast swiss");
        items.add("queso pecorino edam fromage");
        items.add("Mozzarella");
        items.add("Danish fontina");
        items.add("Cheesy grin parmesan stinking bishop ricotta cheeseburger boursin hard cheese cheesecake.");
        items.add("Lorem");
        items.add("Edam bocconcini jarlsberg");
        items.add("Say cheese camembert de normandie");
        items.add("Cheese");
        items.add("Cheese strings babybel cheese on toast. Roquefort fromage frais dolcelatte taleggio chalk");
        items.add("Blue castello cheese on toast swiss");
        items.add("queso pecorino edam fromage");
        items.add("Mozzarella");
        items.add("Danish fontina");
        items.add("Cheesy grin parmesan stinking bishop ricotta cheeseburger boursin hard cheese cheesecake.");
        items.add("Lorem");
        items.add("Edam bocconcini jarlsberg");
        items.add("Say cheese camembert de normandie");
        return items;
    }
}
