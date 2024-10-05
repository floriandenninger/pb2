package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajdl implements aaha {
    private final Context a;
    private final aahd b;
    private final acqz c;
    private final ajut d;
    private final ajdh e;
    private final zbw f;

    public ajdl(Context context, aahd aahdVar, acqz acqzVar, ajut ajutVar, ajdh ajdhVar, zbw zbwVar) {
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
        acqzVar.getClass();
        this.c = acqzVar;
        this.d = ajutVar;
        this.e = ajdhVar;
        this.f = zbwVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqdt aqdtVar;
        ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint confirmDialogEndpointOuterClass$ConfirmDialogEndpoint = (ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint) apxfVar.pX(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint);
        if (((Activity) this.a).isFinishing()) {
            return;
        }
        if ((confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.b & 1) != 0) {
            aqds aqdsVar = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.c;
            if (aqdsVar == null) {
                aqdsVar = aqds.a;
            }
            aqdtVar = aqdsVar.c;
            if (aqdtVar == null) {
                aqdtVar = aqdt.a;
            }
        } else {
            aqdtVar = null;
        }
        aqdt aqdtVar2 = aqdtVar;
        acra mM = this.c.mM();
        mM.D(new acqx(aqdtVar2.n));
        ajdf.h(this.a, aqdtVar2, this.b, mM, this.e, true, true, null, yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), this.d, this.f);
    }
}
