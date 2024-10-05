package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dme implements dmf {
    final int a;
    final Interpolator b;

    public dme(int i, Interpolator interpolator) {
        this.a = i;
        this.b = interpolator;
    }

    @Override // defpackage.dmf
    public final dns a(dnn dnnVar) {
        return new dnq(this.a, dnnVar, this.b);
    }
}
