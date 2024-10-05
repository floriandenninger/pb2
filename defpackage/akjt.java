package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akjt implements View.OnLayoutChangeListener {
    final /* synthetic */ akjv a;

    public akjt(akjv akjvVar) {
        this.a = akjvVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BottomSheetBehavior x = BottomSheetBehavior.x((View) this.a.ai.getParent());
        if (x != null) {
            x.G(3);
            x.r = true;
        }
        this.a.aj.removeOnLayoutChangeListener(this);
    }
}
