package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wir implements wiz, aftc {
    public final axpg a;
    public final Executor b;
    public final ypa c;
    public final Set d = new HashSet();
    public final acpk e;
    private final boolean f;
    private final axpg g;
    private final axpg h;
    private final axpg i;
    private final Executor j;
    private final shf k;
    private final abep l;

    public wir(axpg axpgVar, axpg axpgVar2, axpg axpgVar3, axpg axpgVar4, Executor executor, Executor executor2, aadw aadwVar, acpk acpkVar, shf shfVar, ypa ypaVar, abep abepVar) {
        this.a = axpgVar;
        this.g = axpgVar2;
        this.h = axpgVar3;
        this.b = executor;
        this.j = executor2;
        this.i = axpgVar4;
        this.e = acpkVar;
        this.k = shfVar;
        this.c = ypaVar;
        this.f = whu.e(aadwVar);
        this.l = abepVar;
    }

    public static /* synthetic */ void c(Throwable th) {
        zga.d("Failed to clear the store.", th);
    }

    private final void o(aftl aftlVar) {
        if (!this.d.isEmpty()) {
            e(new IllegalStateException("Only one concurrent post-auth sign-in allowed."));
            zga.b("Only one concurrent post-auth sign-in allowed.");
        }
        if (aftlVar != null) {
            this.d.add(aftlVar);
        }
    }

    private final void p(String str, boolean z, boolean z2) {
        if (str.length() != 0) {
            "Signing out because: ".concat(str);
        }
        if (this.f && !z2) {
            aone createBuilder = aouu.a.createBuilder();
            createBuilder.copyOnWrite();
            aouu aouuVar = (aouu) createBuilder.instance;
            aouuVar.c = 2;
            aouuVar.b |= 1;
            aouu aouuVar2 = (aouu) createBuilder.build();
            arpn a = arpp.a();
            a.copyOnWrite();
            ((arpp) a.instance).bW(aouuVar2);
            this.e.b((arpp) a.build(), a());
            aone createBuilder2 = aouv.a.createBuilder();
            createBuilder2.copyOnWrite();
            aouv aouvVar = (aouv) createBuilder2.instance;
            aouvVar.c = 2;
            aouvVar.b |= 1;
            aouv aouvVar2 = (aouv) createBuilder2.build();
            arpn a2 = arpp.a();
            a2.copyOnWrite();
            ((arpp) a2.instance).bX(aouvVar2);
            this.e.c((arpp) a2.build(), afsw.a);
        }
        f(z);
        this.c.f(new afto(z2, false));
        g(wjb.FINISHED, null);
    }

    public final long a() {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(this.k.c()));
    }

    @Override // defpackage.aftc
    public final void b(afsx afsxVar) {
        if (afsxVar.z()) {
            return;
        }
        ynm.i(((wgv) this.i.get()).d.b(new wgs(((AccountIdentity) afsxVar).a(), 3), angq.a), llr.k);
    }

    public final void d(AccountIdentity accountIdentity, wdk wdkVar, apxf apxfVar) {
        AccountIdentity accountIdentity2;
        wdd wddVar = (wdd) this.a.get();
        boolean z = false;
        if (wddVar.t()) {
            accountIdentity2 = (AccountIdentity) wddVar.c();
            if (wbs.c(accountIdentity) && accountIdentity.l() == 3) {
                ynm.i(((wgv) this.i.get()).d.b(new wgs(accountIdentity2.d(), 5), angq.a), llr.l);
            }
            p("Signed in as new account", false, true);
            z = true;
        } else {
            accountIdentity2 = null;
        }
        wddVar.o(accountIdentity);
        ((wdm) this.g.get()).q(wdkVar);
        final String a = accountIdentity.a();
        final aoqa cg = amkq.cg(Instant.now());
        ynm.i(((wgv) this.i.get()).d.b(new amml() { // from class: wgu
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                String str = a;
                aoqa aoqaVar = cg;
                aone builder = ((awul) obj).toBuilder();
                aoqaVar.getClass();
                builder.copyOnWrite();
                ((awul) builder.instance).a().put(str, aoqaVar);
                return (awul) builder.build();
            }
        }, angq.a), llr.m);
        g(wjb.FINISHED, apxfVar);
        this.c.f(new aftm(accountIdentity));
        this.c.f(new wdl());
        this.b.execute(new wip(this, 1));
        if (this.f) {
            if (!z) {
                final aone createBuilder = aouu.a.createBuilder();
                createBuilder.copyOnWrite();
                aouu aouuVar = (aouu) createBuilder.instance;
                aouuVar.c = 1;
                aouuVar.b |= 1;
                abeo a2 = this.l.a();
                ((abet) a2).b = new amml() { // from class: wik
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        wir wirVar = wir.this;
                        aone aoneVar = createBuilder;
                        apgh apghVar = (apgh) obj;
                        if (!apgh.a.equals(apghVar)) {
                            aoneVar.copyOnWrite();
                            aouu aouuVar2 = (aouu) aoneVar.instance;
                            aouu aouuVar3 = aouu.a;
                            apghVar.getClass();
                            aouuVar2.e = apghVar;
                            aouuVar2.b |= 8;
                        }
                        arpn a3 = arpp.a();
                        a3.copyOnWrite();
                        ((arpp) a3.instance).bW((aouu) aoneVar.build());
                        wirVar.e.b((arpp) a3.build(), wirVar.a());
                        aone createBuilder2 = aouv.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        aouv aouvVar = (aouv) createBuilder2.instance;
                        aouvVar.c = 1;
                        aouvVar.b = 1 | aouvVar.b;
                        aouv aouvVar2 = (aouv) createBuilder2.build();
                        arpn a4 = arpp.a();
                        a4.copyOnWrite();
                        ((arpp) a4.instance).bX(aouvVar2);
                        wirVar.e.c((arpp) a4.build(), afsw.a);
                        return apgh.a;
                    }
                };
                ynm.m(a2.a(), lra.k);
                return;
            }
            if (accountIdentity2 != null) {
                aone createBuilder2 = aouu.a.createBuilder();
                createBuilder2.copyOnWrite();
                aouu aouuVar2 = (aouu) createBuilder2.instance;
                aouuVar2.c = 4;
                aouuVar2.b |= 1;
                aouu aouuVar3 = (aouu) createBuilder2.build();
                arpn a3 = arpp.a();
                a3.copyOnWrite();
                ((arpp) a3.instance).bW(aouuVar3);
                this.e.c((arpp) a3.build(), accountIdentity2);
                aone createBuilder3 = aouu.a.createBuilder();
                createBuilder3.copyOnWrite();
                aouu aouuVar4 = (aouu) createBuilder3.instance;
                aouuVar4.c = 4;
                aouuVar4.b |= 1;
                aouu aouuVar5 = (aouu) createBuilder3.build();
                arpn a4 = arpp.a();
                a4.copyOnWrite();
                ((arpp) a4.instance).bW(aouuVar5);
                arpp arppVar = (arpp) a4.build();
                afsy afsyVar = (afsy) this.a.get();
                this.e.a.h(arppVar, afsyVar.c(), a(), new afsg(afsyVar.g(), afsyVar.c().g()));
            }
        }
    }

    public final void e(Exception exc) {
        if (!((wdd) this.a.get()).t()) {
            f(false);
        }
        g(wjb.CANCELLED, null);
        this.c.f(new wja(exc));
        this.b.execute(new wiq(this, exc));
    }

    public final void f(boolean z) {
        ((wdd) this.a.get()).r(z);
        ((wdm) this.g.get()).i();
    }

    public final void g(wjb wjbVar, apxf apxfVar) {
        this.c.d(new wjc(wjbVar, wjbVar == wjb.FINISHED, apxfVar));
    }

    @Override // defpackage.wiz
    public final void h(AccountIdentity accountIdentity, apxf apxfVar, aftl aftlVar) {
        o(aftlVar);
        g(wjb.STARTED, null);
        this.j.execute(new wim(this, accountIdentity, apxfVar));
    }

    @Override // defpackage.wiz
    public final void i(aata aataVar, apxf apxfVar, aftl aftlVar) {
        yjk.f();
        o(aftlVar);
        g(wjb.STARTED, null);
        if (aataVar.l()) {
            m(aataVar, apxfVar);
        }
    }

    @Override // defpackage.wiz
    public final void j(apud apudVar, avuz avuzVar, apxf apxfVar, aftl aftlVar) {
        wdk wdkVar;
        o(aftlVar);
        g(wjb.STARTED, null);
        if (avuzVar == null) {
            wdkVar = wdk.a;
        } else {
            String str = avuzVar.c;
            String str2 = avuzVar.b;
            avgg avggVar = avuzVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            wdkVar = new wdk(str, str2, avggVar);
        }
        this.j.execute(new wil(this, AccountIdentity.m(apudVar), wdkVar, apxfVar));
    }

    @Override // defpackage.wiz
    public final void k(String str) {
        p(str, true, false);
    }

    @Override // defpackage.wiz
    public final void l(String str, boolean z) {
        p(str, z, false);
    }

    public final void m(aata aataVar, apxf apxfVar) {
        AccountIdentity A;
        if (aataVar.n()) {
            A = AccountIdentity.s(aataVar.k(), aataVar.g(), aataVar.h());
        } else {
            String i = aataVar.i();
            String g = aataVar.g();
            String j = aataVar.j();
            aatj aatjVar = aataVar.c;
            if (aatjVar.d == null) {
                aatjVar.b();
            }
            Boolean bool = aatjVar.d;
            boolean z = false;
            if (bool != null && bool.booleanValue()) {
                z = true;
            }
            A = AccountIdentity.A(i, g, j, z, aataVar.h());
        }
        this.j.execute(new wio(this, A, aataVar, apxfVar));
    }

    @Override // defpackage.wiz
    public final void n(String str, @Deprecated aftl aftlVar) {
        if (aftlVar == null) {
            aftlVar = aftl.g;
        }
        this.d.add(aftlVar);
        g(wjb.STARTED, null);
        whl.c((aatg) this.h.get(), str, new win(this));
    }
}
