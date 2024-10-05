package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rcs extends rdh {
    final /* synthetic */ Context a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ rdq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcs(rdq rdqVar, Context context, Bundle bundle) {
        super(rdqVar);
        this.c = rdqVar;
        this.a = context;
        this.b = bundle;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar;
        try {
            qip.an(this.a);
            rdq rdqVar = this.c;
            try {
                rcfVar = rce.asInterface(qvu.e(this.a, qvu.c, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (qvq e) {
                rdqVar.a(e, true, false);
                rcfVar = null;
            }
            rdqVar.f = rcfVar;
            if (this.c.f == null) {
                Log.w(this.c.a, "Failed to connect to measurement client.");
                return;
            }
            int a = qvu.a(this.a, ModuleDescriptor.MODULE_ID);
            InitializationParams initializationParams = new InitializationParams(44000L, Math.max(a, r2), qvu.b(this.a, ModuleDescriptor.MODULE_ID) < a, null, null, null, this.b, rqr.u(this.a));
            rcf rcfVar2 = this.c.f;
            qip.an(rcfVar2);
            rcfVar2.initialize(qve.a(this.a), initializationParams, this.f);
        } catch (Exception e2) {
            this.c.a(e2, true, false);
        }
    }
}
