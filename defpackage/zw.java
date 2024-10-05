package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class zw {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public boolean b;

    public zw(boolean z) {
        this.b = z;
    }

    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(zo zoVar) {
        this.a.add(zoVar);
    }

    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zo) it.next()).b();
        }
    }

    public final void d(zo zoVar) {
        this.a.remove(zoVar);
    }
}
