package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class yon extends SQLiteOpenHelper implements yoi {
    private final int a;
    public final Context b;

    public yon(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.b = context;
        this.a = i;
    }

    protected abstract yom a(int i);

    protected void b(SQLiteDatabase sQLiteDatabase) {
        yoj.f(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (int i = 0; i < this.a; i++) {
            a(i).a(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b(sQLiteDatabase);
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        while (i < i2) {
            try {
                a(i).a(sQLiteDatabase);
                i++;
            } catch (SQLException e) {
                zga.d(String.format(Locale.US, "Error upgrading from %d to %d", Integer.valueOf(i - 1), Integer.valueOf(i)), e);
                throw e;
            }
        }
    }
}
