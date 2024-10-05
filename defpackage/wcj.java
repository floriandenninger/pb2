package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wcj implements Runnable {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ wck b;

    public wcj(WeakReference weakReference, wck wckVar) {
        this.a = weakReference;
        this.b = wckVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cnl cnlVar = (cnl) this.a.get();
        if (cnlVar != null) {
            cnlVar.kZ(this.b);
        }
    }
}
