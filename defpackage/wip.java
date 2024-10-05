package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wip implements Runnable {
    final /* synthetic */ wir a;
    private final /* synthetic */ int b;

    public wip(wir wirVar, int i) {
        this.b = i;
        this.a = wirVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            Iterator it = this.a.d.iterator();
            while (it.hasNext()) {
                ((aftl) it.next()).a();
            }
            this.a.d.clear();
            return;
        }
        Iterator it2 = this.a.d.iterator();
        while (it2.hasNext()) {
            ((aftl) it2.next()).b();
        }
        this.a.d.clear();
    }
}
