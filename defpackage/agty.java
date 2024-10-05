package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agty extends SQLiteOpenHelper {
    private final int a;

    public agty(Context context) {
        super(context, "bgol_tasks.db", (SQLiteDatabase.CursorFactory) null, Math.max(12, 8));
        this.a = Math.max(12, 8);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor query = writableDatabase.query("transfers", null, null, null, null, null, null);
        int columnIndexOrThrow = query.getColumnIndexOrThrow("file_path");
        int columnIndexOrThrow2 = query.getColumnIndexOrThrow("extras");
        int columnIndexOrThrow3 = query.getColumnIndexOrThrow("output_extras");
        HashSet hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                try {
                    new agny(query.getBlob(columnIndexOrThrow2));
                    new agny(query.getBlob(columnIndexOrThrow3));
                } catch (Exception unused) {
                    hashSet.add(query.getString(columnIndexOrThrow));
                }
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            writableDatabase.delete("transfers", "file_path = ?", new String[]{(String) it.next()});
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, this.a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        yoj.f(sQLiteDatabase);
        onUpgrade(sQLiteDatabase, 0, this.a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        String str;
        String str2;
        String str3;
        Cursor query;
        if (i < 8) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS transfers");
                sQLiteDatabase.execSQL("CREATE TABLE transfers (file_path TEXT PRIMARY KEY,network_uri TEXT,status INTEGER,status_reason INTEGER,bytes_transferred BIGINT,bytes_total BIGINT,extras BLOB,output_extras BLOB, accountname TEXT,priority INTEGER DEFAULT 0)");
                sQLiteDatabase.execSQL("CREATE INDEX idx_transfers_accountname ON transfers (accountname)");
                i3 = 8;
            } catch (SQLiteException e) {
                e = e;
                i3 = i;
                zga.d(String.format(Locale.US, "[Offline] Error trying to upgrade from %d to %d. Wiping data and create database from scratch.", Integer.valueOf(i3), Integer.valueOf(i2)), e);
                yoj.f(sQLiteDatabase);
                onUpgrade(sQLiteDatabase, 0, this.a);
                return;
            }
        } else {
            i3 = i;
        }
        String str4 = "file_path = ?";
        if (i3 != 8 || i2 <= 8) {
            str = "file_path";
            str2 = "extras";
            str3 = "transfers";
        } else {
            try {
                str = "file_path";
                str2 = "extras";
                String str5 = "transfers";
                String str6 = "file_path = ?";
                query = sQLiteDatabase.query("transfers", null, null, null, null, null, null);
                int columnIndexOrThrow = query.getColumnIndexOrThrow(str);
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow(str2);
                while (query.moveToNext()) {
                    try {
                        String string = query.getString(columnIndexOrThrow);
                        agny agnyVar = new agny(query.getBlob(columnIndexOrThrow2));
                        if (agnyVar.m("thumbnail", false)) {
                            agtw.V(agnyVar, 2);
                        } else if (agnyVar.m("ad", false)) {
                            agtw.V(agnyVar, 3);
                        } else {
                            agtw.V(agnyVar, 1);
                        }
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(str, string);
                        contentValues.put(str2, agnyVar.e());
                        String str7 = str5;
                        String str8 = str6;
                        sQLiteDatabase.update(str7, contentValues, str8, new String[]{string});
                        str5 = str7;
                        str6 = str8;
                    } finally {
                    }
                }
                str3 = str5;
                str4 = str6;
                query.close();
                i3 = 9;
            } catch (SQLiteException e2) {
                e = e2;
                zga.d(String.format(Locale.US, "[Offline] Error trying to upgrade from %d to %d. Wiping data and create database from scratch.", Integer.valueOf(i3), Integer.valueOf(i2)), e);
                yoj.f(sQLiteDatabase);
                onUpgrade(sQLiteDatabase, 0, this.a);
                return;
            }
        }
        if (i3 == 9) {
            if (i2 > 9) {
                sQLiteDatabase.execSQL("ALTER TABLE transfers ADD COLUMN failure_count INTEGER NOT NULL DEFAULT 0");
                i3 = 10;
            } else {
                i3 = 9;
            }
        }
        if (i3 != 10 || i2 <= 10) {
            return;
        }
        String str9 = str3;
        String str10 = str4;
        query = sQLiteDatabase.query("transfers", null, null, null, null, null, null);
        int columnIndexOrThrow3 = query.getColumnIndexOrThrow(str);
        int columnIndexOrThrow4 = query.getColumnIndexOrThrow(str2);
        while (query.moveToNext()) {
            try {
                String string2 = query.getString(columnIndexOrThrow3);
                agny agnyVar2 = new agny(query.getBlob(columnIndexOrThrow4));
                if (agtw.af(agnyVar2)) {
                    agtw.O(agnyVar2, false);
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(str, string2);
                    contentValues2.put(str2, agnyVar2.e());
                    String[] strArr = {string2};
                    String str11 = str10;
                    sQLiteDatabase.update(str9, contentValues2, str11, strArr);
                    str10 = str11;
                }
            } finally {
            }
        }
    }
}
