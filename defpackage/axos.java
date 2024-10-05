package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axos extends aoam {
    public final int aI() {
        int b = b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aJ() {
        int b = b(20);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final long aK() {
        if (b(28) != 0) {
            return this.b.getInt(r0 + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final axoh aL() {
        axoh axohVar = new axoh();
        int b = b(6);
        if (b == 0) {
            return null;
        }
        axohVar.f(a(b + this.a), this.b);
        return axohVar;
    }

    public final boolean aM() {
        int b = b(16);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }
}
