package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xwg implements View.OnClickListener {
    final /* synthetic */ xpa a;
    final /* synthetic */ audq b;
    final /* synthetic */ ajok c;
    final /* synthetic */ xwh d;
    final /* synthetic */ aone e;

    public xwg(xwh xwhVar, xpa xpaVar, audq audqVar, aone aoneVar, ajok ajokVar) {
        this.d = xwhVar;
        this.a = xpaVar;
        this.b = audqVar;
        this.e = aoneVar;
        this.c = ajokVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apyv apyvVar;
        aqdt aqdtVar;
        apyx apyxVar = this.a.a().c;
        if (apyxVar == null) {
            apyxVar = apyx.a;
        }
        if (apyxVar.b == 62285947) {
            apyx apyxVar2 = this.a.a().c;
            if (apyxVar2 == null) {
                apyxVar2 = apyx.a;
            }
            if (apyxVar2.b == 62285947) {
                apyvVar = (apyv) apyxVar2.c;
            } else {
                apyvVar = apyv.a;
            }
        } else {
            apyvVar = null;
        }
        apyk c = this.d.b.c(apyvVar, this.a.h());
        if (c == apyk.COMMENT_POLL_STATUS_VOTING) {
            return;
        }
        this.d.b.k(apyvVar.i, this.b.k, apyk.COMMENT_POLL_STATUS_VOTING);
        xos xosVar = this.d.a;
        xpa xpaVar = this.a;
        audq audqVar = this.b;
        audo audoVar = (audo) this.e.build();
        acra acraVar = this.c.a;
        int i = audoVar.b;
        if ((i & 64) != 0) {
            aahd aahdVar = xosVar.b;
            apxf apxfVar = audoVar.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
            return;
        }
        if (((i & 128) == 0 || (i & 256) == 0) && (i & 8) == 0) {
            zga.b("Endpoint not filled in poll choice.");
            return;
        }
        if (c == apyk.COMMENT_POLL_STATUS_VOTE_AND_COMMENT) {
            audn audnVar = audqVar.j;
            if (audnVar == null) {
                audnVar = audn.a;
            }
            if (audnVar.b == 64099105) {
                Context context = xosVar.a;
                audn audnVar2 = audqVar.j;
                if (audnVar2 == null) {
                    audnVar2 = audn.a;
                }
                if (audnVar2.b == 64099105) {
                    aqdtVar = (aqdt) audnVar2.c;
                } else {
                    aqdtVar = aqdt.a;
                }
                ajdf.p(context, aqdtVar, xosVar.b, acraVar, xosVar.e, new xop(xosVar, xpaVar, audqVar, audoVar, acraVar), null);
                return;
            }
        }
        xosVar.a(xpaVar, audqVar, audoVar, c, acraVar);
    }
}
