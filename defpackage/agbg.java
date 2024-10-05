package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agbg implements agbr {
    private final Context a;
    private final Intent b;
    private final Intent c;
    private final atog d;

    public agbg(Context context, Intent intent, Intent intent2, aaea aaeaVar) {
        this.a = context;
        this.b = intent;
        this.c = intent2;
        this.d = aear.A(aaeaVar);
    }

    @Override // defpackage.agbr
    public final void a(apeo apeoVar, acra acraVar, agbs agbsVar, dy dyVar) {
        int i = apeoVar.b;
        if ((i & 2) != 0) {
            dyVar.g = aghv.h(this.a, b(apeoVar, this.b, acraVar));
        } else if ((i & 4) != 0) {
            dyVar.g = aghv.i(this.a, b(apeoVar, this.c, acraVar));
        }
    }

    final Intent b(apeo apeoVar, Intent intent, acra acraVar) {
        Intent intent2 = new Intent(intent);
        apxf apxfVar = apeoVar.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aghv.k(intent2, apxfVar, acraVar, (apeoVar.b & 32768) != 0);
        apxf apxfVar2 = apeoVar.g;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aghv.j(intent2, apxfVar2);
        aear.G(intent2, "CLICKED", this.d);
        apxf apxfVar3 = apeoVar.h;
        if (apxfVar3 == null) {
            apxfVar3 = apxf.a;
        }
        aear.O(intent2, apxfVar3);
        aovq aovqVar = apeoVar.o;
        if (aovqVar == null) {
            aovqVar = aovq.a;
        }
        aear.T(intent2, aovqVar);
        avpy avpyVar = apeoVar.q;
        if (avpyVar == null) {
            avpyVar = avpy.a;
        }
        if (avpyVar != null && avpyVar.b != 0) {
            intent2.putExtra("com.google.android.apps.youtube.unplugged.unplugged_notification_params_extra", avpyVar.toByteArray());
        }
        return intent2;
    }
}
