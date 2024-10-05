package defpackage;

import android.view.WindowInsets;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class kl extends kk {
    private fn c;
    private fn f;
    private fn g;

    public kl(ko koVar, WindowInsets windowInsets) {
        super(koVar, windowInsets);
        this.c = null;
        this.f = null;
        this.g = null;
    }

    @Override // defpackage.ki, defpackage.kn
    public final ko b(int i, int i2, int i3, int i4) {
        return ko.q(this.a.inset(i, i2, i3, i4));
    }

    @Override // defpackage.kj, defpackage.kn
    public final void m(fn fnVar) {
    }

    @Override // defpackage.kn
    public final fn q() {
        if (this.f == null) {
            this.f = fn.e(this.a.getMandatorySystemGestureInsets());
        }
        return this.f;
    }

    @Override // defpackage.kn
    public final fn r() {
        if (this.c == null) {
            this.c = fn.e(this.a.getSystemGestureInsets());
        }
        return this.c;
    }

    @Override // defpackage.kn
    public final fn s() {
        if (this.g == null) {
            this.g = fn.e(this.a.getTappableElementInsets());
        }
        return this.g;
    }
}
