package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wiq implements Runnable {
    final /* synthetic */ Exception a;
    final /* synthetic */ wir b;

    public wiq(wir wirVar, Exception exc) {
        this.b = wirVar;
        this.a = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.b.d.iterator();
        while (it.hasNext()) {
            ((aftl) it.next()).c(this.a);
        }
        this.b.d.clear();
    }
}
