package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alga implements lf {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public alga(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    @Override // defpackage.lf
    public final boolean a(View view) {
        this.b.G(this.a);
        return true;
    }
}
