package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class txg implements twx {
    private final txf a;

    public txg(Context context) {
        this.a = new txf(context);
    }

    private static final twu f(Cursor cursor) {
        twp a = twu.a();
        a.a = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        a.b(cursor.getString(cursor.getColumnIndex("account_name")));
        a.b = cursor.getString(cursor.getColumnIndex("obfuscated_gaia_id"));
        a.c = Long.valueOf(cursor.getLong(cursor.getColumnIndex("sync_version")));
        a.d = Long.valueOf(cursor.getLong(cursor.getColumnIndex("page_version")));
        a.d(twb.a(cursor.getInt(cursor.getColumnIndex("registration_status"))));
        a.e = Long.valueOf(cursor.getLong(cursor.getColumnIndex("last_registration_time_ms")));
        a.c(cursor.getInt(cursor.getColumnIndex("last_registration_request_hash")));
        a.f = Long.valueOf(cursor.getLong(cursor.getColumnIndex("first_registration_version")));
        return a.a();
    }

    private static final ContentValues g(twu twuVar) {
        ContentValues contentValues = new ContentValues(8);
        contentValues.put("account_name", twuVar.b);
        contentValues.put("obfuscated_gaia_id", twuVar.c);
        contentValues.put("sync_version", twuVar.d);
        contentValues.put("page_version", twuVar.e);
        contentValues.put("registration_status", Integer.valueOf(twuVar.f.h));
        contentValues.put("last_registration_time_ms", twuVar.g);
        contentValues.put("last_registration_request_hash", Integer.valueOf(twuVar.h));
        contentValues.put("first_registration_version", twuVar.i);
        return contentValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b A[Catch: all -> 0x006f, TRY_ENTER, TryCatch #4 {, blocks: (B:3:0x0001, B:12:0x001e, B:34:0x006b, B:35:0x006e), top: B:2:0x0001 }] */
    @Override // defpackage.twx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long a(defpackage.twu r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            defpackage.uqq.i()     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            android.content.ContentValues r1 = g(r7)     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            txf r2 = r6.a     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L44 java.lang.RuntimeException -> L46
            java.lang.String r3 = "accounts"
            r4 = 2
            long r0 = r2.insertWithOnConflict(r3, r0, r1, r4)     // Catch: java.lang.RuntimeException -> L42 java.lang.Throwable -> L67
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L23
            if (r2 == 0) goto L21
            r2.close()     // Catch: java.lang.Throwable -> L6f
        L21:
            monitor-exit(r6)
            return r0
        L23:
            twv r0 = new twv     // Catch: java.lang.RuntimeException -> L42 java.lang.Throwable -> L67
            java.lang.String r1 = "Conflict inserting ChimeAccount: "
            java.lang.String r3 = r7.b     // Catch: java.lang.RuntimeException -> L42 java.lang.Throwable -> L67
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.RuntimeException -> L42 java.lang.Throwable -> L67
            int r4 = r3.length()     // Catch: java.lang.RuntimeException -> L42 java.lang.Throwable -> L67
            if (r4 == 0) goto L38
            java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.RuntimeException -> L42 java.lang.Throwable -> L67
            goto L3e
        L38:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.RuntimeException -> L42 java.lang.Throwable -> L67
            r3.<init>(r1)     // Catch: java.lang.RuntimeException -> L42 java.lang.Throwable -> L67
            r1 = r3
        L3e:
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L42 java.lang.Throwable -> L67
            throw r0     // Catch: java.lang.RuntimeException -> L42 java.lang.Throwable -> L67
        L42:
            r0 = move-exception
            goto L49
        L44:
            r7 = move-exception
            goto L69
        L46:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L49:
            twv r1 = new twv     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "Error inserting ChimeAccount: "
            java.lang.String r7 = r7.b     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L67
            int r4 = r7.length()     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L5e
            java.lang.String r7 = r3.concat(r7)     // Catch: java.lang.Throwable -> L67
            goto L63
        L5e:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L67
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L67
        L63:
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L67
            throw r1     // Catch: java.lang.Throwable -> L67
        L67:
            r7 = move-exception
            r0 = r2
        L69:
            if (r0 == 0) goto L6e
            r0.close()     // Catch: java.lang.Throwable -> L6f
        L6e:
            throw r7     // Catch: java.lang.Throwable -> L6f
        L6f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txg.a(twu):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0001, B:12:0x002e, B:14:0x0033, B:20:0x003a, B:22:0x003f, B:23:0x0042, B:24:0x0051, B:31:0x006e, B:33:0x0073, B:34:0x0076), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[Catch: all -> 0x0077, TryCatch #3 {, blocks: (B:3:0x0001, B:12:0x002e, B:14:0x0033, B:20:0x003a, B:22:0x003f, B:23:0x0042, B:24:0x0051, B:31:0x006e, B:33:0x0073, B:34:0x0076), top: B:2:0x0001 }] */
    @Override // defpackage.twx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.twu b(java.lang.String r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            defpackage.uqq.i()     // Catch: java.lang.Throwable -> L77
            r0 = 0
            r1 = 1
            r2 = 0
            txf r3 = r13.a     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L59
            android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L59
            java.lang.String[] r8 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            r8[r0] = r14     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            java.lang.String r5 = "accounts"
            r6 = 0
            java.lang.String r7 = "account_name=?"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r4 = r3
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            int r4 = r2.getCount()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            if (r4 <= 0) goto L38
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            twu r14 = f(r2)     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            if (r2 == 0) goto L31
            r2.close()     // Catch: java.lang.Throwable -> L77
        L31:
            if (r3 == 0) goto L36
            r3.close()     // Catch: java.lang.Throwable -> L77
        L36:
            monitor-exit(r13)
            return r14
        L38:
            if (r2 == 0) goto L3d
            r2.close()     // Catch: java.lang.Throwable -> L77
        L3d:
            if (r3 == 0) goto L42
            r3.close()     // Catch: java.lang.Throwable -> L77
        L42:
            tww r2 = new tww     // Catch: java.lang.Throwable -> L77
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L77
            r1[r0] = r14     // Catch: java.lang.Throwable -> L77
            java.lang.String r14 = "ChimeAccount not found [%s]"
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch: java.lang.Throwable -> L77
            r2.<init>(r14)     // Catch: java.lang.Throwable -> L77
            throw r2     // Catch: java.lang.Throwable -> L77
        L52:
            r14 = move-exception
            goto L6c
        L54:
            r4 = move-exception
            goto L5c
        L56:
            r14 = move-exception
            r3 = r2
            goto L6c
        L59:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L5c:
            tww r5 = new tww     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L52
            r1[r0] = r14     // Catch: java.lang.Throwable -> L52
            java.lang.String r14 = "Error getting ChimeAccount [%s]"
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch: java.lang.Throwable -> L52
            r5.<init>(r14, r4)     // Catch: java.lang.Throwable -> L52
            throw r5     // Catch: java.lang.Throwable -> L52
        L6c:
            if (r2 == 0) goto L71
            r2.close()     // Catch: java.lang.Throwable -> L77
        L71:
            if (r3 == 0) goto L76
            r3.close()     // Catch: java.lang.Throwable -> L77
        L76:
            throw r14     // Catch: java.lang.Throwable -> L77
        L77:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txg.b(java.lang.String):twu");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r0.add(f(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r1.moveToNext() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r1.moveToFirst() != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[Catch: all -> 0x0065, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:16:0x0033, B:18:0x0038, B:30:0x005c, B:32:0x0061, B:33:0x0064, B:25:0x0052), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061 A[Catch: all -> 0x0065, TryCatch #1 {, blocks: (B:3:0x0001, B:16:0x0033, B:18:0x0038, B:30:0x005c, B:32:0x0061, B:33:0x0064, B:25:0x0052), top: B:2:0x0001 }] */
    @Override // defpackage.twx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List c() {
        /*
            r12 = this;
            monitor-enter(r12)
            defpackage.uqq.i()     // Catch: java.lang.Throwable -> L65
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65
            r0.<init>()     // Catch: java.lang.Throwable -> L65
            r1 = 0
            txf r2 = r12.a     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L43
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L43
            java.lang.String r4 = "accounts"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r2
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L3e
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L3e
            if (r3 == 0) goto L31
        L24:
            twu r3 = f(r1)     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L3e
            r0.add(r3)     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L3e
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L3e
            if (r3 != 0) goto L24
        L31:
            if (r1 == 0) goto L36
            r1.close()     // Catch: java.lang.Throwable -> L65
        L36:
            if (r2 == 0) goto L58
        L38:
            r2.close()     // Catch: java.lang.Throwable -> L65
            goto L58
        L3c:
            r0 = move-exception
            goto L5a
        L3e:
            r3 = move-exception
            goto L46
        L40:
            r0 = move-exception
            r2 = r1
            goto L5a
        L43:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L46:
            java.lang.String r4 = "ChimeAccountStorageImpl"
            java.lang.String r5 = "Error getting list of available ChimeAccounts."
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L3c
            defpackage.tzk.c(r4, r3, r5, r6)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L55
            r1.close()     // Catch: java.lang.Throwable -> L65
        L55:
            if (r2 == 0) goto L58
            goto L38
        L58:
            monitor-exit(r12)
            return r0
        L5a:
            if (r1 == 0) goto L5f
            r1.close()     // Catch: java.lang.Throwable -> L65
        L5f:
            if (r2 == 0) goto L64
            r2.close()     // Catch: java.lang.Throwable -> L65
        L64:
            throw r0     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            monitor-exit(r12)
            goto L69
        L68:
            throw r0
        L69:
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txg.c():java.util.List");
    }

    @Override // defpackage.twx
    public final synchronized void d(String str) {
        uqq.i();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                sQLiteDatabase.delete("accounts", "account_name=?", new String[]{str});
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            } catch (RuntimeException e) {
                tzk.c("ChimeAccountStorageImpl", e, "Error deleting ChimeAccount [%s]", str);
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    @Override // defpackage.twx
    public final synchronized void e(twu twuVar) {
        uqq.i();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                ContentValues g = g(twuVar);
                sQLiteDatabase = this.a.getWritableDatabase();
                sQLiteDatabase.update("accounts", g, "account_name=?", new String[]{twuVar.b});
            } finally {
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        } catch (RuntimeException e) {
            tzk.c("ChimeAccountStorageImpl", e, "Error updating ChimeAccount [%s]", twuVar.b);
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
        }
    }
}
