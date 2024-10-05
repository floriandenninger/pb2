package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhr implements shf {
    private final /* synthetic */ int a;

    public zhr(int i) {
        this.a = i;
    }

    @Override // defpackage.shf
    public final long b() {
        return this.a != 0 ? SystemClock.currentThreadTimeMillis() : SystemClock.currentThreadTimeMillis();
    }

    @Override // defpackage.shf
    public final long c() {
        return this.a != 0 ? System.currentTimeMillis() : System.currentTimeMillis();
    }

    @Override // defpackage.shf
    public final long d() {
        return this.a != 0 ? SystemClock.elapsedRealtime() : SystemClock.elapsedRealtime();
    }

    @Override // defpackage.shf
    public final long e() {
        if (this.a == 0) {
            return SystemClock.elapsedRealtimeNanos();
        }
        if (shh.a) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }

    @Override // defpackage.shf
    public final long f() {
        return this.a != 0 ? System.nanoTime() : System.nanoTime();
    }

    @Override // defpackage.shf
    public final long g() {
        return this.a != 0 ? SystemClock.uptimeMillis() : SystemClock.uptimeMillis();
    }
}
