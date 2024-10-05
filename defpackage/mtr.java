package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mtr implements View.OnLayoutChangeListener {
    final /* synthetic */ mts a;
    private final avgg b;

    public mtr(mts mtsVar, avgg avggVar) {
        this.a = mtsVar;
        this.b = avggVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.a.h.getWidth() > 0) {
            this.a.h.removeOnLayoutChangeListener(this);
            mts mtsVar = this.a;
            mtsVar.j = null;
            mtsVar.g(this.b);
        }
    }
}
