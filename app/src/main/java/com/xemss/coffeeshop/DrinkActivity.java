package com.xemss.coffeeshop;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by xemss on 05.10.2017.
 * 
 * // TODO: 15.10.2017 didn't showed drink activity
 * // TODO: 18.10.2017 solved forget to add activity to manifest 
 */

public class DrinkActivity extends AppCompatActivity{
    public static final String EXTRA_DRINKNO = "drinkNo";
    ImageView image;
    TextView name, desc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drink_activity);

        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);

//        try {
//            // TODO: 17.10.2017 create helper to operate database
//            SQLiteOpenHelper sqLiteOpenHelper = new CoffeeShopHelper(this);
//            SQLiteDatabase sqLiteDatabase = sqLiteOpenHelper.getReadableDatabase();
//
//            // TODO: 17.10.2017 create query cursor
//            Cursor cursor = sqLiteDatabase.query("DRINK",
//                    new String[]{"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
//                    "_id =? ",
//                    new String[]{Integer.toString(drinkNo)},
//                    null, null, null);
//
//            if (cursor.moveToFirst()) {
//                // TODO: 17.10.2017 get resourse from cursor
//                String nameText = cursor.getString(0);
//                String descriptionText = cursor.getString(1);
//                int imageId = cursor.getInt(2);
//
//                // TODO: 17.10.2017 find views
//                name = (TextView) findViewById(R.id.name);
//                desc = (TextView) findViewById(R.id.desc);
//                image = (ImageView) findViewById(R.id.image);
//
//                // TODO: 17.10.2017 set content
//                name.setText(nameText);
//                desc.setText(descriptionText);
//                image.setImageResource(imageId);
//                image.setContentDescription(nameText);
//            }
//
//            // TODO: 17.10.2017 close database connection
//            cursor.close();
//            sqLiteDatabase.close();
//
//        } catch (SQLException e) {
//            Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT).show();
//        }

        Drinks drink = Drinks.drinks[drinkNo];
        // TODO: 15.10.2017 get views  

        image = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name);
        desc = (TextView) findViewById(R.id.desc);

        image.setImageResource(drink.getImage());
        image.setContentDescription(drink.getName());

        name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        desc = (TextView) findViewById(R.id.desc);
        desc.setText(drink.getDesc());
    }
}
