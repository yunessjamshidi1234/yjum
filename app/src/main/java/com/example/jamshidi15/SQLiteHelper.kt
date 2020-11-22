package com.example.jamshidi15

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLiteHelper(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int) : SQLiteOpenHelper(context, name, factory, version) {

    val Table_Name="Students"
    override fun onCreate(db: SQLiteDatabase?) {
        val Create_Table=("CREATE TABLE "+Table_Name+" ("
                +"_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                +"name TEXT,"
                +"fname TEXT,"
                +"age INTEGER,"
                +"code INTEGER,"
                +"job TEXT)")

        db?.execSQL(Create_Table)
    }
    fun InsertData(name : String,fname : String,age : Int,code : Int,job : String){
        val Insert_Table="INSERT INTO "+Table_Name+" (name,fname,age,code,job) VALUES ('"+name+"','"+fname+"',"+age+","+code+",'"+job+"')"
        val db=this.writableDatabase
        db.execSQL(Insert_Table)
        db.close()
    }
    fun ReadTable() : String{
        val Read_Table ="SELECT name FROM "+Table_Name
        var result=""
        val db=this.readableDatabase
        val data:Cursor=db.rawQuery(Read_Table,null)
        while (data.moveToNext()){
            result+=result+data.getString(0)+"\n"
        }
        return result
    }
    fun Deletetable(name :String){
        val Delete_Table="DELETE FROM "+Table_Name+" WHERE name LIKE '%"+name+"%'"
        val db=this.writableDatabase
        db.execSQL(Delete_Table)
        db.close()
    }
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
}