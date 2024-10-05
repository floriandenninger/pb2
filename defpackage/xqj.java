package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xqj implements xql, xqk {
    private final Activity a;
    private final xnm b;
    private final ajvc c;
    private final xoo d;
    private final xyt e;
    private final String f;
    private final zfi g;
    private final aahd h;

    public xqj(Activity activity, xnm xnmVar, ajvc ajvcVar, xoo xooVar, xyt xytVar, String str, zfi zfiVar, aahd aahdVar) {
        this.a = activity;
        this.b = xnmVar;
        this.c = ajvcVar;
        this.d = xooVar;
        this.e = xytVar;
        this.f = str;
        this.g = zfiVar;
        this.h = aahdVar;
    }

    private final acra g() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof acqz) {
            return ((acqz) componentCallbacks2).mM();
        }
        return null;
    }

    private static amrz h(ajvc ajvcVar) {
        if (ajvcVar != null) {
            return amrz.k("sectionController", ajvcVar);
        }
        return null;
    }

    @Override // defpackage.xql
    public final /* synthetic */ Long a() {
        return null;
    }

    @Override // defpackage.xql
    public final String b() {
        return this.f;
    }

    @Override // defpackage.xql
    public final void c(cnq cnqVar) {
        this.g.a(cnqVar);
    }

    @Override // defpackage.xql
    public final void d(armi armiVar) {
        arlj arljVar;
        apyv apyvVar;
        this.e.dismiss();
        if ((armiVar.b & 2) != 0 || armiVar.e.size() <= 0) {
            xnm xnmVar = this.b;
            if ((armiVar.b & 4) != 0) {
                arljVar = armiVar.f;
                if (arljVar == null) {
                    arljVar = arlj.a;
                }
            } else {
                arljVar = null;
            }
            xnmVar.a(arljVar, h(this.c));
            armj armjVar = armiVar.d;
            if (armjVar == null) {
                armjVar = armj.a;
            }
            if (armjVar.b == 62285947) {
                armj armjVar2 = armiVar.d;
                if (armjVar2 == null) {
                    armjVar2 = armj.a;
                }
                if (armjVar2.b == 62285947) {
                    apyvVar = (apyv) armjVar2.c;
                } else {
                    apyvVar = apyv.a;
                }
                if ((apyvVar.c & 32) != 0 && g() != null) {
                    g().D(new acqx(apyvVar.A.I()));
                }
                xpa xpaVar = this.d.b;
                if (xpaVar != null) {
                    xpaVar.e(apyvVar);
                    return;
                }
                return;
            }
            return;
        }
        if (g() != null) {
            arlj arljVar2 = armiVar.f;
            if (arljVar2 == null) {
                arljVar2 = arlj.a;
            }
            if ((arljVar2.b & 4096) != 0) {
                arlj arljVar3 = armiVar.f;
                if (arljVar3 == null) {
                    arljVar3 = arlj.a;
                }
                if (arljVar3.l) {
                    g().n(new acqx(acsb.c(103918)));
                    g().n(new acqx(acsb.c(104381)));
                    g().n(new acqx(acsb.c(104380)));
                    g().n(new acqx(acsb.c(104382)));
                }
            }
        }
        this.h.b(armiVar.e);
    }

    @Override // defpackage.xqk
    public final void e(cnq cnqVar) {
        this.g.a(cnqVar);
    }

    @Override // defpackage.xqk
    public final void f(armf armfVar) {
        arlj arljVar;
        xoo xooVar;
        xpa xpaVar;
        apyv apyvVar;
        apyv apyvVar2;
        this.e.dismiss();
        if ((armfVar.b & 2) != 0 || armfVar.f.size() <= 0) {
            xnm xnmVar = this.b;
            if ((armfVar.b & 8) != 0) {
                arljVar = armfVar.g;
                if (arljVar == null) {
                    arljVar = arlj.a;
                }
            } else {
                arljVar = null;
            }
            xnmVar.a(arljVar, h(this.c));
            armg armgVar = armfVar.d;
            if (armgVar == null) {
                armgVar = armg.a;
            }
            if (armgVar.b != 62285947 || (xpaVar = (xooVar = this.d).b) == null) {
                return;
            }
            if (!armfVar.e) {
                apyv apyvVar3 = xooVar.c;
                armg armgVar2 = armfVar.d;
                if (armgVar2 == null) {
                    armgVar2 = armg.a;
                }
                if (armgVar2.b == 62285947) {
                    apyvVar = (apyv) armgVar2.c;
                } else {
                    apyvVar = apyv.a;
                }
                xpaVar.f(apyvVar3, apyvVar);
                return;
            }
            armg armgVar3 = armfVar.d;
            if (armgVar3 == null) {
                armgVar3 = armg.a;
            }
            if (armgVar3.b == 62285947) {
                apyvVar2 = (apyv) armgVar3.c;
            } else {
                apyvVar2 = apyv.a;
            }
            xpaVar.g(apyvVar2, this.d.c);
            return;
        }
        if (g() != null) {
            arlj arljVar2 = armfVar.g;
            if (arljVar2 == null) {
                arljVar2 = arlj.a;
            }
            if ((arljVar2.b & 4096) != 0) {
                arlj arljVar3 = armfVar.g;
                if (arljVar3 == null) {
                    arljVar3 = arlj.a;
                }
                if (arljVar3.l) {
                    g().n(new acqx(acsb.c(103918)));
                    g().n(new acqx(acsb.c(104381)));
                    g().n(new acqx(acsb.c(104380)));
                    g().n(new acqx(acsb.c(104382)));
                }
            }
        }
        this.h.b(armfVar.f);
    }
}
