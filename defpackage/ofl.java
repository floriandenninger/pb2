package defpackage;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ofl implements View.OnClickListener {
    final /* synthetic */ ofm a;

    public ofl(ofm ofmVar) {
        this.a = ofmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apmp apmpVar = this.a.l;
        if (apmpVar == null || !ofm.c(apmpVar)) {
            this.a.f.i(!r4.k.isSelected());
            return;
        }
        this.a.p.E();
        HashMap hashMap = new HashMap();
        hashMap.put("ALLOW_RELOAD", true);
        aahd aahdVar = this.a.e;
        apxf apxfVar = apmpVar.l;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, hashMap);
    }
}
