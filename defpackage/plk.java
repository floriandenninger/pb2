package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class plk implements pmv {
    private final bfg a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private int g;
    private boolean h;

    public plk() {
        this(new bfg(true, 65536), 50000, 50000, 2500, 5000);
    }

    public static void d(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        pse.f(z, sb.toString());
    }

    private final void k(boolean z) {
        this.g = 13107200;
        this.h = false;
        if (z) {
            this.a.b();
        }
    }

    @Override // defpackage.pmv
    public long a() {
        return this.f;
    }

    @Override // defpackage.pmv
    public boolean b(long j, long j2, float f) {
        int a = this.a.a();
        int i = this.g;
        long j3 = this.b;
        if (f > 1.0f) {
            j3 = Math.min(pts.n(j3, f), this.c);
        }
        if (j2 < Math.max(j3, 500000L)) {
            boolean z = a < i;
            this.h = z;
            if (!z && j2 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || a >= i) {
            this.h = false;
        }
        return this.h;
    }

    @Override // defpackage.pmv
    public boolean c(long j, float f, boolean z, long j2) {
        long p = pts.p(j, f);
        long j3 = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || p >= j3 || this.a.a() >= this.g;
    }

    @Override // defpackage.pmv
    public final void e() {
        k(false);
    }

    @Override // defpackage.pmv
    public final void f() {
        k(true);
    }

    @Override // defpackage.pmv
    public final void g() {
        k(true);
    }

    @Override // defpackage.pmv
    public final void h(poe[] poeVarArr, asj asjVar, bel[] belVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i < poeVarArr.length) {
                if (belVarArr[i] != null) {
                    int ae = poeVarArr[i].ae();
                    if (ae != 1) {
                        if (ae != 2) {
                            if (ae != 3) {
                            }
                            i3 = 131072;
                        } else {
                            i3 = 131072000;
                        }
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.g = max;
                this.a.c(max);
                return;
            }
        }
    }

    @Override // defpackage.pmv
    public final boolean i() {
        return false;
    }

    @Override // defpackage.pmv
    public final bfg j() {
        return this.a;
    }

    public plk(bfg bfgVar, int i, int i2, int i3, int i4) {
        d(i3, 0, "bufferForPlaybackMs", "0");
        d(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        d(i, i3, "minBufferMs", "bufferForPlaybackMs");
        d(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        d(i2, i, "maxBufferMs", "minBufferMs");
        d(0, 0, "backBufferDurationMs", "0");
        this.a = bfgVar;
        this.b = plh.c(i);
        this.c = plh.c(i2);
        this.d = plh.c(i3);
        this.e = plh.c(i4);
        this.g = 13107200;
        this.f = plh.c(0L);
    }
}
