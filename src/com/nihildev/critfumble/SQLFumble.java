package com.nihildev.critfumble;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLFumble extends SQLiteOpenHelper {

	String sqlCreate = "CREATE TABLE IF NOT EXISTS Fumbles (Min INTEGER,Max INTEGER,text TEXT)";
	
	public SQLFumble(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(sqlCreate);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		//Se elimina la versión anterior de la tabla
        db.execSQL("DROP TABLE IF EXISTS Fumbles");
 
        //Se crea la nueva versión de la tabla
        db.execSQL(sqlCreate);
	}
	

}