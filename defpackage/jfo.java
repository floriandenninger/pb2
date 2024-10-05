package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jfo implements View.OnLayoutChangeListener {
    final /* synthetic */ jfp a;

    public jfo(jfp jfpVar) {
        this.a = jfpVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 != i8 - i6) {
            this.a.b();
        }
    }
}
