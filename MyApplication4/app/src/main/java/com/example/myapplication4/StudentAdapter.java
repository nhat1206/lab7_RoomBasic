package com.example.myapplication4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    ArrayList<Student> arrayList;
    Context context;
    View itemView;
    private LayoutInflater layoutInflater;

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemView = layoutInflater.inflate(R.layout.list_student,parent, false);
        return new StudentViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        holder.txtShow.setText(arrayList.get(position).getName());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public void filterList(ArrayList<Student> filteredList){
        arrayList = filteredList;
        notifyDataSetChanged();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView txtShow;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
