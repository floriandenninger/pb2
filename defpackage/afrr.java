package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afrr implements afrz {
    final afsc a;
    final afsd b;
    public final boolean c;
    public boolean d;

    public afrr(afqd afqdVar, afsc afscVar, afsd afsdVar) {
        this.c = afqdVar.n();
        this.a = afscVar;
        this.b = afsdVar;
    }

    @Override // defpackage.afrz
    public final synchronized yok a() {
        if (this.c) {
            return new afrq(this);
        }
        return this.a.a();
    }

    @Override // defpackage.afrz
    public final void b() {
        if (this.c) {
            this.b.b();
        } else {
            this.a.b();
        }
    }

    @Override // defpackage.afrz
    public final void c(Set set) {
        if (this.c) {
            this.b.c(set);
        }
        this.a.c(set);
    }

    @Override // defpackage.afrz
    public final void d() {
        if (this.c) {
            this.b.d();
        }
        this.a.d();
    }

    @Override // defpackage.afrz
    public final void e(List list) {
        if (this.c) {
            this.b.e(list);
        } else {
            this.a.e(list);
        }
    }

    @Override // defpackage.afrz
    public final void f(aone aoneVar) {
        if (this.c) {
            this.b.f(aoneVar);
        } else {
            this.a.f(aoneVar);
        }
    }

    @Override // defpackage.afrz
    public final void g(aone aoneVar) {
        if (this.c) {
            this.b.g(aoneVar);
        } else {
            this.a.g(aoneVar);
        }
    }
}
