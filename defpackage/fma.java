package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fma {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    private final Set b = new HashSet();

    private final void d() {
        c();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahfa) it.next()).z();
        }
    }

    public final String a() {
        boolean c = c();
        String uuid = UUID.randomUUID().toString();
        this.b.add(uuid);
        if (!c) {
            d();
        }
        return uuid;
    }

    public final void b(String str) {
        boolean c = c();
        this.b.remove(str);
        if (c() != c) {
            d();
        }
    }

    public final boolean c() {
        return !this.b.isEmpty();
    }
}
