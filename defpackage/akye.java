package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class akye implements akyq {
    public final int a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public akye(int i) {
        this.a = i;
    }

    @Override // defpackage.akyq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.akyq
    public final synchronized void b(akyp akypVar) {
        if (this.b.isEmpty()) {
            e();
        }
        this.b.add(akypVar);
    }

    public final void c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((akyp) it.next()).rW(this);
        }
    }

    @Override // defpackage.akyq
    public final synchronized void d(akyp akypVar) {
        if (this.b.isEmpty()) {
            return;
        }
        this.b.remove(akypVar);
        if (this.b.isEmpty()) {
            f();
        }
    }

    protected abstract void e();

    public boolean equals(Object obj) {
        return (obj instanceof akyq) && this.a == ((akyq) obj).a();
    }

    protected abstract void f();

    public int hashCode() {
        return this.a;
    }
}
