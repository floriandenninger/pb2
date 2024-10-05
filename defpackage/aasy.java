package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aasy {
    private final PackageManager a;
    private final aadw b;

    public aasy(aadw aadwVar, PackageManager packageManager) {
        this.b = aadwVar;
        this.a = packageManager;
    }

    public final amru a() {
        apwy b = this.b.b();
        if (b != null) {
            apdc apdcVar = b.h;
            if (apdcVar == null) {
                apdcVar = apdc.a;
            }
            if (apdcVar.b.size() > 0) {
                apdc apdcVar2 = b.h;
                if (apdcVar2 == null) {
                    apdcVar2 = apdc.a;
                }
                aony<apdd> aonyVar = apdcVar2.b;
                amrp amrpVar = new amrp();
                for (apdd apddVar : aonyVar) {
                    if (!this.a.queryIntentActivities(new Intent().setPackage(apddVar.c), 65536).isEmpty()) {
                        amrpVar.h(Integer.valueOf(apddVar.b));
                    }
                }
                return amrpVar.g();
            }
        }
        return amru.q();
    }
}
