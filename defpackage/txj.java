package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class txj extends SQLiteOpenHelper {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public txj(android.content.Context r3, long r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 43
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "_tasks.notifications.db"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 0
            r0 = 5
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txj.<init>(android.content.Context, long):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        tzk.e("ChimeTaskDataSQLiteHelper", "Creating SQLite Database [%s]", getDatabaseName());
        sQLiteDatabase.execSQL("CREATE TABLE tasks(_id INTEGER PRIMARY KEY,job_type INTEGER NOT NULL,payload BLOB);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        tzk.e("ChimeTaskDataSQLiteHelper", "Upgrading SQLite Database [%s], from version [%d] to [%d]", getDatabaseName(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 5) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tasks");
            sQLiteDatabase.execSQL("CREATE TABLE tasks(_id INTEGER PRIMARY KEY,job_type INTEGER NOT NULL,payload BLOB);");
        }
    }
}
