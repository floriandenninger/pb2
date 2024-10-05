package defpackage;

import android.os.Handler;
import android.util.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnj {
    public final avk a;
    public int b;
    public boolean c;
    public png d;
    public png e;
    public png f;
    public int g;
    public Object h;
    private final pos i = new pos();
    private final pot j = new pot();
    private final Handler k;
    private long l;
    private long m;

    public pnj(avk avkVar, Handler handler) {
        this.a = avkVar;
        this.k = handler;
    }

    private final long l(pou pouVar, Object obj, int i) {
        pouVar.jH(obj, this.i);
        this.i.f(i);
        long j = this.i.g.a(i).f;
        return 0L;
    }

    private final pnh m(pou pouVar, Object obj, int i, int i2, long j, long j2) {
        ash ashVar = new ash(obj, i, i2, j2);
        long d = pouVar.jH(ashVar.a, this.i).d(ashVar.b, ashVar.c);
        if (i2 == this.i.c(i)) {
            this.i.g();
        }
        this.i.h(ashVar.b);
        long j3 = 0;
        if (d != -9223372036854775807L && d <= 0) {
            j3 = Math.max(0L, (-1) + d);
        }
        return new pnh(ashVar, j3, j, -9223372036854775807L, d, false, false, false, false);
    }

    private final pnh n(pou pouVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5 = j;
        pouVar.jH(obj, this.i);
        int b = this.i.b(j5);
        ash ashVar = new ash(obj, j3, b);
        boolean r = r(ashVar);
        boolean q = q(pouVar, ashVar);
        boolean p = p(pouVar, ashVar, r);
        if (b != -1) {
            this.i.h(b);
        }
        if (b != -1) {
            this.i.f(b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j6 = j4 != -9223372036854775807L ? j4 : this.i.d;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0L, (-1) + j6);
        }
        return new pnh(ashVar, j5, j2, j4, j6, false, r, q, p);
    }

    private static ash o(pou pouVar, Object obj, long j, long j2, pos posVar) {
        pouVar.jH(obj, posVar);
        int i = posVar.g.b;
        return new ash(obj, j2, posVar.b(j));
    }

    private final boolean p(pou pouVar, ash ashVar, boolean z) {
        int d = pouVar.d(ashVar.a);
        return !pouVar.y(pouVar.x(d, this.i).c, this.j).i && pouVar.u(d, this.i, this.j, this.b, this.c) == -1 && z;
    }

    private final boolean q(pou pouVar, ash ashVar) {
        if (r(ashVar)) {
            return pouVar.y(pouVar.jH(ashVar.a, this.i).c, this.j).p == pouVar.d(ashVar.a);
        }
        return false;
    }

    private static final boolean r(ash ashVar) {
        return !ashVar.a() && ashVar.e == -1;
    }

    public final png a() {
        png pngVar = this.d;
        if (pngVar == null) {
            return null;
        }
        if (pngVar == this.e) {
            this.e = pngVar.h;
        }
        pngVar.h();
        int i = this.g - 1;
        this.g = i;
        if (i == 0) {
            this.f = null;
            png pngVar2 = this.d;
            this.h = pngVar2.b;
            this.m = pngVar2.f.i.d;
        }
        this.d = this.d.h;
        e();
        return this.d;
    }

    public final pnh b(pou pouVar, png pngVar, long j) {
        long j2;
        pnh pnhVar = pngVar.f;
        long j3 = (pngVar.k + pnhVar.d) - j;
        if (pnhVar.f) {
            long j4 = 0;
            int u = pouVar.u(pouVar.d(pnhVar.i.a), this.i, this.j, this.b, this.c);
            if (u == -1) {
                return null;
            }
            int i = pouVar.a(u, this.i, true).c;
            Object obj = this.i.b;
            long j5 = pnhVar.i.d;
            if (pouVar.y(i, this.j).o == u) {
                Pair w = pouVar.w(this.j, this.i, i, -9223372036854775807L, Math.max(0L, j3));
                if (w == null) {
                    return null;
                }
                obj = w.first;
                long longValue = ((Long) w.second).longValue();
                png pngVar2 = pngVar.h;
                if (pngVar2 != null && pngVar2.b.equals(obj)) {
                    j5 = pngVar2.f.i.d;
                } else {
                    j5 = this.l;
                    this.l = 1 + j5;
                }
                j2 = longValue;
                j4 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            return k(pouVar, o(pouVar, obj, j2, j5, this.i), j4, j2);
        }
        ash ashVar = pnhVar.i;
        pouVar.jH(ashVar.a, this.i);
        if (ashVar.a()) {
            int i2 = ashVar.b;
            if (this.i.a(i2) == -1) {
                return null;
            }
            int b = this.i.g.a(i2).b(ashVar.c);
            if (b < 0) {
                return m(pouVar, ashVar.a, i2, b, pnhVar.b, ashVar.d);
            }
            long j6 = pnhVar.b;
            if (j6 == -9223372036854775807L) {
                pot potVar = this.j;
                pos posVar = this.i;
                Pair w2 = pouVar.w(potVar, posVar, posVar.c, -9223372036854775807L, Math.max(0L, j3));
                if (w2 == null) {
                    return null;
                }
                j6 = ((Long) w2.second).longValue();
            }
            l(pouVar, ashVar.a, ashVar.b);
            return n(pouVar, ashVar.a, Math.max(0L, j6), pnhVar.b, ashVar.d);
        }
        int c = this.i.c(ashVar.e);
        if (c == this.i.a(ashVar.e)) {
            l(pouVar, ashVar.a, ashVar.e);
            return n(pouVar, ashVar.a, 0L, pnhVar.d, ashVar.d);
        }
        return m(pouVar, ashVar.a, ashVar.e, c, pnhVar.d, ashVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pnh c(defpackage.pou r19, defpackage.pnh r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            ash r3 = r2.i
            boolean r12 = r(r3)
            boolean r13 = r0.q(r1, r3)
            boolean r14 = r0.p(r1, r3, r12)
            ash r4 = r2.i
            java.lang.Object r4 = r4.a
            pos r5 = r0.i
            r1.jH(r4, r5)
            boolean r1 = r3.a()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L36
            int r1 = r3.e
            if (r1 != r4) goto L2e
            goto L36
        L2e:
            pos r7 = r0.i
            r7.f(r1)
            r7 = 0
            goto L37
        L36:
            r7 = r5
        L37:
            boolean r1 = r3.a()
            if (r1 == 0) goto L49
            pos r1 = r0.i
            int r5 = r3.b
            int r6 = r3.c
            long r5 = r1.d(r5, r6)
        L47:
            r9 = r5
            goto L54
        L49:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L4f
            r9 = r7
            goto L54
        L4f:
            pos r1 = r0.i
            long r5 = r1.d
            goto L47
        L54:
            boolean r1 = r3.a()
            if (r1 == 0) goto L62
            pos r1 = r0.i
            int r4 = r3.b
            r1.h(r4)
            goto L6b
        L62:
            int r1 = r3.e
            if (r1 == r4) goto L6b
            pos r4 = r0.i
            r4.h(r1)
        L6b:
            pnh r15 = new pnh
            long r4 = r2.a
            long r1 = r2.b
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pnj.c(pou, pnh):pnh");
    }

    public final void d() {
        if (this.g == 0) {
            return;
        }
        png pngVar = this.d;
        pse.d(pngVar);
        this.h = pngVar.b;
        this.m = pngVar.f.i.d;
        while (pngVar != null) {
            pngVar.h();
            pngVar = pngVar.h;
        }
        this.d = null;
        this.f = null;
        this.e = null;
        this.g = 0;
        e();
    }

    public final void e() {
        if (this.a != null) {
            final amrp f = amru.f();
            for (png pngVar = this.d; pngVar != null; pngVar = pngVar.h) {
                f.h(pngVar.f.i);
            }
            png pngVar2 = this.e;
            final ash ashVar = pngVar2 == null ? null : pngVar2.f.i;
            this.k.post(new Runnable() { // from class: pni
                @Override // java.lang.Runnable
                public final void run() {
                    pnj pnjVar = pnj.this;
                    amrp amrpVar = f;
                    ash ashVar2 = ashVar;
                    avk avkVar = pnjVar.a;
                    amru g = amrpVar.g();
                    avj avjVar = avkVar.b;
                    poa poaVar = avkVar.e;
                    pse.c(poaVar);
                    avjVar.b = amru.o(g);
                    if (!g.isEmpty()) {
                        avjVar.d = (ash) g.get(0);
                        pse.c(ashVar2);
                        avjVar.e = ashVar2;
                    }
                    if (avjVar.c == null) {
                        avjVar.c = avj.b(poaVar, avjVar.b, avjVar.d, avjVar.a);
                    }
                    avjVar.a(poaVar.s());
                }
            });
        }
    }

    public final void f(long j) {
        png pngVar = this.f;
        if (pngVar != null) {
            pse.g(pngVar.l());
            if (pngVar.d) {
                pngVar.a.m(pngVar.e(j));
            }
        }
    }

    public final boolean g(bbp bbpVar) {
        png pngVar = this.f;
        return pngVar != null && pngVar.a == bbpVar;
    }

    public final boolean h(png pngVar) {
        boolean z = false;
        pse.g(pngVar != null);
        if (pngVar.equals(this.f)) {
            return false;
        }
        this.f = pngVar;
        while (true) {
            pngVar = pngVar.h;
            if (pngVar != null) {
                if (pngVar == this.e) {
                    this.e = this.d;
                    z = true;
                }
                pngVar.h();
                this.g--;
            } else {
                this.f.i(null);
                e();
                return z;
            }
        }
    }

    public final boolean i(pou pouVar) {
        png pngVar;
        png pngVar2 = this.d;
        if (pngVar2 == null) {
            return true;
        }
        int d = pouVar.d(pngVar2.b);
        while (true) {
            d = pouVar.u(d, this.i, this.j, this.b, this.c);
            while (true) {
                pngVar = pngVar2.h;
                if (pngVar == null || pngVar2.f.f) {
                    break;
                }
                pngVar2 = pngVar;
            }
            if (d == -1 || pngVar == null || pouVar.d(pngVar.b) != d) {
                break;
            }
            pngVar2 = pngVar;
        }
        boolean h = h(pngVar2);
        pngVar2.f = c(pouVar, pngVar2.f);
        return !h;
    }

    public final ash j(pou pouVar, Object obj, long j) {
        long j2;
        int d;
        int i = pouVar.jH(obj, this.i).c;
        Object obj2 = this.h;
        if (obj2 == null || (d = pouVar.d(obj2)) == -1 || pouVar.x(d, this.i).c != i) {
            png pngVar = this.d;
            while (true) {
                if (pngVar == null) {
                    png pngVar2 = this.d;
                    while (true) {
                        if (pngVar2 != null) {
                            int d2 = pouVar.d(pngVar2.b);
                            if (d2 != -1 && pouVar.x(d2, this.i).c == i) {
                                j2 = pngVar2.f.i.d;
                                break;
                            }
                            pngVar2 = pngVar2.h;
                        } else {
                            j2 = this.l;
                            this.l = 1 + j2;
                            if (this.d == null) {
                                this.h = obj;
                                this.m = j2;
                            }
                        }
                    }
                } else {
                    if (pngVar.b.equals(obj)) {
                        j2 = pngVar.f.i.d;
                        break;
                    }
                    pngVar = pngVar.h;
                }
            }
        } else {
            j2 = this.m;
        }
        return o(pouVar, obj, j, j2, this.i);
    }

    public final pnh k(pou pouVar, ash ashVar, long j, long j2) {
        pouVar.jH(ashVar.a, this.i);
        if (ashVar.a()) {
            return m(pouVar, ashVar.a, ashVar.b, ashVar.c, j, ashVar.d);
        }
        return n(pouVar, ashVar.a, j2, j, ashVar.d);
    }
}
