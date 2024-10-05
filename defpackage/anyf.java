package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anyf extends Service {
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService e;

    public anyf() {
        rbd rbdVar = ral.a;
        this.e = rbd.v(new qts("Firebase-Messaging-Intent-Handle"));
        this.b = new Object();
        this.d = 0;
    }

    public final rpt f(final Intent intent) {
        final rpv rpvVar = new rpv();
        this.e.execute(new Runnable() { // from class: anyd
            @Override // java.lang.Runnable
            public final void run() {
                anyf anyfVar = anyf.this;
                Intent intent2 = intent;
                rpv rpvVar2 = rpvVar;
                try {
                    anyfVar.h(intent2);
                } finally {
                    rpvVar2.b(null);
                }
            }
        });
        return rpvVar.a;
    }

    public final void g(Intent intent) {
        if (intent != null) {
            synchronized (anzp.b) {
                if (anzp.c != null && anzp.b(intent)) {
                    anzp.a(intent, false);
                    row rowVar = anzp.c;
                    if (rowVar.m.decrementAndGet() < 0) {
                        Log.e("WakeLock", rowVar.j.concat(" release without a matched acquire!"));
                    }
                    synchronized (rowVar.b) {
                        rowVar.c();
                        if (rowVar.l.containsKey(null)) {
                            ajbh ajbhVar = (ajbh) rowVar.l.get(null);
                            if (ajbhVar != null) {
                                int i = ajbhVar.i - 1;
                                ajbhVar.i = i;
                                if (i == 0) {
                                    rowVar.l.remove(null);
                                }
                            }
                        } else {
                            Log.w("WakeLock", rowVar.j.concat(" counter does not exist"));
                        }
                        rowVar.d();
                    }
                }
            }
        }
        synchronized (this.b) {
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public abstract void h(Intent intent);

    protected Intent i() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new anzr(new anye(this));
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.e.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.d++;
        }
        Intent i3 = i();
        if (i3 == null) {
            g(intent);
            return 2;
        }
        rpt f = f(i3);
        if (f.j()) {
            g(intent);
            return 2;
        }
        f.m(qmq.i, new rpi() { // from class: anyc
            @Override // defpackage.rpi
            public final void a(rpt rptVar) {
                anyf.this.g(intent);
            }
        });
        return 3;
    }
}
