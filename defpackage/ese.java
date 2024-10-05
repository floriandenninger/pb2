package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ese implements View.OnClickListener {
    final /* synthetic */ apqh a;
    final /* synthetic */ esi b;

    public ese(esi esiVar, apqh apqhVar) {
        this.b = esiVar;
        this.a = apqhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apqh apqhVar = this.a;
        if ((apqhVar.b & 1) != 0) {
            aahd aahdVar = this.b.b;
            apxf apxfVar = apqhVar.c;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }
}
