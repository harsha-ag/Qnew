package com.example.qnew.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.qnew.R;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private String[] names={"pradeep","pradeep1","pradeep2"};
    private int[] images={R.drawable.ic_menu_camera,R.drawable.ic_menu_gallery,R.drawable.ic_launcher_background};
    private List<SearchData> sData=new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_searchlists );

        String s = getIntent().getStringExtra( "TITLE" );
        Log.d("TEST", s);
        Toast.makeText( SearchActivity.this,s, Toast.LENGTH_SHORT ).show();
        recyclerView= findViewById( R.id.rv__productlisting_recycleview );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        prepareTheList();
        SearchAdapter adapter =new SearchAdapter( sData );
        recyclerView.setAdapter( adapter );
    }
    private void prepareTheList()
    {
        int count =0;
        for (String name: names)
        {
            SearchData searchData = new SearchData(name,images[count]);
           sData.add( searchData );
           count++;
        }
    }



}