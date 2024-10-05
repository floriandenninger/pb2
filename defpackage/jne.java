package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jne implements jmu {
    public final jmz a;
    private final Executor b;
    private final /* synthetic */ int c;

    public jne(jmz jmzVar, Executor executor, int i) {
        this.c = i;
        this.a = jmzVar;
        this.b = executor;
    }

    public static final ammw e(awil awilVar) {
        return ammw.a(Optional.ofNullable(awilVar.f()), Optional.ofNullable(awilVar.b()));
    }

    public static final ammw f(asxs asxsVar) {
        atre atreVar;
        asxn b = asxsVar.b();
        if (b != null) {
            atxb b2 = b.b();
            r0 = b2;
            atreVar = b2 != null ? b2.f() : null;
        } else {
            atreVar = null;
        }
        return ammw.a(Optional.ofNullable(r0), Optional.ofNullable(atreVar));
    }

    @Override // defpackage.jmu
    public final anhy a(jmt jmtVar) {
        if (this.c == 0) {
            return anfq.i(anht.q(anaf.S(new jnb(jmtVar, 4), this.b)), new jnd(this, 1), this.b);
        }
        return anfq.i(anht.q(anaf.S(new jnb(jmtVar, 1), this.b)), new jna(this, 1, null), this.b);
    }

    @Override // defpackage.jmu
    public final anhy b(jmt jmtVar) {
        if (this.c == 0) {
            return anfq.i(anht.q(anaf.S(new jnb(jmtVar, 5), this.b)), new jnd(this, 0), this.b);
        }
        return anfq.i(anht.q(anaf.S(new jnb(jmtVar, 0), this.b)), new jna(this, 0, null), this.b);
    }

    @Override // defpackage.jmu
    public final anhy c(jmt jmtVar) {
        if (this.c == 0) {
            return anfq.i(anht.q(anaf.S(new jnb(jmtVar, 6), this.b)), new jnd(this, 2), this.b);
        }
        return anfq.i(anht.q(anaf.S(new jnb(jmtVar, 2), this.b)), new jna(this, 2, null), this.b);
    }

    @Override // defpackage.jmu
    public final anhy d(jmt jmtVar) {
        if (this.c == 0) {
            return anfq.i(anht.q(anaf.S(new jnb(jmtVar, 7), this.b)), new jnd(this, 3), this.b);
        }
        return anfq.i(anht.q(anaf.S(new jnb(jmtVar, 3), this.b)), new jna(this, 3, null), this.b);
    }
}
