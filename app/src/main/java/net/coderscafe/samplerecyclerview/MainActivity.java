package net.coderscafe.samplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recyclerview);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MyAdapter(getItems());
        mRecyclerView.setAdapter(mAdapter);
    }

    private List<String> getItems() {
        List<String> items = new ArrayList<>();
        items.add("Evernote");
        items.add("Slack");
        items.add("Spotify");
        items.add("Todoist");
        items.add("AirDroid");
        return items;
    }
}
