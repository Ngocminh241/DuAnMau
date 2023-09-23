package com.example.duanmau.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import com.example.duanmau.DTO.DTO_LoaiHang;
import com.example.duanmau.dbhelper.DBHelper;

import java.util.ArrayList;
import java.util.List;

public class DAO_LoaiHang {
    DBHelper dbHelper;
    SQLiteDatabase db;

    public DAO_LoaiHang(Context context) {
        dbHelper = new DBHelper(context);
        db = dbHelper.getWritableDatabase();
    }

    public long AddRow(DTO_LoaiHang hang) {
        ContentValues values = new ContentValues();
        values.put("TenLoai", hang.getTenLoai());
        return db.insert("tb_loaihang", null, values);
    }

    public int DeleteRow(DTO_LoaiHang hang) {
        String[] index = new String[]{
                String.valueOf(hang.getId())
        };
        return db.delete("tb_loaihang", "MaLoai=?", index);
    }

//    public int Update(DTO_LoaiHang hang) {
//        ContentValues values = new ContentValues();
//        values.put("TenLoai", hang.getTenLoai());
//        String[] index = new String[]{
//                String.valueOf(hang.getId())
//        };
//        return db.update("tb_loaihang", values, "MaLoai=?", index);
//    }

//    public String getTenLoai(int maLoai) {
//        db = dbHelper.getReadableDatabase();
//        String ten = "";
//        try {
//            Cursor cursor = db.rawQuery("SELECT TenLoai FROM tb_loaihang WHERE MaLoai = ?", new String[]{String.valueOf(maLoai)});
//            ten = cursor.getString(0);
//        } catch (Exception e) {
//            Log.i(TAG, "Lỗi" + e);
//        }
//        return ten;
//    }

    public List<DTO_LoaiHang> getAll() {
        List<DTO_LoaiHang> list = new ArrayList<>();
        Cursor c = db.rawQuery("select * from tb_loaihang", null);
        if (c != null && c.getCount() > 0) {
            c.moveToFirst();
            do {
                int id = c.getInt(0);
                String tenHang = c.getString(1);
                list.add(new DTO_LoaiHang(id, tenHang));
            } while (c.moveToNext());
        }
        return list;
    }
}
