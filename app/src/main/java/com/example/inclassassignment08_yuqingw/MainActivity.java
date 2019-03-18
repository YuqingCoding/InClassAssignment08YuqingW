package com.example.inclassassignment08_yuqingw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_View);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // setting Adapter to the QuestionsAdapter that needs two bits of information
        //1. List of questions
        //2. The context to put them in
        recyclerView.setAdapter(new QuestionsAdapter(questions, this));
    }

    public void initialData() {
        questions = new ArrayList<>();
        questions.add(new Question(R.string.australia, R.string.question_australia, R.mipmap.australia, false));
        questions.add(new Question(R.string.africa, R.string.question_africa, R.mipmap.africa, true));
        questions.add(new Question(R.string.asia, R.string.question_asia, R.mipmap.asia, false));
        questions.add(new Question(R.string.america, R.string.question_america, R.mipmap.americas, false));
        questions.add(new Question(R.string.desert, R.string.question_desert, R.mipmap.africa, true));
        questions.add(new Question(R.string.canada, R.string.question_canada, R.mipmap.americas, true));
    }
}
