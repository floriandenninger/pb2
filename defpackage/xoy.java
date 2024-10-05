package defpackage;

import com.google.protos.youtube.api.innertube.CommentSectionRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xoy extends ajud implements xpd, ypd {
    public xox a;
    public xow b;
    private final apzv c;
    private final xpo d;
    private final yaq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoy(ajvb ajvbVar, ypa ypaVar, zaw zawVar, yaq yaqVar, ajfh ajfhVar, aadw aadwVar, apzx apzxVar, aasm aasmVar, acra acraVar, yaq yaqVar2, yap yapVar, byte[] bArr, byte[] bArr2) {
        super(aasmVar, ypaVar, zawVar, acraVar);
        apzv apzvVar;
        apyv apyvVar;
        ajvbVar.get();
        this.e = yaqVar2;
        ajvbVar.a(apzx.class);
        apzw apzwVar = apzxVar.i;
        if (((apzwVar == null ? apzw.a : apzwVar).b & 1) != 0) {
            apzw apzwVar2 = apzxVar.i;
            apzvVar = (apzwVar2 == null ? apzw.a : apzwVar2).c;
            if (apzvVar == null) {
                apzvVar = apzv.a;
            }
        } else {
            apzvVar = null;
        }
        this.c = apzvVar;
        xpo xpoVar = new xpo(yaqVar, this, apzxVar, yaqVar2, yapVar, aadwVar, null, null);
        this.d = xpoVar;
        this.i.mK(new ajve(this));
        this.i.mK(new xpb(xpoVar));
        apyx apyxVar = apzxVar.c;
        if ((apyxVar == null ? apyx.a : apyxVar).b != 62285947) {
            aulq aulqVar = apzxVar.d;
            if ((aulqVar == null ? aulq.a : aulqVar).pY(ElementRendererOuterClass.elementRenderer)) {
                aulq aulqVar2 = apzxVar.d;
                aulqVar2 = aulqVar2 == null ? aulq.a : aulqVar2;
                ajwt ajwtVar = new ajwt();
                ajwtVar.b(ajfhVar);
                aqrf aqrfVar = (aqrf) aulqVar2.pX(ElementRendererOuterClass.elementRenderer);
                aone createBuilder = askg.a.createBuilder();
                createBuilder.copyOnWrite();
                askg askgVar = (askg) createBuilder.instance;
                aqrfVar.getClass();
                askgVar.av = aqrfVar;
                askgVar.h |= 1048576;
                D(ajwtVar.a(amru.r((askg) createBuilder.build())));
                ypaVar.g(this);
            }
        } else {
            apyx apyxVar2 = apzxVar.c;
            apyxVar2 = apyxVar2 == null ? apyx.a : apyxVar2;
            if (apyxVar2.b == 62285947) {
                apyvVar = (apyv) apyxVar2.c;
            } else {
                apyvVar = apyv.a;
            }
            A(apyvVar);
        }
        aulq aulqVar3 = apzxVar.e;
        if ((aulqVar3 == null ? aulq.a : aulqVar3).pY(CommentSectionRendererOuterClass.backstageSubscribeBarRenderer)) {
            aulq aulqVar4 = apzxVar.e;
            A((aulqVar4 == null ? aulq.a : aulqVar4).pX(CommentSectionRendererOuterClass.backstageSubscribeBarRenderer));
        }
        apzi apziVar = apzxVar.g;
        if (((apziVar == null ? apzi.a : apziVar).b & 1) != 0) {
            apzi apziVar2 = apzxVar.g;
            apzh apzhVar = (apziVar2 == null ? apzi.a : apziVar2).c;
            A(apzhVar == null ? apzh.a : apzhVar);
        }
        apzp apzpVar = apzxVar.f;
        if (((apzpVar == null ? apzp.a : apzpVar).b & 1) != 0) {
            apzp apzpVar2 = apzxVar.f;
            apzn apznVar = (apzpVar2 == null ? apzp.a : apzpVar2).c;
            p(apznVar == null ? apzn.a : apznVar, false);
        }
        yaqVar.d(apzxVar, this);
    }

    private final void p(apzn apznVar, boolean z) {
        if (r()) {
            int size = this.i.size();
            Object obj = this.i.get(size - 1);
            Object obj2 = this.i.size() > 1 ? this.i.get(size - 2) : null;
            if (obj2 == null || !(obj2 instanceof apzv)) {
                if (obj instanceof apzv) {
                    super.G(obj);
                }
            } else {
                super.G(obj2);
            }
        }
        ArrayList arrayList = new ArrayList(apznVar.e.size());
        for (apzu apzuVar : apznVar.e) {
            if ((apzuVar.b & 1) != 0) {
                atmt atmtVar = apzuVar.c;
                if (atmtVar == null) {
                    atmtVar = atmt.a;
                }
                arrayList.add(ahbj.o(atmtVar));
            }
        }
        lu(arrayList);
        for (apyx apyxVar : this.e.b(apznVar)) {
            if (!z) {
                A(apyxVar.b == 62285947 ? (apyv) apyxVar.c : null);
            } else {
                this.d.j(apyxVar.b == 62285947 ? (apyv) apyxVar.c : null);
            }
        }
        apzv apzvVar = this.c;
        if (apzvVar != null) {
            A(apzvVar);
        }
    }

    private final void q() {
        xox xoxVar = this.a;
        if (xoxVar != null) {
            npj npjVar = (npj) xoxVar;
            if (npj.H(npjVar.k)) {
                npjVar.k = npj.I(npjVar.k, true);
            }
        }
    }

    private final boolean r() {
        int size = this.i.size();
        return ((size > 0 ? this.i.get(size + (-1)) : null) instanceof apzv) || ((size > 1 ? this.i.get(size + (-2)) : null) instanceof apzv);
    }

    public final void i(xpa xpaVar) {
        if (xpaVar != null) {
            this.d.a.add(xpaVar);
        }
    }

    @Override // defpackage.xpd
    public final void k(apyv apyvVar) {
        if (r()) {
            C(apyvVar, this.i.size() - 1);
        } else {
            A(apyvVar);
        }
        q();
    }

    @Override // defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != xoy.class) {
            return ahbw.m(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{aacj.class};
        }
        if (i == 0) {
            G(((aacj) obj).b());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.xpd
    public final void l(apyv apyvVar) {
        G(apyvVar);
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ void lB(Object obj, ajcd ajcdVar) {
        auwh auwhVar;
        apzn apznVar = (apzn) obj;
        super.lB(apznVar, ajcdVar);
        if (apznVar == null) {
            return;
        }
        if (ajcdVar == ajcd.RELOAD) {
            xpo xpoVar = this.d;
            apzi apziVar = xpoVar.b.g;
            if (apziVar == null) {
                apziVar = apzi.a;
            }
            apzh apzhVar = apziVar.c;
            if (apzhVar == null) {
                apzhVar = apzh.a;
            }
            apzo apzoVar = apzhVar.f;
            if (apzoVar == null) {
                apzoVar = apzo.a;
            }
            if (apzoVar.b == 76818770) {
                apzi apziVar2 = xpoVar.b.g;
                if (apziVar2 == null) {
                    apziVar2 = apzi.a;
                }
                apzh apzhVar2 = apziVar2.c;
                if (apzhVar2 == null) {
                    apzhVar2 = apzh.a;
                }
                aone builder = apzhVar2.toBuilder();
                apzo apzoVar2 = apzhVar2.f;
                if (apzoVar2 == null) {
                    apzoVar2 = apzo.a;
                }
                aone builder2 = apzoVar2.toBuilder();
                apzo apzoVar3 = apzhVar2.f;
                if (apzoVar3 == null) {
                    apzoVar3 = apzo.a;
                }
                if (apzoVar3.b == 76818770) {
                    auwhVar = (auwh) apzoVar3.c;
                } else {
                    auwhVar = auwh.a;
                }
                aone builder3 = auwhVar.toBuilder();
                builder3.copyOnWrite();
                ((auwh) builder3.instance).c = auwh.emptyProtobufList();
                Iterator it = auwhVar.c.iterator();
                while (it.hasNext()) {
                    aone builder4 = ((auwg) it.next()).toBuilder();
                    builder4.copyOnWrite();
                    auwg auwgVar = (auwg) builder4.instance;
                    auwgVar.b |= 4;
                    auwgVar.g = false;
                    builder3.copyOnWrite();
                    auwh auwhVar2 = (auwh) builder3.instance;
                    auwg auwgVar2 = (auwg) builder4.build();
                    auwgVar2.getClass();
                    auwhVar2.a();
                    auwhVar2.c.add(auwgVar2);
                }
                auwh auwhVar3 = (auwh) builder3.build();
                builder2.copyOnWrite();
                apzo apzoVar4 = (apzo) builder2.instance;
                auwhVar3.getClass();
                apzoVar4.c = auwhVar3;
                apzoVar4.b = 76818770;
                builder.copyOnWrite();
                apzh apzhVar3 = (apzh) builder.instance;
                apzo apzoVar5 = (apzo) builder2.build();
                apzoVar5.getClass();
                apzhVar3.f = apzoVar5;
                apzhVar3.b |= 8;
                apzh apzhVar4 = (apzh) builder.build();
                aone builder5 = xpoVar.b.toBuilder();
                apzi apziVar3 = xpoVar.b.g;
                if (apziVar3 == null) {
                    apziVar3 = apzi.a;
                }
                aone builder6 = apziVar3.toBuilder();
                builder6.copyOnWrite();
                apzi apziVar4 = (apzi) builder6.instance;
                apzhVar4.getClass();
                apziVar4.c = apzhVar4;
                apziVar4.b |= 1;
                builder5.copyOnWrite();
                apzx apzxVar = (apzx) builder5.instance;
                apzi apziVar5 = (apzi) builder6.build();
                apziVar5.getClass();
                apzxVar.g = apziVar5;
                apzxVar.b |= 64;
                xpoVar.k((apzx) builder5.build());
            }
            this.d.i();
            p(apznVar, true);
            return;
        }
        p(apznVar, true);
    }

    @Override // defpackage.xpd
    public final void m() {
        lD();
        q();
        xow xowVar = this.b;
        if (xowVar != null) {
            xowVar.a();
        }
    }

    @Override // defpackage.xpd
    public final void n(apyv apyvVar, apyv apyvVar2) {
        I(apyvVar, apyvVar2);
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajtz
    public final /* bridge */ /* synthetic */ Object nn(aulp aulpVar) {
        if (aulpVar == null || !aulpVar.pY(apzn.b)) {
            return null;
        }
        return (apzn) aulpVar.pX(apzn.b);
    }

    @Override // defpackage.xpd
    public final void o(apyv apyvVar, apyv apyvVar2) {
        I(apyvVar, apyvVar2);
        q();
    }
}
