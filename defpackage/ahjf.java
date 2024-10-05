package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahjf implements Runnable {
    final /* synthetic */ FrameLayout.LayoutParams a;
    final /* synthetic */ ahjo b;

    public ahjf(ahjo ahjoVar, FrameLayout.LayoutParams layoutParams) {
        this.b = ahjoVar;
        this.a = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahjm ahjmVar = this.b.j;
        final FrameLayout.LayoutParams layoutParams = this.a;
        yny.A(ahjmVar, new azrw() { // from class: ahje
            @Override // defpackage.azrw
            public final Object get() {
                return layoutParams;
            }
        }, yny.y(this.a.width, this.a.height), ViewGroup.LayoutParams.class);
    }
}
