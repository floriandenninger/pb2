package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iov implements View.OnLayoutChangeListener {
    final /* synthetic */ iox a;

    public iov(iox ioxVar) {
        this.a = ioxVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i8) {
            iox ioxVar = this.a;
            int height = ioxVar.a.getHeight();
            yny.z(ioxVar.c, yny.n((ioxVar.i == avuu.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER || ioxVar.k) ? height / 2 : height - (ioxVar.b.getLineHeight() * 4)), ViewGroup.LayoutParams.class);
            ioxVar.d.F(height / 2);
            BottomSheetBehavior bottomSheetBehavior = ioxVar.d;
            if (bottomSheetBehavior.t != 5) {
                bottomSheetBehavior.G(4);
            }
        }
    }
}
