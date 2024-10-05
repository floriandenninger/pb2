package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dwe {
    public static final String a = String.format(Locale.US, "CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s INTEGER, %s INTEGER, %s TEXT, %s INTEGER, %s INTEGER,%s INTEGER);", "conversiontracking", "conversion_ping_id", "string_url", "preference_key", "is_repeatable", "parameter_is_null", "preference_name", "record_time", "retry_count", "last_retry_time");
    public final Object b = new Object();
    private final dwd c;

    public dwe(Context context) {
        this.c = new dwd(context);
    }

    public static final dvz e(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        int i = cursor.getInt(7);
        String string = cursor.getString(1);
        if (i > 0) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("retry", Integer.toString(i)).build().toString();
        }
        return new dvz(cursor.getLong(0), string, cursor.getString(2), cursor.getInt(3) > 0, cursor.getInt(4) > 0, cursor.getString(5), cursor.getLong(6), i);
    }

    public final SQLiteDatabase a() {
        try {
            return this.c.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleConversionReporter", "Error opening writable conversion tracking database");
            return null;
        }
    }

    public final void b(dvz dvzVar) {
        if (dvzVar == null) {
            return;
        }
        synchronized (this.b) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            a2.delete("conversiontracking", String.format(Locale.US, "%s = %d", "conversion_ping_id", Long.valueOf(dvzVar.h)), null);
        }
    }

    public final void c() {
        synchronized (this.b) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            a2.delete("conversiontracking", String.format(Locale.US, "(%s > %d) or (%s < %d and %s > 0)", "retry_count", 9000L, "record_time", Long.valueOf(dwg.a() - 43200000), "retry_count"), null);
        }
    }

    public final void d(dvz dvzVar) {
        synchronized (this.b) {
            SQLiteDatabase a2 = a();
            if (a2 == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_retry_time", Long.valueOf(dwg.a()));
            contentValues.put("retry_count", Integer.valueOf(dvzVar.c + 1));
            a2.update("conversiontracking", contentValues, String.format(Locale.US, "%s = %d", "conversion_ping_id", Long.valueOf(dvzVar.h)), null);
            c();
        }
    }
}
