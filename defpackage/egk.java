package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class egk extends ameh implements edx {
    public boolean a;
    egm b;
    azrw c;
    azrw d;
    azrw e;
    axpg f;
    axpg g;
    azrw h;
    Executor i;
    azrw j;
    azrw k;
    azrw l;
    yxx m;
    private long p;
    private long q;
    private egg r;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ameh, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.p = SystemClock.elapsedRealtime();
        this.q = System.currentTimeMillis();
        super.attachBaseContext(context);
    }

    @Override // defpackage.edx
    public final long b() {
        return this.q;
    }

    @Override // defpackage.edx
    public final long c() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(azrw azrwVar) {
        this.r = (egg) azrwVar.get();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i) {
        boolean z;
        azrw azrwVar;
        yxx yxxVar = this.m;
        boolean z2 = false;
        if (yxxVar == null || (yxxVar.f(yxx.F) & 16) != 0) {
            z = false;
        } else {
            if (this.r == null && (azrwVar = this.e) != null) {
                i(azrwVar);
            }
            z = true;
        }
        final egg eggVar = this.r;
        if (eggVar != null) {
            if (eggVar.b == 1 || (eggVar.b == 2 && i >= 20)) {
                if ((eggVar.c & 1) == 0) {
                    eggVar.b(i);
                    eggVar.a(i);
                } else {
                    eggVar.a.a.a.execute(new Runnable() { // from class: egf
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2;
                            egg eggVar2 = egg.this;
                            int i3 = i;
                            while (true) {
                                int i4 = eggVar2.d.get();
                                if (i4 != 0) {
                                    if (i3 <= i4 || eggVar2.d.compareAndSet(i4, i3)) {
                                        return;
                                    }
                                } else if (eggVar2.d.compareAndSet(0, i3)) {
                                    do {
                                        i2 = eggVar2.d.get();
                                        eggVar2.b(i2);
                                        eggVar2.a(i2);
                                    } while (!eggVar2.d.compareAndSet(i2, 0));
                                    return;
                                }
                            }
                        }
                    });
                }
                z2 = true;
            }
            z |= z2;
        }
        if (z) {
            super.onTrimMemory(i);
        }
    }
}
