package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfy extends AtomicInteger implements ayqd, ayqx, aytt {
    private static final long serialVersionUID = 8080567949447303262L;
    final ayqd a;
    final ayrv b;
    final int c;
    final int d;
    public final azqf e = new azqf();
    final ArrayDeque f = new ArrayDeque();
    aytf g;
    public ayqx h;
    volatile boolean i;
    int j;
    volatile boolean k;
    ayts l;
    int m;
    public final int n;

    public azfy(ayqd ayqdVar, ayrv ayrvVar, int i, int i2, int i3) {
        this.a = ayqdVar;
        this.b = ayrvVar;
        this.c = i;
        this.d = i2;
        this.n = i3;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (azqi.e(this.e, th)) {
            this.i = true;
            f();
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.j == 0) {
            this.g.k(obj);
        }
        f();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        r12.m = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (r12.k == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (r7 != 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (((java.lang.Throwable) r12.e.get()) != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        r0.d();
        h();
        r2.b(defpackage.azqi.d(r12.e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        r6 = r12.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r6 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        if (r7 != 2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        if (((java.lang.Throwable) r12.e.get()) != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        r0.d();
        h();
        r2.b(defpackage.azqi.d(r12.e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d0, code lost:
    
        r6 = r12.i;
        r8 = (defpackage.ayts) r1.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
    
        if (r6 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
    
        if (r8 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        r12.l = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        if (((java.lang.Throwable) r12.e.get()) == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
    
        r0.d();
        h();
        r2.b(defpackage.azqi.d(r12.e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f6, code lost:
    
        r2.sh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
    
        if (r8 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0100, code lost:
    
        if (r6 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0102, code lost:
    
        r8 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0106, code lost:
    
        if (r12.k != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        r9 = r6.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        if (r7 != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        if (((java.lang.Throwable) r12.e.get()) != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
    
        r0.d();
        h();
        r2.b(defpackage.azqi.d(r12.e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0128, code lost:
    
        r11 = r8.sg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        if (r9 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
    
        if (r11 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0130, code lost:
    
        r12.l = null;
        r12.m--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013d, code lost:
    
        r2.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013a, code lost:
    
        if (r11 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        r5 = addAndGet(-r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0160, code lost:
    
        if (r5 != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0162, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0141, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        defpackage.aynu.c(r6);
        defpackage.azqi.e(r12.e, r6);
        r12.l = null;
        r12.m--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0154, code lost:
    
        r0.d();
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0089, code lost:
    
        r0.d();
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x008f, code lost:
    
        return;
     */
    @Override // defpackage.aytt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azfy.f():void");
    }

    @Override // defpackage.aytt
    public final void g(ayts aytsVar) {
        aytsVar.f();
        f();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.h.qc();
        if (getAndIncrement() != 0) {
            return;
        }
        do {
            this.g.d();
            h();
        } while (decrementAndGet() != 0);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.h, ayqxVar)) {
            this.h = ayqxVar;
            if (ayqxVar instanceof ayta) {
                ayta aytaVar = (ayta) ayqxVar;
                int sf = aytaVar.sf(3);
                if (sf == 1) {
                    this.j = 1;
                    this.g = aytaVar;
                    this.i = true;
                    this.a.se(this);
                    f();
                    return;
                }
                if (sf == 2) {
                    this.j = 2;
                    this.g = aytaVar;
                    this.a.se(this);
                    return;
                }
            }
            this.g = new azoh(this.d);
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.i = true;
        f();
    }

    final void h() {
        ayts aytsVar = this.l;
        if (aytsVar != null) {
            ayrz.c(aytsVar);
        }
        while (true) {
            ayts aytsVar2 = (ayts) this.f.poll();
            if (aytsVar2 == null) {
                return;
            } else {
                ayrz.c(aytsVar2);
            }
        }
    }
}
