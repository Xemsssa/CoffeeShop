package com.xemss.coffeeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 15.10.2017 didn't work click listener
//        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
//            public void onItemClick(
//                    AdapterView<?> listView,
//                    View itemView,
//                    int position,
//                    long id) {
//                // TODO: 15.10.2017 show drink activity
//                if (position == 0) {
//                    Intent intent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
////                    setContentView(intent);
//                    startActivity(intent);
//                }
//            }
//        };
//
        // TODO: 17.10.2017 still didn't work click listener
//        ListView.OnItemClickListener onItemClickListener1 = new ListView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position == 0) {
//                    Intent intent = new Intent(MainActivity.this,  DrinkCategoryActivity.class);
//                    startActivity(intent);
//                }
//            }
//        };
//
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        }
        ListView listView = (ListView) findViewById(R.id.listView);
//        listView.setOnClickListener(onItemClickListener);
//        listView.setOnClickListener(onItemClickListener1);
//        listView.setOnClickListener((View.OnClickListener) onItemClickListener);
//        listView.setOnClickListener((View.OnClickListener) onItemClickListener1);
    }
}
