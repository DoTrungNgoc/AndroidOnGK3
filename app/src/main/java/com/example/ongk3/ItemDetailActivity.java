package com.example.ongk3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {
    private TextView name,price;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        name = findViewById(R.id.textViewDetailName);
        price = findViewById(R.id.textViewDetailPrice);
        img = findViewById(R.id.imageViewDetail);

        Plass plass = (Plass) getIntent().getSerializableExtra("plass");

        name.setText(plass.getName());
        price.setText(plass.getPrice());
        img.setImageResource(plass.getImg());
    }
}