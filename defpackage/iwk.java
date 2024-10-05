package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iwk implements View.OnLayoutChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ iwn b;

    public iwk(iwn iwnVar, int i) {
        this.b = iwnVar;
        this.a = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.b.ah.getHeight() != this.a) {
            this.b.ah.removeOnLayoutChangeListener(this);
            this.b.aJ(false);
        }
    }
}
