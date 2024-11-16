package com.example.ad2_asm.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.ad2_asm.database.DBHelper;
import com.example.ad2_asm.model.Product;

import java.util.ArrayList;

public class SanphamDAO {
    private DBHelper dbHelper;

    public SanphamDAO(Context context) {
        dbHelper = new DBHelper(context);
    }

    public ArrayList<Product> getDS(){
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        ArrayList<Product> list = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM sanpham", null);
        if (cursor.getCount() > 0) {
            do {
                list.add(new Product(cursor.getInt(0), cursor.getString(1),  cursor.getInt(2), cursor.getInt(3)));
            } while (cursor.moveToNext());
        }
        return list;
    }
}
