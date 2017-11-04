package com.xemss.coffeeshop;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by xemss on 15.10.2017.
 */

public class CoffeeShopHelper extends SQLiteOpenHelper {
    // TODO: 15.10.2017 create var with params of database
    private final static String LOG = "Log";

    private static final String DRINK_TABLE = "Drink";
    private static final String DB_NAME = "coffeeshop";
//    private static final int DB_VERSION = 1;
    private static final int DB_VERSION = 2;

    // TODO: 15.10.2017 constructor
//    public CoffeeShopHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
//        super(context, name, factory, version);
//    }

    public CoffeeShopHelper (Context context) {
        super(context, DB_NAME,null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO: 15.10.2017 remove create table and inert method
        updateDatabase(db, 0, DB_VERSION);
    }

    private static void insertDrink(SQLiteDatabase db, String name, String description, int resource_id) {
        ContentValues contentValues = new ContentValues();

        contentValues.put("NAME", name);
        contentValues.put("DESCRIPTION", description);
        contentValues.put("IMAGE_RESOURCE_ID", resource_id);

        Log.d("Log", "insert into drink " + name + " with name");
        db.insert("DRINK", null, contentValues);
    }

    private void updateDatabase (SQLiteDatabase db, int oldVersion, int newVersion ) {
        // TODO: 15.10.2017 create tables
//        if (oldVersion < 1) {
        try {
            db.execSQL("CREATE TABLE DRINK (" +
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "NAME TEXT, " +
                    "DESCRIPTION TEXT, " +
                    "IMAGE_RESOURSCE_ID INTEGER);");
            // TODO: 17.10.2017 added image for latte and cappuccino
            insertDrink(db, "Latte", "Espresso and steamed milk", R.drawable.latte);
            insertDrink(db, "cappuccino", "Espresso, hot milk and steamed-milk foam", R.drawable.cappuccino);
            // TODO: 17.10.2017 add filter
            // insertDrink(db, "Filter", "Our best drip coffee", R.drawable.filter);
//        }
        } catch (SQLException e) {
            Log.d(LOG, "error create table drink");
        }

        if (oldVersion <= 2) {
           db.execSQL("ALTER TABLE DRINK" +
                   " ADD COLUMN FAVORITE NUMERIC;");
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//         if (oldVersion < 1) {
             updateDatabase(db, oldVersion,  newVersion);
//         }
         
//         if (oldVersion < 2) {
//             // TODO: 15.10.2017 if version of db is below 2
//         }
//        if (oldVersion == 1) {
//
//        }
//
//        if (oldVersion < 3) {
//
//        }
//
//        if (oldVersion == 3) {
//
//        }

    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }
}

//{
//        ContentValues contentValues = new ContentValues();
//
//        contentValues.put("DESCRIPTION", "Tasty");
//
//        db.update(DRINK_TABLE, contentValues, "NAME = ?", new String[]{"Latte"});
//        db.update(DRINK_TABLE, contentValues, "NAME = ? OR DESCRIPTION = ?", new String[]{"Latte", "Our best drip coffee"});
//        db.update(DRINK_TABLE, contentValues, "_id = ? OR DESCRIPTION = ?", new String[]{Integer.toString(1)});
//
//        ContentValues contentValues = new ContentValues();
//        contentValues.put("NAME", "Latte");
//        contentValues.put("DESCRIPTION", "Espresso and streamed milk");
//        contentValues.put("IMAGE_RESOURCE", R.drawable.latte);
//
//        db.insert(DRINK_TABLE, null, contentValues);
//        db.delete(DRINK_TABLE, "NAME = ?", new String[]{"Latte"});
//}