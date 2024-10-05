package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class algd implements Runnable {
    public boolean a;
    public int b;
    final /* synthetic */ BottomSheetBehavior c;
    private final View d;

    public algd(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.d = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        akn aknVar = this.c.u;
        if (aknVar == null || !aknVar.n()) {
            this.c.H(this.b);
        } else {
            jw.H(this.d, this);
        }
        this.a = false;
    }
}
