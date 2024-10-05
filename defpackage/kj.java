package defpackage;

import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class kj extends ki {
    private fn c;

    public kj(ko koVar, WindowInsets windowInsets) {
        super(koVar, windowInsets);
        this.c = null;
    }

    @Override // defpackage.kn
    public final fn j() {
        if (this.c == null) {
            this.c = fn.d(this.a.getStableInsetLeft(), this.a.getStableInsetTop(), this.a.getStableInsetRight(), this.a.getStableInsetBottom());
        }
        return this.c;
    }

    @Override // defpackage.kn
    public final ko k() {
        return ko.q(this.a.consumeStableInsets());
    }

    @Override // defpackage.kn
    public final ko l() {
        return ko.q(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.kn
    public void m(fn fnVar) {
        this.c = fnVar;
    }

    @Override // defpackage.kn
    public final boolean n() {
        return this.a.isConsumed();
    }
}
