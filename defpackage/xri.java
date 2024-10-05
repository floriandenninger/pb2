package defpackage;

import android.text.Spanned;
import com.google.protos.youtube.api.innertube.UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xri implements aaha {
    private final xoh a;
    private final xng b;
    private final acqz c;
    private final aahv d;
    private final afsy e;

    public xri(xoh xohVar, xng xngVar, acqz acqzVar, aahv aahvVar, afsy afsyVar) {
        xohVar.getClass();
        this.a = xohVar;
        xngVar.getClass();
        this.b = xngVar;
        this.c = acqzVar;
        this.d = aahvVar;
        this.e = afsyVar;
    }

    private final acra b() {
        return this.c.mM();
    }

    private final void c(UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint, xpa xpaVar, apyv apyvVar) {
        apyj apyjVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        boolean z = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.d;
        avrz avrzVar = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.c;
        if (avrzVar == null) {
            avrzVar = avrz.a;
        }
        if (avrzVar.b != 122274699) {
            zga.b("Executed UpdateCommentDialogEndpoint with no dialog.");
            return;
        }
        if ((updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.b & 8) != 0) {
            String str = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.e;
            this.a.k = str;
            wcy.v(this.d.a(this.e.c()), str, true);
        }
        xoh xohVar = this.a;
        avrz avrzVar2 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.c;
        if (avrzVar2 == null) {
            avrzVar2 = avrz.a;
        }
        if (avrzVar2.b == 122274699) {
            apyjVar = (apyj) avrzVar2.c;
        } else {
            apyjVar = apyj.a;
        }
        aone builder = apyjVar.toBuilder();
        apyj apyjVar2 = (apyj) builder.instance;
        if ((apyjVar2.b & 8) == 0) {
            zga.b("No submit button specified for comment dialog.");
            return;
        }
        apmh apmhVar = apyjVar2.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            zga.b("No button renderer specified for comment dialog.");
            return;
        }
        apmh apmhVar2 = ((apyj) builder.instance).f;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 8192) == 0) {
            zga.b("No service endpoint specified for comment dialog.");
            return;
        }
        apmh apmhVar3 = ((apyj) builder.instance).f;
        if (apmhVar3 == null) {
            apmhVar3 = apmh.a;
        }
        aone builder2 = apmhVar3.toBuilder();
        apmh apmhVar4 = ((apyj) builder.instance).f;
        if (apmhVar4 == null) {
            apmhVar4 = apmh.a;
        }
        apmg apmgVar2 = apmhVar4.c;
        if (apmgVar2 == null) {
            apmgVar2 = apmg.a;
        }
        apmg b = xohVar.b(apmgVar2);
        builder2.copyOnWrite();
        apmh apmhVar5 = (apmh) builder2.instance;
        b.getClass();
        apmhVar5.c = b;
        apmhVar5.b |= 1;
        builder.copyOnWrite();
        apyj apyjVar3 = (apyj) builder.instance;
        apmh apmhVar6 = (apmh) builder2.build();
        apmhVar6.getClass();
        apyjVar3.f = apmhVar6;
        apyjVar3.b |= 8;
        avgg avggVar = ((apyj) builder.instance).e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        avgg avggVar2 = avggVar;
        apyj apyjVar4 = (apyj) builder.instance;
        aqyg aqygVar3 = null;
        if ((apyjVar4.b & 2) != 0) {
            aqygVar = apyjVar4.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b2 = ajcq.b(aqygVar);
        apmh apmhVar7 = ((apyj) builder.instance).f;
        if (apmhVar7 == null) {
            apmhVar7 = apmh.a;
        }
        apmg apmgVar3 = apmhVar7.c;
        if (apmgVar3 == null) {
            apmgVar3 = apmg.a;
        }
        apxf apxfVar = apmgVar3.n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        apxf apxfVar2 = apxfVar;
        apmh apmhVar8 = ((apyj) builder.instance).g;
        if (apmhVar8 == null) {
            apmhVar8 = apmh.a;
        }
        apmg apmgVar4 = apmhVar8.c;
        if (apmgVar4 == null) {
            apmgVar4 = apmg.a;
        }
        apmg apmgVar5 = apmgVar4;
        aulq aulqVar = ((apyj) builder.instance).h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aulq aulqVar2 = aulqVar;
        apyj apyjVar5 = (apyj) builder.instance;
        String str2 = apyjVar5.i;
        if ((apyjVar5.b & 2) != 0) {
            aqyg aqygVar4 = apyjVar5.d;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            aqygVar2 = aqygVar4;
        } else {
            aqygVar2 = null;
        }
        xoo xooVar = new xoo(2, avggVar2, xpaVar, apyvVar, null, b2, null, apxfVar2, null, apmgVar5, aulqVar2, str2, null, aqygVar2, (apyj) builder.build(), null);
        apyj apyjVar6 = (apyj) builder.instance;
        if ((1 & apyjVar6.b) != 0) {
            aqyg aqygVar5 = apyjVar6.c;
            aqygVar3 = aqygVar5 == null ? aqyg.a : aqygVar5;
        }
        xohVar.e(xooVar, null, ajcq.b(aqygVar3), null, false, z);
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        apjf apjfVar;
        apjf apjfVar2;
        UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint = (UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint) apxfVar.pX(UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.updateCommentDialogEndpoint);
        if (updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.d && b() != null) {
            b().I(3, new acqx(acsb.c(104381)), null);
        }
        xov xovVar = (xov) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xov.class);
        if (xovVar == null) {
            avrz avrzVar = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.c;
            if (avrzVar == null) {
                avrzVar = avrz.a;
            }
            if (avrzVar.b != 118523928) {
                c(updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint, null, null);
                return;
            }
            xng xngVar = this.b;
            avrz avrzVar2 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.c;
            if (avrzVar2 == null) {
                avrzVar2 = avrz.a;
            }
            if (avrzVar2.b == 118523928) {
                apjfVar2 = (apjf) avrzVar2.c;
            } else {
                apjfVar2 = apjf.a;
            }
            xngVar.b(apjfVar2, null);
            return;
        }
        xpa e = xovVar.e();
        avrz avrzVar3 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.c;
        if (avrzVar3 == null) {
            avrzVar3 = avrz.a;
        }
        if (avrzVar3.b != 118523928) {
            c(updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint, e, ((xnn) xovVar).d());
            return;
        }
        xng xngVar2 = this.b;
        avrz avrzVar4 = updateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.c;
        if (avrzVar4 == null) {
            avrzVar4 = avrz.a;
        }
        if (avrzVar4.b == 118523928) {
            apjfVar = (apjf) avrzVar4.c;
        } else {
            apjfVar = apjf.a;
        }
        xngVar2.b(apjfVar, e);
    }
}
