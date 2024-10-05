package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azlx extends AtomicReference implements aypq {
    private static final long serialVersionUID = 8410034718427740355L;
    final azly a;
    final int b;
    final int c;
    long d;
    volatile ayte e;

    public azlx(azly azlyVar, int i) {
        this.a = azlyVar;
        this.b = i;
        this.c = i - (i >> 2);
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.a.f(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.a.g(this, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ayte d() {
        ayte ayteVar = this.e;
        if (ayteVar != null) {
            return ayteVar;
        }
        azog azogVar = new azog(this.b);
        this.e = azogVar;
        return azogVar;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        azqb.k(this, banxVar, this.b);
    }

    @Override // defpackage.banw
    public final void sh() {
        this.a.d();
    }
}
