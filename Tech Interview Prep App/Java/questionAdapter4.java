package com.example.splashscreenformajorproject;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class questionAdapter4 extends RecyclerView.Adapter<questionAdapter4.QuestionVH> {

    List<sample4> sampleList;

    public questionAdapter4(List<sample4> sampleList) {
        this.sampleList = sampleList;
    }

    @NonNull
    @Override

    public QuestionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row4, parent, false);
        return new QuestionVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionVH holder, int position) {

        sample4 samples = sampleList.get(position);
        holder.questionTxt.setText(samples.getQuestion());
        holder.answerTxt.setText(samples.getAnswer());

        boolean isExpandable = sampleList.get(position).isExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return sampleList.size();
    }

    public class QuestionVH extends RecyclerView.ViewHolder {


        TextView questionTxt, answerTxt;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;


        public QuestionVH(@NonNull View itemView) {
            super(itemView);

            questionTxt = itemView.findViewById(R.id.question1);
            answerTxt = itemView.findViewById(R.id.answer1);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandableLayout = itemView.findViewById(R.id.expandable_layout);

            // on click listener

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sample4 samples = sampleList.get(getAdapterPosition());
                    samples.setExpandable(!samples.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }



}
