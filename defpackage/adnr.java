package defpackage;

import android.os.Handler;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adnr implements adpj {
    public static final String a = zga.a("MDX.SessionRecoveryController");
    public adph c;
    public adlp d;
    public volatile adlp e;
    public boolean g;
    private final shf h;
    private final adpi i;
    private final Handler k;
    private final aioc l;
    private final List o;
    private boolean p;
    private final ayqw m = new ayqw();
    private final adnq n = new adnq(this);
    private final Runnable q = new adnn(this);
    private final adno r = new adno(this);
    private final Set j = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile adma b = adma.a().a();
    public volatile String f = "";

    public adnr(shf shfVar, adpi adpiVar, Handler handler, aioc aiocVar, acun acunVar) {
        this.h = shfVar;
        this.i = adpiVar;
        this.k = handler;
        this.l = aiocVar;
        this.o = acunVar.ap;
    }

    private final void k(adlp adlpVar, int i) {
        agaj a2 = adma.a();
        a2.b(i);
        if (adlpVar != null) {
            a2.c(adlpVar.e);
        }
        adma a3 = a2.a();
        if (this.b.equals(a3)) {
            return;
        }
        this.b = a3;
        for (adpd adpdVar : this.j) {
            adma admaVar = this.b;
            adpdVar.a.q();
            int i2 = admaVar.a;
            if (i2 != 0) {
                if (i2 == 1) {
                    for (adls adlsVar : adpdVar.a.c) {
                        String str = admaVar.b;
                        adlsVar.d();
                    }
                } else if (i2 == 2) {
                    Iterator it = adpdVar.a.c.iterator();
                    while (it.hasNext()) {
                        ((adls) it.next()).b();
                    }
                } else if (i2 == 3) {
                    Iterator it2 = adpdVar.a.c.iterator();
                    while (it2.hasNext()) {
                        ((adls) it2.next()).a();
                    }
                } else if (i2 == 4) {
                    for (adls adlsVar2 : adpdVar.a.c) {
                        String str2 = admaVar.b;
                        adlsVar2.c();
                    }
                } else {
                    StringBuilder sb = new StringBuilder(28);
                    sb.append("unexpected state:");
                    sb.append(i2);
                    throw new AssertionError(sb.toString());
                }
            }
        }
    }

    private final void l(adph adphVar, adlp adlpVar) {
        if (!adlpVar.a.isPresent()) {
            zga.c(a, "session was not connected, do not start recovery.");
            f(0);
            return;
        }
        zga.h(a, "starting session recovery");
        this.d = adlpVar;
        k(adlpVar, 1);
        adphVar.f(adlpVar, this.r);
        if (((adkq) adlpVar.a.get()).d) {
            return;
        }
        long j = ((adkq) adlpVar.a.get()).c;
        this.k.removeCallbacks(this.q);
        this.k.postDelayed(this.q, Math.max(0L, j - this.h.c()));
    }

    private final boolean m(adlp adlpVar) {
        return adlpVar.a.isPresent() && (((adkq) adlpVar.a.get()).d || ((adkq) adlpVar.a.get()).c - this.h.c() > 0) && adlpVar.f.isPresent() && !this.o.contains(Integer.valueOf(((atbi) adlpVar.f.get()).D));
    }

    @Override // defpackage.adpj
    public final adma a() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (((defpackage.adfy) r4).n.equals(r1.a) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r1 != 2) goto L28;
     */
    @Override // defpackage.adpj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional b(defpackage.adgb r4) {
        /*
            r3 = this;
            adlp r0 = r3.e
            if (r0 != 0) goto L9
            j$.util.Optional r4 = j$.util.Optional.empty()
            return r4
        L9:
            java.lang.String r1 = r3.f
            if (r1 == 0) goto L27
            java.lang.String r1 = r3.f
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L27
            java.lang.String r1 = r3.f
            java.lang.String r2 = defpackage.adcp.f(r4)
            boolean r1 = defpackage.adeg.c(r1, r2)
            if (r1 != 0) goto L22
            goto L27
        L22:
            j$.util.Optional r4 = j$.util.Optional.of(r0)
            return r4
        L27:
            java.lang.String r1 = defpackage.adnr.a
            java.lang.String r2 = "recovered screen cannot be matched via selected route Id, fallback to sessionInfo"
            defpackage.zga.m(r1, r2)
            java.lang.String r1 = r0.d
            java.lang.String r2 = defpackage.adcp.f(r4)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3b
            goto L5e
        L3b:
            int r1 = r0.i
            r2 = 3
            if (r1 != r2) goto L57
            boolean r1 = r4 instanceof defpackage.adfy
            defpackage.amkq.N(r1)
            adfy r4 = (defpackage.adfy) r4
            adks r1 = r0.c
            r1.getClass()
            adgn r4 = r4.n
            adgn r1 = r1.a
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L5e
            goto L63
        L57:
            r4 = 4
            if (r1 == r4) goto L63
            r4 = 2
            if (r1 != r4) goto L5e
            goto L63
        L5e:
            j$.util.Optional r4 = j$.util.Optional.empty()
            return r4
        L63:
            j$.util.Optional r4 = j$.util.Optional.of(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adnr.b(adgb):j$.util.Optional");
    }

    @Override // defpackage.adpj
    public final void c(adlp adlpVar) {
        if (adlpVar.a.isPresent()) {
            if (!m(adlpVar)) {
                f(0);
                return;
            }
            adph a2 = this.i.a(adlpVar.i);
            this.c = a2;
            if (a2 == null) {
                String str = a;
                int i = adlpVar.i;
                String cT = i != 0 ? amkq.cT(i) : "null";
                StringBuilder sb = new StringBuilder(cT.length() + 52);
                sb.append("No session recoverer for loaded SessionInfo of type ");
                sb.append(cT);
                zga.m(str, sb.toString());
                return;
            }
            l(a2, adlpVar);
        }
    }

    @Override // defpackage.adpj
    public final void d() {
        yjk.f();
        adlp adlpVar = this.d;
        if (this.c == null || adlpVar == null) {
            return;
        }
        f(2);
    }

    public final void e() {
        f(3);
    }

    public final void f(int i) {
        adph adphVar = this.c;
        if (adphVar != null) {
            adphVar.d();
            this.c = null;
        }
        adlp adlpVar = this.d;
        this.d = null;
        this.k.removeCallbacks(this.q);
        k(adlpVar, i);
    }

    @Override // defpackage.adpj
    public final void g(adlp adlpVar) {
        yjk.f();
        this.g = false;
        adph a2 = this.i.a(adlpVar.i);
        this.c = a2;
        if (a2 == null) {
            f(0);
        } else if (m(adlpVar)) {
            l(this.c, adlpVar);
        } else {
            f(0);
        }
    }

    @Override // defpackage.adpj
    public final void h(adlm adlmVar) {
        yjk.f();
        this.g = true;
        adph adphVar = this.c;
        if (adphVar != null && !adphVar.e(adlmVar)) {
            this.c.d();
        }
        this.e = null;
        this.f = "";
        this.d = null;
        k(null, 0);
    }

    @Override // defpackage.adpj
    public final void i() {
        yjk.f();
        if (this.p) {
            return;
        }
        this.p = true;
        this.m.g(this.n.kI(this.l));
    }

    @Override // defpackage.adpj
    public final void j(adpd adpdVar) {
        this.j.add(adpdVar);
    }
}
