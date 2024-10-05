package com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b {
    private static b a;
    private Thread.UncaughtExceptionHandler b;
    private volatile c c;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }

    public final synchronized void b(c cVar) {
        if (this.c == null) {
            this.c = cVar;
            if (this.b == null) {
                this.b = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.a
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th) {
                        b.this.d(thread, th);
                    }
                });
            }
        }
    }

    public final synchronized void c() {
        this.c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        r1.a(new com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData(r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(java.lang.Thread r9, java.lang.Throwable r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r10 != 0) goto L5
            monitor-exit(r8)
            return
        L5:
            r0 = 0
            com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c r1 = r8.c     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L34
            r2 = r10
        Lb:
            if (r2 == 0) goto L34
            java.lang.StackTraceElement[] r3 = r2.getStackTrace()     // Catch: java.lang.Throwable -> L48
            int r4 = r3.length     // Catch: java.lang.Throwable -> L48
            r5 = 0
        L13:
            if (r5 >= r4) goto L2f
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = r6.getClassName()     // Catch: java.lang.Throwable -> L48
            java.lang.String r7 = "com.google.android.apps.youtube.embeddedplayer"
            boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L2c
            com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData r2 = new com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData     // Catch: java.lang.Throwable -> L48
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L48
            r1.a(r2)     // Catch: java.lang.Throwable -> L48
            goto L34
        L2c:
            int r5 = r5 + 1
            goto L13
        L2f:
            java.lang.Throwable r2 = r2.getCause()     // Catch: java.lang.Throwable -> L48
            goto Lb
        L34:
            java.lang.Thread$UncaughtExceptionHandler r1 = r8.b     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L3d
            r1.uncaughtException(r9, r10)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r8)
            return
        L3d:
            java.lang.String r9 = "Error calling original UncaughtExceptionHandler, cannot propagate exception to embedding app."
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L46
            defpackage.alta.B(r9, r10)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r8)
            return
        L46:
            r9 = move-exception
            goto L90
        L48:
            r1 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L7f
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L7f
            int r2 = r2 + 25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = "Cannot log crash due to: "
            r3.append(r2)     // Catch: java.lang.Throwable -> L7f
            r3.append(r1)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L7f
            defpackage.alta.B(r1, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.Thread$UncaughtExceptionHandler r1 = r8.b     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L76
            r1.uncaughtException(r9, r10)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r8)
            return
        L76:
            java.lang.String r9 = "Error calling original UncaughtExceptionHandler, cannot propagate exception to embedding app."
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L46
            defpackage.alta.B(r9, r10)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r8)
            return
        L7f:
            r1 = move-exception
            java.lang.Thread$UncaughtExceptionHandler r2 = r8.b     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L88
            r2.uncaughtException(r9, r10)     // Catch: java.lang.Throwable -> L46
            goto L8f
        L88:
            java.lang.String r9 = "Error calling original UncaughtExceptionHandler, cannot propagate exception to embedding app."
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L46
            defpackage.alta.B(r9, r10)     // Catch: java.lang.Throwable -> L46
        L8f:
            throw r1     // Catch: java.lang.Throwable -> L46
        L90:
            monitor-exit(r8)
            goto L93
        L92:
            throw r9
        L93:
            goto L92
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.b.d(java.lang.Thread, java.lang.Throwable):void");
    }
}
