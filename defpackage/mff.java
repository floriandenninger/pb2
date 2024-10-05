package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mff extends mel implements wnb {
    public mff(ajjz ajjzVar, ajuw ajuwVar, aahd aahdVar, acra acraVar, Context context, aabq aabqVar, met metVar) {
        super(ajjzVar, ajuwVar, aahdVar, acraVar, context, aabqVar, metVar);
    }

    @Override // defpackage.wmz
    public final void h(xad xadVar) {
        aabq aabqVar;
        this.g = false;
        if (this.f != null && xadVar.a() == xce.USER_SKIPPED && (aabqVar = this.e) != null) {
            aabqVar.b();
        }
        auta autaVar = this.f;
        if (autaVar == null || (autaVar.b & 4096) == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.f);
        aahd aahdVar = this.b;
        apxf apxfVar = this.f.m;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, hashMap);
    }

    @Override // defpackage.wnb
    public final boolean i(String str, aqde aqdeVar, ashd ashdVar) {
        auta autaVar;
        if ((aqdeVar.b & 4) != 0) {
            autaVar = aqdeVar.e;
            if (autaVar == null) {
                autaVar = auta.a;
            }
        } else {
            autaVar = null;
        }
        this.f = autaVar;
        auta autaVar2 = this.f;
        return autaVar2 != null && autaVar2.f.size() > 0;
    }
}
