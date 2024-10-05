package defpackage;

import android.text.Spanned;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xvb implements View.OnClickListener {
    final /* synthetic */ aqab a;
    final /* synthetic */ xpa b;
    final /* synthetic */ apyv c;
    final /* synthetic */ xvc d;

    public xvb(xvc xvcVar, aqab aqabVar, xpa xpaVar, apyv apyvVar) {
        this.d = xvcVar;
        this.a = aqabVar;
        this.b = xpaVar;
        this.c = apyvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aqyg aqygVar;
        apmg apmgVar;
        aqyg aqygVar2;
        xoh xohVar = this.d.b;
        aqab aqabVar = this.a;
        xpa xpaVar = this.b;
        apyv apyvVar = this.c;
        if ((aqabVar.b & 32) == 0) {
            if (!xohVar.n.t(aqabVar)) {
                zga.b("No button renderer specified for comment detail simplebox.");
                return;
            }
            if ((xohVar.n.r(aqabVar).b & 8192) == 0) {
                zga.b("No service endpoint specified for comment detail simplebox.");
                return;
            }
            ajun ajunVar = xohVar.n;
            ajunVar.s(aqabVar, xohVar.b(ajunVar.r(aqabVar)));
            if (xoh.p(apyvVar) == null) {
                apyk b = apyk.b(apyvVar.H);
                if (b == null) {
                    b = apyk.COMMENT_POLL_STATUS_UNKNOWN;
                }
                if (b == apyk.COMMENT_POLL_STATUS_VOTE_NO_COMMENT) {
                    xohVar.g(aqabVar, xpaVar);
                    return;
                }
                return;
            }
            avgg avggVar = aqabVar.e;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            avgg avggVar2 = avggVar;
            if ((aqabVar.b & 16) != 0) {
                aqygVar = aqabVar.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            Spanned b2 = ajcq.b(aqygVar);
            apxf apxfVar = xohVar.n.r(aqabVar).n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            apxf apxfVar2 = apxfVar;
            apmh apmhVar = aqabVar.h;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if ((apmhVar.b & 1) != 0) {
                apmh apmhVar2 = aqabVar.h;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmg apmgVar2 = apmhVar2.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                apmgVar = apmgVar2;
            } else {
                apmgVar = null;
            }
            apmh apmhVar3 = aqabVar.j;
            if (apmhVar3 == null) {
                apmhVar3 = apmh.a;
            }
            apmg apmgVar3 = apmhVar3.c;
            if (apmgVar3 == null) {
                apmgVar3 = apmg.a;
            }
            apmg apmgVar4 = apmgVar3;
            aulq aulqVar = aqabVar.k;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aulq aulqVar2 = aulqVar;
            String str = aqabVar.l;
            if ((aqabVar.b & 16) != 0) {
                aqyg aqygVar3 = aqabVar.f;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                aqygVar2 = aqygVar3;
            } else {
                aqygVar2 = null;
            }
            xohVar.e(new xoo(1, avggVar2, xpaVar, apyvVar, null, b2, null, apxfVar2, apmgVar, apmgVar4, aulqVar2, str, null, aqygVar2, null, null), null, null, null, false, false);
            return;
        }
        aahd aahdVar = xohVar.b;
        apxf apxfVar3 = aqabVar.g;
        if (apxfVar3 == null) {
            apxfVar3 = apxf.a;
        }
        aahdVar.c(apxfVar3, null);
    }
}
