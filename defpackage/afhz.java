package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afhz implements afhd {
    public final Set a = new CopyOnWriteArraySet();

    @Override // defpackage.afhd
    public final void a(Exception exc) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((afia) it.next()).b(exc);
        }
    }

    @Override // defpackage.afhd
    public final void b(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((afia) it.next()).c(i);
        }
    }

    @Override // defpackage.afhd
    @Deprecated
    public final void c(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((afia) it.next()).rP(j);
        }
    }

    public final void d(afia afiaVar) {
        this.a.add(afiaVar);
    }

    public final void e(afia afiaVar) {
        this.a.remove(afiaVar);
    }
}
