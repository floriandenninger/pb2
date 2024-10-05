package defpackage;

import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mek implements View.OnClickListener {
    final /* synthetic */ mel a;
    private final /* synthetic */ int b;

    public mek(mel melVar, int i) {
        this.b = i;
        this.a = melVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            mel melVar = this.a;
            auta autaVar = melVar.f;
            if (autaVar == null || (autaVar.b & 512) == 0) {
                return;
            }
            aahd aahdVar = melVar.b;
            apxf apxfVar = autaVar.j;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
            return;
        }
        mel melVar2 = this.a;
        auta autaVar2 = melVar2.f;
        if (autaVar2 != null) {
            if ((autaVar2.b & 64) != 0) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", melVar2.f);
                hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{melVar2.d});
                aahd aahdVar2 = melVar2.b;
                apxf apxfVar2 = melVar2.f.h;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar2.c(apxfVar2, hashMap);
            }
            auta autaVar3 = melVar2.f;
            if ((autaVar3.b & 32) != 0) {
                melVar2.c.I(3, new acqx(autaVar3.g.I()), null);
            }
            aabq aabqVar = melVar2.e;
            if (aabqVar != null) {
                if (melVar2.h) {
                    aabqVar.o();
                } else if (melVar2.g) {
                    aabqVar.j(-1, true);
                } else {
                    aabqVar.k(-1);
                }
            }
        }
    }
}
