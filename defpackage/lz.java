package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lz implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ mg c;
    private final /* synthetic */ int d;

    public lz(mg mgVar, View view, View view2, int i) {
        this.d = i;
        this.c = mgVar;
        this.a = view;
        this.b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            mg.a(this.c.q, this.a, this.b);
        } else {
            mg.a(this.c.f, this.a, this.b);
        }
    }
}
