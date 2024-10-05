package defpackage;

import com.google.protos.youtube.api.innertube.AppPromoAdCtaRendererOuterClass;
import com.google.protos.youtube.api.innertube.CollapsibleAdCtaRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementsAdCtaRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wsl {
    private static final amru a;

    static {
        aone createBuilder = aown.a.createBuilder();
        createBuilder.copyOnWrite();
        aown.a((aown) createBuilder.instance);
        createBuilder.copyOnWrite();
        aown aownVar = (aown) createBuilder.instance;
        aownVar.c = 1;
        aownVar.b = 1 | aownVar.b;
        a = amru.r((aown) createBuilder.build());
    }

    public static xjn a(xjn xjnVar, long j) {
        xjm a2 = xjnVar.a();
        a2.c(j);
        xjn a3 = a2.a();
        if (m(a3)) {
            if (a3.h && !a3.e.isEmpty()) {
                amru amruVar = a3.e;
                int size = amruVar.size();
                int i = 0;
                while (i < size) {
                    aown aownVar = (aown) amruVar.get(i);
                    i++;
                    if (((float) j) >= aownVar.d) {
                        int i2 = a3.k;
                        int bW = amkq.bW(aownVar.c);
                        if (bW == 0) {
                            bW = 1;
                        }
                        if (i2 != bW) {
                            int bW2 = amkq.bW(aownVar.c);
                            boolean z = (bW2 != 0 && bW2 == 2) || a3.k != 3;
                            xjm a4 = a3.a();
                            int bW3 = amkq.bW(aownVar.c);
                            if (bW3 == 0) {
                                bW3 = 1;
                            }
                            a4.k(bW3);
                            a4.b(z);
                            a4.i(true);
                            return a4.a();
                        }
                        return l(a3);
                    }
                }
            } else if (a3.k != 3) {
                xjm a5 = a3.a();
                a5.k(3);
                a5.b(false);
                a5.i(true);
                return a5.a();
            }
            return l(a3);
        }
        return l(a3);
    }

    public static xjn b(xjn xjnVar, Object obj) {
        xjm a2 = xjnVar.a();
        a2.e(ammv.j(obj));
        return a2.a();
    }

    public static xjn c(xjn xjnVar, aigf aigfVar) {
        if (m(xjnVar)) {
            boolean z = xjnVar.h;
            boolean z2 = aigfVar == aigf.FULLSCREEN;
            if (z != z2) {
                xjm a2 = xjnVar.a();
                a2.d(z2);
                xjn a3 = a2.a();
                return a(a3, a3.f);
            }
            return l(xjnVar);
        }
        return l(xjnVar);
    }

    public static xjn d(aigf aigfVar, argp argpVar) {
        int i = argpVar.b;
        if (i == 133765738) {
            return i(aigfVar, (apfm) argpVar.c);
        }
        if (i == 156617590) {
            return j(aigfVar, (apxa) argpVar.c);
        }
        if (i == 211734746) {
            return k(aigfVar, (aqrj) argpVar.c);
        }
        return xjn.a;
    }

    public static xjn e(aigf aigfVar, aulq aulqVar) {
        if (aulqVar.pY(AppPromoAdCtaRendererOuterClass.appPromoAdCtaRenderer)) {
            return i(aigfVar, (apfm) aulqVar.pX(AppPromoAdCtaRendererOuterClass.appPromoAdCtaRenderer));
        }
        if (aulqVar.pY(CollapsibleAdCtaRendererOuterClass.collapsibleAdCtaRenderer)) {
            return j(aigfVar, (apxa) aulqVar.pX(CollapsibleAdCtaRendererOuterClass.collapsibleAdCtaRenderer));
        }
        if (aulqVar.pY(ElementsAdCtaRendererOuterClass.elementsAdCtaRenderer)) {
            return k(aigfVar, (aqrj) aulqVar.pX(ElementsAdCtaRendererOuterClass.elementsAdCtaRenderer));
        }
        return xjn.a;
    }

    public static xjn f(xjn xjnVar) {
        xjm a2 = xjnVar.a();
        a2.g(true);
        return a2.a();
    }

    public static void g(xjn xjnVar, wzq wzqVar) {
        if (xjnVar.c.h()) {
            wzqVar.b(xjnVar.c.c());
        }
    }

    public static boolean h(xjn xjnVar) {
        int i;
        return (xjnVar.i || (i = xjnVar.k) == 1 || i == 3 || xjnVar.d.H()) ? false : true;
    }

    private static xjn i(aigf aigfVar, apfm apfmVar) {
        xjm b = xjn.b();
        b.f(ammv.j(apfmVar));
        b.h(apfmVar.g);
        b.j(amru.o(apfmVar.f));
        b.d(aigfVar == aigf.FULLSCREEN);
        return b.a();
    }

    private static xjn j(aigf aigfVar, apxa apxaVar) {
        xjm b = xjn.b();
        b.f(ammv.j(apxaVar));
        b.h(apxaVar.g);
        b.j(amru.o(apxaVar.f));
        b.d(aigfVar == aigf.FULLSCREEN);
        return b.a();
    }

    private static xjn k(aigf aigfVar, aqrj aqrjVar) {
        xjm b = xjn.b();
        b.f(ammv.j(aqrjVar));
        b.h(aqrjVar.c);
        b.j(a);
        b.d(aigfVar == aigf.FULLSCREEN);
        return b.a();
    }

    private static xjn l(xjn xjnVar) {
        if (!xjnVar.j) {
            return xjnVar;
        }
        xjm a2 = xjnVar.a();
        a2.i(false);
        return a2.a();
    }

    private static boolean m(xjn xjnVar) {
        return xjnVar.b.h();
    }
}
