package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dwa implements Runnable {
    final /* synthetic */ dwc a;

    public dwa(dwc dwcVar) {
        this.a = dwcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r13.moveToFirst() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r12.add(defpackage.dwe.e(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r13.moveToNext() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        if (r13 == null) goto L35;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r14 = this;
            dwc r0 = r14.a
            java.lang.Object r0 = r0.a
            java.lang.String r9 = "100"
            monitor-enter(r0)
            dwc r1 = r14.a     // Catch: java.lang.Throwable -> L9f
            boolean r2 = r1.e     // Catch: java.lang.Throwable -> L9f
            if (r2 == 0) goto L9d
            android.content.Context r1 = r1.c     // Catch: java.lang.Throwable -> L9f
            boolean r1 = defpackage.dwg.h(r1)     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L9d
            dwc r1 = r14.a     // Catch: java.lang.Throwable -> L9f
            boolean r2 = r1.d     // Catch: java.lang.Throwable -> L9f
            if (r2 == 0) goto L1d
            goto L9d
        L1d:
            java.util.List r10 = r1.b     // Catch: java.lang.Throwable -> L9f
            dwe r1 = r1.f     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r11 = r1.b     // Catch: java.lang.Throwable -> L9f
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L9f
            java.util.LinkedList r12 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L9a
            r12.<init>()     // Catch: java.lang.Throwable -> L9a
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> L9a
            if (r1 != 0) goto L31
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L9a
            goto L7e
        L31:
            r13 = 0
            java.lang.String r8 = "last_retry_time ASC"
            java.lang.String r2 = "conversiontracking"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r13 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5a
            boolean r1 = r13.moveToFirst()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5a
            if (r1 == 0) goto L52
        L45:
            dvz r1 = defpackage.dwe.e(r13)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5a
            r12.add(r1)     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5a
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Throwable -> L58 android.database.sqlite.SQLiteException -> L5a
            if (r1 != 0) goto L45
        L52:
            if (r13 == 0) goto L7d
        L54:
            r13.close()     // Catch: java.lang.Throwable -> L9a
            goto L7d
        L58:
            r1 = move-exception
            goto L94
        L5a:
            r1 = move-exception
            java.lang.String r2 = "GoogleConversionReporter"
            java.lang.String r3 = "Error extracing ping Info: "
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L58
            int r4 = r1.length()     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L72
            java.lang.String r1 = r3.concat(r1)     // Catch: java.lang.Throwable -> L58
            goto L77
        L72:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L58
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L58
        L77:
            android.util.Log.w(r2, r1)     // Catch: java.lang.Throwable -> L58
            if (r13 == 0) goto L7d
            goto L54
        L7d:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L9a
        L7e:
            r10.addAll(r12)     // Catch: java.lang.Throwable -> L9f
            dwc r1 = r14.a     // Catch: java.lang.Throwable -> L9f
            android.content.Context r1 = r1.c     // Catch: java.lang.Throwable -> L9f
            defpackage.dwg.f(r1)     // Catch: java.lang.Throwable -> L9f
            dwc r1 = r14.a     // Catch: java.lang.Throwable -> L9f
            r2 = 1
            r1.d = r2     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> L9f
            r1.notify()     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            return
        L94:
            if (r13 == 0) goto L99
            r13.close()     // Catch: java.lang.Throwable -> L9a
        L99:
            throw r1     // Catch: java.lang.Throwable -> L9a
        L9a:
            r1 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L9a
            throw r1     // Catch: java.lang.Throwable -> L9f
        L9d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            return
        L9f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9f
            goto La3
        La2:
            throw r1
        La3:
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwa.run():void");
    }
}
