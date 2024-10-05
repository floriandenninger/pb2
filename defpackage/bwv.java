package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
class bwv extends bwu {
    private static boolean a = true;

    @Override // defpackage.lo
    public void ow(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.ow(view, i);
        } else if (a) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
