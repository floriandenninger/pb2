package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alfw implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ BottomSheetBehavior c;

    public alfw(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.a = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.I(this.a, this.b);
    }
}
