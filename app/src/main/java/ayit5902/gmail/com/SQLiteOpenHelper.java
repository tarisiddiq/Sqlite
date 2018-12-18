package ayit5902.gmail.com;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

abstract class SQLiteOpenHelper {
    public SQLiteOpenHelper(Context context, String databaseName, Object o, int databaseVersion) {
    }

    public abstract void onCreate(SQLiteDatabase db);

    public abstract void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2);

    public SQLiteDatabase getReadableDatabase() {
        return null;
    }

    public SQLiteDatabase getWritableDatabase() {
        return null;
    }
}
