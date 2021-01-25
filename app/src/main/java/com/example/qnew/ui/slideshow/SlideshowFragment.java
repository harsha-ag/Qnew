package com.example.qnew.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.R;
import com.example.qnew.feedpost.PostData;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import notification.NotificationAdapter;
import notification.NotificationData;

public class SlideshowFragment extends Fragment {
    private String[] notify={"asdfsasdfasdfasdfasdfasdfasdfasdfasdfasdfasdf","jklk;jkl;jkl;jkjl;jkl;kj;jkl;jkl;kjl;jkl;jk;k;jlk;jkk;jkl;"};
    private List<NotificationData> sData=new ArrayList<>();
    private RecyclerView recyclerView;
    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        slideshowViewModel =
//                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
      //  final TextView textView = root.findViewById(R.id.text_slideshow);
//        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        prepareTheList();
        recyclerView= root.findViewById(R.id.rv_fragmentslideshow_recycleview);
        recyclerView.setLayoutManager( new LinearLayoutManager( this.getContext()) );
        NotificationAdapter adapter=new NotificationAdapter( sData );
        recyclerView.setAdapter( adapter );
        return root;
    }

    @NotNull
    private SlideshowFragment getSlideshowFragment() {
        return this;
    }
    private void prepareTheList()
    {
        int count =0;
        for (String notif: notify)
        {
            NotificationData postData1 = new NotificationData(notif);
            sData.add( postData1 );
            count++;
        }
    }
}