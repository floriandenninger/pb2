package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import java.io.File;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class yoh implements yol {
    public final yoi a;
    public final String b;

    public yoh(yoi yoiVar, String str) {
        yoiVar.getClass();
        this.a = yoiVar;
        this.b = str;
    }

    private final Cursor o() {
        String str;
        Cursor query = this.a.getReadableDatabase().query(this.b, new String[]{"value", "key"}, null, null, null, null, "sortingValue ASC, insertionOrder ASC");
        try {
            query.getCount();
            return query;
        } catch (SQLException e) {
            yoi yoiVar = this.a;
            String str2 = "";
            if (yoiVar instanceof yon) {
                yon yonVar = (yon) yoiVar;
                str2 = yonVar.getDatabaseName();
                File databasePath = yonVar.b.getDatabasePath(yonVar.getDatabaseName());
                if (databasePath == null) {
                    str = " is null";
                } else if (databasePath.exists()) {
                    str = !databasePath.canRead() ? String.format("%s is not readable", databasePath.getAbsolutePath()) : String.format("%s is readable", databasePath.getAbsolutePath());
                } else {
                    str = String.format("%s doesn't exist", databasePath.getAbsolutePath());
                }
            } else {
                str = "";
            }
            throw new yof(String.format(Locale.US, "%s trying to access db %s: %s", e.toString(), str2, str));
        }
    }

    protected abstract long a(Object obj);

    @Override // defpackage.yol
    public final yok b() {
        Cursor cursor;
        yjk.e();
        try {
            cursor = o();
        } catch (IllegalStateException e) {
            zga.d("Failed to read values from database.", e);
            cursor = null;
        }
        return new yod(this, cursor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object c(byte[] bArr);

    @Override // defpackage.yol
    public final void d() {
        e(true);
    }

    public final void e(boolean z) {
        if (z) {
            yjk.e();
        }
        this.a.getWritableDatabase().beginTransaction();
    }

    @Override // defpackage.yol
    public final void f() {
        g(true);
    }

    public final void g(boolean z) {
        if (z) {
            yjk.e();
        }
        this.a.getWritableDatabase().endTransaction();
    }

    public final void h(yoe yoeVar, boolean z) {
        Object obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", yoeVar.a);
        contentValues.put("value", m(yoeVar.b));
        contentValues.put("sortingValue", Long.valueOf(a(yoeVar.b)));
        String str = yoeVar.a;
        if (z) {
            yjk.e();
        }
        Cursor query = this.a.getReadableDatabase().query(this.b, new String[]{"value"}, "key=?", new String[]{str}, null, null, null, null);
        if (query.moveToNext()) {
            obj = c(query.getBlob(0));
            query.close();
        } else {
            query.close();
            obj = null;
        }
        if (obj == null) {
            this.a.getWritableDatabase().insert(this.b, null, contentValues);
        } else {
            this.a.getWritableDatabase().update(this.b, contentValues, "key = ?", new String[]{yoeVar.a});
        }
    }

    @Override // defpackage.yol
    public final void i() {
        j(true);
    }

    public final void j(boolean z) {
        if (z) {
            yjk.e();
        }
        this.a.getWritableDatabase().setTransactionSuccessful();
    }

    public final void k(yoe yoeVar, boolean z) {
        if (z) {
            yjk.e();
        }
        e(z);
        try {
            h(yoeVar, z);
            j(z);
        } finally {
            g(z);
        }
    }

    @Override // defpackage.yol
    public final void l(String str, Object obj) {
        k(yoe.a(str, obj), true);
    }

    protected abstract byte[] m(Object obj);

    @Override // defpackage.yol
    public final void n(String str) {
        yjk.e();
        this.a.getWritableDatabase().delete(this.b, "key = ?", new String[]{str});
    }
}
