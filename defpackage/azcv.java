package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azcv extends AtomicReference implements aypt, ayqx {
    private static final long serialVersionUID = 4375739915521278546L;
    final aypt a;
    final ayrv b;
    ayqx c;

    public azcv(aypt ayptVar, ayrv ayrvVar) {
        this.a = ayptVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
        this.c.qc();
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        try {
            aypv aypvVar = (aypv) this.b.a(obj);
            aysw.b(aypvVar, "The mapper returned a null MaybeSource");
            if (e()) {
                return;
            }
            aypvVar.Y(new azcu(this));
        } catch (Exception e) {
            aynu.c(e);
            this.a.b(e);
        }
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.aypt
    public final void sh() {
        this.a.sh();
    }
}
