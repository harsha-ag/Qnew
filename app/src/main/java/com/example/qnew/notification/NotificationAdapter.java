package com.example.qnew.notification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.R;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.notificationviewholder> {
    private List<NotificationData> list;

    public NotificationAdapter(List<NotificationData> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public notificationviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notifytext, parent, false);
        return new notificationviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull notificationviewholder holder, int position) {
        holder.notification.setText(list.get(position).getNotification());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class notificationviewholder extends RecyclerView.ViewHolder {
        public TextView notification;

        public notificationviewholder(@NonNull View itemView) {
            super(itemView);
            notification = itemView.findViewById(R.id.tv_notifytext_textview);
        }
    }
}
