package com.example.ad2_asm.dao;

import android.content.Context;

import com.example.ad2_asm.database.DBHelper;

public class NguoiDungDAO {
    private DBHelper dbHelper;

    public  NguoiDungDAO(Context context) {
        dbHelper = new DBHelper(context);
    }
}
