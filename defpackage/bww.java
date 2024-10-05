package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bww extends bwv {
    @Override // defpackage.bws, defpackage.lo
    public final void f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.bwt, defpackage.lo
    public final void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.bwt, defpackage.lo
    public final void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.bws, defpackage.lo
    public final float lH(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.bwv, defpackage.lo
    public final void ow(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.bwu, defpackage.lo
    public final void pb(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
