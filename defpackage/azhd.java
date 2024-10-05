package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azhd extends aytg {
    final ayrw f;

    public azhd(ayqd ayqdVar, ayrw ayrwVar) {
        super(ayqdVar);
        this.f = ayrwVar;
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.e == 0) {
            try {
                if (this.f.a(obj)) {
                    this.a.c(obj);
                    return;
                }
                return;
            } catch (Throwable th) {
                g(th);
                return;
            }
        }
        this.a.c(null);
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return f(i);
    }

    @Override // defpackage.aytf
    public final Object sg() {
        Object sg;
        do {
            sg = this.c.sg();
            if (sg == null) {
                break;
            }
        } while (!this.f.a(sg));
        return sg;
    }
}
