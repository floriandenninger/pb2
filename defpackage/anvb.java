package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anvb implements anwy {
    private volatile Set b = null;
    private volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public anvb(Collection collection) {
        this.a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anvb b(Collection collection) {
        return new anvb((Set) collection);
    }

    private final synchronized void d() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.add(((anwy) it.next()).a());
        }
        this.a = null;
    }

    @Override // defpackage.anwy
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(anwy anwyVar) {
        if (this.b == null) {
            this.a.add(anwyVar);
        } else {
            this.b.add(anwyVar.a());
        }
    }
}
