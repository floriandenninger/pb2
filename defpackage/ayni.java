package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayni implements aygf {
    final aynj a;
    final /* synthetic */ aynl b;

    public ayni(aynl aynlVar, aynj aynjVar) {
        this.b = aynlVar;
        this.a = aynjVar;
    }

    private static final Integer b(aycd aycdVar) {
        String str = (String) aycdVar.b(aynl.b);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // defpackage.aygf
    public final void a(Status status, ayge aygeVar, aycd aycdVar) {
        boolean z;
        aymx aymxVar;
        long nanos;
        synchronized (this.b.l) {
            aynl aynlVar = this.b;
            aynb aynbVar = aynlVar.r;
            aynj aynjVar = this.a;
            aynjVar.b = true;
            if (aynbVar.c.contains(aynjVar)) {
                ArrayList arrayList = new ArrayList(aynbVar.c);
                arrayList.remove(aynjVar);
                aynbVar = new aynb(aynbVar.b, Collections.unmodifiableCollection(arrayList), aynbVar.d, aynbVar.f, aynbVar.g, aynbVar.a, aynbVar.h, aynbVar.e);
            }
            aynlVar.r = aynbVar;
            this.b.q.a(status.getCode());
        }
        aynj aynjVar2 = this.a;
        if (aynjVar2.c) {
            this.b.r(aynjVar2);
            if (this.b.r.f == this.a) {
                this.b.g.execute(new aynf(this, status, aygeVar, aycdVar, 1));
                return;
            }
            return;
        }
        if (this.b.r.f == null) {
            boolean z2 = false;
            if (aygeVar == ayge.REFUSED && this.b.s.compareAndSet(false, true)) {
                aynj p = this.b.p(this.a.d, true);
                aynl aynlVar2 = this.b;
                if (aynlVar2.k) {
                    synchronized (aynlVar2.l) {
                        aynl aynlVar3 = this.b;
                        aynb aynbVar2 = aynlVar3.r;
                        aynj aynjVar3 = this.a;
                        ArrayList arrayList2 = new ArrayList(aynbVar2.d);
                        arrayList2.remove(aynjVar3);
                        arrayList2.add(p);
                        aynlVar3.r = new aynb(aynbVar2.b, aynbVar2.c, Collections.unmodifiableCollection(arrayList2), aynbVar2.f, aynbVar2.g, aynbVar2.a, aynbVar2.h, aynbVar2.e);
                        aynl aynlVar4 = this.b;
                        if (aynlVar4.v(aynlVar4.r) || this.b.r.d.size() != 1) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.b.r(p);
                    }
                } else {
                    aynm aynmVar = aynlVar2.i;
                    if (aynmVar == null || aynmVar.a == 1) {
                        aynlVar2.r(p);
                    }
                }
                this.b.f.execute(new ayne(this, p));
                return;
            }
            if (aygeVar == ayge.DROPPED) {
                aynl aynlVar5 = this.b;
                if (aynlVar5.k) {
                    aynlVar5.u();
                }
            } else {
                this.b.s.set(true);
                aynl aynlVar6 = this.b;
                if (aynlVar6.k) {
                    Integer b = b(aycdVar);
                    boolean z3 = !this.b.j.c.contains(status.getCode());
                    z = (z3 || ((this.b.p == null || (z3 && (b == null || b.intValue() >= 0))) ? false : this.b.p.b() ^ true)) ? false : true;
                    if (z) {
                        aynl aynlVar7 = this.b;
                        if (b != null) {
                            if (b.intValue() < 0) {
                                aynlVar7.u();
                            } else {
                                synchronized (aynlVar7.l) {
                                    aymx aymxVar2 = aynlVar7.w;
                                    if (aymxVar2 != null) {
                                        Future a = aymxVar2.a();
                                        aymx aymxVar3 = new aymx(aynlVar7.l);
                                        aynlVar7.w = aymxVar3;
                                        if (a != null) {
                                            a.cancel(false);
                                        }
                                        aymxVar3.b(aynlVar7.h.schedule(new aymz(aynlVar7, aymxVar3), b.intValue(), TimeUnit.MILLISECONDS));
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this.b.l) {
                        aynl aynlVar8 = this.b;
                        aynb aynbVar3 = aynlVar8.r;
                        aynj aynjVar4 = this.a;
                        ArrayList arrayList3 = new ArrayList(aynbVar3.d);
                        arrayList3.remove(aynjVar4);
                        aynlVar8.r = new aynb(aynbVar3.b, aynbVar3.c, Collections.unmodifiableCollection(arrayList3), aynbVar3.f, aynbVar3.g, aynbVar3.a, aynbVar3.h, aynbVar3.e);
                        if (z) {
                            aynl aynlVar9 = this.b;
                            if (aynlVar9.v(aynlVar9.r) || !this.b.r.d.isEmpty()) {
                                return;
                            }
                        }
                    }
                } else {
                    aynm aynmVar2 = aynlVar6.i;
                    long j = 0;
                    if (aynmVar2 != null) {
                        boolean contains = aynmVar2.f.contains(status.getCode());
                        Integer b2 = b(aycdVar);
                        boolean z4 = (this.b.p == null || (!contains && (b2 == null || b2.intValue() >= 0))) ? false : !this.b.p.b();
                        aynl aynlVar10 = this.b;
                        if (aynlVar10.i.a > this.a.d + 1 && !z4) {
                            if (b2 == null) {
                                if (contains) {
                                    double d = aynlVar10.x;
                                    double nextDouble = aynl.d.nextDouble();
                                    Double.isNaN(d);
                                    nanos = (long) (d * nextDouble);
                                    aynl aynlVar11 = this.b;
                                    long j2 = aynlVar11.x;
                                    aynm aynmVar3 = aynlVar11.i;
                                    double d2 = j2;
                                    double d3 = aynmVar3.d;
                                    Double.isNaN(d2);
                                    aynlVar11.x = Math.min((long) (d2 * d3), aynmVar3.c);
                                    j = nanos;
                                    z2 = true;
                                }
                            } else if (b2.intValue() >= 0) {
                                nanos = TimeUnit.MILLISECONDS.toNanos(b2.intValue());
                                aynl aynlVar12 = this.b;
                                aynlVar12.x = aynlVar12.i.b;
                                j = nanos;
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        synchronized (this.b.l) {
                            aynl aynlVar13 = this.b;
                            aymxVar = new aymx(aynlVar13.l);
                            aynlVar13.v = aymxVar;
                        }
                        aymxVar.b(this.b.h.schedule(new aynh(this, 1), j, TimeUnit.NANOSECONDS));
                        return;
                    }
                }
            }
        }
        this.b.r(this.a);
        if (this.b.r.f == this.a) {
            this.b.g.execute(new aynf(this, status, aygeVar, aycdVar, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r5.b.g.execute(new defpackage.aync(r5, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        r1 = r0.d.get();
        r2 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r1 == r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r0.d.compareAndSet(r1, java.lang.Math.min(r0.c + r1, r2)) == false) goto L15;
     */
    @Override // defpackage.aygf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.aycd r6) {
        /*
            r5 = this;
            aynl r0 = r5.b
            aynj r1 = r5.a
            r0.r(r1)
            aynl r0 = r5.b
            aynb r0 = r0.r
            aynj r0 = r0.f
            aynj r1 = r5.a
            if (r0 != r1) goto L3d
            aynl r0 = r5.b
            aynk r0 = r0.p
            if (r0 != 0) goto L18
            goto L31
        L18:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.d
            int r1 = r1.get()
            int r2 = r0.a
            if (r1 == r2) goto L31
            int r3 = r0.c
            java.util.concurrent.atomic.AtomicInteger r4 = r0.d
            int r3 = r3 + r1
            int r2 = java.lang.Math.min(r3, r2)
            boolean r1 = r4.compareAndSet(r1, r2)
            if (r1 == 0) goto L18
        L31:
            aynl r0 = r5.b
            java.util.concurrent.Executor r0 = r0.g
            aync r1 = new aync
            r1.<init>(r5, r6)
            r0.execute(r1)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayni.c(aycd):void");
    }

    @Override // defpackage.ayod
    public final void d(ayoc ayocVar) {
        aynb aynbVar = this.b.r;
        amkq.O(aynbVar.f != null, "Headers should be received prior to messages.");
        if (aynbVar.f != this.a) {
            return;
        }
        this.b.g.execute(new ayng(this, ayocVar));
    }

    @Override // defpackage.ayod
    public final void e() {
        if (this.b.o()) {
            this.b.g.execute(new aynh(this, 0));
        }
    }
}
