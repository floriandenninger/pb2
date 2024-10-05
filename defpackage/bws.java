package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
class bws extends lo {
    private static boolean a = true;

    @Override // defpackage.lo
    public void f(View view, float f) {
        if (a) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // defpackage.lo
    public float lH(View view) {
        if (a) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }
}
