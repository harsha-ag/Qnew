package com.example.qnew.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.qnew.R;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchlists);

        List<SearchData> results = new ArrayList<SearchData>();
        results.add(new SearchData("Jim", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg"));
        results.add(new SearchData("Jim", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg"));
        results.add(new SearchData("Jim", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg"));
        results.add(new SearchData("Jim", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg"));
        results.add(new SearchData("Jim", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg"));

        String query = getIntent().getStringExtra("query");

        RecyclerView recyclerView = findViewById(R.id.rv_productlisting_recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        SearchAdapter adapter = new SearchAdapter(results);
        recyclerView.setAdapter(adapter);
    }
}