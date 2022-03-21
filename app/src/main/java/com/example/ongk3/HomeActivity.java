package com.example.ongk3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private ListView listView;
    private List<Plass> listSource,listTemp;
    private PlassAdapter adapter;
    private Button btnM, btnW,btnC, btnA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listView = findViewById(R.id.listview);
        btnA = findViewById(R.id.buttonA);
        btnM = findViewById(R.id.buttonM);
        btnC = findViewById(R.id.buttonC);
        btnW = findViewById(R.id.buttonW);

        listSource = new ArrayList<>();
        listTemp = new ArrayList<>();
        listSource.add(new Plass("Chanel","$19","for man",R.drawable.mat_kinh_1));
        listSource.add(new Plass("Chanel","$19","for woman",R.drawable.mat_kinh_2));
        listSource.add(new Plass("Chanel","$19","for man",R.drawable.mat_kinh_3));
        listSource.add(new Plass("Chanel","$19","for children",R.drawable.mat_kinh_4));
        listSource.add(new Plass("Chanel","$19","for man",R.drawable.mat_kinh_4));
        listSource.add(new Plass("Chanel","$19","for man",R.drawable.mat_kinh_1));
        listSource.add(new Plass("Chanel","$19","for woman",R.drawable.mat_kinh_2));
        listSource.add(new Plass("Chanel","$19","for man",R.drawable.mat_kinh_3));
        listSource.add(new Plass("Chanel","$19","for children",R.drawable.mat_kinh_4));
        listSource.add(new Plass("Chanel","$19","for man",R.drawable.mat_kinh_4));

        adapter = new PlassAdapter(HomeActivity.this,R.layout.item_layout,listTemp);
        listView.setAdapter(adapter);

        processButton(btnM,btnW,btnC,btnA);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processButton(btnA,btnW,btnC,btnM);
            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processButton(btnM,btnA,btnC,btnW);
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processButton(btnC,btnW,btnA,btnM);
            }
        });
        btnW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processButton(btnW,btnA,btnC,btnM);
            }
        });
    }

    private void processButton(Button btn1, Button btn2, Button btn3, Button btn4){
        btn1.setBackgroundColor(Color.parseColor("#FFC107"));
        btn2.setBackgroundColor(Color.parseColor("#D6D0D0"));
        btn3.setBackgroundColor(Color.parseColor("#D6D0D0"));
        btn4.setBackgroundColor(Color.parseColor("#D6D0D0"));

        String cate = "for man";

        if (btn1 == btnW){
            cate = "for woman";
        }
        if (btn1 == btnC){
            cate = "for children";
        }
        listTemp.clear();
        if (btn1 == btnA){
            for (Plass plass:listSource){
                listTemp.add(plass);
            }
        }
        else{
            for (Plass plass:listSource){
                if (plass.getCategory().equalsIgnoreCase(cate)){
                    listTemp.add(plass);
                }
            }
        }
        adapter.notifyDataSetChanged();
    }


}