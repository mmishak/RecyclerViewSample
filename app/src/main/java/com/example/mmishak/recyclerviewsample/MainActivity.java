package com.example.mmishak.recyclerviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            cats.add(new Cat("Персик", "Веселый котик"));
            cats.add(new Cat("Витя", "Ему нужно выйти"));
            cats.add(new Cat("Борис", "Просто Борис"));
            cats.add(new Cat("Петр Семенович", "Статный кот"));
            cats.add(new Cat("Партос", "Кот с мечом"));
            cats.add(new Cat("Акакий", "Древне-русский кот"));
            cats.add(new Cat("Кековский", "Кот под вискасом"));
        }

        CatsAdapter adapter = new CatsAdapter(cats);
        recyclerView.setAdapter(adapter);
    }
}
