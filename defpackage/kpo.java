package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kpo implements View.OnClickListener {
    final /* synthetic */ kpr a;
    private final int b;

    public kpo(kpr kprVar, int i) {
        this.a = kprVar;
        this.b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kpr kprVar = this.a;
        int i = this.b;
        boolean z = !view.isSelected();
        kprVar.j(i, z);
        if (kprVar.f) {
            if (z) {
                int i2 = kprVar.g;
                if (i < i2) {
                    kprVar.j(i2, false);
                } else {
                    for (int i3 = 0; i3 < kprVar.g; i3++) {
                        kprVar.j(i3, false);
                    }
                }
            }
            kprVar.n();
            return;
        }
        kprVar.f();
    }
}
