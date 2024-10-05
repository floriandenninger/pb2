package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yot {
    public final HashSet a = new HashSet();

    public final void a(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yoq) it.next()).pd(i, i2);
        }
    }

    public final void b(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yoq) it.next()).pe(i, i2);
        }
    }

    public final void c(int i, int i2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((yoq) it.next()).d(i, i2);
        }
    }

    public final void d(int i) {
        c(i, 1);
    }

    public final void e(yoq yoqVar) {
        this.a.add(yoqVar);
    }

    public final void f(yoq yoqVar) {
        this.a.remove(yoqVar);
    }

    public final void g() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ajnf) it.next()).pc();
        }
    }
}
