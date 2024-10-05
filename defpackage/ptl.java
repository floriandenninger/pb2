package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ptl implements psx {
    public pnu a = pnu.a;
    private boolean b;
    private long c;
    private long d;

    public final void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    public final void c() {
        if (this.b) {
            a(f());
            this.b = false;
        }
    }

    @Override // defpackage.psx
    public final long f() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        return j + (this.a.b == 1.0f ? plh.c(elapsedRealtime) : elapsedRealtime * r4.d);
    }

    @Override // defpackage.psx
    public final pnu h() {
        return this.a;
    }

    @Override // defpackage.psx
    public final void q(pnu pnuVar) {
        if (this.b) {
            a(f());
        }
        this.a = pnuVar;
    }
}
