package com.example.qnew.feedpost;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.qnew.R;
import com.example.qnew.search.SearchAdapter;
import com.example.qnew.search.SearchListData;

import java.util.ArrayList;
import java.util.List;

public class post extends AppCompatActivity {
    private String[] names={"pradeep","pradeep1"};
    private int[] images={R.drawable.ic_menu_camera,R.drawable.ic_menu_gallery};
    private String[] questions={"asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf","jklk;jkl;jkl;jkjl;jkl;kj;jkl;jkl;kjl;jkl;jk;k;jlk;jkk;jkl;"};
    private String[] answers={"jklk;jkl;jkl;jkjl;jkl;kj;jkl;jkl;kjl;jkl;jk;k;jlk;jkk;jkl;","asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf"};
    private int[] lcounts={20,30};
    private int[] dcounts={2,3};
    private List<postdata> sData=new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_post_layout );


        recyclerView= findViewById( R.id.rv_postrecycle_recycle11 );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        prepareTheList();

       postAdapter adapter =new postAdapter( sData );
        recyclerView.setAdapter( adapter );



//
//        ImageView imageView = findViewById(R.id.cv_postlayout_proimage);
//
//        Glide.with(this)
//                .load("https://images.livemint.com/rf/Image-621x414/LiveMint/Period2/2017/04/06/Photos/Processed/munnar2-krXG--621x414@LiveMint.jpg")
//                .into(imageView);


    }

    private void prepareTheList()
    {
        int count =0;
        for (String name: names)
        {
            postdata postdata= new postdata(name,images[count],questions[count],answers[count],lcounts[count],dcounts[count]);
            sData.add( postdata );
            count++;
        }
    }
}
