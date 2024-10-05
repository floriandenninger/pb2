package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgb implements View.OnClickListener {
    final /* synthetic */ awcf a;
    final /* synthetic */ lgd b;

    public lgb(lgd lgdVar, awcf awcfVar) {
        this.b = lgdVar;
        this.a = awcfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        awcf awcfVar = this.a;
        if ((awcfVar.b & 8) != 0) {
            aahd aahdVar = this.b.a;
            apxf apxfVar = awcfVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }
}
