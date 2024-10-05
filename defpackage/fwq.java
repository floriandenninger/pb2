package defpackage;

import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fwq implements ajyc {
    private final ypa a;
    private final acra b;

    public fwq(ypa ypaVar, acra acraVar) {
        this.a = ypaVar;
        this.b = acraVar;
    }

    @Override // defpackage.ajyc
    public final void oC(aong aongVar) {
        if (aongVar != null) {
            if ((((apmg) aongVar.instance).b & 8192) != 0) {
                this.a.d(new fcb());
                acra acraVar = this.b;
                apxf apxfVar = ((apmg) aongVar.instance).n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                acraVar.I(3, new acqx(apxfVar.c), null);
            }
            if (this.b != null) {
                apxf apxfVar2 = ((apmg) aongVar.instance).o;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                if (apxfVar2.pY(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
                    acra acraVar2 = this.b;
                    apxf apxfVar3 = ((apmg) aongVar.instance).o;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                    acraVar2.I(3, new acqx(apxfVar3.c), null);
                }
            }
        }
    }
}
