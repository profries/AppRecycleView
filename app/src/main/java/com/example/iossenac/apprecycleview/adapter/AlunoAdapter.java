package com.example.iossenac.apprecycleview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.iossenac.apprecycleview.R;
import com.example.iossenac.apprecycleview.model.Aluno;

import java.util.List;

public class AlunoAdapter extends RecyclerView.Adapter<AlunoAdapter.ViewHolder> {
    List<Aluno> listaAlunos;

    public AlunoAdapter(List<Aluno> listaAlunos){
        this.listaAlunos = listaAlunos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.list_item_alunos, viewGroup, false
        );

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int posicao) {
        Aluno aluno = listaAlunos.get(posicao);
        viewHolder.textMatricula.setText(aluno.getMatricula());
        viewHolder.textNome.setText(aluno.getNome());
        viewHolder.textEmail.setText(aluno.getEmail());
    }

    @Override
    public int getItemCount() {
        return listaAlunos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textMatricula;
        TextView textNome;
        TextView textEmail;
        public ViewHolder(View view) {
            super(view);
            textMatricula = (TextView) view.findViewById(R.id.textMatricula);
            textNome = (TextView) view.findViewById(R.id.textNome);
            textEmail = (TextView) view.findViewById(R.id.textEmail);
        }
    }
}
