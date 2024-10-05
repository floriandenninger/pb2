package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pae {
    public final int a;
    public final long b;
    public final HashMap c;
    public pbg d;
    public boolean e;
    public boolean f;
    public long g;
    private final int[] h;
    private long i;

    public pae(pag pagVar, int i, pao paoVar, int i2, pad padVar) {
        this.a = i;
        par b = paoVar.b(i2);
        long d = d(paoVar, i2);
        pal palVar = (pal) b.b.get(padVar.d);
        List list = palVar.b;
        this.b = b.a * 1000;
        pbd pbdVar = null;
        if (!palVar.c.isEmpty()) {
            for (int i3 = 0; i3 < palVar.c.size(); i3++) {
                pam pamVar = (pam) palVar.c.get(i3);
                if (pamVar.b != null && pamVar.c != null) {
                    pbdVar = pbdVar == null ? new pbd() : pbdVar;
                    pbdVar.b(pamVar.b, pamVar.c);
                }
            }
        }
        this.d = pbdVar;
        if (padVar.a()) {
            this.h = new int[padVar.f.length];
            int i4 = 0;
            while (true) {
                ozv[] ozvVarArr = padVar.f;
                if (i4 >= ozvVarArr.length) {
                    break;
                }
                this.h[i4] = e(list, ozvVarArr[i4].a);
                i4++;
            }
        } else {
            this.h = new int[]{e(list, padVar.e.a)};
        }
        this.c = new HashMap();
        int i5 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i5 < iArr.length) {
                pav pavVar = (pav) list.get(iArr[i5]);
                this.c.put(pavVar.e.a, new paf(pagVar, this.b, d, pavVar));
                i5++;
            } else {
                c(d, (pav) list.get(iArr[0]));
                return;
            }
        }
    }

    private final void c(long j, pav pavVar) {
        long j2;
        pah h = pavVar.h();
        if (h != null) {
            int a = h.a();
            int b = h.b(j);
            this.e = b == -1;
            this.f = h.g();
            this.g = this.b + h.e(a);
            if (this.e) {
                return;
            }
            j2 = this.b + h.e(b);
            j = h.d(b, j);
        } else {
            this.e = false;
            this.f = true;
            j2 = this.b;
            this.g = j2;
        }
        this.i = j2 + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final long d(defpackage.pao r5, int r6) {
        /*
            java.util.List r0 = r5.g
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r1 = -1
            if (r6 != r0) goto L20
            long r3 = r5.b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            r3 = r1
            goto L37
        L14:
            java.util.List r5 = r5.g
            java.lang.Object r5 = r5.get(r6)
            par r5 = (defpackage.par) r5
            long r5 = r5.a
        L1e:
            long r3 = r3 - r5
            goto L37
        L20:
            java.util.List r0 = r5.g
            int r3 = r6 + 1
            java.lang.Object r0 = r0.get(r3)
            par r0 = (defpackage.par) r0
            long r3 = r0.a
            java.util.List r5 = r5.g
            java.lang.Object r5 = r5.get(r6)
            par r5 = (defpackage.par) r5
            long r5 = r5.a
            goto L1e
        L37:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r1
        L3c:
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pae.d(pao, int):long");
    }

    private static final int e(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(((pav) list.get(i)).e.a)) {
                return i;
            }
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing format id: ".concat(str) : new String("Missing format id: "));
    }

    public final long a() {
        if (this.e) {
            throw new IllegalStateException("Period has unbounded index");
        }
        return this.i;
    }

    public final void b(pao paoVar, int i, pad padVar) {
        par b = paoVar.b(i);
        long d = d(paoVar, i);
        List list = ((pal) b.b.get(padVar.d)).b;
        int i2 = 0;
        while (true) {
            int[] iArr = this.h;
            if (i2 < iArr.length) {
                pav pavVar = (pav) list.get(iArr[i2]);
                paf pafVar = (paf) this.c.get(pavVar.e.a);
                pah h = pafVar.c.h();
                pah h2 = pavVar.h();
                pafVar.g = d;
                pafVar.c = pavVar;
                if (h != null) {
                    pafVar.d = h2;
                    if (h.g()) {
                        int b2 = h.b(pafVar.g);
                        long e = h.e(b2) + h.d(b2, pafVar.g);
                        int a = h2.a();
                        long e2 = h2.e(a);
                        if (e == e2) {
                            pafVar.h += (h.b(pafVar.g) + 1) - a;
                        } else if (e >= e2) {
                            pafVar.h += h.c(e2, pafVar.g) - a;
                        } else {
                            throw new oxb();
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            } else {
                c(d, (pav) list.get(iArr[0]));
                return;
            }
        }
    }
}
