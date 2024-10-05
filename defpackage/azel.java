package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azel extends AtomicReference implements aypt {
    private static final long serialVersionUID = 3323743579927613702L;
    final azek a;
    final int b;

    public azel(azek azekVar, int i) {
        this.a = azekVar;
        this.b = i;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        this.a.c(th, this.b);
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        azek azekVar = this.a;
        azekVar.d[this.b] = obj;
        if (azekVar.decrementAndGet() == 0) {
            try {
                Object a = azekVar.b.a(azekVar.d);
                aysw.b(a, "The zipper returned a null value");
                azekVar.a.sc(a);
            } catch (Throwable th) {
                aynu.c(th);
                azekVar.a.b(th);
            }
        }
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypt
    public final void sh() {
        azek azekVar = this.a;
        int i = this.b;
        if (azekVar.getAndSet(0) > 0) {
            azekVar.a(i);
            azekVar.a.sh();
        }
    }
}
