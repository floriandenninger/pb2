package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghb implements agtv {
    final /* synthetic */ aghc a;

    public aghb(aghc aghcVar) {
        this.a = aghcVar;
    }

    private final void m(String str) {
        aghk aghkVar = (aghk) this.a.n.get();
        if (aghkVar.c().contains(str)) {
            this.a.n(aghkVar.b().b());
        }
        agsy agsyVar = (agsy) this.a.o.get();
        if (agsyVar.c().contains(str)) {
            this.a.v(agsyVar.b().b());
        }
    }

    @Override // defpackage.agtv
    public final void a(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            String t = agtw.t(agnzVar.f);
            agil agilVar = (agil) this.a.k.get();
            agilVar.W(t, agnzVar);
            agilVar.V(t, agnf.ACTIVE);
            if (agilVar.a(t) == 0) {
                agilVar.aa(t, this.a.a.c());
            }
            this.a.t(t);
            m(t);
        }
    }

    @Override // defpackage.agtv
    public final void b(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void c() {
    }

    @Override // defpackage.agtv
    public final void d(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            String t = agtw.t(agnzVar.f);
            agil agilVar = (agil) this.a.k.get();
            agilVar.W(t, agnzVar);
            agilVar.V(t, agnf.PAUSED);
            this.a.t(t);
            m(t);
        }
    }

    @Override // defpackage.agtv
    public final void e(final agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            this.a.i.execute(new Runnable() { // from class: aggy
                @Override // java.lang.Runnable
                public final void run() {
                    aghb aghbVar = aghb.this;
                    agnz agnzVar2 = agnzVar;
                    String t = agtw.t(agnzVar2.f);
                    ((agil) aghbVar.a.k.get()).W(t, agnzVar2);
                    aghbVar.a.t(t);
                    aghk aghkVar = (aghk) aghbVar.a.n.get();
                    if (aghkVar.c().contains(t)) {
                        aghl b = aghkVar.b();
                        if (b.e(agnzVar2)) {
                            aghbVar.a.n(b.b());
                        }
                    }
                    agsy agsyVar = (agsy) aghbVar.a.o.get();
                    if (agsyVar.c().contains(t)) {
                        agsz b2 = agsyVar.b();
                        if (b2.f(agnzVar2)) {
                            aghbVar.a.v(b2.b());
                        }
                    }
                }
            });
        }
    }

    @Override // defpackage.agtv
    public final void f(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            String t = agtw.t(agnzVar.f);
            ((aghk) this.a.n.get()).b().f(agnzVar);
            ((agsy) this.a.o.get()).b().g(agnzVar);
            m(t);
        }
    }

    @Override // defpackage.agtv
    public final void g() {
        this.a.i.execute(new Runnable() { // from class: aggx
            @Override // java.lang.Runnable
            public final void run() {
                aghb aghbVar = aghb.this;
                String a = aghbVar.a.f.a();
                if (aghbVar.a.b.equals(a)) {
                    agil agilVar = (agil) aghbVar.a.k.get();
                    aghk aghkVar = (aghk) aghbVar.a.n.get();
                    agsy agsyVar = (agsy) aghbVar.a.o.get();
                    boolean z = false;
                    boolean z2 = false;
                    for (agnz agnzVar : aghbVar.a.f.b(a).values()) {
                        if (agtw.ai(agnzVar)) {
                            String t = agtw.t(agnzVar.f);
                            agilVar.W(t, agnzVar);
                            aghbVar.a.t(t);
                            z |= aghkVar.c().contains(t);
                            if (agsyVar.c().contains(t)) {
                                z2 = true;
                            }
                        }
                    }
                    if (z) {
                        aghbVar.a.n(aghkVar.b().b());
                    }
                    if (z2) {
                        aghbVar.a.v(agsyVar.b().b());
                    }
                    for (agnv agnvVar : agilVar.s()) {
                        if (agnvVar.i() == agnq.PLAYABLE) {
                            aghbVar.a.C(agnvVar);
                        }
                    }
                }
            }
        });
    }

    @Override // defpackage.agtv
    public final void h(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            String t = agtw.t(agnzVar.f);
            agil agilVar = (agil) this.a.k.get();
            agilVar.W(t, agnzVar);
            agilVar.V(t, agnf.ACTIVE);
            this.a.t(t);
            m(t);
        }
    }

    @Override // defpackage.agtv
    public final void i(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void j(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void k(final agnz agnzVar, final atqs atqsVar, final agnf agnfVar) {
        int f = agtw.f(agnzVar.f);
        if (agtw.ai(agnzVar)) {
            this.a.i.execute(new Runnable() { // from class: agha
                @Override // java.lang.Runnable
                public final void run() {
                    aghb aghbVar = aghb.this;
                    agnz agnzVar2 = agnzVar;
                    agnf agnfVar2 = agnfVar;
                    atqs atqsVar2 = atqsVar;
                    final String t = agtw.t(agnzVar2.f);
                    agil agilVar = (agil) aghbVar.a.k.get();
                    agilVar.W(t, agnzVar2);
                    agilVar.V(t, agnfVar2);
                    if (agnzVar2.b == avjo.TRANSFER_STATE_COMPLETE) {
                        if (agnfVar2 == agnf.COMPLETE) {
                            agnp c = agilVar.c(t);
                            if (c != null) {
                                agilVar.H(c);
                                aghbVar.a.r(t);
                            }
                        } else if (agnfVar2 == agnf.REQUIRES_CONTENT_VERIFICATION) {
                            byte[] aj = agtw.aj(agnzVar2.f);
                            if (aj == null) {
                                aj = aaef.b;
                            }
                            final byte[] bArr = aj;
                            aghbVar.a.t(t);
                            final aghc aghcVar = aghbVar.a;
                            final String n = agtw.n(agnzVar2.f);
                            final boolean ac = agtw.ac(agnzVar2.f);
                            final boolean ag = agtw.ag(agnzVar2.f);
                            aghcVar.h.s(new Runnable() { // from class: aggu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aghc aghcVar2 = aghc.this;
                                    String str = t;
                                    byte[] bArr2 = bArr;
                                    String str2 = n;
                                    boolean z = ac;
                                    boolean z2 = ag;
                                    agnv e = aghcVar2.e(str);
                                    if (e == null) {
                                        zga.b("[Offline] Snapshot missing for video queued for verification");
                                        return;
                                    }
                                    if (e.l != agnf.REQUIRES_CONTENT_VERIFICATION) {
                                        String valueOf = String.valueOf(e.l);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                                        sb.append("[Offline] Content verification requested for video in state: ");
                                        sb.append(valueOf);
                                        zga.l(sb.toString());
                                        return;
                                    }
                                    aghj aghjVar = (aghj) aghcVar2.l.get();
                                    yjk.e();
                                    agny agnyVar = new agny();
                                    agtw.z(agnyVar, bArr2);
                                    agtw.X(agnyVar, str);
                                    agtw.V(agnyVar, 5);
                                    agtw.S(agnyVar, aghjVar.a.a());
                                    agtw.P(agnyVar, agnf.REQUIRES_CONTENT_VERIFICATION);
                                    agtw.W(agnyVar, z2);
                                    if (str2 != null) {
                                        agtw.A(agnyVar, str2);
                                    }
                                    agtw.F(agnyVar, z);
                                    aghjVar.c.c(aghjVar.b, String.format(Locale.US, "%s:%s:cv", aghjVar.b, str), 250, agnyVar);
                                }
                            });
                        }
                    } else {
                        if (agnzVar2.b == avjo.TRANSFER_STATE_TRANSFERRING) {
                            ((agon) aghbVar.a.e.get()).g(t);
                        }
                        aghbVar.a.u(t, atqsVar2);
                    }
                    aghk aghkVar = (aghk) aghbVar.a.n.get();
                    if (aghkVar.c().contains(t)) {
                        aghl b = aghkVar.b();
                        if (b.e(agnzVar2)) {
                            aghbVar.a.n(b.b());
                        }
                    }
                    agsy agsyVar = (agsy) aghbVar.a.o.get();
                    if (agsyVar.c().contains(t)) {
                        agsz b2 = agsyVar.b();
                        if (b2.f(agnzVar2)) {
                            aghbVar.a.v(b2.b());
                        }
                    }
                }
            });
            return;
        }
        if (f != 2) {
            if (f == 5) {
                this.a.i.execute(new Runnable() { // from class: aggz
                    @Override // java.lang.Runnable
                    public final void run() {
                        aghb aghbVar = aghb.this;
                        agnz agnzVar2 = agnzVar;
                        agnf agnfVar2 = agnfVar;
                        String t = agtw.t(agnzVar2.f);
                        agil agilVar = (agil) aghbVar.a.k.get();
                        agilVar.W(t, agnzVar2);
                        agilVar.V(t, agnfVar2);
                        if (agnfVar2 == agnf.COMPLETE) {
                            aghbVar.a.r(t);
                        } else {
                            aghbVar.a.t(t);
                        }
                    }
                });
            }
        } else {
            String t = agtw.t(agnzVar.f);
            if (TextUtils.isEmpty(t)) {
                return;
            }
            ((agil) this.a.k.get()).x(t);
        }
    }

    @Override // defpackage.agtv
    public final void l(agnz agnzVar) {
        String t = agtw.t(agnzVar.f);
        aghc aghcVar = this.a;
        t.length();
        aghcVar.h.v(new aglj(t));
    }
}
