package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kuq implements View.OnLayoutChangeListener {
    final /* synthetic */ kur a;

    public kuq(kur kurVar) {
        this.a = kurVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int i11 = i8 - i6;
        if (i9 == i7 - i5 && i10 == i11) {
            return;
        }
        kur kurVar = this.a;
        float f = i9 / i10;
        kurVar.e = f;
        kurVar.c.a = f;
        kurVar.r();
    }
}
