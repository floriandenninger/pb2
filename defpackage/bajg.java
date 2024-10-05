package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bajg extends bakg implements Serializable, baka {
    private static final long serialVersionUID = -5171125899451703815L;

    public bajg() {
    }

    public final bajg a(int i) {
        return i == 0 ? this : e(this.b.F().b(this.a, i));
    }

    public final bajg b(int i) {
        return i == 0 ? this : e(this.b.G().b(this.a, i));
    }

    public final bajg c(int i) {
        return e(this.b.f().h(this.a, i));
    }

    public final bajg d(int i) {
        return e(this.b.k().h(this.a, i));
    }

    public final bajg e(long j) {
        return j == this.a ? this : new bajg(j, this.b);
    }

    public final bajg f(int i) {
        return e(this.b.p().h(this.a, i));
    }

    public final bajg g(int i) {
        return e(this.b.q().h(this.a, i));
    }

    public final bajg h(int i) {
        return e(this.b.w().h(this.a, i));
    }

    public final bajg i() {
        return e(this.b.B().b(this.a, 1));
    }

    public final bajg j() {
        return e(this.b.s().h(this.a, 0));
    }

    public bajg(long j) {
        super(j, bale.O());
    }

    public bajg(long j, bajf bajfVar) {
        super(j, bajfVar);
    }

    public bajg(long j, bajn bajnVar) {
        super(j, bajnVar);
    }

    public bajg(bajn bajnVar) {
        super(bajk.a(), bale.P(bajnVar));
    }
}
