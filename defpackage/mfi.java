package defpackage;

import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mfi implements View.OnClickListener {
    final /* synthetic */ mfm a;

    public mfi(mfm mfmVar) {
        this.a = mfmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mfm mfmVar = this.a;
        aqdd aqddVar = mfmVar.d;
        if (aqddVar == null || (aqddVar.b & 128) == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", mfmVar.d);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{mfmVar.c});
        aahd aahdVar = mfmVar.a;
        apxf apxfVar = mfmVar.d.i;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, hashMap);
    }
}
