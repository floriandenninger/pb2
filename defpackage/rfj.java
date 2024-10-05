package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfj extends rdv {
    private final rfi b;
    private boolean c;

    public rfj(rgt rgtVar) {
        super(rgtVar);
        Context I = I();
        f();
        this.b = new rfi(this, I);
    }

    @Override // defpackage.rdv
    protected final boolean d() {
        return false;
    }

    final SQLiteDatabase e() {
        if (this.c) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.c = true;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f() {
        J();
        return "google_app_measurement_local.db";
    }

    public final void o() {
        int delete;
        n();
        try {
            SQLiteDatabase e = e();
            if (e == null || (delete = e.delete("messages", null, null)) <= 0) {
                return;
            }
            aF().k.b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e2) {
            aF().c.b("Error resetting local analytics data. error", e2);
        }
    }

    final boolean p() {
        return I().getDatabasePath(f()).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfj.q(int, byte[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List r() {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfj.r():java.util.List");
    }

    public final void s() {
        int i;
        n();
        if (!this.c && p()) {
            int i2 = 5;
            while (i < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase e = e();
                    if (e == null) {
                        this.c = true;
                        return;
                    }
                    e.beginTransaction();
                    e.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    e.setTransactionSuccessful();
                    e.endTransaction();
                    e.close();
                    return;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e2) {
                    aF().c.b("Error deleting app launch break from local database", e2);
                    this.c = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e3) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    aF().c.b("Error deleting app launch break from local database", e3);
                    this.c = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            aF().f.a("Error deleting app launch break from local database in reasonable time");
        }
    }
}
