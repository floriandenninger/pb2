package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vhp {
    public final SQLiteDatabase a;
    public final Executor b;
    public final Executor c;
    public volatile boolean d = false;
    public final vhx e;

    public vhp(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, vhx vhxVar) {
        this.a = sQLiteDatabase;
        this.b = executor;
        this.c = executor2;
        this.e = vhxVar;
    }

    public final void a() {
        if (this.d) {
            throw new IllegalStateException("Already closed");
        }
    }
}
