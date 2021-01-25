package notification;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.R;
import com.example.qnew.singlequestion.ShowSingleQuestionAdapter;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.notificationviewholder> {
    private List<NotificationData> list;
    public NotificationAdapter(List<NotificationData> list){this.list=list;}
    @NonNull
    @Override
    public notificationviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.notifytext,parent,false );
        return new notificationviewholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull notificationviewholder holder, int position) {
        NotificationData notificationData=list.get( position );
        holder.notify.setText( notificationData.getNotify() );
    }




    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class notificationviewholder extends RecyclerView.ViewHolder{
        public TextView notify;
        public notificationviewholder(@NonNull View itemView)
        {
            super( itemView );
            notify=itemView.findViewById( R.id.tv_notifytext_textview );
        }
    }
}
