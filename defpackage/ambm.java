package defpackage;

import android.app.Service;
import android.content.Context;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ambm {
    public final ambd a;
    public final Context b;
    public final Object c = new Object();
    public final Map d = new IdentityHashMap(10);
    public Service e;
    public ambl f;
    public int g;
    public ambk h;

    public ambm(Context context, ambd ambdVar, final Executor executor) {
        this.b = context;
        this.a = ambdVar;
        anaf.E(executor);
        this.f = ambl.STOPPED;
        new Runnable() { // from class: ambj
            @Override // java.lang.Runnable
            public final void run() {
                final ambm ambmVar = ambm.this;
                executor.execute(new Runnable() { // from class: ambi
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            r7 = this;
                            ambm r0 = defpackage.ambm.this
                            ambd r1 = r0.a
                            java.lang.Object r2 = r1.a
                            monitor-enter(r2)
                            boolean r1 = r1.c     // Catch: java.lang.Throwable -> L6b
                            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
                            java.lang.Object r3 = r0.c
                            monitor-enter(r3)
                            r2 = 1
                            r4 = 0
                            if (r1 != 0) goto L1d
                            java.util.Map r1 = r0.d     // Catch: java.lang.Throwable -> L1b
                            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1b
                            if (r1 != 0) goto L1d
                            r1 = 1
                            goto L1e
                        L1b:
                            r0 = move-exception
                            goto L69
                        L1d:
                            r1 = 0
                        L1e:
                            ambl r5 = defpackage.ambl.STOPPED     // Catch: java.lang.Throwable -> L1b
                            ambl r5 = r0.f     // Catch: java.lang.Throwable -> L1b
                            int r5 = r5.ordinal()     // Catch: java.lang.Throwable -> L1b
                            if (r5 == 0) goto L32
                            r2 = 2
                            if (r5 == r2) goto L2c
                            goto L67
                        L2c:
                            if (r1 != 0) goto L67
                            r0.b()     // Catch: java.lang.Throwable -> L1b
                            goto L67
                        L32:
                            if (r1 == 0) goto L67
                            r1 = 0
                            ambk r5 = r0.a(r1)     // Catch: java.lang.Throwable -> L1b
                            android.app.Notification r5 = r5.a     // Catch: java.lang.Throwable -> L1b
                            ambl r5 = r0.f     // Catch: java.lang.Throwable -> L1b
                            ambl r6 = defpackage.ambl.STOPPED     // Catch: java.lang.Throwable -> L1b
                            if (r5 != r6) goto L42
                            goto L43
                        L42:
                            r2 = 0
                        L43:
                            defpackage.amkq.N(r2)     // Catch: java.lang.Throwable -> L1b
                            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L1b
                            android.content.Context r4 = r0.b     // Catch: java.lang.Throwable -> L1b
                            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L1b
                            java.lang.String r4 = "fallback_notification"
                            r2.putExtra(r4, r1)     // Catch: java.lang.Throwable -> L1b
                            ambl r1 = defpackage.ambl.STARTING     // Catch: java.lang.Throwable -> L1b
                            r0.f = r1     // Catch: java.lang.Throwable -> L1b
                            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b
                            r4 = 26
                            if (r1 < r4) goto L62
                            android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L1b
                            r0.startForegroundService(r2)     // Catch: java.lang.Throwable -> L1b
                            goto L67
                        L62:
                            android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L1b
                            r0.startService(r2)     // Catch: java.lang.Throwable -> L1b
                        L67:
                            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                            return
                        L69:
                            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
                            throw r0
                        L6b:
                            r0 = move-exception
                            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6b
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ambi.run():void");
                    }
                });
            }
        };
    }

    public final ambk a(ambk ambkVar) {
        amkq.O(!this.d.isEmpty(), "Can't select a best notification if thare are none");
        for (ambk ambkVar2 : this.d.values()) {
            if (ambkVar != null) {
                int i = ambkVar2.b;
            } else {
                ambkVar = ambkVar2;
            }
        }
        return ambkVar;
    }

    public final void b() {
        amkq.Q(this.f == ambl.STARTED, "Destroyed in wrong state %s", this.f);
        this.f = ambl.STOPPED;
        this.e.stopForeground(true);
        this.h = null;
        this.e.stopSelf(this.g);
        this.e = null;
    }
}
