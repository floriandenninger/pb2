package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alme implements View.OnLayoutChangeListener {
    final /* synthetic */ View a;

    public alme(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.getVisibility();
    }
}
