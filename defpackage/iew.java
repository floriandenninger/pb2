package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iew implements aaha {
    private final Context a;
    private final aahd b;
    private final acra c;
    private final ajut d;

    public iew(Context context, aahd aahdVar, acra acraVar, ajut ajutVar) {
        context.getClass();
        this.a = context;
        aahdVar.getClass();
        this.b = aahdVar;
        this.c = acraVar;
        this.d = ajutVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        aqdt aqdtVar;
        Context context = this.a;
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint confirmDialogEndpointOuterClass$ConfirmDialogEndpoint = (ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint) apxfVar.pX(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint);
        Context context2 = this.a;
        aqds aqdsVar = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.c;
        if (aqdsVar == null) {
            aqdsVar = aqds.a;
        }
        if ((aqdsVar.b & 1) != 0) {
            aqds aqdsVar2 = confirmDialogEndpointOuterClass$ConfirmDialogEndpoint.c;
            if (aqdsVar2 == null) {
                aqdsVar2 = aqds.a;
            }
            aqdtVar = aqdsVar2.c;
            if (aqdtVar == null) {
                aqdtVar = aqdt.a;
            }
        } else {
            aqdtVar = null;
        }
        ajdf.o(context2, aqdtVar, this.b, this.c, true, null, yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag"), this.d);
    }
}
