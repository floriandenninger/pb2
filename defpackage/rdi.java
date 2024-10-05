package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rdi extends rdh {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ rdp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdi(rdp rdpVar, Bundle bundle, Activity activity) {
        super(rdpVar.a);
        this.c = rdpVar;
        this.a = bundle;
        this.b = activity;
    }

    @Override // defpackage.rdh
    public final void a() {
        Bundle bundle;
        if (this.a != null) {
            bundle = new Bundle();
            if (this.a.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.a.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        rcf rcfVar = this.c.a.f;
        qip.an(rcfVar);
        rcfVar.onActivityCreated(qve.a(this.b), bundle, this.g);
    }
}
