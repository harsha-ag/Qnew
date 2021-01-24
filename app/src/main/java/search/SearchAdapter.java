package search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.searchviewholder>{

    private List<SearchListData> list;

    public SearchAdapter(List<SearchListData> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public searchviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from( parent.getContext() ).inflate( R.layout.searchlititems,parent,false );
        return new searchviewholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull searchviewholder holder, int position) {
       SearchListData searchListData=list.get( position );
       holder.personname.setText( searchListData.getNameid() );
       holder.personimage.setImageResource( searchListData.getImageid() );

    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class searchviewholder extends RecyclerView.ViewHolder
    {
        public TextView personname;
        public CircleImageView personimage;
        public searchviewholder(@NonNull View itemView) {
            super( itemView );
            personname= itemView.findViewById( R.id.tv_lb_username );
            personimage= itemView.findViewById( R.id.profile_image );
        }
    }
}
