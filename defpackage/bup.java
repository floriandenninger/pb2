package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bup implements DatabaseErrorHandler {
    final /* synthetic */ buo[] a;

    public bup(buo[] buoVarArr) {
        this.a = buoVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        String c;
        buo b = buq.b(this.a, sQLiteDatabase);
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + b.c());
        if (b.j()) {
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = b.a.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    b.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    Iterator<Pair<String, String>> it = list.iterator();
                    while (it.hasNext()) {
                        bug.a((String) it.next().second);
                    }
                    return;
                }
                c = b.c();
            } catch (Throwable th) {
                if (list != null) {
                    Iterator<Pair<String, String>> it2 = list.iterator();
                    while (it2.hasNext()) {
                        bug.a((String) it2.next().second);
                    }
                } else {
                    bug.a(b.c());
                }
                throw th;
            }
        } else {
            c = b.c();
        }
        bug.a(c);
    }
}
