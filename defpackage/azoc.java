package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azoc extends AtomicReference implements ayqk {
    private static final long serialVersionUID = 3323743579927613702L;
    final azob a;
    final int b;

    public azoc(azob azobVar, int i) {
        this.a = azobVar;
        this.b = i;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.a(th, this.b);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        azob azobVar = this.a;
        azobVar.d[this.b] = obj;
        if (azobVar.decrementAndGet() == 0) {
            try {
                Object a = azobVar.b.a(azobVar.d);
                aysw.b(a, "The zipper returned a null value");
                azobVar.a.sc(a);
            } catch (Throwable th) {
                aynu.c(th);
                azobVar.a.b(th);
            }
        }
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }
}
