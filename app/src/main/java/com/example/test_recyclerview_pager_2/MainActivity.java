package com.example.test_recyclerview_pager_2;


import android.graphics.Movie;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ArrayList<Product>> allMovieList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.initializeData();

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(mLayoutManager);

        ProductCardAdapter mCardAdapter = new ProductCardAdapter(, allMovieList);
        rv.setAdapter(mCardAdapter);
    }

    public void initializeData()
    {
        ArrayList<Product> movieList1 = new ArrayList();

        movieList1.add(new Product(R.drawable.movie1, "어벤져스"));
        movieList1.add(new Product(R.drawable.movie2, "미션임파서블"));
        movieList1.add(new Product(R.drawable.movie3, "아저씨"));

        allMovieList.add(movieList1);

        ArrayList<Product> movieList2 = new ArrayList();

        movieList2.add(new Product(R.drawable.movie4, "범죄도시"));
        movieList2.add(new Product(R.drawable.movie5, "공공의적"));
        movieList2.add(new Product(R.drawable.movie6, "맨인블랙"));

        allMovieList.add(movieList2);

        ArrayList<Product> movieList3 = new ArrayList();

        movieList3.add(new Product(R.drawable.movie7, "고질라"));
        movieList3.add(new Product(R.drawable.movie8, "캡틴마블"));
        movieList3.add(new Product(R.drawable.movie9, "아이언맨"));

        allMovieList.add(movieList3);
    }

}
