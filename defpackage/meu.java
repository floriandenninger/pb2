package defpackage;

import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class meu implements View.OnClickListener {
    final /* synthetic */ wzq a;
    final /* synthetic */ aahd b;
    final /* synthetic */ mev c;

    public meu(mev mevVar, wzq wzqVar, aahd aahdVar) {
        this.c = mevVar;
        this.a = wzqVar;
        this.b = aahdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aqdh aqdhVar = this.c.a;
        if (aqdhVar == null || (aqdhVar.b & 4) == 0 || this.a.d(aqdhVar)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c.a);
        aahd aahdVar = this.b;
        apxf apxfVar = this.c.a.e;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, hashMap);
    }
}
