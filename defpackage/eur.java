package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class eur implements euw {
    protected final azrw a;
    private final int b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final Set f = new HashSet();
    private final amph g = amre.g(16);
    private final ReferenceQueue h = new ReferenceQueue();
    private final Queue i = new ArrayDeque();

    public eur(azrw azrwVar, int i, boolean z, boolean z2, String str) {
        this.a = azrwVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    private final void g() {
        if (this.c) {
            Reference poll = this.h.poll();
            while (poll != null) {
                if (poll instanceof WeakReference) {
                    this.i.add((WeakReference) poll);
                }
                poll = this.h.poll();
            }
        }
    }

    protected abstract int a();

    @Override // defpackage.euw
    public void b(eux euxVar) {
        if (this.c) {
            this.g.remove(euxVar);
        }
        if (this.d) {
            this.f.add(euxVar);
        }
    }

    @Override // defpackage.euw
    public void c(List list) {
        if (this.c) {
            g();
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                eux euxVar = (eux) this.g.a().get((WeakReference) it.next());
                if (euxVar != null) {
                    list.add(euxVar);
                }
            }
            this.i.clear();
        }
    }

    @Override // defpackage.euw
    public void d(eux euxVar, String str, Object obj, boolean z) {
        WeakReference weakReference;
        if (z) {
            return;
        }
        if (this.c && ((weakReference = (WeakReference) this.g.get(euxVar)) == null || weakReference.get() != obj)) {
            if (obj != null) {
                this.g.put(euxVar, new WeakReference(obj, this.h));
                if (weakReference != null) {
                    ((viz) ((aksl) this.a.get()).c.get()).b(ammx.d(str), this.e);
                }
            } else if (weakReference != null) {
                this.g.remove(euxVar);
                ((viz) ((aksl) this.a.get()).d.get()).b(ammx.d(str), this.e);
            }
        }
        if (this.d) {
            this.f.remove(euxVar);
        }
    }

    @Override // defpackage.euw
    public final boolean e() {
        g();
        return (this.b != 0 && a() > this.b) || (this.i.isEmpty() ^ true);
    }

    @Override // defpackage.euw
    public final boolean f(eux euxVar) {
        if (this.d) {
            return this.f.contains(euxVar);
        }
        return false;
    }
}
