package defpackage;

import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class awj {
    public final awi a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public awj(AudioTrack audioTrack) {
        int i = pts.a;
        this.a = new awi(audioTrack);
        d();
    }

    public final long a() {
        return this.a.e;
    }

    public final long b() {
        return this.a.a();
    }

    public final void c() {
        e(4);
    }

    public final void d() {
        e(0);
    }

    public final void e(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.d = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }
}
