package defpackage;

import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mex implements View.OnClickListener {
    final /* synthetic */ wzq a;
    final /* synthetic */ aahd b;
    final /* synthetic */ mez c;

    public mex(mez mezVar, wzq wzqVar, aahd aahdVar) {
        this.c = mezVar;
        this.a = wzqVar;
        this.b = aahdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.d(this.c.e)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c.e);
        hashMap.put("shopping_drawer_ad_playing", Boolean.valueOf(this.c.d));
        mez mezVar = this.c;
        athe atheVar = mezVar.e;
        if (atheVar == null || (atheVar.b & 1) == 0) {
            return;
        }
        hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{mezVar.c});
        aahd aahdVar = this.b;
        apxf apxfVar = this.c.e.d;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, hashMap);
    }
}
