package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dtp implements Runnable {
    public final drp a;
    final /* synthetic */ dtr b;
    private final View c;

    public dtp(dtr dtrVar, drp drpVar, View view) {
        this.b = dtrVar;
        this.a = drpVar;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.l = this.a.a(this.c);
    }
}
