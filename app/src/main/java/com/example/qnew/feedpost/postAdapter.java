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

public class postAdapter extends RecyclerView.Adapter<postAdapter.postviewholder> {

    private List<postdata> list;
    public postAdapter(List<postdata> list){this.list=list;}
    @NonNull
    @Override
    public postviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.searchlititems,parent,false );
        return new postviewholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull postviewholder holder, int position) {
        postdata postdata=list.get( position );
        holder.nameq.setText( postdata.getNameQid() );
        holder.imageq.setImageResource( postdata.getImageQid() );
        holder.question.setText( postdata.getQuestion() );
        holder.answer.setText( postdata.getAnswer() );
        holder.lcount.setText( postdata.getLcount() );
        holder.dcount.setText( postdata.getDcount() );
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
