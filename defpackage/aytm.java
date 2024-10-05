package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytm extends AtomicReference implements aypi, ayqx, ayrs {
    private static final long serialVersionUID = -4361286194466301354L;
    final ayrs a;
    final ayrm b;

    public aytm(ayrm ayrmVar) {
        this.a = this;
        this.b = ayrmVar;
    }

    @Override // defpackage.ayrs
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aynu.j(new ayrh((Throwable) obj));
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        try {
            this.a.a(th);
        } catch (Throwable th2) {
            aynu.c(th2);
            aynu.j(th2);
        }
        lazySet(ayrz.a);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == ayrz.a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        try {
            this.b.a();
        } catch (Throwable th) {
            aynu.c(th);
            aynu.j(th);
        }
        lazySet(ayrz.a);
    }

    public aytm(ayrs ayrsVar, ayrm ayrmVar) {
        this.a = ayrsVar;
        this.b = ayrmVar;
    }
}
