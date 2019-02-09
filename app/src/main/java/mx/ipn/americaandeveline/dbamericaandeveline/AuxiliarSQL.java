package mx.ipn.americaandeveline.dbamericaandeveline;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Profesor on 08/02/2019.
 */

public class AuxiliarSQL extends SQLiteOpenHelper{

    String SQL_Tabla = "CREATE TABLE Reservacion ("
    +"_id INTEGER PRIMARY KEY AUTOINCEMENT,"+"Nombre TEXT)";

    public AuxiliarSQL(Context context, String DBname,
                        SQLiteDatabase.CursorFactory factory,
                        int version){
        super(context,DBname, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase baseDatos){
        baseDatos.execSQL(SQL_Tabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase baseDatos, int oldVersion, int newVersion) {
        baseDatos.execSQL("DROP TABLE IF EXISTS Reservacion");
        baseDatos.execSQL(SQL_Tabla);
    }
}

