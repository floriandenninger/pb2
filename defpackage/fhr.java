package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fhr extends fhp {
    public ywf a;
    public aadw b;

    @Override // defpackage.fhp, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && Build.VERSION.SDK_INT >= 26) {
            a(context);
            if (this.b.b() != null) {
                asvu asvuVar = this.b.b().e;
                if (asvuVar == null) {
                    asvuVar = asvu.a;
                }
                if (asvuVar.y) {
                    this.a.a();
                }
            }
        }
    }
}
