package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahmr implements Runnable {
    final /* synthetic */ ViewGroup.LayoutParams a;
    final /* synthetic */ ahmt b;

    public ahmr(ahmt ahmtVar, ViewGroup.LayoutParams layoutParams) {
        this.b = ahmtVar;
        this.a = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahms ahmsVar = this.b.k;
        final ViewGroup.LayoutParams layoutParams = this.a;
        yny.A(ahmsVar, new azrw() { // from class: ahmq
            @Override // defpackage.azrw
            public final Object get() {
                return layoutParams;
            }
        }, yny.y(this.a.width, this.a.height), ViewGroup.LayoutParams.class);
    }
}
