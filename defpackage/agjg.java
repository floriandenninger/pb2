package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjg {
    public final agik a;

    public agjg(agik agikVar) {
        this.a = agikVar;
    }

    public agjg(agik agikVar, byte[] bArr) {
        agikVar.getClass();
        this.a = agikVar;
    }

    public static final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            if (sQLiteDatabase.inTransaction()) {
                sQLiteDatabase.endTransaction();
            }
        } catch (SQLiteException e) {
            zga.n("Error while terminating OfflineSubscriptions db transaction", e);
        }
    }
}
