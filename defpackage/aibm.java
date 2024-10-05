package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aibm implements aibf {
    final /* synthetic */ aibn a;
    private final Set b = new CopyOnWriteArraySet();

    public aibm(aibn aibnVar) {
        this.a = aibnVar;
    }

    @Override // defpackage.aibf
    public final void a(int i, int i2, int i3) {
        synchronized (this.a) {
            int b = this.a.b(0, i2);
            this.a.d();
            d(b, i3);
        }
    }

    @Override // defpackage.aibf
    public final void b(int i) {
        synchronized (this.a) {
            int b = this.a.b(1, 0);
            int b2 = this.a.b(0, i);
            this.a.d();
            if (b != b2) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((yoq) it.next()).e(b, b2);
                }
            }
        }
    }

    @Override // defpackage.aibf
    public final void c(int i, int i2) {
        synchronized (this.a) {
            int b = this.a.b(i, 0);
            this.a.d();
            e(b, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i, int i2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((yoq) it.next()).pe(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((yoq) it.next()).d(i, i2);
        }
    }
}
