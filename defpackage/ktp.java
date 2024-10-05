package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ktp implements View.OnLayoutChangeListener {
    final /* synthetic */ ktq a;

    public ktp(ktq ktqVar) {
        this.a = ktqVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ktq ktqVar = this.a;
        ktqVar.i = i4 - i2 > i3 - i;
        ktqVar.d();
    }
}
