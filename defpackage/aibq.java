package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aibq implements aibf {
    private final int a;
    private final Set b = new CopyOnWriteArraySet();

    public aibq(int i) {
        this.a = i;
    }

    @Override // defpackage.aibf
    public final void a(int i, int i2, int i3) {
        if (this.a != i) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((yoq) it.next()).pe(i2, i3);
        }
    }

    @Override // defpackage.aibf
    public final void c(int i, int i2) {
        if (this.a != i) {
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((yoq) it.next()).d(0, i2);
        }
    }

    @Override // defpackage.aibf
    public final void b(int i) {
        int i2 = this.a;
        if (i2 == 1) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((yoq) it.next()).d(0, 1);
            }
        } else if (i2 == 0) {
            Iterator it2 = this.b.iterator();
            while (it2.hasNext()) {
                ((yoq) it2.next()).pe(i, 1);
            }
        }
    }
}
