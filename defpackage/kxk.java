package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kxk implements View.OnClickListener {
    public final /* synthetic */ kxu a;
    private final /* synthetic */ int b;

    public /* synthetic */ kxk(kxu kxuVar, int i) {
        this.b = i;
        this.a = kxuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.y.performClick();
            return;
        }
        if (i == 1) {
            this.a.x.performClick();
            return;
        }
        kxu kxuVar = this.a;
        kxuVar.d.onClick(view);
        fyj fyjVar = new fyj();
        fyjVar.z(kxuVar.s);
        bwh.b(kxuVar.f, fyjVar);
        kxuVar.g();
    }
}
