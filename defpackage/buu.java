package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class buu extends but implements bul {
    private final SQLiteStatement b;

    public buu(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final void a() {
        this.b.executeInsert();
    }

    public final void b() {
        this.b.executeUpdateDelete();
    }
}
