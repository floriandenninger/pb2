package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lfh implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ lfi b;

    public lfh(lfi lfiVar, View view) {
        this.b = lfiVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        wcy.q(this.b.d, 0, 0, (int) this.b.a.getDimension(R.dimen.dropdown_switch_button_tap_area_margin_right), 0);
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
