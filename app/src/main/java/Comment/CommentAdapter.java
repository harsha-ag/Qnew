package Comment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.qnew.R;

import java.util.List;

class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.commentviewholder> {
    private List<CommentData> list;
    public CommentAdapter(List<CommentData> list){this.list=list;}
    @NonNull
    @Override
    public commentviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.comment_card,parent,false );
        return new commentviewholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull commentviewholder holder, int position) {
        CommentData commentData=list.get( position );
        holder.comment.setText( commentData.getComment() );
        Glide.with(holder.image.getContext())
                .load(commentData.getImageid())
                .placeholder(R.drawable.ic_menu_camera)
                .into(holder.image);
        holder.name.setText( commentData.getName() );
        holder.likecounts.setText( String.valueOf(  commentData.getLikecount()) );
        holder.dislikecounts.setText( String.valueOf(  commentData.getDislikecount() ));
    }




    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class commentviewholder extends RecyclerView.ViewHolder
    {
        public TextView comment;
        public ImageView image;
        public TextView name;
        public TextView likecounts;
        public TextView dislikecounts;

        public commentviewholder(@NonNull View itemView) {
            super( itemView );
            comment= itemView.findViewById( R.id.tv_post_answer_card_answer );
            image= itemView.findViewById( R.id.civ_post_answer_card_picture );
            name =itemView.findViewById( R.id.civ_comment_card_name );
            likecounts=itemView.findViewById( R.id.ibt_comment_card_likecount );
            dislikecounts=itemView.findViewById( R.id.ibt_comment_card_dislikecount );
        }
    }
}
