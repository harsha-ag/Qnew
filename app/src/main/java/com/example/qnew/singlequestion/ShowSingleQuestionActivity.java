package com.example.qnew.singlequestion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.qnew.R;
import com.example.qnew.feedpost.PostAdapter;
import com.example.qnew.feedpost.PostData;

import java.util.ArrayList;
import java.util.List;

public class ShowSingleQuestionActivity extends AppCompatActivity {
    private String[] answers={"asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf","jklk;jkl;jkl;jkjl;jkl;kj;jkl;jkl;kjl;jkl;jk;k;jlk;jkk;jkl;"};
    private int[] images={R.drawable.ic_menu_camera,R.drawable.ic_menu_gallery};
    private String[] names={"pradeep","pradeep1"};
    private List<ShowSingleQuestionData> sData=new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_show_single_question);
        prepareTheList();
        recyclerView= findViewById( R.id.rv_singlepost_answers );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        ShowSingleQuestionAdapter adapter =new ShowSingleQuestionAdapter( sData );
        recyclerView.setAdapter( adapter );
    }
    private void prepareTheList()
    {
        int count =0;
        for (String answer: answers)
        {
            ShowSingleQuestionData showSingleQuestionData = new ShowSingleQuestionData(answer,images[count],names[count]);
            sData.add( showSingleQuestionData );
            count++;
        }
    }
}