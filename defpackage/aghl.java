package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aghl {
    private final aghk a;
    private final HashSet b;
    private volatile agnk c;
    private volatile int d;

    public aghl(aghk aghkVar, HashSet hashSet) {
        this.a = aghkVar;
        this.b = new HashSet(hashSet);
    }

    final synchronized int a() {
        return this.b.size();
    }

    public final agnk b() {
        if (this.c == null) {
            this.c = new agnk(this.a.a(), a(), this.d);
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(String str) {
        zhq.m(str);
        this.b.add(str);
        this.a.d(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean e(agnz agnzVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(agnz agnzVar) {
        String t = agtw.t(agnzVar.f);
        if (this.b.remove(t)) {
            this.a.e(t);
            this.c = null;
        }
    }
}
