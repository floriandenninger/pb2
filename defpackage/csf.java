package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csf implements Runnable, Comparable, csa, dds {
    private int A;
    public cod c;
    public cqi d;
    public cof e;
    public int f;
    public int g;
    public csk h;
    public cqn i;
    public csd j;
    public int k;
    public cqi l;
    public volatile csb m;
    public volatile boolean n;
    public int o;
    public final csp p;
    private final hy s;
    private Thread t;
    private cqi u;
    private Object v;
    private cqw w;
    private volatile boolean x;
    private boolean y;
    private int z;
    public final csc a = new csc();
    private final List r = new ArrayList();
    private final aldo B = aldo.c();
    public final cse b = new cse();
    public final baof q = new baof();

    public csf(csp cspVar, hy hyVar) {
        this.p = cspVar;
        this.s = hyVar;
    }

    private final int g() {
        return this.e.ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c1 A[LOOP:1: B:89:0x007c->B:131:0x01c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ce A[EDGE_INSN: B:132:0x01ce->B:133:0x01ce BREAK  A[LOOP:1: B:89:0x007c->B:131:0x01c1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x003e A[Catch: all -> 0x01fb, TryCatch #10 {all -> 0x01fb, blocks: (B:81:0x0011, B:84:0x005b, B:135:0x01d5, B:173:0x01f7, B:174:0x01fa, B:176:0x002a, B:180:0x0034, B:182:0x003e, B:187:0x0048, B:86:0x0063, B:134:0x01d0, B:142:0x01f0, B:143:0x01f5), top: B:80:0x0011, outer: #9, inners: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i() {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csf.i():void");
    }

    private final void j() {
        l();
        csz cszVar = new csz("Failed to load resource", new ArrayList(this.r));
        csd csdVar = this.j;
        synchronized (csdVar) {
            ((csv) csdVar).f = cszVar;
        }
        synchronized (csdVar) {
            ((csv) csdVar).m.b();
            if (((csv) csdVar).i) {
                ((csv) csdVar).e();
            } else if (!((csv) csdVar).a.e()) {
                if (!((csv) csdVar).g) {
                    ((csv) csdVar).g = true;
                    cqi cqiVar = ((csv) csdVar).b;
                    csu c = ((csv) csdVar).a.c();
                    ((csv) csdVar).d(c.a() + 1);
                    csv csvVar = (csv) csdVar;
                    csvVar.l.b(csvVar, cqiVar, null);
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        cst cstVar = (cst) it.next();
                        cstVar.b.execute(new css(csvVar, cstVar.a, 1));
                    }
                    csvVar.c();
                } else {
                    throw new IllegalStateException("Already failed once");
                }
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
        if (this.q.g()) {
            a();
        }
    }

    private final void k() {
        this.t = Thread.currentThread();
        ddi.b();
        boolean z = false;
        while (!this.n && this.m != null && !(z = this.m.b())) {
            this.z = b(this.z);
            this.m = h();
            if (this.z == 4) {
                c();
                return;
            }
        }
        if ((this.z == 6 || this.n) && !z) {
            j();
        }
    }

    private final void l() {
        Throwable th;
        this.B.b();
        if (!this.x) {
            this.x = true;
            return;
        }
        if (this.r.isEmpty()) {
            th = null;
        } else {
            th = (Throwable) this.r.get(r0.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    public final void a() {
        this.q.e();
        cse cseVar = this.b;
        cseVar.a = null;
        cseVar.b = null;
        cseVar.c = null;
        csc cscVar = this.a;
        cscVar.c = null;
        cscVar.d = null;
        cscVar.m = null;
        cscVar.g = null;
        cscVar.j = null;
        cscVar.h = null;
        cscVar.n = null;
        cscVar.i = null;
        cscVar.o = null;
        cscVar.a.clear();
        cscVar.k = false;
        cscVar.b.clear();
        cscVar.l = false;
        this.x = false;
        this.c = null;
        this.d = null;
        this.i = null;
        this.e = null;
        this.j = null;
        this.z = 0;
        this.m = null;
        this.t = null;
        this.l = null;
        this.v = null;
        this.A = 0;
        this.w = null;
        this.n = false;
        this.r.clear();
        this.s.b(this);
    }

    @Override // defpackage.csa
    public final void c() {
        this.o = 2;
        this.j.a(this);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        csf csfVar = (csf) obj;
        int g = g() - csfVar.g();
        return g == 0 ? this.k - csfVar.k : g;
    }

    @Override // defpackage.csa
    public final void d(cqi cqiVar, Exception exc, cqw cqwVar, int i) {
        cqwVar.c();
        csz cszVar = new csz("Fetching data failed", Collections.singletonList(exc));
        cszVar.b(cqiVar, i, cqwVar.a());
        this.r.add(cszVar);
        if (Thread.currentThread() != this.t) {
            this.o = 2;
            this.j.a(this);
        } else {
            k();
        }
    }

    @Override // defpackage.csa
    public final void e(cqi cqiVar, Object obj, cqw cqwVar, int i, cqi cqiVar2) {
        this.l = cqiVar;
        this.v = obj;
        this.w = cqwVar;
        this.A = i;
        this.u = cqiVar2;
        this.y = cqiVar != this.a.e().get(0);
        if (Thread.currentThread() == this.t) {
            i();
        } else {
            this.o = 3;
            this.j.a(this);
        }
    }

    @Override // defpackage.dds
    public final aldo f() {
        return this.B;
    }

    public final int b(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            if (this.h.b()) {
                return 2;
            }
            return b(2);
        }
        if (i2 == 1) {
            if (this.h.a()) {
                return 3;
            }
            return b(3);
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3 || i2 == 5) {
            return 6;
        }
        String s = gm.s(i);
        StringBuilder sb = new StringBuilder(s.length() + 20);
        sb.append("Unrecognized stage: ");
        sb.append(s);
        throw new IllegalArgumentException(sb.toString());
    }

    private final csb h() {
        int i = this.z;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            return new cte(this.a, this);
        }
        if (i2 == 2) {
            csc cscVar = this.a;
            return new crx(cscVar.e(), cscVar, this);
        }
        if (i2 == 3) {
            return new cti(this.a, this);
        }
        if (i2 == 5) {
            return null;
        }
        String s = gm.s(i);
        StringBuilder sb = new StringBuilder(s.length() + 20);
        sb.append("Unrecognized stage: ");
        sb.append(s);
        throw new IllegalStateException(sb.toString());
    }

    @Override // java.lang.Runnable
    public final void run() {
        cqw cqwVar = this.w;
        try {
            try {
                if (this.n) {
                    j();
                    if (cqwVar != null) {
                        return;
                    } else {
                        return;
                    }
                }
                int i = this.o;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    this.z = b(1);
                    this.m = h();
                    k();
                } else if (i2 == 1) {
                    k();
                } else if (i2 == 2) {
                    i();
                } else {
                    String str = i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE";
                    StringBuilder sb = new StringBuilder(str.length() + 25);
                    sb.append("Unrecognized run reason: ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
                if (cqwVar != null) {
                    cqwVar.c();
                }
            } finally {
                if (cqwVar != null) {
                    cqwVar.c();
                }
            }
        } catch (crw e) {
            throw e;
        } catch (Throwable th) {
            if (this.z != 5) {
                this.r.add(th);
                j();
            }
            if (!this.n) {
                throw th;
            }
            throw th;
        }
    }
}
