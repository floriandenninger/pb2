package defpackage;

import android.provider.BaseColumns;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rry implements BaseColumns {
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.ContentResolver r10, android.net.Uri r11) {
        /*
            java.lang.String r0 = "youtube_client_id"
            r1 = 1
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L31 android.database.SQLException -> L34
            java.lang.String r3 = "value"
            r9 = 0
            r5[r9] = r3     // Catch: java.lang.Throwable -> L31 android.database.SQLException -> L34
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L31 android.database.SQLException -> L34
            r7[r9] = r0     // Catch: java.lang.Throwable -> L31 android.database.SQLException -> L34
            java.lang.String r6 = "name=?"
            r8 = 0
            r3 = r10
            r4 = r11
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L31 android.database.SQLException -> L34
            if (r10 == 0) goto L2b
            boolean r1 = r10.moveToFirst()     // Catch: android.database.SQLException -> L29 java.lang.Throwable -> L5b
            if (r1 != 0) goto L21
            goto L2b
        L21:
            java.lang.String r11 = r10.getString(r9)     // Catch: android.database.SQLException -> L29 java.lang.Throwable -> L5b
            r10.close()
            return r11
        L29:
            r1 = move-exception
            goto L37
        L2b:
            if (r10 == 0) goto L30
            r10.close()
        L30:
            return r2
        L31:
            r10 = move-exception
            r11 = r10
            goto L5d
        L34:
            r10 = move-exception
            r1 = r10
            r10 = r2
        L37:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r3.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "Can't get key "
            r3.append(r4)     // Catch: java.lang.Throwable -> L5b
            r3.append(r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = " from "
            r3.append(r0)     // Catch: java.lang.Throwable -> L5b
            r3.append(r11)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r11 = "GoogleSettings"
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5b
            android.util.Log.e(r11, r0, r1)     // Catch: java.lang.Throwable -> L5b
            if (r10 == 0) goto L5a
            r10.close()
        L5a:
            return r2
        L5b:
            r11 = move-exception
            r2 = r10
        L5d:
            if (r2 == 0) goto L62
            r2.close()
        L62:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rry.a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
