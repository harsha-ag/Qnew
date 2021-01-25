package com.example.qnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.qnew.entities.Profile;

public class ViewProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

        Profile profile = new Profile(
                "1",
                "St. Kitty Cat Junior III",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/best-boy-cat-names-1606242656.jpg?crop=0.668xw:1.00xh;0.214xw,0&resize=980:*",
                420,
                6969,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        populateFields(profile);
    }

    private void populateFields(Profile profile) {
        ((TextView)findViewById(R.id.tv_myprofile_name)).setText(profile.getName());
        if (profile.getBio() != null) ((TextView)findViewById(R.id.tv_myprofile_bio)).setText(profile.getBio());
        ((TextView)findViewById(R.id.tv_myprofile_follower_count)).setText(Integer.toString(profile.getFollowerCount()));
        ((TextView)findViewById(R.id.tv_myprofile_following_count)).setText(Integer.toString(profile.getFollowingCount()));
        Glide.with(this)
                .load(profile.getProfilePictureURL())
                .placeholder(R.drawable.cat)
                .into((ImageView)findViewById(R.id.civ_profile_picture));

        Button followButton = findViewById(R.id.bt_profile_follow);
        Button unfollowButton = findViewById(R.id.bt_profile_unfollow);

        //

        followButton.setOnClickListener(v -> {
            // follow
        });


        findViewById(R.id.bt_myprofile_getposts).setOnClickListener(v -> {
            // TODO: redirect to Teja's feed activity
            Intent goToPosts = new Intent(ViewProfileActivity.this, ViewProfileActivity.class);
            goToPosts.putExtra("userID", profile.getUserID());
            startActivity(goToPosts);
        });
    }
}