package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axov extends aoam {
    public final long aI() {
        if (b(12) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final long aJ() {
        if (b(10) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final aoam aK() {
        aoam aoamVar = new aoam();
        int b = b(8);
        if (b == 0) {
            return null;
        }
        aoamVar.f(a(b + this.a), this.b);
        return aoamVar;
    }

    @Override // defpackage.aoam
    public final String m() {
        int b = b(4);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }
}
