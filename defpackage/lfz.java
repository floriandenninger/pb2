package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lfz implements View.OnClickListener {
    final /* synthetic */ lgd a;
    private final /* synthetic */ int b;

    public lfz(lgd lgdVar, int i) {
        this.b = i;
        this.a = lgdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            lgd lgdVar = this.a;
            lgdVar.b = !lgdVar.b;
            lgdVar.f();
        } else {
            lgd lgdVar2 = this.a;
            aahd aahdVar = lgdVar2.a;
            apxf apxfVar = lgdVar2.c.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
        }
    }
}
