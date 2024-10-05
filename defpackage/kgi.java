package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kgi implements View.OnLayoutChangeListener {
    final /* synthetic */ kgj a;
    private final int b;
    private int c;

    public kgi(kgj kgjVar) {
        this.a = kgjVar;
        this.b = kgjVar.getResources().getDimensionPixelSize(R.dimen.app_related_end_screen_item_padding);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        if (this.c != i9) {
            this.c = i9;
            kgj kgjVar = this.a;
            kgjVar.a = (i9 - kgjVar.e) - this.b;
            kgjVar.j(kgjVar.c.a, false, 0);
        }
    }
}
