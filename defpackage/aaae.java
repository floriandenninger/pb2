package defpackage;

import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaae implements View.OnClickListener {
    final /* synthetic */ arhg a;
    final /* synthetic */ aabq b;
    final /* synthetic */ aaaf c;
    private final /* synthetic */ int d;

    public aaae(arhg arhgVar, aaaf aaafVar, aabq aabqVar, int i) {
        this.d = i;
        this.a = arhgVar;
        this.c = aaafVar;
        this.b = aabqVar;
    }

    public aaae(arhg arhgVar, aabq aabqVar, aaaf aaafVar, int i) {
        this.d = i;
        this.a = arhgVar;
        this.b = aabqVar;
        this.c = aaafVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.d != 0) {
            if ((this.a.b & 2) != 0) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
                hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{this.c.j});
                aahd aahdVar = this.b.w;
                apxf apxfVar = this.a.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, hashMap);
                return;
            }
            return;
        }
        if ((this.a.b & 128) == 0 || !this.b.o) {
            return;
        }
        HashMap hashMap2 = new HashMap(2);
        hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
        hashMap2.put("MacrosConverters.CustomConvertersKey", new afxe[]{this.c.j});
        aahd aahdVar2 = this.b.w;
        apxf apxfVar2 = this.a.i;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aahdVar2.c(apxfVar2, hashMap2);
    }
}
