package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xou implements xnn, xov, afwx {
    public final xpa a;
    public final apyv b;
    private final Context c;
    private final yal d;
    private final xnm e;
    private final ajrn f;
    private final ajqu g;
    private final zaw h;
    private final ajvc i;
    private final xoz j;
    private final acra k;
    private final boolean l;

    public xou(Context context, yal yalVar, xnm xnmVar, ajrn ajrnVar, ajqu ajquVar, zaw zawVar, ajvc ajvcVar, xpa xpaVar, apyv apyvVar, acra acraVar, boolean z) {
        this.c = context;
        this.d = yalVar;
        this.e = xnmVar;
        this.f = ajrnVar;
        this.g = ajquVar;
        this.h = zawVar;
        this.i = ajvcVar;
        this.a = xpaVar;
        this.j = new xqb(ajvcVar);
        this.b = apyvVar;
        this.k = acraVar;
        this.l = z;
        ajquVar.b = this;
    }

    public static final void f(Context context, arqh arqhVar, xnn xnnVar) {
        apyv apyvVar;
        if ((arqhVar.b & 4) != 0) {
            arqf arqfVar = arqhVar.e;
            if (arqfVar == null) {
                arqfVar = arqf.a;
            }
            aqyg aqygVar = arqfVar.b;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.L(context, ajcq.b(aqygVar), 1);
        }
        xou xouVar = (xou) xnnVar;
        apyv apyvVar2 = xouVar.b;
        xpa xpaVar = xouVar.a;
        apzx a = xpaVar.a();
        if (a != null && (a.b & 1) == 0) {
            xpaVar.c(apyvVar2);
            return;
        }
        if (a != null) {
            apyx apyxVar = a.c;
            if (apyxVar == null) {
                apyxVar = apyx.a;
            }
            if (apyxVar.b == 62285947) {
                apyx apyxVar2 = a.c;
                if (apyxVar2 == null) {
                    apyxVar2 = apyx.a;
                }
                if (apyxVar2.b == 62285947) {
                    apyvVar = (apyv) apyxVar2.c;
                } else {
                    apyvVar = apyv.a;
                }
                if (apyvVar.equals(apyvVar2)) {
                    xpaVar.d();
                } else {
                    xpaVar.c(apyvVar2);
                }
            }
        }
    }

    private final void g() {
        apyv apyvVar;
        apzx a = this.a.a();
        if (a != null) {
            apyx apyxVar = a.c;
            if (apyxVar == null) {
                apyxVar = apyx.a;
            }
            if (apyxVar.b == 62285947) {
                apyx apyxVar2 = a.c;
                if (apyxVar2 == null) {
                    apyxVar2 = apyx.a;
                }
                if (apyxVar2.b == 62285947) {
                    apyvVar = (apyv) apyxVar2.c;
                } else {
                    apyvVar = apyv.a;
                }
                if (apyvVar.equals(this.b)) {
                    this.a.d();
                    return;
                } else if (this.l) {
                    this.a.g(null, this.b);
                    return;
                } else {
                    this.a.c(this.b);
                    return;
                }
            }
        }
        this.a.c(this.b);
    }

    @Override // defpackage.xnn
    public final apyv d() {
        return this.b;
    }

    @Override // defpackage.xov
    public final xpa e() {
        return this.a;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.h.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final void kZ(Object obj) {
        aumb aumbVar;
        apyv apyvVar;
        apzx apzxVar;
        apzx apzxVar2;
        apzx apzxVar3;
        if (obj instanceof arlt) {
            for (arlj arljVar : ((arlt) obj).c) {
                xnm xnmVar = this.e;
                ajvc ajvcVar = this.i;
                xnmVar.a(arljVar, ajvcVar != null ? amrz.k("sectionController", ajvcVar) : null);
                int dF = amkq.dF(arljVar.d);
                if (dF == 0) {
                    dF = 1;
                }
                int i = dF - 1;
                if (i != 1) {
                    if (i == 9) {
                        g();
                        arlk arlkVar = arljVar.g;
                        if (arlkVar == null) {
                            arlkVar = arlk.a;
                        }
                        if (arlkVar.b == 62285833) {
                            xoz xozVar = this.j;
                            arlk arlkVar2 = arljVar.g;
                            if (arlkVar2 == null) {
                                arlkVar2 = arlk.a;
                            }
                            if (arlkVar2.b == 62285833) {
                                apzxVar3 = (apzx) arlkVar2.c;
                            } else {
                                apzxVar3 = apzx.a;
                            }
                            xozVar.a(apzxVar3, true);
                        }
                    } else if (i == 10) {
                        g();
                        arlk arlkVar3 = arljVar.g;
                        if (arlkVar3 == null) {
                            arlkVar3 = arlk.a;
                        }
                        if (arlkVar3.b == 62285833) {
                            xoz xozVar2 = this.j;
                            arlk arlkVar4 = arljVar.g;
                            if (arlkVar4 == null) {
                                arlkVar4 = arlk.a;
                            }
                            if (arlkVar4.b == 62285833) {
                                apzxVar2 = (apzx) arlkVar4.c;
                            } else {
                                apzxVar2 = apzx.a;
                            }
                            xozVar2.a(apzxVar2, false);
                        }
                    } else if (i == 15) {
                        arlk arlkVar5 = arljVar.g;
                        if (arlkVar5 == null) {
                            arlkVar5 = arlk.a;
                        }
                        if (arlkVar5.b == 62285833) {
                            ajvc ajvcVar2 = this.i;
                            ajwm ajwmVar = ajvcVar2 instanceof ajwm ? (ajwm) ajvcVar2 : null;
                            if (ajwmVar != null) {
                                arlk arlkVar6 = arljVar.g;
                                if (arlkVar6 == null) {
                                    arlkVar6 = arlk.a;
                                }
                                if (arlkVar6.b == 62285833) {
                                    apzxVar = (apzx) arlkVar6.c;
                                } else {
                                    apzxVar = apzx.a;
                                }
                                ajwmVar.O(this.a.a(), apzxVar);
                            }
                        }
                    } else if (i != 16) {
                    }
                }
                g();
                if (this.a.a() != null) {
                    apyx apyxVar = this.a.a().c;
                    if (apyxVar == null) {
                        apyxVar = apyx.a;
                    }
                    if (apyxVar.b == 62285947) {
                        yal yalVar = this.d;
                        apyx apyxVar2 = this.a.a().c;
                        if (apyxVar2 == null) {
                            apyxVar2 = apyx.a;
                        }
                        if (apyxVar2.b == 62285947) {
                            apyvVar = (apyv) apyxVar2.c;
                        } else {
                            apyvVar = apyv.a;
                        }
                        String str = apyvVar.i;
                        long j = arljVar.j;
                        apyk b = apyk.b(arljVar.i);
                        if (b == null) {
                            b = apyk.COMMENT_POLL_STATUS_UNKNOWN;
                        }
                        yalVar.k(str, j, b);
                    }
                }
            }
            return;
        }
        if (obj instanceof arqh) {
            final arqh arqhVar = (arqh) obj;
            if (arqhVar == null) {
                whu.K(this.c, R.string.video_flagged, 1);
                return;
            }
            this.g.kZ(arqhVar);
            final Context context = this.c;
            if ((arqhVar.b & 2) == 0) {
                f(context, arqhVar, this);
                return;
            }
            AlertDialog.Builder cancelable = new AlertDialog.Builder(context).setCancelable(true);
            aqyg aqygVar = arqhVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            cancelable.setMessage(ajcq.b(aqygVar)).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: xot
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    xou.f(context, arqhVar, this);
                }
            }).show();
            return;
        }
        if (obj instanceof arzq) {
            arzq arzqVar = (arzq) obj;
            if (arzqVar != null) {
                arzr arzrVar = arzqVar.c;
                if (arzrVar == null) {
                    arzrVar = arzr.a;
                }
                if (arzrVar.b == 113762946) {
                    arzr arzrVar2 = arzqVar.c;
                    if (arzrVar2 == null) {
                        arzrVar2 = arzr.a;
                    }
                    if (arzrVar2.b == 113762946) {
                        aumbVar = (aumb) arzrVar2.c;
                    } else {
                        aumbVar = aumb.a;
                    }
                    this.k.D(new acqx(aumbVar.i.I()));
                    this.f.c(aumbVar, this);
                    return;
                }
                return;
            }
            return;
        }
        if (obj instanceof arqe) {
            apzx a = this.a.a();
            ajvc ajvcVar3 = this.i;
            ajpd ajpdVar = ajvcVar3 != null ? (ajpd) ajvcVar3.lC() : null;
            if (ajpdVar == null || a == null) {
                return;
            }
            ajpdVar.remove(a);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
