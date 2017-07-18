package com.example.notepad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<MyItems> data = new ArrayList<>();

        data.add(new MyItems(R.drawable.ic_add_box_black_24dp,"ADD"));
        data.add(new MyItems(R.drawable.ic_edit_black_24dp,"EDIT"));

        final MyAdapter adapter = new MyAdapter(this,data);
        ((ListView)findViewById(R.id.ListView)).setAdapter(adapter);

        ((ListView)findViewById(R.id.ListView)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (data.get(position).equals(data.get(0))){
                    Intent intent = new Intent(MainActivity.this,AddActivity.class);
                    startActivity(intent);
                }else if (data.get(position).equals(data.get(1))){
                    Intent intent = new Intent(MainActivity.this,EditActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
