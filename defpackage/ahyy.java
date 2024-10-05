package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahyy implements View.OnLayoutChangeListener {
    final /* synthetic */ ahyz a;

    public ahyy(ahyz ahyzVar) {
        this.a = ahyzVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ahyz ahyzVar = this.a;
        ahyzVar.i(ahyzVar.a, false);
        this.a.removeOnLayoutChangeListener(this);
    }
}
