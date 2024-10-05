package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afnh implements View.OnLayoutChangeListener {
    final /* synthetic */ afnl a;

    public afnh(afnl afnlVar) {
        this.a = afnlVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i8) {
            afnl afnlVar = this.a;
            int height = afnlVar.k == afqi.ANDROID_CREATOR ? afnlVar.a.getHeight() - 72 : afnlVar.a.getHeight();
            afnlVar.b.getLineHeight();
            int i9 = height / 2;
            yny.z(afnlVar.c, yny.n(i9), ViewGroup.LayoutParams.class);
            afnlVar.d.F(i9);
            BottomSheetBehavior bottomSheetBehavior = afnlVar.d;
            if (bottomSheetBehavior.t != 5) {
                bottomSheetBehavior.G(4);
            }
        }
    }
}
