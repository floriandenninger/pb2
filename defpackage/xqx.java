package defpackage;

import android.content.Context;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xqx {
    public String a;
    private final Context b;
    private final aahd c;
    private final acra d;
    private final xoh e;
    private final yal f;
    private final ajdh g;

    public xqx(Context context, aahd aahdVar, acra acraVar, xoh xohVar, yal yalVar, ajdh ajdhVar) {
        this.b = context;
        this.c = aahdVar;
        this.e = xohVar;
        this.d = acraVar;
        this.f = yalVar;
        this.g = ajdhVar;
    }

    public final void a(xou xouVar, aqgt aqgtVar, apxl apxlVar, apxl apxlVar2, boolean z) {
        aqdt aqdtVar;
        aqyg aqygVar;
        apmg apmgVar;
        String str = this.a;
        if (str != null) {
            this.e.k = str;
        }
        aqyg aqygVar2 = null;
        if (xouVar == null) {
            if (aqgtVar.b == 97806346) {
                apzd apzdVar = (apzd) aqgtVar.c;
                ajok ajokVar = this.f.b;
                this.e.h(apzdVar, ajokVar != null ? (xpa) ajokVar.c("commentThreadMutator") : null, null, z);
                return;
            }
            return;
        }
        xpa xpaVar = xouVar.a;
        apyk c = this.f.c(xouVar.b, xpaVar.h());
        if (c == apyk.COMMENT_POLL_STATUS_NO_VOTE && (apxlVar.b & 1) != 0) {
            aqdtVar = apxlVar.c;
            if (aqdtVar == null) {
                aqdtVar = aqdt.a;
            }
        } else if (c != apyk.COMMENT_POLL_STATUS_VOTE_AND_COMMENT || (apxlVar2.b & 1) == 0) {
            aqdtVar = null;
        } else {
            aqdtVar = apxlVar2.c;
            if (aqdtVar == null) {
                aqdtVar = aqdt.a;
            }
        }
        if (aqdtVar == null) {
            if (aqgtVar.b == 97806346) {
                apzd apzdVar2 = (apzd) aqgtVar.c;
                apjn apjnVar = xouVar.b.B;
                if (apjnVar == null) {
                    apjnVar = apjn.a;
                }
                if (apjnVar.b != 99391126) {
                    this.e.h(apzdVar2, xpaVar, xouVar.b, false);
                    return;
                }
                xoh xohVar = this.e;
                apyv apyvVar = xouVar.b;
                if ((apzdVar2.b & 32) == 0) {
                    zga.b("No reply button specified for comment reply dialog.");
                    return;
                }
                apmh apmhVar = apzdVar2.f;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                if ((apmhVar.b & 1) == 0) {
                    zga.b("No button renderer specified for comment reply dialog.");
                    return;
                }
                apmh apmhVar2 = apzdVar2.f;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmg apmgVar2 = apmhVar2.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                if ((apmgVar2.b & 8192) == 0) {
                    zga.b("No service endpoint specified for comment reply dialog.");
                    return;
                }
                apzd c2 = xohVar.c(apzdVar2);
                if (xoh.p(apyvVar) == null) {
                    apyk b = apyk.b(apyvVar.H);
                    if (b == null) {
                        b = apyk.COMMENT_POLL_STATUS_UNKNOWN;
                    }
                    if (b == apyk.COMMENT_POLL_STATUS_VOTE_NO_COMMENT) {
                        xohVar.h(c2, xpaVar, apyvVar, false);
                        return;
                    }
                    return;
                }
                avgg avggVar = c2.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                avgg avggVar2 = avggVar;
                if ((c2.b & 16) != 0) {
                    aqygVar = c2.e;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                } else {
                    aqygVar = null;
                }
                Spanned b2 = ajcq.b(aqygVar);
                apmh apmhVar3 = c2.f;
                if (apmhVar3 == null) {
                    apmhVar3 = apmh.a;
                }
                apmg apmgVar3 = apmhVar3.c;
                if (apmgVar3 == null) {
                    apmgVar3 = apmg.a;
                }
                apxf apxfVar = apmgVar3.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                apxf apxfVar2 = apxfVar;
                if ((c2.b & 128) != 0) {
                    apmh apmhVar4 = c2.g;
                    if (apmhVar4 == null) {
                        apmhVar4 = apmh.a;
                    }
                    apmg apmgVar4 = apmhVar4.c;
                    if (apmgVar4 == null) {
                        apmgVar4 = apmg.a;
                    }
                    apmgVar = apmgVar4;
                } else {
                    apmgVar = null;
                }
                apmh apmhVar5 = c2.i;
                if (apmhVar5 == null) {
                    apmhVar5 = apmh.a;
                }
                apmg apmgVar5 = apmhVar5.c;
                if (apmgVar5 == null) {
                    apmgVar5 = apmg.a;
                }
                apmg apmgVar6 = apmgVar5;
                aulq aulqVar = c2.j;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                aulq aulqVar2 = aulqVar;
                String str2 = c2.k;
                if ((c2.b & 16) != 0 && (aqygVar2 = c2.e) == null) {
                    aqygVar2 = aqyg.a;
                }
                xohVar.e(new xoo(1, avggVar2, xpaVar, apyvVar, null, b2, null, apxfVar2, apmgVar, apmgVar6, aulqVar2, str2, null, aqygVar2, null, c2), null, null, null, false, false);
                return;
            }
            return;
        }
        ajdf.m(this.b, aqdtVar, this.c, this.d, this.g);
    }
}
