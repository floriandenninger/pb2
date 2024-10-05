package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class viq {
    final CancellationSignal a = new CancellationSignal();
    public final SQLiteDatabase b;

    public viq(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    public static void c() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    public final Cursor a(vim vimVar) {
        c();
        String valueOf = String.valueOf(vimVar.a);
        amil l = amjw.l(valueOf.length() != 0 ? "Query: ".concat(valueOf) : new String("Query: "));
        try {
            Cursor rawQueryWithFactory = this.b.rawQueryWithFactory(new vio(vimVar.b), vimVar.a, null, null, this.a);
            l.close();
            return rawQueryWithFactory;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @SafeVarargs
    public final Cursor b(String str, String... strArr) {
        c();
        amil l = amjw.l(str.length() != 0 ? "Query: ".concat(str) : new String("Query: "));
        try {
            Cursor rawQuery = this.b.rawQuery(str, strArr, this.a);
            l.close();
            return rawQuery;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void d(vim vimVar) {
        c();
        String valueOf = String.valueOf(vimVar.a);
        amil l = amjw.l(valueOf.length() != 0 ? "execSQL: ".concat(valueOf) : new String("execSQL: "));
        try {
            this.b.execSQL(vimVar.a, vimVar.b);
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @SafeVarargs
    public final void e(String str, String... strArr) {
        c();
        amil l = amjw.l(str.length() != 0 ? "execSQL: ".concat(str) : new String("execSQL: "));
        try {
            this.b.execSQL(str, strArr);
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final long f(String str, ContentValues contentValues) {
        c();
        amil l = amjw.l(str.length() != 0 ? "INSERT WITH ON CONFLICT ".concat(str) : new String("INSERT WITH ON CONFLICT "));
        try {
            long insertWithOnConflict = this.b.insertWithOnConflict(str, null, contentValues, 5);
            l.close();
            return insertWithOnConflict;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
