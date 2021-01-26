package com.example.qnew.ui.answer;

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

public class AnswerFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate( R.layout.fragment_answer, container, false);

        List<AnswerData> sData = new ArrayList<>();
        sData.add(new AnswerData( "https://i.guim.co.uk/img/media/7a633730f5f90db3c12f6efc954a2d5b475c3d4a/0_138_5544_3327/master/5544.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=27c09d27ccbd139fd0f7d1cef8f7d41d","John", "Sports", "No.1 Test team in world?"));
        sData.add(new AnswerData( "https://i.guim.co.uk/img/media/7a633730f5f90db3c12f6efc954a2d5b475c3d4a/0_138_5544_3327/master/5544.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=27c09d27ccbd139fd0f7d1cef8f7d41d", "John1","Movies", "Is bob the worlds best Actor?"));
        sData.add(new AnswerData( "https://i.guim.co.uk/img/media/7a633730f5f90db3c12f6efc954a2d5b475c3d4a/0_138_5544_3327/master/5544.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=27c09d27ccbd139fd0f7d1cef8f7d41d", "John2","Tech", "Whats new?"));
        sData.add(new AnswerData("https://i.guim.co.uk/img/media/7a633730f5f90db3c12f6efc954a2d5b475c3d4a/0_138_5544_3327/master/5544.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=27c09d27ccbd139fd0f7d1cef8f7d41d", "John3", "Sports", "When is ipl?"));
        sData.add(new AnswerData( "https://i.guim.co.uk/img/media/7a633730f5f90db3c12f6efc954a2d5b475c3d4a/0_138_5544_3327/master/5544.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=27c09d27ccbd139fd0f7d1cef8f7d41d","John4", "Movies", "New movie is comming?"));
        sData.add(new AnswerData( "https://i.guim.co.uk/img/media/7a633730f5f90db3c12f6efc954a2d5b475c3d4a/0_138_5544_3327/master/5544.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=27c09d27ccbd139fd0f7d1cef8f7d41d","John5", "Tech", "All good?"));
        sData.add(new AnswerData( "https://i.guim.co.uk/img/media/7a633730f5f90db3c12f6efc954a2d5b475c3d4a/0_138_5544_3327/master/5544.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=27c09d27ccbd139fd0f7d1cef8f7d41d", "John6","Sports", "MSD retired?"));

        RecyclerView recyclerView = root.findViewById(R.id.rv_fragment_answer_addanswer);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        AnswerAdapter adapter = new AnswerAdapter(sData);
        recyclerView.setAdapter(adapter);



        return root;

    }
}
