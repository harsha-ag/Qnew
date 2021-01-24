package com.example.qnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PostLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_post_layout );

        ImageView imageView = findViewById(R.id.proimage);
        Glide.with(this)
                .load("https://images.livemint.com/rf/Image-621x414/LiveMint/Period2/2017/04/06/Photos/Processed/munnar2-krXG--621x414@LiveMint.jpg")
                .into(imageView);


    }
}