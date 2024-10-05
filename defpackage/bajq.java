package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bajq extends bajr {
    private static final long serialVersionUID = 31156755687123L;
    private final byte n;

    public bajq(String str, byte b) {
        super(str);
        this.n = b;
    }

    private Object readResolve() {
        switch (this.n) {
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            case 4:
                return d;
            case 5:
                return e;
            case 6:
                return f;
            case 7:
                return g;
            case 8:
                return h;
            case 9:
                return i;
            case 10:
                return j;
            case 11:
                return k;
            default:
                return l;
        }
    }

    @Override // defpackage.bajr
    public final bajp a(bajf bajfVar) {
        bajf d = bajk.d(bajfVar);
        switch (this.n) {
            case 1:
                return d.C();
            case 2:
                return d.A();
            case 3:
                return d.K();
            case 4:
                return d.L();
            case 5:
                return d.H();
            case 6:
                return d.J();
            case 7:
                return d.B();
            case 8:
                return d.D();
            case 9:
                return d.E();
            case 10:
                return d.G();
            case 11:
                return d.I();
            default:
                return d.F();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bajq) && this.n == ((bajq) obj).n;
    }

    public final int hashCode() {
        return 1 << this.n;
    }
}
