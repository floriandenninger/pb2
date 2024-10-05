package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdf extends ajdd {
    private final aqdt a;
    private final acra b;
    private final ajde c;
    private final zbw d;

    protected ajdf(aqdt aqdtVar, aahd aahdVar, acra acraVar, ajdh ajdhVar, ajde ajdeVar, Object obj, String str, zbw zbwVar) {
        super(aahdVar, ajdhVar, obj, str);
        aqdtVar.getClass();
        this.a = aqdtVar;
        acraVar.getClass();
        this.b = acraVar;
        this.c = ajdeVar;
        this.d = zbwVar;
    }

    public static ajdf c(Context context, aqdt aqdtVar, aahd aahdVar, acra acraVar, ajde ajdeVar, Object obj) {
        return g(context, aqdtVar, aahdVar, acraVar, null, true, true, ajdeVar, obj);
    }

    public static ajdf g(Context context, aqdt aqdtVar, aahd aahdVar, acra acraVar, ajdh ajdhVar, boolean z, boolean z2, ajde ajdeVar, Object obj) {
        return h(context, aqdtVar, aahdVar, acraVar, ajdhVar, z, z2, ajdeVar, obj, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ajdf h(android.content.Context r16, defpackage.aqdt r17, defpackage.aahd r18, defpackage.acra r19, defpackage.ajdh r20, boolean r21, boolean r22, defpackage.ajde r23, java.lang.Object r24, defpackage.ajut r25, defpackage.zbw r26) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdf.h(android.content.Context, aqdt, aahd, acra, ajdh, boolean, boolean, ajde, java.lang.Object, ajut, zbw):ajdf");
    }

    public static void m(Context context, aqdt aqdtVar, aahd aahdVar, acra acraVar, ajdh ajdhVar) {
        p(context, aqdtVar, aahdVar, acraVar, ajdhVar, null, null);
    }

    public static void n(Context context, aqdt aqdtVar, aahd aahdVar, acra acraVar, Object obj) {
        p(context, aqdtVar, aahdVar, acraVar, null, null, obj);
    }

    public static void o(Context context, aqdt aqdtVar, aahd aahdVar, acra acraVar, boolean z, ajde ajdeVar, Object obj, ajut ajutVar) {
        h(context, aqdtVar, aahdVar, acraVar, null, true, z, ajdeVar, obj, ajutVar, null);
    }

    public static void p(Context context, aqdt aqdtVar, aahd aahdVar, acra acraVar, ajdh ajdhVar, ajde ajdeVar, Object obj) {
        g(context, aqdtVar, aahdVar, acraVar, ajdhVar, true, true, ajdeVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajdd
    public final Map d() {
        Map d = super.d();
        d.remove(acrc.b);
        return d;
    }

    @Override // defpackage.ajdd
    protected final void e() {
        apmg l = ahbl.l(this.a);
        if (l != null) {
            if ((l.b & 16384) != 0) {
                aahd aahdVar = this.g;
                apxf apxfVar = l.o;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, d());
            }
            if ((l.b & 8192) != 0) {
                aahd aahdVar2 = this.g;
                apxf apxfVar2 = l.n;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar2.c(apxfVar2, d());
            }
            if ((l.b & 32768) != 0) {
                aahd aahdVar3 = this.g;
                apxf apxfVar3 = l.p;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aahdVar3.c(apxfVar3, d());
            }
            this.b.I(3, new acqx(l.t), null);
        } else {
            aqdt aqdtVar = this.a;
            if ((aqdtVar.b & 16777216) != 0) {
                aahd aahdVar4 = this.g;
                apxf apxfVar4 = aqdtVar.s;
                if (apxfVar4 == null) {
                    apxfVar4 = apxf.a;
                }
                aahdVar4.c(apxfVar4, d());
            }
        }
        ajde ajdeVar = this.c;
        if (ajdeVar != null) {
            ajdeVar.a();
        }
        zbw zbwVar = this.d;
        if (zbwVar != null) {
            zbwVar.b();
        }
    }

    @Override // defpackage.ajdd
    protected final void f() {
        apmg m = ahbl.m(this.a);
        if (m != null) {
            if ((m.b & 32768) != 0) {
                aahd aahdVar = this.g;
                apxf apxfVar = m.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, d());
            }
            if ((m.b & 16384) != 0) {
                aahd aahdVar2 = this.g;
                apxf apxfVar2 = m.o;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar2.c(apxfVar2, d());
            }
            if ((m.b & 8192) != 0) {
                aahd aahdVar3 = this.g;
                apxf apxfVar3 = m.n;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aahdVar3.c(apxfVar3, d());
            }
            this.b.I(3, new acqx(m.t), null);
        } else {
            aqdt aqdtVar = this.a;
            int i = aqdtVar.b;
            if ((33554432 & i) != 0) {
                aahd aahdVar4 = this.g;
                apxf apxfVar4 = aqdtVar.t;
                if (apxfVar4 == null) {
                    apxfVar4 = apxf.a;
                }
                aahdVar4.c(apxfVar4, d());
            } else if ((i & 8388608) != 0) {
                aahd aahdVar5 = this.g;
                apxf apxfVar5 = aqdtVar.r;
                if (apxfVar5 == null) {
                    apxfVar5 = apxf.a;
                }
                aahdVar5.c(apxfVar5, d());
            }
        }
        ajde ajdeVar = this.c;
        if (ajdeVar != null) {
            ajdeVar.b();
        }
        zbw zbwVar = this.d;
        if (zbwVar != null) {
            zbwVar.b();
        }
    }

    public final void l() {
        AlertDialog alertDialog = this.i;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        i(7);
    }

    @Override // defpackage.ajdd
    protected final void lw(int i) {
        ajde ajdeVar = this.c;
        if (ajdeVar != null) {
            ajdeVar.c(i == 5 || i == 6 || i == 7);
        }
        if (i != 1) {
            this.g.e(this.a.l, this.h);
            if (i == 6) {
                return;
            }
        }
        zbw zbwVar = this.d;
        if (zbwVar != null) {
            zbwVar.b();
        }
    }
}
