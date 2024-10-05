package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdz extends beb {
    private final bey d;
    private final amru e;
    private float f;
    private int g;
    private int h;
    private long i;
    private bdu j;

    /* JADX INFO: Access modifiers changed from: protected */
    public bdz(asi asiVar, int[] iArr, bey beyVar, List list) {
        super(asiVar, iArr, null);
        this.d = beyVar;
        this.e = amru.o(list);
        this.f = 1.0f;
        this.h = 0;
        this.i = -9223372036854775807L;
    }

    public static void k(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            amrp amrpVar = (amrp) list.get(i);
            if (amrpVar != null) {
                amrpVar.h(new bdy(j, jArr[i]));
            }
        }
    }

    private final int t(long j) {
        long e = (((float) this.d.e()) * 0.7f) / this.f;
        if (!this.e.isEmpty()) {
            int i = 1;
            while (i < this.e.size() - 1 && ((bdy) this.e.get(i)).a < e) {
                i++;
            }
            bdy bdyVar = (bdy) this.e.get(i - 1);
            bdy bdyVar2 = (bdy) this.e.get(i);
            long j2 = bdyVar.a;
            long j3 = bdyVar2.a;
            e = ((((float) (e - j2)) / ((float) (j3 - j2))) * ((float) (bdyVar2.b - r8))) + bdyVar.b;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !r(i3, j)) {
                if (f(i3).j <= e) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    private static final void u(List list) {
        if (list.isEmpty()) {
            return;
        }
        bdu bduVar = (bdu) amkq.bj(list);
        if (bduVar.k != -9223372036854775807L) {
            long j = bduVar.l;
        }
    }

    @Override // defpackage.beb, defpackage.bel
    public final int g(long j, List list) {
        int i;
        int i2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.i;
        if (j2 == -9223372036854775807L || elapsedRealtime - j2 >= 1000 || (!list.isEmpty() && !((bdu) amkq.bj(list)).equals(this.j))) {
            this.i = elapsedRealtime;
            this.j = list.isEmpty() ? null : (bdu) amkq.bj(list);
            if (list.isEmpty()) {
                return 0;
            }
            int size = list.size();
            if (pts.p(((bdu) list.get(size - 1)).k - j, this.f) < 25000000) {
                return size;
            }
            u(list);
            pms f = f(t(elapsedRealtime));
            for (int i3 = 0; i3 < size; i3++) {
                bdu bduVar = (bdu) list.get(i3);
                pms pmsVar = bduVar.h;
                if (pts.p(bduVar.k - j, this.f) >= 25000000 && pmsVar.j < f.j && (i = pmsVar.t) != -1 && i < 720 && (i2 = pmsVar.s) != -1 && i2 < 1280 && i < f.t) {
                    return i3;
                }
            }
            return size;
        }
        return list.size();
    }

    @Override // defpackage.bel
    public final int h() {
        return this.g;
    }

    @Override // defpackage.bel
    public final int i() {
        return this.h;
    }

    @Override // defpackage.bel
    public final Object j() {
        return null;
    }

    @Override // defpackage.beb, defpackage.bel
    public final void l() {
        this.j = null;
    }

    @Override // defpackage.beb, defpackage.bel
    public final void m() {
        this.i = -9223372036854775807L;
        this.j = null;
    }

    @Override // defpackage.beb, defpackage.bel
    public final void n(float f) {
        this.f = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r9 < r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r9 >= 25000000) goto L38;
     */
    @Override // defpackage.bel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(long r7, long r9, long r11, java.util.List r13, defpackage.bdw[] r14) {
        /*
            r6 = this;
            long r7 = android.os.SystemClock.elapsedRealtime()
            int r0 = r6.g
            int r1 = r14.length
            r2 = 0
            if (r0 >= r1) goto L1d
            r0 = r14[r0]
            boolean r0 = r0.b()
            if (r0 == 0) goto L1d
            int r0 = r6.g
            r14 = r14[r0]
            r14.c()
            r14.d()
            goto L34
        L1d:
            if (r2 >= r1) goto L31
            r0 = r14[r2]
            boolean r3 = r0.b()
            if (r3 == 0) goto L2e
            r0.c()
            r0.d()
            goto L34
        L2e:
            int r2 = r2 + 1
            goto L1d
        L31:
            u(r13)
        L34:
            int r14 = r6.h
            if (r14 != 0) goto L42
            r9 = 1
            r6.h = r9
            int r7 = r6.t(r7)
            r6.g = r7
            return
        L42:
            int r0 = r6.g
            boolean r1 = r13.isEmpty()
            r2 = -1
            if (r1 == 0) goto L4d
            r1 = -1
            goto L59
        L4d:
            java.lang.Object r1 = defpackage.amkq.bj(r13)
            bdu r1 = (defpackage.bdu) r1
            pms r1 = r1.h
            int r1 = r6.c(r1)
        L59:
            if (r1 == r2) goto L64
            java.lang.Object r13 = defpackage.amkq.bj(r13)
            bdu r13 = (defpackage.bdu) r13
            int r14 = r13.i
            r0 = r1
        L64:
            int r13 = r6.t(r7)
            boolean r7 = r6.r(r0, r7)
            if (r7 != 0) goto La1
            pms r7 = r6.f(r0)
            pms r8 = r6.f(r13)
            int r8 = r8.j
            int r7 = r7.j
            if (r8 <= r7) goto L97
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 10000000(0x989680, double:4.9406565E-317)
            int r5 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r5 == 0) goto L92
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 > 0) goto L92
            float r11 = (float) r11
            r12 = 1061158912(0x3f400000, float:0.75)
            float r11 = r11 * r12
            long r3 = (long) r11
        L92:
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 >= 0) goto L97
            goto La0
        L97:
            if (r8 >= r7) goto La1
            r7 = 25000000(0x17d7840, double:1.2351641E-316)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 < 0) goto La1
        La0:
            r13 = r0
        La1:
            if (r13 != r0) goto La4
            goto La5
        La4:
            r14 = 3
        La5:
            r6.h = r14
            r6.g = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdz.o(long, long, long, java.util.List, bdw[]):void");
    }
}
