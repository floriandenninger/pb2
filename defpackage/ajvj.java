package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajvj extends ajud implements ajst, ajwl, ajwm, ajth, ajus, ypd {
    private boolean a;
    private String b;
    public final ajwt h;
    public final ajwt m;

    public ajvj(aasm aasmVar, ajvb ajvbVar, ypa ypaVar, zaw zawVar, acra acraVar, ajxe ajxeVar) {
        this(aasmVar, ajvbVar, ypaVar, zawVar, acraVar, ajxeVar, new ajpd());
    }

    @Override // defpackage.ajud
    public final void H(ammy ammyVar) {
        super.H(ammyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L(ajwv ajwvVar) {
        this.h.b(ajwvVar);
    }

    public final void M(ajvf ajvfVar) {
        super.G(ajvfVar.a());
    }

    public final void N(aaxa aaxaVar) {
        super.G(aaxaVar.b());
    }

    @Override // defpackage.ajwm
    public final void O(Object obj, Object obj2) {
        I(obj, obj2);
    }

    public void i(aalz aalzVar) {
        lD();
        askb askbVar = aalzVar.a.d;
        if (askbVar == null) {
            askbVar = askb.a;
        }
        this.a = false;
        if (askbVar != null) {
            int i = askbVar.b;
            if ((i & 1) != 0) {
                p(askbVar);
            } else if ((i & 2) == 0) {
                aooy aa = whu.aa(askbVar);
                if (aa != null) {
                    if (aa instanceof aqrf) {
                        ajwt ajwtVar = this.m;
                        askb askbVar2 = aalzVar.a.d;
                        if (askbVar2 == null) {
                            askbVar2 = askb.a;
                        }
                        D(ajwtVar.a(amru.r(askbVar2)));
                    } else {
                        A(aa);
                    }
                    this.a = true;
                }
            } else {
                askc askcVar = askbVar.d;
                if (askcVar == null) {
                    askcVar = askc.a;
                }
                aske askeVar = askcVar.d;
                if (askeVar == null) {
                    askeVar = aske.a;
                }
                if ((askeVar.b & 1) != 0) {
                    askc askcVar2 = askbVar.d;
                    if (askcVar2 == null) {
                        askcVar2 = askc.a;
                    }
                    A(askcVar2);
                    this.a = true;
                }
            }
        }
        nk(aalzVar);
        this.b = aalzVar.a.i;
    }

    @Override // defpackage.ajud, defpackage.ypd
    public Class[] kz(Class cls, Object obj, int i) {
        if (cls != ajvj.class) {
            return ahbw.m(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{aacj.class, aacl.class, aaxa.class, ajvf.class};
        }
        if (i == 0) {
            nl((aacj) obj);
            return null;
        }
        if (i == 1) {
            nm((aacl) obj);
            return null;
        }
        if (i == 2) {
            N((aaxa) obj);
            return null;
        }
        if (i == 3) {
            M((ajvf) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    /* renamed from: lA, reason: merged with bridge method [inline-methods] */
    public void lB(aalz aalzVar, ajcd ajcdVar) {
        super.lB(aalzVar, ajcdVar);
        if (aalzVar == null) {
            return;
        }
        if (ajcdVar == ajcd.RELOAD) {
            i(aalzVar);
        } else {
            nk(aalzVar);
        }
    }

    @Override // defpackage.ajth
    public final /* synthetic */ void ll(aulm aulmVar, zfi zfiVar, ajug ajugVar, apxf apxfVar) {
        throw null;
    }

    @Override // defpackage.ajus
    public String lx() {
        return this.b;
    }

    @Override // defpackage.ajst
    public void ly(Object obj, int i) {
        if (this.a) {
            C(obj, i + 1);
        } else {
            C(obj, i);
        }
    }

    @Override // defpackage.ajth
    public void lz(aulm aulmVar, apxf apxfVar) {
        lD();
        lt(ahbj.o(aulmVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void nk(aalz aalzVar) {
        if (aalzVar == null) {
            return;
        }
        lu(aalzVar.a());
        D(this.h.a(aalzVar.a.e));
    }

    public void nl(aacj aacjVar) {
        super.G(aacjVar.b());
    }

    public void nm(aacl aaclVar) {
        if (aaclVar.c() != null) {
            super.H(aaclVar.c());
        } else {
            super.G(aaclVar.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ Object nn(aulp aulpVar) {
        if (aulpVar == null || !aulpVar.pY(askd.b)) {
            return null;
        }
        return new aalz((askd) aulpVar.pX(askd.b));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(askb askbVar) {
        aska askaVar = askbVar.c;
        if (askaVar == null) {
            askaVar = aska.a;
        }
        aqyg aqygVar = askaVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        if (!TextUtils.isEmpty(ajcq.b(aqygVar))) {
            aska askaVar2 = askbVar.c;
            if (askaVar2 == null) {
                askaVar2 = aska.a;
            }
            A(askaVar2);
            this.a = true;
            return;
        }
        if ((askbVar.b & 64) != 0) {
            aqrf aqrfVar = askbVar.i;
            if (aqrfVar == null) {
                aqrfVar = aqrf.a;
            }
            A(aqrfVar);
        }
    }

    @Override // defpackage.ajud, defpackage.ajtz, defpackage.ajvz
    public ajxe ph() {
        return new ajvi(super.ph(), this.a, this.b);
    }

    @Override // defpackage.ajst
    public final void z(Object obj) {
        A(obj);
    }

    public ajvj(aasm aasmVar, ajvb ajvbVar, ypa ypaVar, zaw zawVar, acra acraVar, ajxe ajxeVar, ajpd ajpdVar) {
        this(aasmVar, ajvbVar, ypaVar, zawVar, acraVar, ajxeVar, ajpdVar, amlr.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajvj(aasm aasmVar, ajvb ajvbVar, ypa ypaVar, zaw zawVar, acra acraVar, ajxe ajxeVar, ajpd ajpdVar, ammv ammvVar) {
        super(aasmVar, ypaVar, zawVar, acraVar, ajxe.a(ajxeVar), ajpdVar);
        ajvbVar.get();
        ajvbVar.a(aalz.class);
        ypaVar.getClass();
        if (ajxeVar instanceof ajvi) {
            ajvi ajviVar = (ajvi) ajxeVar;
            this.a = ajviVar.a;
            this.b = ajviVar.b;
        }
        ypaVar.g(this);
        ajpdVar.mK(new ajve(this));
        ajpdVar.mK(new ajxd(this));
        this.h = new ajwt();
        this.m = new ajwt();
        L(new ajvh(ammvVar));
    }
}
