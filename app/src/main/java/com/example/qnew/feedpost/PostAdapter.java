package com.example.qnew.feedpost;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.postviewholder> {

    private List<PostData> list;
    public PostAdapter(List<PostData> list){this.list=list;}
    @NonNull
    @Override
    public postviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.activity_post_layout,parent,false );
        return new postviewholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull postviewholder holder, int position) {
        PostData postData1 =list.get( position );
        holder.nameq.setText( postData1.getNameQid()+"");
        holder.imageq.setImageResource( postData1.getImageQid() );
        holder.question.setText( postData1.getQuestion() );
        holder.answer.setText( postData1.getAnswer() );
        holder.lcount.setText(Integer.toString( postData1.getLcount() ));
        holder.dcount.setText(Integer.toString( postData1.getDcount() ));
    }



    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class postviewholder extends RecyclerView.ViewHolder
    {
        public TextView nameq;
        public CircleImageView imageq;
        public TextView question;
        public TextView answer;
        public TextView lcount;
        public TextView dcount;
        public postviewholder(@NonNull View itemView) {
            super( itemView );
            nameq= itemView.findViewById( R.id.tv_postlayout_name );
            imageq= itemView.findViewById( R.id.cv_postlayout_proimage );
            question =itemView.findViewById( R.id.tv_postlayout_question );
            answer =itemView.findViewById( R.id.tv_postlayout_answer );
            lcount =itemView.findViewById( R.id.tv_postlayout_likecount );
            dcount =itemView.findViewById( R.id.tv_postlayout_dislikecount );



        }
    }
}
