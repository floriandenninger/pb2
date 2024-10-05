package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xva implements View.OnClickListener {
    final /* synthetic */ aqab a;
    final /* synthetic */ xpa b;
    final /* synthetic */ xvc c;

    public xva(xvc xvcVar, aqab aqabVar, xpa xpaVar) {
        this.c = xvcVar;
        this.a = aqabVar;
        this.b = xpaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.b.g(this.a, this.b);
    }
}
