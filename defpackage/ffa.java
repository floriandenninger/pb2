package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ffa implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ ffc b;

    public ffa(ffc ffcVar, View view) {
        this.b = ffcVar;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.ae = this.a.getMeasuredWidth();
        this.b.af = this.a.getMeasuredHeight();
        this.b.aH();
    }
}
