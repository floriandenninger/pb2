package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aevv extends pou {
    private final pou[] a;
    private final long[] b;
    private final long[] c;
    private final Object[] e;
    private final AtomicInteger f;
    private final int g;

    public aevv(aevw aevwVar, aevw aevwVar2, AtomicInteger atomicInteger, int i) {
        pou pouVar = aevwVar.e;
        pou pouVar2 = aevwVar2 != null ? aevwVar2.e : null;
        boolean l = l(pouVar);
        boolean l2 = l(pouVar2);
        if (l) {
            this.a = new pou[0];
            long[] jArr = new long[0];
            this.b = jArr;
            this.c = jArr;
            this.e = new Object[0];
        } else if (l2) {
            this.a = new pou[]{pouVar};
            this.b = new long[]{aevwVar.b};
            this.c = new long[]{aevwVar.f};
            this.e = new Object[]{aevwVar};
        } else {
            this.a = new pou[]{pouVar, pouVar2};
            this.b = new long[]{aevwVar.b, aevwVar2.b};
            this.c = new long[]{aevwVar.f, aevwVar2.f};
            this.e = new Object[]{aevwVar, aevwVar2};
        }
        this.f = atomicInteger;
        this.g = i;
    }

    private static boolean l(pou pouVar) {
        int h;
        int i = 1;
        if (pouVar == null || (h = pouVar.h()) == 0) {
            return true;
        }
        if (h != 1) {
            i = h;
        } else if (pouVar.g() == 1) {
            return false;
        }
        int g = pouVar.g();
        StringBuilder sb = new StringBuilder(74);
        sb.append("Child Timeline too complex windowCount ");
        sb.append(i);
        sb.append(" periodCount ");
        sb.append(g);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.pou
    public final pos a(int i, pos posVar, boolean z) {
        this.a[i].a(0, posVar, z);
        posVar.c = i;
        if (z) {
            posVar.b = this.e[i];
        }
        long j = this.c[i];
        if (j != -1) {
            posVar.d = j * 1000;
        }
        return posVar;
    }

    @Override // defpackage.pou
    public final pot b(int i, pot potVar, long j) {
        this.a[i].b(0, potVar, j);
        potVar.b = this.e[i];
        potVar.o = i;
        potVar.p = i;
        potVar.c = new aevu(this.g, this.f, this.a[i], potVar.c);
        long j2 = this.b[i];
        if (j2 != 0) {
            long j3 = (j2 * 1000) - potVar.q;
            potVar.m = j3;
            if (j3 < 0) {
                afic aficVar = afic.ABR;
                potVar.m = 0L;
            } else {
                long j4 = potVar.n;
                if (j4 != -9223372036854775807L && j3 > j4) {
                    afic aficVar2 = afic.ABR;
                }
            }
        }
        long j5 = this.c[i];
        if (j5 != -1) {
            long j6 = (j5 * 1000) - potVar.q;
            if (potVar.m > j6) {
                potVar.m = j6;
            }
            if (potVar.n > j6) {
                potVar.n = j6;
            }
        }
        return potVar;
    }

    @Override // defpackage.pou
    public final int d(Object obj) {
        int i = 0;
        while (true) {
            Object[] objArr = this.e;
            if (i >= objArr.length) {
                return -1;
            }
            if (objArr[i] == obj) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.pou
    public final int g() {
        return this.a.length;
    }

    @Override // defpackage.pou
    public final int h() {
        return this.a.length;
    }

    @Override // defpackage.pou
    public final Object i(int i) {
        return this.e[i];
    }
}
