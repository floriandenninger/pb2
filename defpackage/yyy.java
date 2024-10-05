package defpackage;

import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yyy {
    static final int a = yny.N(0, 3);
    static final int b = yny.N(3, 3);
    static final int c = yny.N(6, 4);
    static final int d = yny.N(10, 4);
    static final int e = yny.N(14, 5);
    public static final int f = yny.N(19, 7);
    public static final int g = yny.N(26, 7);
    static final int h = yny.N(33, 3);
    static final int i = yny.N(36, 2);
    static final int j = yny.N(38, 1);
    static final int k = yny.N(39, 1);
    static final int l = yny.N(40, 3);
    static final int m = yny.N(43, 5);
    static final int n = yny.N(48, 9);
    static final int o = yny.N(57, 4);
    static final int p = yny.N(61, 3);
    public final int q;
    public final int r;
    public final int s;
    private final long t;

    public yyy(long j2) {
        long j3 = j2;
        long nextLong = ThreadLocalRandom.current().nextLong();
        if (j3 == 0) {
            int i2 = c;
            long U = yny.U(j3, i2, yny.R(i2) >> 1);
            int i3 = d;
            long U2 = yny.U(U, i3, yny.R(i3) >> 1);
            int i4 = i;
            j3 = yny.T(yny.T(yny.T(yny.U(U2, i4, yny.R(i4) >> 1), e, 5000L, 250L, 250L), f, 500L, 50L, 50L), g, 1000L, 50L, 50L);
        }
        this.t = j3;
        int d2 = d(a);
        int d3 = d(b);
        int d4 = d(h);
        if (d2 != 0 && !e(c, nextLong)) {
            d2 = 7;
        }
        this.q = d2;
        if (d3 != 0 && !e(d, nextLong)) {
            d3 = 7;
        }
        this.r = d3;
        if (d4 != 0 && !e(i, nextLong)) {
            d4 = 7;
        }
        this.s = d4;
    }

    public static long c(avdy avdyVar) {
        avdk avdkVar = avdyVar.i;
        if (avdkVar == null) {
            avdkVar = avdk.a;
        }
        avdv avdvVar = avdyVar.l;
        if (avdvVar == null) {
            avdvVar = avdv.a;
        }
        avdp avdpVar = avdyVar.j;
        if (avdpVar == null) {
            avdpVar = avdp.a;
        }
        return yny.T(yny.T(yny.T(yny.T(yny.U(yny.U(yny.U(yny.U(yny.U(yny.U(yny.U(yny.U(yny.U(yny.U(yny.U(yny.U(0L, a, avdkVar.g), b, avdvVar.c), h, avdpVar.b), c, avdkVar.h), d, avdvVar.d), i, avdpVar.c), n, avdyVar.n), l, avdkVar.i), m, avdkVar.j), j, true != avdvVar.e ? 0L : 1L), k, true == avdpVar.d ? 1L : 0L), p, avdkVar.l), e, avdkVar.b, 250L, 250L), f, avdkVar.e, 50L, 50L), g, avdkVar.f, 50L, 50L), o, avdkVar.k, 0L, 200L);
    }

    private final int d(int i2) {
        return (int) yny.S(this.t, i2);
    }

    private final boolean e(int i2, long j2) {
        long d2 = d(i2);
        return d2 > 0 && ((j2 >> yny.O(i2)) & yny.R(i2)) <= d2;
    }

    public final int a(int i2, int i3, int i4) {
        return (int) ((yny.S(this.t, i2) * i4) + i3);
    }

    public final int b() {
        return a(e, 250, 250);
    }
}
