package com.example.qnew.ui.answer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.qnew.R;
import com.example.qnew.feedpost.PostAdapter;
import com.example.qnew.feedpost.PostData;

import java.util.List;

public class AnswerAdapter  extends RecyclerView.Adapter<AnswerAdapter.answerViewHolder> {
    private List<AnswerData> list;

    public AnswerAdapter(List<AnswerData> list) {
        this.list = list;
    }
    @NonNull
    @Override
    public answerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.add_answerfragment_card, parent, false);
        return new answerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull answerViewHolder holder, int position) {
        AnswerData post = list.get(position);


        Glide.with(holder.imageqr.getContext())
                .load(post.getImageqr())
                .placeholder(R.drawable.ic_menu_camera)
                .into(holder.imageqr);
        holder.nameqr.setText(post.getNameqr() + "");
        holder.categoryqr.setText(post.getCategoryqr());
        holder.questionqr.setText(post.getQuestionqr());
    }



    @Override
    public int getItemCount() {
        return list.size();
    }

    class answerViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageqr;
        public TextView nameqr;
        public TextView categoryqr;
        public TextView questionqr;


        public answerViewHolder(@NonNull View itemView) {
            super(itemView);
            imageqr = itemView.findViewById( R.id.cv_answerfragment_card_proimage );
            nameqr = itemView.findViewById(R.id.tv_answerfragment_card_name );
            categoryqr = itemView.findViewById(R.id.tv_answerfragment_card_category );
            questionqr = itemView.findViewById(R.id.tv_answerfragment_card_question );



        }
    }
}
