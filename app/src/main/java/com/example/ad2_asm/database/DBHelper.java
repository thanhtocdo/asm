package com.example.ad2_asm.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "ASM", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String nguoiDung = "CREATE TABLE NGUOIDUNG(tendangnhap TEXT PRIMARY KEY, matkhau TEXT, hoten TEXT)";
        db.execSQL(nguoiDung);
        String sanPham = "CREATE TABLE SANPHAM(masp INTEGER PRIMARY KEY AUTOINCREMENT, tensp TEXT, giaban INTEGER, soluong INTEGER)";
        db.execSQL(sanPham);

        String nd = "INSERT INTO NGUOIDUNG VALUES('a', '123', 'a')";
        db.execSQL(nd);
        String sp = "INSERT INTO SANPHAM VALUES(1, 'banh', 5000, 10), (2, 'keo', 5000, 15)";
        db.execSQL(sp);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        if (i != i1) {
            db.execSQL("DROP TABLE IF EXISTS NGUOIDUNG");
            db.execSQL("DROP TABLE IF EXISTS SANPHAM");
        }
    }
}
