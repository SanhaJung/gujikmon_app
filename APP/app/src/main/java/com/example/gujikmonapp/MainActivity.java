package com.example.gujikmonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    View  companySearch;
    ImageButton filter , cofavorites, searchBtn;
    EditText coNm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//       검색 바
        companySearch = findViewById(R.id.search_bar); // SearchView
//        버튼
        filter = findViewById(R.id.filter);
        cofavorites = findViewById(R.id.cofavorites);
        searchBtn = findViewById(R.id.search);
//        검색한 기업 명
        coNm = findViewById(R.id.coNm);
    }//onCreate()






}