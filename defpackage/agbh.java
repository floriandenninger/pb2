package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.protos.youtube.api.innertube.RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agbh implements agbr {
    private final Context a;
    private final Intent b;
    private final atog c;

    public agbh(Context context, Intent intent, aaea aaeaVar) {
        this.a = context;
        this.b = intent;
        this.c = aear.A(aaeaVar);
    }

    @Override // defpackage.agbr
    public final void a(apeo apeoVar, acra acraVar, agbs agbsVar, dy dyVar) {
        if (this.b == null || (apeoVar.b & 16) == 0) {
            return;
        }
        apxf apxfVar = apeoVar.i;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (apxfVar.pY(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint)) {
            Context context = this.a;
            Intent intent = new Intent(this.b);
            apxf apxfVar2 = apeoVar.i;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aear.O(intent, apxfVar2);
            asuh asuhVar = apeoVar.u;
            if (asuhVar == null) {
                asuhVar = asuh.b;
            }
            aear.N(intent, asuhVar);
            if ((apeoVar.b & 32768) != 0) {
                aear.R(intent, ((acqq) acraVar).g);
                intent.putExtra("interaction_type", 2);
            }
            aear.G(intent, "DISMISSED", this.c);
            aovq aovqVar = apeoVar.o;
            if (aovqVar == null) {
                aovqVar = aovq.a;
            }
            aear.T(intent, aovqVar);
            dyVar.m(aghv.i(context, intent));
        }
    }
}
