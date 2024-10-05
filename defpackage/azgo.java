package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgo extends aytg {
    final ayrp f;
    Object g;
    boolean h;

    public azgo(ayqd ayqdVar, ayrp ayrpVar) {
        super(ayqdVar);
        this.f = ayrpVar;
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        if (this.e == 0) {
            try {
                if (this.h) {
                    boolean a = this.f.a(this.g, obj);
                    this.g = obj;
                    if (a) {
                        return;
                    }
                } else {
                    this.h = true;
                    this.g = obj;
                }
                this.a.c(obj);
                return;
            } catch (Throwable th) {
                g(th);
                return;
            }
        }
        this.a.c(obj);
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return f(i);
    }

    @Override // defpackage.aytf
    public final Object sg() {
        Object sg;
        boolean a;
        do {
            sg = this.c.sg();
            if (sg == null) {
                return null;
            }
            if (!this.h) {
                this.h = true;
                this.g = sg;
                return sg;
            }
            a = this.f.a(this.g, sg);
            this.g = sg;
        } while (a);
        return sg;
    }
}
