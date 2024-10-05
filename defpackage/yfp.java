package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class yfp implements aaha {
    private final Context a;
    private final ygc b;
    private final aahd c;
    private final acra d;

    public yfp(Context context, ygc ygcVar, aahd aahdVar, acra acraVar) {
        this.a = context;
        this.b = ygcVar;
        this.c = aahdVar;
        this.d = acraVar;
    }

    @Override // defpackage.aaha
    public void kE(apxf apxfVar, Map map) {
        asjh asjhVar;
        UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint = (UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) apxfVar.pX(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint);
        avmu avmuVar = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
        if (avmuVar == null) {
            avmuVar = avmu.a;
        }
        aqdt aqdtVar = null;
        if (avmuVar.b == 86135402) {
            avmu avmuVar2 = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
            if (avmuVar2 == null) {
                avmuVar2 = avmu.a;
            }
            if (avmuVar2.b == 86135402) {
                asjhVar = (asjh) avmuVar2.c;
            } else {
                asjhVar = asjh.a;
            }
        } else {
            asjhVar = null;
        }
        if (asjhVar == null) {
            avmu avmuVar3 = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
            if (avmuVar3 == null) {
                avmuVar3 = avmu.a;
            }
            if (avmuVar3.b == 64099105) {
                avmu avmuVar4 = unlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.b;
                if (avmuVar4 == null) {
                    avmuVar4 = avmu.a;
                }
                if (avmuVar4.b == 64099105) {
                    aqdtVar = (aqdt) avmuVar4.c;
                } else {
                    aqdtVar = aqdt.a;
                }
            }
            aqdt aqdtVar2 = aqdtVar;
            if (aqdtVar2 != null) {
                ajdf.c(this.a, aqdtVar2, this.c, this.d, (ajde) yjj.u(map, "confirmDialogControllerListener", ajde.class), null);
                return;
            }
            return;
        }
        this.b.e(asjhVar);
    }
}
