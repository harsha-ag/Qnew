package com.example.qnew.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.R;
import com.example.qnew.feedpost.PostAdapter;
import com.example.qnew.feedpost.PostData;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private String[] names={"pradeep","pradeep1","pradeep2"};
    private int[] images={R.drawable.ic_menu_camera,R.drawable.ic_menu_gallery,R.drawable.ic_menu_camera};
    private String[] questions={"asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf","jklk;jkl;jkl;jkjl;jkl;kj;jkl;jkl;kjl;jkl;jk;k;jlk;jkk;jkl;","asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf"};
    private String[] answers={"jklk;jkl;jkl;jkjl;jkl;kj;jkl;jkl;kjl;jkl;jk;k;jlk;jkk;jkl;","asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf","asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf"};
    private int[] lcounts={20,30,40};
    private int[] dcounts={2,3,4};
    private List<PostData> sData=new ArrayList<>();
    private RecyclerView recyclerView;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        prepareTheList();
        recyclerView= root.findViewById(R.id.rv_fragmenthome_recycle);


       recyclerView.setLayoutManager( new LinearLayoutManager( this.getContext()) );

        PostAdapter adapter =new PostAdapter( sData );
        recyclerView.setAdapter( adapter );


        return root;
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