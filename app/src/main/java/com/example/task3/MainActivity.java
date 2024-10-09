package com.example.task3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private Button btnShow;
    private ListView list1;
    private String[] arr;
    private ArrayAdapter<String> adapter;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                list1.setAdapter(adapter);
            }
        });
 list1.setOnItemClickListener(this);

    }

    private void initViews() {
        btnShow = findViewById(R.id.btnShowList);
        list1 = findViewById(R.id.lstStones);
        initArray();
        adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arr);
        img = findViewById(R.id.imageView);
    }

    private void initArray() {
        arr = getResources().getStringArray(R.array.fruits);
    }
@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            img.setImageResource(R.drawable.grapes);
        }
        if (position == 1) {
            img.setImageResource(R.drawable.apple);

        }
        if (position == 2) {
            img.setImageResource(R.drawable.strawbery);

        }
        if (position == 3) {
            img.setImageResource(R.drawable.banana);

        }
        if (position == 4) {
            img.setImageResource(R.drawable.imgwatermelon);

        }
        if (position == 5) {
            img.setImageResource(R.drawable.mango);

        }


    }





}