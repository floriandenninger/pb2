package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ackr implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ LinearLayout b;
    final /* synthetic */ acks c;

    public ackr(acks acksVar, View view, LinearLayout linearLayout) {
        this.c = acksVar;
        this.a = view;
        this.b = linearLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        PopupWindow popupWindow = this.c.g;
        View view = this.a;
        popupWindow.update(view, 0, acks.c(this.b, view), -2, -2);
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
