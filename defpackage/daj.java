package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daj implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ cyd a;
    final /* synthetic */ dak b;

    public daj(dak dakVar, cyd cydVar) {
        this.b = dakVar;
        this.a = cydVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.b.a = true;
        cyd cydVar = this.a;
        ddn.j();
        if (cydVar.d.get()) {
            return;
        }
        ddn.k(new dai(this));
    }
}
