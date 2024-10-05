package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeyg {
    public final bcx a;
    public pms b = null;
    public final List c = new ArrayList();
    public volatile boolean d;
    private long e;

    public aeyg(bfg bfgVar, Looper looper, ayr ayrVar, bbx bbxVar, long j, byte[] bArr) {
        this.a = bcx.D(bfgVar, looper, ayrVar, bbxVar);
        f(j);
    }

    private final synchronized void j() {
        bcx bcxVar = this.a;
        bcxVar.z(bcxVar.c());
    }

    private final synchronized void k() {
        bcx bcxVar = this.a;
        bcxVar.z(bcxVar.b);
    }

    public final synchronized int a(pmt pmtVar, asw aswVar, int i) {
        return this.a.d(pmtVar, aswVar, i, this.d);
    }

    public final synchronized int b(long j) {
        int b;
        b = this.a.b(j, this.d);
        this.a.w(b);
        return b;
    }

    public final synchronized List c(ajcb ajcbVar, int i, boolean z) {
        int al = pts.al(amkq.aU(this.c, adpv.l), Integer.valueOf(i));
        int i2 = -1;
        if (al < 0 || al >= this.c.size() || ((aeyf) this.c.get(al)).b != i) {
            al = -1;
        }
        if (al >= 0 && ((aeyf) this.c.get(al)).a.equals(ajcbVar)) {
            i2 = al;
        }
        if (i2 < 0) {
            return Collections.emptyList();
        }
        aeyf aeyfVar = (aeyf) this.c.get(i2);
        if (!z || aeyfVar.c > this.a.h()) {
            while (aeyfVar.c <= this.a.h()) {
                i2++;
                if (i2 < this.c.size()) {
                    aeyfVar = (aeyf) this.c.get(i2);
                } else {
                    return Collections.emptyList();
                }
            }
            this.a.l(aeyfVar.c);
        } else {
            long h = this.a.h();
            k();
            this.a.l(aeyfVar.c);
            j();
            this.a.c = h;
        }
        int size = this.c.size();
        if (this.d && size == this.c.size()) {
            this.d = false;
        }
        List subList = this.c.subList(i2, size);
        ArrayList arrayList = new ArrayList(subList);
        subList.clear();
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11 < (r3 + r5)) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(long r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            bcx r0 = r10.a     // Catch: java.lang.Throwable -> L65
            long r0 = r0.h()     // Catch: java.lang.Throwable -> L65
            long r11 = java.lang.Math.min(r11, r0)     // Catch: java.lang.Throwable -> L65
            java.util.List r0 = r10.c     // Catch: java.lang.Throwable -> L65
            adpv r1 = defpackage.adpv.m     // Catch: java.lang.Throwable -> L65
            java.util.List r0 = defpackage.amkq.aU(r0, r1)     // Catch: java.lang.Throwable -> L65
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L65
            int r0 = defpackage.pts.al(r0, r1)     // Catch: java.lang.Throwable -> L65
            r1 = -1
            if (r0 < 0) goto L45
            java.util.List r2 = r10.c     // Catch: java.lang.Throwable -> L65
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L65
            if (r0 >= r2) goto L45
            java.util.List r2 = r10.c     // Catch: java.lang.Throwable -> L65
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L65
            aeyf r2 = (defpackage.aeyf) r2     // Catch: java.lang.Throwable -> L65
            long r3 = r2.c     // Catch: java.lang.Throwable -> L65
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 > 0) goto L45
            long r5 = r2.e     // Catch: java.lang.Throwable -> L65
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L3f
            long r5 = r2.d     // Catch: java.lang.Throwable -> L65
            long r5 = r5 - r3
        L3f:
            long r3 = r3 + r5
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 >= 0) goto L45
            goto L46
        L45:
            r0 = -1
        L46:
            if (r0 > 0) goto L4a
            monitor-exit(r10)
            return
        L4a:
            java.util.List r11 = r10.c     // Catch: java.lang.Throwable -> L65
            java.lang.Object r11 = r11.get(r0)     // Catch: java.lang.Throwable -> L65
            aeyf r11 = (defpackage.aeyf) r11     // Catch: java.lang.Throwable -> L65
            bcx r12 = r10.a     // Catch: java.lang.Throwable -> L65
            long r1 = r11.c     // Catch: java.lang.Throwable -> L65
            r11 = 0
            r12.j(r1, r11, r11)     // Catch: java.lang.Throwable -> L65
            java.util.List r12 = r10.c     // Catch: java.lang.Throwable -> L65
            java.util.List r11 = r12.subList(r11, r0)     // Catch: java.lang.Throwable -> L65
            r11.clear()     // Catch: java.lang.Throwable -> L65
            monitor-exit(r10)
            return
        L65:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyg.d(long):void");
    }

    public final synchronized void e() {
        this.c.clear();
        this.d = false;
        this.a.r();
        f(this.e);
    }

    public final synchronized void f(long j) {
        this.e = j;
        this.a.c = j;
    }

    public final synchronized boolean g() {
        return this.a.y(this.d);
    }

    public final synchronized void h() {
        this.a.C();
    }

    public final synchronized boolean i(long j) {
        boolean A;
        A = this.a.A(j, false);
        f(j);
        return A;
    }
}
