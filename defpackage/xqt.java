package defpackage;

import android.text.Spanned;
import com.google.protos.youtube.api.innertube.CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xqt implements aaha {
    private final xoh a;
    private final acqz b;

    public xqt(xoh xohVar, acqz acqzVar) {
        this.a = xohVar;
        this.b = acqzVar;
    }

    private final acra b() {
        return this.b.mM();
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        awjz awjzVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint = (CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint) apxfVar.pX(CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.createCommentDialogEndpoint);
        aqyg aqygVar3 = null;
        if (createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.d && b() != null) {
            b().q(new acqx(acsb.c(103918)), null);
            b().I(3, new acqx(acsb.c(104381)), null);
        }
        xoh xohVar = this.a;
        aqgs aqgsVar = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.b;
        if (aqgsVar == null) {
            aqgsVar = aqgs.a;
        }
        if (aqgsVar.b != 122274699) {
            zga.b("No comment dialog renderer specified for CreateCommentDialogEndpoint.");
            return;
        }
        aqgs aqgsVar2 = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.b;
        if (aqgsVar2 == null) {
            aqgsVar2 = aqgs.a;
        }
        apyj apyjVar = aqgsVar2.b == 122274699 ? (apyj) aqgsVar2.c : apyj.a;
        apmh apmhVar = apyjVar.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) == 0) {
            zga.b("No submit button renderer specified for CreateCommentDialogEndpoint.");
            return;
        }
        apmh apmhVar2 = apyjVar.f;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 8192) == 0) {
            zga.b("No service endpoint on submit button specified for CreateCommentDialogEndpoint.");
            return;
        }
        Long d = xohVar.m.d();
        if (xohVar.a() != null) {
            apmh apmhVar3 = apyjVar.f;
            if (apmhVar3 == null) {
                apmhVar3 = apmh.a;
            }
            aone builder = apmhVar3.toBuilder();
            apmh apmhVar4 = apyjVar.f;
            if (apmhVar4 == null) {
                apmhVar4 = apmh.a;
            }
            apmg apmgVar2 = apmhVar4.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmg b = xohVar.b(apmgVar2);
            builder.copyOnWrite();
            apmh apmhVar5 = (apmh) builder.instance;
            b.getClass();
            apmhVar5.c = b;
            apmhVar5.b |= 1;
            apmh apmhVar6 = (apmh) builder.build();
            aone builder2 = apyjVar.toBuilder();
            builder2.copyOnWrite();
            apyj apyjVar2 = (apyj) builder2.instance;
            apmhVar6.getClass();
            apyjVar2.f = apmhVar6;
            apyjVar2.b |= 8;
            apyjVar = (apyj) builder2.build();
        }
        awkb awkbVar = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.c;
        if (awkbVar == null) {
            awkbVar = awkb.a;
        }
        if ((awkbVar.b & 1) != 0) {
            awkb awkbVar2 = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.c;
            if (awkbVar2 == null) {
                awkbVar2 = awkb.a;
            }
            awjz awjzVar2 = awkbVar2.c;
            if (awjzVar2 == null) {
                awjzVar2 = awjz.a;
            }
            awjzVar = awjzVar2;
        } else {
            awjzVar = null;
        }
        boolean z = createCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.d;
        avgg avggVar = apyjVar.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        avgg avggVar2 = avggVar;
        if ((apyjVar.b & 2) != 0) {
            aqygVar = apyjVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b2 = ajcq.b(aqygVar);
        apmh apmhVar7 = apyjVar.f;
        if (apmhVar7 == null) {
            apmhVar7 = apmh.a;
        }
        apmg apmgVar3 = apmhVar7.c;
        if (apmgVar3 == null) {
            apmgVar3 = apmg.a;
        }
        apxf apxfVar2 = apmgVar3.n;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        apxf apxfVar3 = apxfVar2;
        apmh apmhVar8 = apyjVar.g;
        if (apmhVar8 == null) {
            apmhVar8 = apmh.a;
        }
        apmg apmgVar4 = apmhVar8.c;
        if (apmgVar4 == null) {
            apmgVar4 = apmg.a;
        }
        apmg apmgVar5 = apmgVar4;
        aulq aulqVar = apyjVar.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aulq aulqVar2 = aulqVar;
        String str = apyjVar.i;
        if ((apyjVar.b & 2) != 0) {
            aqyg aqygVar4 = apyjVar.d;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            aqygVar2 = aqygVar4;
        } else {
            aqygVar2 = null;
        }
        xoo xooVar = new xoo(1, avggVar2, null, null, null, b2, awjzVar, apxfVar3, null, apmgVar5, aulqVar2, str, null, aqygVar2, apyjVar, null);
        if ((apyjVar.b & 1) != 0 && (aqygVar3 = apyjVar.c) == null) {
            aqygVar3 = aqyg.a;
        }
        xohVar.e(xooVar, null, aahk.a(aqygVar3, xohVar.b, false), d, false, z);
    }
}
