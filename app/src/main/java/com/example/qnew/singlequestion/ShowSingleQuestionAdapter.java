package com.example.qnew.singlequestion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.R;
import com.example.qnew.feedpost.PostAdapter;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ShowSingleQuestionAdapter extends RecyclerView.Adapter<ShowSingleQuestionAdapter.singleviewholder> {
    private List<ShowSingleQuestionData> list;
    public ShowSingleQuestionAdapter(List<ShowSingleQuestionData> list){this.list=list;}

    @NonNull
    @Override
    public singleviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.single_post_answer_card,parent,false );
        return new singleviewholder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull singleviewholder holder, int position) {
        ShowSingleQuestionData showSingleQuestionData =list.get( position );
        holder.answer.setText( showSingleQuestionData.getAnswer()+"");
        holder.image.setImageResource( showSingleQuestionData.getImageid() );
        holder.name.setText( showSingleQuestionData.getName() );

    }



    @Override
    public int getItemCount() {
         return list.size();
    }
    public static class singleviewholder extends RecyclerView.ViewHolder
    {
        public TextView answer;
        public CircleImageView image;
        public TextView name;
        public singleviewholder(@NonNull View itemView) {
            super( itemView );
            answer= itemView.findViewById( R.id.tv_singlepostanswer_textview );
            image= itemView.findViewById( R.id.civ_singlepost_answerer_picture );
            name =itemView.findViewById( R.id.civ_singlepost_answerer_name );
        }
    }
}
