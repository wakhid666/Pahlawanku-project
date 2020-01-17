package com.example.kuispahlawan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.kuispahlawan.model.Hero;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnStart, btnAbout, btnBiodata;
    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBiodata = (Button) findViewById(R.id.btn_biodata);
        btnStart = (Button) findViewById(R.id.btn_start);
        btnAbout = (Button) findViewById(R.id.btn_about);
        btnBiodata.setOnClickListener(this);
        btnStart.setOnClickListener(this);
        btnAbout.setOnClickListener(this);


    }

    Intent j;
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_biodata:
                j = new Intent(this, BiodataActivity.class);
                startActivity(j);
                break;
            case R.id.btn_start:
                j = new Intent(this, QuizActivity.class);
                startActivity(j);
                break;
            case R.id.btn_about:
                j = new Intent(this, AboutActivity.class);
                startActivity(j);
        }

    }
}
