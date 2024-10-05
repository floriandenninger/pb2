package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgm extends aytg {
    final Collection f;
    final ayrv g;

    public azgm(ayqd ayqdVar, ayrv ayrvVar, Collection collection) {
        super(ayqdVar);
        this.g = ayrvVar;
        this.f = collection;
    }

    @Override // defpackage.aytg, defpackage.ayqd
    public final void b(Throwable th) {
        if (this.d) {
            aynu.j(th);
            return;
        }
        this.d = true;
        this.f.clear();
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        if (this.e == 0) {
            try {
                Object a = this.g.a(obj);
                aysw.b(a, "The keySelector returned a null key");
                if (this.f.add(a)) {
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

    @Override // defpackage.aytg, defpackage.aytf
    public final void d() {
        this.f.clear();
        super.d();
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return f(i);
    }

    @Override // defpackage.aytf
    public final Object sg() {
        Object sg;
        Collection collection;
        Object a;
        do {
            sg = this.c.sg();
            if (sg == null) {
                break;
            }
            collection = this.f;
            a = this.g.a(sg);
            aysw.b(a, "The keySelector returned a null key");
        } while (!collection.add(a));
        return sg;
    }

    @Override // defpackage.aytg, defpackage.ayqd
    public final void sh() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f.clear();
        this.a.sh();
    }
}
