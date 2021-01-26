package com.example.qnew.singlequestion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.qnew.R;
import com.example.qnew.feedpost.PostAdapter;
import com.example.qnew.feedpost.PostData;
import com.example.qnew.search.SearchAdapter;
import com.example.qnew.search.SearchData;

import java.util.ArrayList;
import java.util.List;

public class ShowSingleQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_show_single_question);

        List<ShowSingleQuestionData> results = new ArrayList<ShowSingleQuestionData>();
        results.add(new ShowSingleQuestionData("Answer", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg","Leonardo"));
        results.add(new ShowSingleQuestionData("Answer", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg","Leonardo"));
        results.add(new ShowSingleQuestionData("Answer", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg","Leonardo"));
        results.add(new ShowSingleQuestionData("Answer", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg","Leonardo"));
        results.add(new ShowSingleQuestionData("Answer", "https://vetmed.tamu.edu/news/wp-content/uploads/sites/9/2019/01/pettalk011719_450x300-300x200.jpg","Leonardo"));

        String query = getIntent().getStringExtra("query");

        RecyclerView recyclerView = findViewById(R.id.rv_singlepost_answers);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ShowSingleQuestionAdapter adapter = new ShowSingleQuestionAdapter(results);
        recyclerView.setAdapter(adapter);
    }

}