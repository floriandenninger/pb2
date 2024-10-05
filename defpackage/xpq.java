package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xpq implements aawb, xpr {
    private final Activity a;
    private final xnm b;
    private final yal c;
    private final xpu d;
    private final ajfh e;
    private final ajvc f;
    private final xoo g;
    private final xyt h;
    private final String i;
    private final Long j;
    private final zfi k;
    private final vak l;

    public xpq(Activity activity, xnm xnmVar, yal yalVar, xpu xpuVar, vak vakVar, ajfh ajfhVar, ajvc ajvcVar, xoo xooVar, xyt xytVar, String str, Long l, zfi zfiVar, byte[] bArr) {
        this.a = activity;
        this.b = xnmVar;
        this.c = yalVar;
        this.d = xpuVar;
        this.l = vakVar;
        this.e = ajfhVar;
        this.f = ajvcVar;
        this.g = xooVar;
        this.h = xytVar;
        this.i = str;
        this.j = l;
        this.k = zfiVar;
    }

    private final acra i() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof acqz) {
            return ((acqz) componentCallbacks2).mM();
        }
        return null;
    }

    private final ajvc j() {
        ajvc ajvcVar = this.f;
        return ajvcVar == null ? (ajvc) amkq.bi(this.l.c(), null) : ajvcVar;
    }

    private static amrz k(ajvc ajvcVar) {
        if (ajvcVar != null) {
            return amrz.k("sectionController", ajvcVar);
        }
        return null;
    }

    @Override // defpackage.aawb
    public final /* synthetic */ aawe a() {
        return null;
    }

    @Override // defpackage.aawb
    public final Long b() {
        return this.j;
    }

    @Override // defpackage.aawb
    public final String c() {
        return this.i;
    }

    @Override // defpackage.aawb
    public final void d() {
        this.h.dismiss();
    }

    @Override // defpackage.aawb
    public final void e(cnq cnqVar) {
        this.k.a(cnqVar);
    }

    @Override // defpackage.aawb
    public final void f(armb armbVar) {
        apzx apzxVar;
        ammv ammvVar;
        apzx apzxVar2;
        arlj arljVar;
        List aR;
        this.h.dismiss();
        armc armcVar = armbVar.d;
        if (armcVar == null) {
            armcVar = armc.a;
        }
        int i = armcVar.b;
        if (i != 153515154) {
            if (i == 62285833) {
                apzxVar = (apzx) armcVar.c;
            } else {
                apzxVar = apzx.a;
            }
            apyx apyxVar = apzxVar.c;
            if (apyxVar == null) {
                apyxVar = apyx.a;
            }
            if (apyxVar.b == 62285947) {
                if (armcVar.b == 62285833) {
                    apzxVar2 = (apzx) armcVar.c;
                } else {
                    apzxVar2 = apzx.a;
                }
                ammvVar = ammv.j(new xpp(apzxVar2));
            } else {
                ammvVar = amlr.a;
            }
        } else {
            ammvVar = ammv.j(new xpp((aqrf) armcVar.c));
        }
        if (ammvVar.h()) {
            xnm xnmVar = this.b;
            if ((armbVar.b & 4) != 0) {
                arljVar = armbVar.f;
                if (arljVar == null) {
                    arljVar = arlj.a;
                }
            } else {
                arljVar = null;
            }
            xnmVar.b(arljVar, k(j()), R.string.comment_added);
            aomf aomfVar = ((xpp) ammvVar.c()).b;
            if (aomfVar != null && i() != null) {
                i().D(new acqx(aomfVar.I()));
            }
            Object obj = ((xpp) ammvVar.c()).a;
            ajvc ajvcVar = this.f;
            if (ajvcVar == null) {
                aR = this.l.c();
            } else {
                aR = amkq.aR(ajvcVar);
            }
            Iterator it = aR.iterator();
            while (it.hasNext()) {
                xpx xpxVar = new xpx((ajvc) it.next());
                if (!(obj instanceof aqrf) || this.e == null) {
                    xpxVar.a(obj, false);
                } else {
                    xpxVar.a(ajds.a((aqrf) obj), false);
                }
            }
            return;
        }
        if (i() != null) {
            arlj arljVar2 = armbVar.f;
            if (arljVar2 == null) {
                arljVar2 = arlj.a;
            }
            if ((arljVar2.b & 4096) != 0) {
                arlj arljVar3 = armbVar.f;
                if (arljVar3 == null) {
                    arljVar3 = arlj.a;
                }
                if (arljVar3.l) {
                    i().n(new acqx(acsb.c(103918)));
                    i().n(new acqx(acsb.c(104381)));
                    i().n(new acqx(acsb.c(104380)));
                    i().n(new acqx(acsb.c(104382)));
                }
            }
        }
    }

    @Override // defpackage.xpr
    public final void g(cnq cnqVar) {
        this.k.a(cnqVar);
    }

    @Override // defpackage.xpr
    public final void h(arly arlyVar) {
        apyv apyvVar;
        apyv apyvVar2;
        this.h.dismiss();
        if ((arlyVar.b & 2) != 0 || arlyVar.g.size() <= 0) {
            arlz arlzVar = arlyVar.d;
            if (arlzVar == null) {
                arlzVar = arlz.a;
            }
            if (arlzVar.b != 153515154) {
                xpa xpaVar = this.g.b;
                arlj arljVar = null;
                if (xpaVar == null) {
                    ajok ajokVar = this.c.b;
                    xpaVar = ajokVar != null ? (xpa) ajokVar.c("commentThreadMutator") : null;
                }
                xnm xnmVar = this.b;
                if ((arlyVar.b & 16) != 0 && (arljVar = arlyVar.h) == null) {
                    arljVar = arlj.a;
                }
                xnmVar.b(arljVar, k(j()), R.string.reply_added);
                arlz arlzVar2 = arlyVar.d;
                if (arlzVar2 == null) {
                    arlzVar2 = arlz.a;
                }
                if (arlzVar2.b == 62285947 && xpaVar != null) {
                    if (!arlyVar.e) {
                        arlz arlzVar3 = arlyVar.d;
                        if (arlzVar3 == null) {
                            arlzVar3 = arlz.a;
                        }
                        if (arlzVar3.b == 62285947) {
                            apyvVar = (apyv) arlzVar3.c;
                        } else {
                            apyvVar = apyv.a;
                        }
                        xpaVar.b(apyvVar);
                    } else {
                        arlz arlzVar4 = arlyVar.d;
                        if (arlzVar4 == null) {
                            arlzVar4 = arlz.a;
                        }
                        if (arlzVar4.b == 62285947) {
                            apyvVar2 = (apyv) arlzVar4.c;
                        } else {
                            apyvVar2 = apyv.a;
                        }
                        xpaVar.g(apyvVar2, this.g.c);
                    }
                }
                arlj arljVar2 = arlyVar.h;
                if (arljVar2 == null) {
                    arljVar2 = arlj.a;
                }
                apyk b = apyk.b(arljVar2.i);
                if (b == null) {
                    b = apyk.COMMENT_POLL_STATUS_UNKNOWN;
                }
                if (b != apyk.COMMENT_POLL_STATUS_UNKNOWN) {
                    yal yalVar = this.c;
                    String str = this.g.c.i;
                    arlj arljVar3 = arlyVar.h;
                    if (arljVar3 == null) {
                        arljVar3 = arlj.a;
                    }
                    long j = arljVar3.j;
                    arlj arljVar4 = arlyVar.h;
                    if (arljVar4 == null) {
                        arljVar4 = arlj.a;
                    }
                    apyk b2 = apyk.b(arljVar4.i);
                    if (b2 == null) {
                        b2 = apyk.COMMENT_POLL_STATUS_UNKNOWN;
                    }
                    yalVar.k(str, j, b2);
                    if ((arlyVar.b & 8) != 0) {
                        yal yalVar2 = this.c;
                        String str2 = this.g.c.i;
                        audn audnVar = arlyVar.f;
                        if (audnVar == null) {
                            audnVar = audn.a;
                        }
                        yaj yajVar = (yaj) yalVar2.a.b(yal.n(str2));
                        if (yajVar != null) {
                            aone builder = ((audq) yajVar.a).toBuilder();
                            builder.copyOnWrite();
                            audq audqVar = (audq) builder.instance;
                            audnVar.getClass();
                            audqVar.j = audnVar;
                            audqVar.b |= 128;
                            yalVar2.a.d(yal.n(str2), new yaj((audq) builder.build(), 0L));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            this.d.a(arlyVar);
            return;
        }
        if (i() != null) {
            arlj arljVar5 = arlyVar.h;
            if (arljVar5 == null) {
                arljVar5 = arlj.a;
            }
            if ((arljVar5.b & 4096) != 0) {
                arlj arljVar6 = arlyVar.h;
                if (arljVar6 == null) {
                    arljVar6 = arlj.a;
                }
                if (arljVar6.l) {
                    i().n(new acqx(acsb.c(103918)));
                    i().n(new acqx(acsb.c(104381)));
                    i().n(new acqx(acsb.c(104380)));
                    i().n(new acqx(acsb.c(104382)));
                }
            }
        }
    }
}
