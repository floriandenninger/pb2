package defpackage;

import android.os.Build;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ehc implements Runnable {
    public final /* synthetic */ ehq a;
    private final /* synthetic */ int b;

    public /* synthetic */ ehc(ehq ehqVar, int i) {
        this.b = i;
        this.a = ehqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.b) {
            case 0:
                ehq ehqVar = this.a;
                afso afsoVar = (afso) ehqVar.ba.get();
                ((ypa) ehqVar.z.get()).g(afsoVar);
                afsoVar.b();
                return;
            case 1:
                ((jur) this.a.R.get()).a();
                return;
            case 2:
                ehq ehqVar2 = this.a;
                if (Build.VERSION.SDK_INT < 23 || !afze.d(ehqVar2.bv)) {
                    return;
                }
                ((fhn) ehqVar2.aB.get()).a(ehqVar2.f);
                return;
            case 3:
                ((zfu) this.a.aL.get()).a();
                return;
            case 4:
                ehq ehqVar3 = this.a;
                if (ehqVar3.g.f(yxx.S) != 10) {
                    ((afps) ehqVar3.V.get()).c();
                    return;
                }
                return;
            case 5:
                ehq ehqVar4 = this.a;
                aabv.d((aawl) ehqVar4.K.get());
                wbs.i((ylf) ehqVar4.ap.get(), ehqVar4.h.c());
                return;
            case 6:
                ((jni) this.a.P.get()).c();
                return;
            case 7:
                ((aior) this.a.aT.get()).a();
                return;
            case 8:
                this.a.r.get();
                return;
            case 9:
                ehq ehqVar5 = this.a;
                ynm.i(ehqVar5.i, new ehp(ehqVar5));
                return;
            case 10:
                ((acso) this.a.j.get()).f();
                return;
            case 11:
                ehq ehqVar6 = this.a;
                ((actg) ehqVar6.M.get()).f();
                yyr yyrVar = ehqVar6.d.i;
                yyrVar.getClass();
                yyrVar.d().O(ehqVar6.bt).O(300L, TimeUnit.SECONDS, ehqVar6.b).I(ehqVar6.b).r(15L, TimeUnit.SECONDS, ehqVar6.b).W(new ehd(ehqVar6, 3), new ehd(ehqVar6, i));
                return;
            case 12:
                ((akmx) this.a.aa.get()).c();
                return;
            case 13:
                ((acpl) this.a.ax.get()).b();
                return;
            case 14:
                ((jjo) this.a.bb.get()).d();
                return;
            case 15:
                final ehq ehqVar7 = this.a;
                izr izrVar = (izr) ehqVar7.k.get();
                izrVar.f = new aacw((aacu) ehqVar7.aO.get());
                izrVar.n();
                ehqVar7.d.b().R(new ayrm() { // from class: eho
                    @Override // defpackage.ayrm
                    public final void a() {
                        ((aacu) ehq.this.aO.get()).b(false);
                    }
                });
                return;
            case 16:
                final ehq ehqVar8 = this.a;
                aoes.f = new ehm();
                aoes.d(new aoep() { // from class: ehl
                    @Override // defpackage.aoep
                    public final void a(String str) {
                        yny.g(ehq.this.f, str);
                    }
                });
                return;
            case 17:
                final ehq ehqVar9 = this.a;
                ehqVar9.af.get();
                aacy aacyVar = (aacy) ehqVar9.aN.get();
                amkq.O(aacyVar.b.get(), "BrowseFirstController not initialized");
                if (aacyVar.a) {
                    if (!((ysy) ehqVar9.aq.get()).o() || ((elf) ehqVar9.as.get()).a() != 1) {
                        ((aacu) ehqVar9.aO.get()).b(false);
                    } else {
                        ayph a = ehqVar9.d.a();
                        yyr yyrVar2 = ehqVar9.d.g;
                        yyrVar2.getClass();
                        ayqi ayqiVar = azre.d;
                        yyq c = yyr.c(1, a);
                        c.b("bfr", new ehc(ehqVar9, 15));
                        yyrVar2.n(ayqiVar, c);
                    }
                } else {
                    ynm.k(ehqVar9.i, ehqVar9.a, egw.c, new ynl() { // from class: ehh
                        @Override // defpackage.ynl, defpackage.zfi
                        public final void a(Object obj) {
                            ehq ehqVar10 = ehq.this;
                            if (((Boolean) obj).booleanValue() || !((Boolean) ehqVar10.aY.get()).booleanValue()) {
                                return;
                            }
                            avdj avdjVar = ehqVar10.bv.b().u;
                            if (avdjVar == null) {
                                avdjVar = avdj.a;
                            }
                            apev apevVar = avdjVar.g;
                            if (apevVar == null) {
                                apevVar = apev.a;
                            }
                            if (apevVar.i && ((ysy) ehqVar10.aq.get()).o() && ((elf) ehqVar10.as.get()).a() == 1) {
                                ayph a2 = ehqVar10.d.a();
                                yyr yyrVar3 = ehqVar10.d.g;
                                yyrVar3.getClass();
                                ayqi ayqiVar2 = azre.d;
                                yyq c2 = yyr.c(1, a2);
                                c2.b("ebr", new ehg(ehqVar10, 15));
                                yyrVar3.n(ayqiVar2, c2);
                            }
                        }
                    });
                }
                ((aaqo) ehqVar9.ag.get()).b();
                ((iyu) ehqVar9.ah.get()).a();
                ehqVar9.ai.get();
                return;
            case 18:
                ehq ehqVar10 = this.a;
                ehqVar10.d.c(1);
                ehqVar10.d.f(((elf) ehqVar10.as.get()).a());
                return;
            case 19:
                ehq ehqVar11 = this.a;
                if (evr.aM(ehqVar11.bv)) {
                    ((aadd) ehqVar11.bn.get()).b();
                    return;
                }
                return;
            default:
                ehq ehqVar12 = this.a;
                apdm b = ehqVar12.b();
                if (!b.d || b.e.size() == 0) {
                    return;
                }
                ajoy ajoyVar = (ajoy) ehqVar12.aK.get();
                Iterator it = b.e.iterator();
                while (it.hasNext()) {
                    ajoyVar.u((String) it.next());
                }
                return;
        }
    }
}
