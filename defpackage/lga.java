package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lga implements View.OnClickListener {
    final /* synthetic */ awdd a;
    final /* synthetic */ lgd b;

    public lga(lgd lgdVar, awdd awddVar) {
        this.b = lgdVar;
        this.a = awddVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        awdd awddVar = this.a;
        if ((awddVar.b & 16) != 0) {
            aahd aahdVar = this.b.a;
            apxf apxfVar = awddVar.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }
}
