package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class buq extends SQLiteOpenHelper {
    final buo[] a;
    final bug b;
    private boolean c;

    public buq(Context context, String str, buo[] buoVarArr, bug bugVar) {
        super(context, str, null, bugVar.a, new bup(buoVarArr));
        this.b = bugVar;
        this.a = buoVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static buo b(buo[] buoVarArr, SQLiteDatabase sQLiteDatabase) {
        buo buoVar = buoVarArr[0];
        if (buoVar != null && buoVar.a == sQLiteDatabase) {
            return buoVar;
        }
        buo buoVar2 = new buo(sQLiteDatabase);
        buoVarArr[0] = buoVar2;
        return buoVar2;
    }

    final buo a(SQLiteDatabase sQLiteDatabase) {
        return b(this.a, sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized buo c() {
        this.c = false;
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (this.c) {
            close();
            return c();
        }
        return a(writableDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.a[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        bug bugVar = this.b;
        buo a = a(sQLiteDatabase);
        Cursor b = a.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = true;
                }
            }
            b.close();
            bugVar.c.b(a);
            if (!z) {
                dwh f = bugVar.c.f(a);
                if (!f.b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + f.a);
                }
            }
            bugVar.c(a);
            bugVar.c.a();
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.b(a(sQLiteDatabase), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r5 = this;
            boolean r0 = r5.c
            if (r0 != 0) goto L91
            bug r0 = r5.b
            buo r6 = r5.a(r6)
            java.lang.String r1 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r1 = r6.b(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L8c
            r3 = 0
            if (r2 == 0) goto L1f
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            r1.close()
            r1 = 0
            if (r2 == 0) goto L5e
            buf r2 = new buf
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r2.<init>(r4)
            android.database.Cursor r2 = r6.a(r2)
            boolean r4 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L3c
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L59
            goto L3d
        L3c:
            r3 = r1
        L3d:
            r2.close()
            java.lang.String r2 = r0.d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6b
            java.lang.String r2 = r0.e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L51
            goto L6b
        L51:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
            r6.<init>(r0)
            throw r6
        L59:
            r6 = move-exception
            r2.close()
            throw r6
        L5e:
            btm r2 = r0.c
            dwh r2 = r2.f(r6)
            boolean r3 = r2.b
            if (r3 == 0) goto L73
            r0.c(r6)
        L6b:
            btm r2 = r0.c
            r2.d(r6)
            r0.b = r1
            return
        L73:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L8c:
            r6 = move-exception
            r1.close()
            throw r6
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buq.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.b(a(sQLiteDatabase), i, i2);
    }
}
