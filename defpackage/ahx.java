package defpackage;

import android.os.AsyncTask;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahx extends AsyncTask {
    final /* synthetic */ aif a;

    public ahx(aif aifVar) {
        this.a = aifVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[LOOP:0: B:2:0x0002->B:12:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r5) {
        /*
            r4 = this;
            java.lang.Void[] r5 = (java.lang.Void[]) r5
        L2:
            aif r5 = r4.a
            aic r0 = r5.g
            r1 = 0
            if (r0 == 0) goto L30
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            android.app.job.JobParameters r5 = r0.c     // Catch: java.lang.Throwable -> L2d
            if (r5 != 0) goto L13
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
        L11:
            r2 = r1
            goto L49
        L13:
            android.app.job.JobWorkItem r5 = r5.dequeueWork()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L11
            android.content.Intent r2 = r5.getIntent()
            aif r3 = r0.a
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.setExtrasClassLoader(r3)
            aib r2 = new aib
            r2.<init>(r0, r5)
            goto L49
        L2d:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r5
        L30:
            java.util.ArrayList r0 = r5.f
            monitor-enter(r0)
            java.util.ArrayList r2 = r5.f     // Catch: java.lang.Throwable -> L58
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L58
            if (r2 <= 0) goto L47
            java.util.ArrayList r5 = r5.f     // Catch: java.lang.Throwable -> L58
            r2 = 0
            java.lang.Object r5 = r5.remove(r2)     // Catch: java.lang.Throwable -> L58
            r2 = r5
            aia r2 = (defpackage.aia) r2     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            goto L11
        L49:
            if (r2 == 0) goto L57
            aif r5 = r4.a
            r2.b()
            r5.e()
            r2.a()
            goto L2
        L57:
            return r1
        L58:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            goto L5c
        L5b:
            throw r5
        L5c:
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahx.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        this.a.c();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.a.c();
    }
}
