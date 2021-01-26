package com.example.qnew.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import com.example.qnew.notification.NotificationAdapter;
import com.example.qnew.notification.NotificationData;

public class NotificationFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        // TODO: INTEGRATION
        List<NotificationData> sData = new ArrayList<NotificationData>();
        sData.add(new NotificationData("asd"));
        sData.add(new NotificationData("asd"));
        sData.add(new NotificationData("asd"));
        sData.add(new NotificationData("asd"));
        sData.add(new NotificationData("asd"));


        RecyclerView recyclerView = root.findViewById(R.id.rv_fragmentslideshow_recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        NotificationAdapter adapter = new NotificationAdapter(sData);
        recyclerView.setAdapter(adapter);

        return root;
    }

    @NotNull
    private NotificationFragment getNotificationFragment() {
        return this;
    }
}