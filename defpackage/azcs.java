package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azcs extends AtomicReference implements aypt, ayqx {
    private static final long serialVersionUID = 4375739915521278546L;
    final aypt a;
    final ayrv b;
    final ayrv c;
    final Callable d;
    ayqx e;

    public azcs(aypt ayptVar, ayrv ayrvVar, ayrv ayrvVar2, Callable callable) {
        this.a = ayptVar;
        this.b = ayrvVar;
        this.c = ayrvVar2;
        this.d = callable;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        try {
            aypv aypvVar = (aypv) this.c.a(th);
            aysw.b(aypvVar, "The onErrorMapper returned a null MaybeSource");
            aypvVar.Y(new azcr(this));
        } catch (Exception e) {
            aynu.c(e);
            this.a.b(new ayrf(th, e));
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
        this.e.qc();
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        try {
            aypv aypvVar = (aypv) this.b.a(obj);
            aysw.b(aypvVar, "The onSuccessMapper returned a null MaybeSource");
            aypvVar.Y(new azcr(this));
        } catch (Exception e) {
            aynu.c(e);
            this.a.b(e);
        }
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.e, ayqxVar)) {
            this.e = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.aypt
    public final void sh() {
        try {
            aypv aypvVar = (aypv) this.d.call();
            aysw.b(aypvVar, "The onCompleteSupplier returned a null MaybeSource");
            aypvVar.Y(new azcr(this));
        } catch (Exception e) {
            aynu.c(e);
            this.a.b(e);
        }
    }
}
