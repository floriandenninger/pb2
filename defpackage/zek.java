package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zek implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ zen b;
    final /* synthetic */ float c;
    final /* synthetic */ SwipeLayout d;

    public zek(SwipeLayout swipeLayout, View view, zen zenVar, float f) {
        this.d = swipeLayout;
        this.a = view;
        this.b = zenVar;
        this.c = f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.a.getParent() != null) {
            this.d.m(((Integer) this.b.a()).intValue(), this.c);
        }
    }
}
