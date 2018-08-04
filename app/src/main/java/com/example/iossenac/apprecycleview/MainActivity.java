package com.example.iossenac.apprecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.iossenac.apprecycleview.adapter.AlunoAdapter;
import com.example.iossenac.apprecycleview.model.Aluno;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Aluno> listaAlunos = Arrays.asList(
        new Aluno("0001","Abigail", "abigail@mail.com"),
        new Aluno("0002","Beatriz", "beatriz@mail.com"),
        new Aluno("0003","Carlos", "carlos@mail.com"),
        new Aluno("0004","David", "david@mail.com"),
        new Aluno("0005","Ernesto", "ernesto@mail.com"),
        new Aluno("0006","Ferdinando", "ferdinando@mail.com"),
        new Aluno("0007","Heloisa", "heloisa@mail.com"),
        new Aluno("0008","Irvin", "irvin@mail.com")

    );
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        RecyclerView.Adapter adapter = new AlunoAdapter(listaAlunos);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);




    }
}
