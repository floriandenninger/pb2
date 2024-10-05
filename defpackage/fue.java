package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fue {
    public final aahd a;
    public final acra b;
    public final shf c;
    public final SharedPreferences d;
    private final ysy e;
    private final akbz f;

    public fue(aahd aahdVar, acra acraVar, ysy ysyVar, shf shfVar, SharedPreferences sharedPreferences, akbz akbzVar) {
        this.a = aahdVar;
        this.b = acraVar;
        this.e = ysyVar;
        this.c = shfVar;
        this.d = sharedPreferences;
        this.f = akbzVar;
    }

    private static atnc b(avzn avznVar) {
        atnc atncVar;
        if (avznVar == null) {
            return null;
        }
        avzo avzoVar = avznVar.e;
        if (avzoVar == null) {
            avzoVar = avzo.a;
        }
        if (avzoVar.b == 96140188) {
            atncVar = (atnc) avzoVar.c;
        } else {
            atncVar = atnc.a;
        }
        apmh apmhVar = atncVar.d;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            return null;
        }
        avzo avzoVar2 = avznVar.e;
        if (avzoVar2 == null) {
            avzoVar2 = avzo.a;
        }
        return avzoVar2.b == 96140188 ? (atnc) avzoVar2.c : atnc.a;
    }

    private static final boolean c(avzn avznVar, avzp avzpVar) {
        if ((avznVar.b & 1) != 0) {
            avzq avzqVar = avznVar.c;
            if (avzqVar == null) {
                avzqVar = avzq.b;
            }
            Iterator<E> it = new aonw(avzqVar.c, avzq.a).iterator();
            while (it.hasNext()) {
                if (avzpVar == ((avzp) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(avzn avznVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        yjk.f();
        atnc b = b(avznVar);
        if (b == null || (b.b & 1) == 0) {
            return;
        }
        apmh apmhVar = b.d;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 16384) != 0) {
            apmh apmhVar2 = b.d;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            aqyg aqygVar3 = null;
            if ((apmgVar2.b & 256) != 0) {
                apmh apmhVar3 = b.d;
                if (apmhVar3 == null) {
                    apmhVar3 = apmh.a;
                }
                apmg apmgVar3 = apmhVar3.c;
                if (apmgVar3 == null) {
                    apmgVar3 = apmg.a;
                }
                aqygVar = apmgVar3.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            if (ajcq.b(aqygVar) == null) {
                return;
            }
            avznVar.getClass();
            avzq avzqVar = avznVar.c;
            if (avzqVar == null) {
                avzqVar = avzq.b;
            }
            if (avzqVar != null) {
                if (TimeUnit.MILLISECONDS.toSeconds(this.c.c() - this.d.getLong(yny.VIDEO_QUALITY_PROMO_LAST_DISPLAYED, 0L)) < avzqVar.g) {
                    return;
                }
            }
            if ((this.e.m() && c(avznVar, avzp.CELLULAR)) || (this.e.r() && c(avznVar, avzp.WIFI))) {
                avznVar.getClass();
                final atnc b2 = b(avznVar);
                b2.getClass();
                fud fudVar = new fud(this, avznVar, b2);
                akbz akbzVar = this.f;
                akca m = akbzVar.m();
                if ((b2.b & 1) != 0) {
                    aqygVar2 = b2.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                m.k(ajcq.b(aqygVar2));
                apmh apmhVar4 = b2.d;
                if (apmhVar4 == null) {
                    apmhVar4 = apmh.a;
                }
                apmg apmgVar4 = apmhVar4.c;
                if (apmgVar4 == null) {
                    apmgVar4 = apmg.a;
                }
                if ((apmgVar4.b & 256) != 0) {
                    apmh apmhVar5 = b2.d;
                    if (apmhVar5 == null) {
                        apmhVar5 = apmh.a;
                    }
                    apmg apmgVar5 = apmhVar5.c;
                    if (apmgVar5 == null) {
                        apmgVar5 = apmg.a;
                    }
                    aqygVar3 = apmgVar5.i;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                }
                m.m(ajcq.b(aqygVar3).toString(), new View.OnClickListener() { // from class: fuc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        fue fueVar = fue.this;
                        atnc atncVar = b2;
                        if ((atncVar.b & 16) != 0) {
                            fueVar.b.I(3, new acqx(atncVar.e), null);
                        }
                        aahd aahdVar = fueVar.a;
                        apmh apmhVar6 = atncVar.d;
                        if (apmhVar6 == null) {
                            apmhVar6 = apmh.a;
                        }
                        apmg apmgVar6 = apmhVar6.c;
                        if (apmgVar6 == null) {
                            apmgVar6 = apmg.a;
                        }
                        apxf apxfVar = apmgVar6.o;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, null);
                    }
                });
                m.l(fudVar);
                m.j(false);
                akbzVar.o(m.b());
            }
        }
    }
}
