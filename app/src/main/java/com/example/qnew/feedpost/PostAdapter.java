package com.example.qnew.feedpost;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.qnew.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private List<PostData> list;

    public PostAdapter(List<PostData> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_post_layout, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        PostData post = list.get(position);
        holder.nameq.setText(post.getNameQid() + "");

        Glide.with(holder.imageq.getContext())
                .load(post.getImageQid())
                .placeholder(R.drawable.ic_menu_camera)
                .into(holder.imageq);

        holder.question.setText(post.getQuestion());
        holder.answer.setText(post.getAnswer());
        holder.lcount.setText(Integer.toString(post.getLcount()));
        holder.dcount.setText(Integer.toString(post.getDcount()));
        holder.category.setText(post.getCategory());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    class PostViewHolder extends RecyclerView.ViewHolder {
        public TextView nameq;
        public ImageView imageq;
        public TextView question;
        public TextView answer;
        public TextView lcount;
        public TextView dcount;
        public ImageButton upvote;
        public ImageButton downvote;
        public TextView category;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            nameq = itemView.findViewById(R.id.tv_answerfragment_card_name );
            imageq = itemView.findViewById(R.id.cv_answerfragment_card_proimage );
            question = itemView.findViewById(R.id.tv_answerfragment_card_category );
            answer = itemView.findViewById(R.id.tv_answerfragment_card_question );
            lcount = itemView.findViewById(R.id.tv_postlayout_likecount);
            dcount = itemView.findViewById(R.id.tv_postlayout_dislikecount);
            upvote = itemView.findViewById(R.id.ibt_postlayout_upvote);
            downvote = itemView.findViewById(R.id.ibt_postlayout_downvote);
            category = itemView.findViewById(R.id.tv_activity_post_layout_category);

        }
    }
}