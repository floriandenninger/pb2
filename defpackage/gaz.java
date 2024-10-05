package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gaz implements View.OnLayoutChangeListener {
    final /* synthetic */ BottomUiContainer a;

    public gaz(BottomUiContainer bottomUiContainer) {
        this.a = bottomUiContainer;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.h(view);
        view.removeOnLayoutChangeListener(this);
    }
}
