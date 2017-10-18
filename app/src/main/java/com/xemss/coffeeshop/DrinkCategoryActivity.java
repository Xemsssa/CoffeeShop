package com.xemss.coffeeshop;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

/**
 * Created by xemss on 04.10.2017.
 */

public class DrinkCategoryActivity extends ListActivity{
    private Cursor cursor;
    private SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO: 17.10.2017 get view
        ListView listDrinks = getListView();

        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks>(
                this,
                android.R.layout.simple_list_item_1,
                Drinks.drinks);

        listDrinks.setAdapter(listAdapter);

        // TODO: 15.10.2017 get drinks from database
//        cursor = db.query("DRINK",
//            new String[] {"_id",  "NAME"},
//                null, null, null, null, null, null);
//
//        CursorAdapter listAdapter =  new SimpleCursorAdapter(
//                this,
//                android.R.layout.simple_list_item_1,
//                cursor,
//                new String[] {"NAME"},
//                new int[] {android.R.id.text1},
//                0);
//
//        listDrinks.setAdapter(listAdapter);

//        try {
//            // TODO: 17.10.2017 create obj to operate database
//            SQLiteOpenHelper sqLiteOpenHelper = new CoffeeShopHelper(this);
//            sqLiteDatabase =  sqLiteOpenHelper.getReadableDatabase();
//
//            // TODO: 17.10.2017 query
//            cursor = sqLiteDatabase.query(
//                    "DRINK",
//                    new String[] {"_id", "NAME"},
//                    null, null, null, null, null);
//
//            // TODO: 17.10.2017 create listView with data from database
//            CursorAdapter listAdapter = new SimpleCursorAdapter(
//                    this,
//                    android.R.layout.simple_list_item_1,
//                    cursor,
//                    new String[] {"NAME"},
//                    new int[] {android.R.id.text1},
//                    0
//            );
//
//            listDrinks.setAdapter(listAdapter);
//
//        } catch (SQLException e)  {
//            // TODO: 17.10.2017 show user message if error connection
//            Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT).show();
//        }
    }
//
//    // TODO: 17.10.2017 create method to close connection
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        cursor.close();
//        sqLiteDatabase.close();
//    }

//        @Override
//    public ListView getListView() {
//        return super.getListView();
//    }
//
//    @Override
//    public ListAdapter getListAdapter() {
//        return super.getListAdapter();
//    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }
}
