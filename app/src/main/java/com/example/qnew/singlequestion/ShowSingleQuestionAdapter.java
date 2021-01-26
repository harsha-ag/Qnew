package com.example.qnew.singlequestion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qnew.R;

import java.util.List;

public class ShowSingleQuestionAdapter extends RecyclerView.Adapter<ShowSingleQuestionAdapter.AnswerViewHolder> {
    private List<ShowSingleQuestionData> list;

    public ShowSingleQuestionAdapter(List<ShowSingleQuestionData> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AnswerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_post_answer_card, parent, false);
        return new AnswerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnswerViewHolder holder, int position) {
        ShowSingleQuestionData showSingleQuestionData = list.get(position);
        holder.answer.setText(showSingleQuestionData.getAnswer() + "");
        holder.image.setImageResource(showSingleQuestionData.getImageid());
        holder.name.setText(showSingleQuestionData.getName());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class AnswerViewHolder extends RecyclerView.ViewHolder {
        public TextView answer;
        public ImageView image;
        public TextView name;
        public Button upvote;
        public Button downvote;
        public Button comment;


        public AnswerViewHolder(@NonNull View itemView) {
            super(itemView);
            answer = itemView.findViewById(R.id.tv_singlepostanswer_textview);
            image = itemView.findViewById(R.id.civ_singlepost_answerer_picture);
            name = itemView.findViewById(R.id.tv_singlepost_answerer_name);
            upvote = itemView.findViewById(R.id.ibt_postlayout_upvote);
            downvote = itemView.findViewById(R.id.ibt_postlayout_downvote);
            comment = itemView.findViewById(R.id.ibt_postlayout_comment);
        }
    }
}
