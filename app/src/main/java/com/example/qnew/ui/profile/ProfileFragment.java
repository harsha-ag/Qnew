package com.example.qnew.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.qnew.R;
import com.example.qnew.entities.Profile;

public class ProfileFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.profile_fragment, container, false);

        // TODO: Integrate, get my profile details given user ID
        Profile myProfile = new Profile(
                "1",
                "St. Kitty Cat Junior III",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/best-boy-cat-names-1606242656.jpg?crop=0.668xw:1.00xh;0.214xw,0&resize=980:*",
                420,
                6969,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");


        ((TextView)root.findViewById(R.id.tv_myprofile_name)).setText(myProfile.getName());
        ((TextView)root.findViewById(R.id.tv_myprofile_follower_count)).setText(myProfile.getFollowerCount());
        ((TextView)root.findViewById(R.id.tv_myprofile_following_count)).setText(myProfile.getFollowingCount());
        ((TextView)root.findViewById(R.id.tv_myprofile_bio)).setText(myProfile.getBio());

        return root;
    }
}