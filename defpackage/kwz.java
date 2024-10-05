package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kwz implements View.OnClickListener {
    public final /* synthetic */ kxj a;
    private final /* synthetic */ int b;

    public /* synthetic */ kwz(kxj kxjVar, int i) {
        this.b = i;
        this.a = kxjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.y.performClick();
            return;
        }
        kxj kxjVar = this.a;
        kxjVar.d.onClick(view);
        fyj fyjVar = new fyj();
        fyjVar.z(kxjVar.t);
        bwh.b(kxjVar.f, fyjVar);
        kxjVar.g();
    }
}
