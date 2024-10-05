package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ggl implements View.OnLayoutChangeListener {
    final /* synthetic */ ggm a;

    public ggl(ggm ggmVar) {
        this.a = ggmVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int i11 = i8 - i6;
        if (i9 == i7 - i5 && i10 == i11) {
            return;
        }
        ggm ggmVar = this.a;
        if (i10 <= 0 || i9 <= 0) {
            ggmVar.a = 0.0f;
            return;
        }
        ggmVar.a = i9 / i10;
        ggmVar.b = new Rect(0, 0, i9, i10);
        ggmVar.h();
    }
}
