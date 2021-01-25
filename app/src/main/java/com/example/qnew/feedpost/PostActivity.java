package com.example.qnew.feedpost;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.R;

import java.util.ArrayList;
import java.util.List;

public class PostActivity extends AppCompatActivity {
    private String[] names={"pradeep","pradeep1"};
    private int[] images={R.drawable.ic_menu_camera,R.drawable.ic_menu_gallery};
    private String[] questions={"asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf","jklk;jkl;jkl;jkjl;jkl;kj;jkl;jkl;kjl;jkl;jk;k;jlk;jkk;jkl;"};
    private String[] answers={"jklk;jkl;jkl;jkjl;jkl;kj;jkl;jkl;kjl;jkl;jk;k;jlk;jkk;jkl;","asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf"};
    private int[] lcounts={20,30};
    private int[] dcounts={2,3};
    private List<PostData> sData=new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.post_recycle );
       // sData.add("name"+R.drawable.ic_menu_camera)
        prepareTheList();
        recyclerView= findViewById( R.id.rv_postrecycle_recycle11 );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );


       PostAdapter adapter =new PostAdapter( sData );
        recyclerView.setAdapter( adapter );
    }

    private void prepareTheList()
    {
        int count =0;
        for (String name: names)
        {
            PostData postData1 = new PostData(name,images[count],questions[count],answers[count],lcounts[count],dcounts[count]);
            sData.add( postData1 );
            count++;
        }
    }
}
