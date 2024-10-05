package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baag extends Thread {
    public final baaq a;
    public final azvk b;
    public boolean c;
    final /* synthetic */ baah d;
    public int e;
    private long f;
    private long g;
    private int h;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public baag(baah baahVar, int i) {
        this.d = baahVar;
        setDaemon(true);
        this.a = new baaq();
        this.e = 4;
        this.b = azth.p();
        this.nextParkedWorker = baah.a;
        azuu azuuVar = azuu.b;
        Object obj = ((azuq) azuu.b).a.get();
        obj.getClass();
        this.h = ((Random) obj).nextInt();
        c(i);
    }

    private final baam e() {
        if (a(2) == 0) {
            baam baamVar = (baam) this.d.i.b();
            return baamVar == null ? (baam) this.d.j.b() : baamVar;
        }
        baam baamVar2 = (baam) this.d.j.b();
        return baamVar2 == null ? (baam) this.d.i.b() : baamVar2;
    }

    private final baam f(boolean z) {
        long b;
        long b2;
        boolean z2 = azwq.a;
        int i = (int) (this.d.h.b & 2097151);
        if (i < 2) {
            return null;
        }
        int a = a(i);
        baah baahVar = this.d;
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            a++;
            if (a > i) {
                a = 1;
            }
            baag baagVar = (baag) baahVar.g.get(a);
            if (baagVar != null && baagVar != this) {
                if (z) {
                    baaq baaqVar = this.a;
                    baaq baaqVar2 = baagVar.a;
                    baaqVar2.getClass();
                    int i3 = baaqVar2.c.a;
                    AtomicReferenceArray atomicReferenceArray = baaqVar2.a;
                    for (int i4 = baaqVar2.d.a; i4 != i3; i4++) {
                        int i5 = i4 & 127;
                        if (baaqVar2.e.a == 0) {
                            break;
                        }
                        baam baamVar = (baam) atomicReferenceArray.get(i5);
                        if (baamVar != null && baamVar.h.e() == 1 && atomicReferenceArray.compareAndSet(i5, baamVar, null)) {
                            baaqVar2.e.a();
                            baaqVar.c(baamVar, false);
                            b2 = -1;
                            break;
                        }
                    }
                    b2 = baaqVar.b(baaqVar2, true);
                    b = b2;
                } else {
                    baaq baaqVar3 = this.a;
                    baaq baaqVar4 = baagVar.a;
                    baaqVar4.getClass();
                    baam e = baaqVar4.e();
                    if (e != null) {
                        baaqVar3.c(e, false);
                        b = -1;
                    } else {
                        b = baaqVar3.b(baaqVar4, false);
                    }
                }
                if (b == -1) {
                    return this.a.d();
                }
                if (b > 0) {
                    j = Math.min(j, b);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.g = j;
        return null;
    }

    private final boolean g() {
        return this.nextParkedWorker != baah.a;
    }

    public final int a(int i) {
        int i2 = this.h;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.h = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final void c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.e);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = i2 == 1;
        if (z) {
            this.d.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        int i = 1;
        boolean z2 = false;
        loop0: while (true) {
            boolean z3 = false;
            while (!this.d.d() && this.e != 5) {
                baam b = b(this.c);
                long j = -2097152;
                if (b != null) {
                    this.g = 0L;
                    int e = b.h.e();
                    this.f = 0L;
                    if (this.e == 3) {
                        boolean z4 = azwq.a;
                        this.e = 2;
                    }
                    if (e != 0 && d(2)) {
                        this.d.c();
                    }
                    baah.f(b);
                    if (e != 0) {
                        this.d.h.a(-2097152L);
                        if (this.e != 5) {
                            boolean z5 = azwq.a;
                            this.e = 4;
                        }
                    }
                } else {
                    this.c = z2;
                    if (this.g == 0) {
                        if (g()) {
                            boolean z6 = azwq.a;
                            azvk azvkVar = this.b;
                            int i2 = azvn.a;
                            azvkVar.a = -1;
                            while (g() && this.b.a == -1 && !this.d.d() && this.e != 5) {
                                d(3);
                                Thread.interrupted();
                                if (this.f == 0) {
                                    z = z3;
                                    this.f = System.nanoTime() + this.d.d;
                                } else {
                                    z = z3;
                                }
                                LockSupport.parkNanos(this.d.d);
                                if (System.nanoTime() - this.f >= 0) {
                                    this.f = 0L;
                                    baah baahVar = this.d;
                                    synchronized (baahVar.g) {
                                        if (!baahVar.d()) {
                                            if (((int) (baahVar.h.b & 2097151)) > baahVar.b) {
                                                if (this.b.c(-1, i)) {
                                                    int i3 = this.indexInArray;
                                                    c(0);
                                                    baahVar.b(this, i3, 0);
                                                    int andDecrement = (int) (azvl.a.getAndDecrement(baahVar.h) & 2097151);
                                                    if (andDecrement != i3) {
                                                        Object obj = baahVar.g.get(andDecrement);
                                                        obj.getClass();
                                                        baag baagVar = (baag) obj;
                                                        baahVar.g.set(i3, baagVar);
                                                        baagVar.c(i3);
                                                        baahVar.b(baagVar, andDecrement, i3);
                                                    }
                                                    baahVar.g.set(andDecrement, null);
                                                    this.e = 5;
                                                    z3 = z;
                                                    i = 1;
                                                }
                                            }
                                        }
                                    }
                                }
                                z3 = z;
                            }
                        } else {
                            baah baahVar2 = this.d;
                            if (this.nextParkedWorker == baah.a) {
                                azvl azvlVar = baahVar2.f;
                                while (true) {
                                    long j2 = azvlVar.b;
                                    int i4 = this.indexInArray;
                                    boolean z7 = azwq.a;
                                    this.nextParkedWorker = baahVar2.g.get((int) (j2 & 2097151));
                                    if (baahVar2.f.b(j2, i4 | ((2097152 + j2) & j))) {
                                        break;
                                    } else {
                                        j = -2097152;
                                    }
                                }
                            }
                        }
                        z3 = z3;
                        i = 1;
                        z2 = false;
                    } else if (z3) {
                        d(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.g);
                        this.g = 0L;
                    } else {
                        z3 = true;
                    }
                }
            }
        }
        d(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        if (r0 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.baam b(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = 1
            if (r0 != r1) goto L6
            goto L4e
        L6:
            baah r0 = r8.d
            azvl r2 = r0.h
        La:
            long r3 = r2.b
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r7 = 42
            long r5 = r5 >> r7
            int r6 = (int) r5
            if (r6 != 0) goto L3e
            if (r9 == 0) goto L2d
            baaq r9 = r8.a
            baam r9 = r9.d()
            if (r9 != 0) goto L37
            baah r9 = r8.d
            azzu r9 = r9.j
            java.lang.Object r9 = r9.b()
            baam r9 = (defpackage.baam) r9
            goto L37
        L2d:
            baah r9 = r8.d
            azzu r9 = r9.j
            java.lang.Object r9 = r9.b()
            baam r9 = (defpackage.baam) r9
        L37:
            if (r9 != 0) goto L3d
            baam r9 = r8.f(r1)
        L3d:
            return r9
        L3e:
            azvl r5 = r0.h
            r6 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r6 = r6 + r3
            boolean r3 = r5.b(r3, r6)
            if (r3 == 0) goto La
            r8.e = r1
        L4e:
            if (r9 == 0) goto L72
            baah r9 = r8.d
            int r9 = r9.b
            int r9 = r9 + r9
            int r9 = r8.a(r9)
            if (r9 != 0) goto L61
            baam r0 = r8.e()
            if (r0 != 0) goto L78
        L61:
            baaq r0 = r8.a
            baam r0 = r0.d()
            if (r0 != 0) goto L78
            if (r9 == 0) goto L79
            baam r0 = r8.e()
            if (r0 == 0) goto L79
            goto L78
        L72:
            baam r0 = r8.e()
            if (r0 == 0) goto L79
        L78:
            return r0
        L79:
            r9 = 0
            baam r9 = r8.f(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baag.b(boolean):baam");
    }
}
