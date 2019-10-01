package com.example.calendarioacademico.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.calendarioacademico.Model.Discipina;
import com.example.calendarioacademico.R;

import java.util.List;

public class adapterRecycleViewDisciplinas extends RecyclerView.Adapter<adapterRecycleViewDisciplinas.Adapter> {

    List<Discipina> disciplinasList;

    public adapterRecycleViewDisciplinas(List<Discipina> disciplinasList) {
        this.disciplinasList = disciplinasList;
    }

    @NonNull
    @Override
    public Adapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.lista_disciplinas,parent,false);

        return new Adapter(view,parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter holder, int position) {
        holder.txtDisciplina.setText(disciplinasList.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return disciplinasList.size();
    }

    class Adapter extends RecyclerView.ViewHolder{

        TextView txtDisciplina;
        public Adapter(@NonNull View itemView,Context contect) {
            super(itemView);
            txtDisciplina = itemView.findViewById(R.id.txtDisciplina);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
