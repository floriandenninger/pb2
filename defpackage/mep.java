package defpackage;

import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mep implements View.OnClickListener {
    final /* synthetic */ meq a;

    public mep(meq meqVar) {
        this.a = meqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        meq meqVar = this.a;
        aqbn aqbnVar = meqVar.d;
        if (aqbnVar == null || (aqbnVar.b & 16) == 0 || meqVar.b.d(aqbnVar)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a.d);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{this.a.c});
        meq meqVar2 = this.a;
        aahd aahdVar = meqVar2.a;
        apxf apxfVar = meqVar2.d.g;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, hashMap);
    }
}
