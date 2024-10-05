package defpackage;

import android.os.SystemClock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class rdh implements Runnable {
    final long f;
    final long g;
    final boolean h;
    final /* synthetic */ rdq i;

    public rdh(rdq rdqVar) {
        this(rdqVar, true);
    }

    public abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.i.e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            this.i.a(e, false, this.h);
            b();
        }
    }

    public rdh(rdq rdqVar, boolean z) {
        this.i = rdqVar;
        this.f = System.currentTimeMillis();
        this.g = SystemClock.elapsedRealtime();
        this.h = z;
    }
}
