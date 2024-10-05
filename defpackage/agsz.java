package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agsz {
    private final agsy a;
    private final HashSet b;
    private volatile agnw c;
    private volatile int d;

    public agsz(agsy agsyVar, HashSet hashSet) {
        this.a = agsyVar;
        this.b = new HashSet(hashSet);
    }

    final synchronized int a() {
        return this.b.size();
    }

    public final agnw b() {
        if (this.c == null) {
            this.c = new agnw(this.a.a(), a(), this.d);
        }
        return this.c;
    }

    public final synchronized void c(String str) {
        zhq.m(str);
        this.b.add(str);
        this.a.d(str);
    }

    public final synchronized void d(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        this.c = null;
    }

    public final synchronized boolean f(agnz agnzVar) {
        String t = agtw.t(agnzVar.f);
        int i = 0;
        if (!this.b.contains(t)) {
            return false;
        }
        if (!agnzVar.c()) {
            this.b.remove(t);
            if (this.b.isEmpty()) {
                this.a.c().clear();
            }
        }
        int a = this.a.a();
        if (a > 0) {
            int size = a - this.b.size();
            if (size == a) {
                this.d = 100;
            } else {
                int i2 = (size * 100) / a;
                if (agnzVar.c()) {
                    i2 += agnzVar.a() / a;
                }
                if (i2 != 0) {
                    i = i2;
                } else if (agnzVar.d > 0) {
                    i = 1;
                }
                this.d = Math.min(99, i);
            }
        }
        this.c = null;
        return true;
    }

    public final synchronized void g(agnz agnzVar) {
        String t = agtw.t(agnzVar.f);
        if (this.b.remove(t)) {
            this.a.e(t);
            this.c = null;
        }
    }
}
