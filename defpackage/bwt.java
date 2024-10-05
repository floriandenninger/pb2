package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
class bwt extends bws {
    private static boolean a = true;
    private static boolean b = true;

    @Override // defpackage.lo
    public void h(View view, Matrix matrix) {
        if (a) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    @Override // defpackage.lo
    public void i(View view, Matrix matrix) {
        if (b) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
    }
}
