package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class balv extends ball {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long a;

    public balv(bajr bajrVar, long j) {
        super(bajrVar);
        this.a = j;
    }

    @Override // defpackage.bajp
    public final long b(long j, int i) {
        return aynu.x(j, i * this.a);
    }

    @Override // defpackage.bajp
    public final long c(long j, long j2) {
        long j3 = this.a;
        long j4 = 0;
        if (j2 != 1) {
            if (j2 != 0) {
                j4 = j2 * j3;
                if (j4 / j3 != j2) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Multiplication overflows a long: ");
                    sb.append(j2);
                    sb.append(" * ");
                    sb.append(j3);
                    throw new ArithmeticException(sb.toString());
                }
            }
            j3 = j4;
        }
        return aynu.x(j, j3);
    }

    @Override // defpackage.bajp
    public final long d(long j, long j2) {
        return aynu.z(j, j2) / this.a;
    }

    @Override // defpackage.bajp
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof balv) {
            balv balvVar = (balv) obj;
            if (this.d == balvVar.d && this.a == balvVar.a) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bajp
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return ((int) this.a) + this.d.hashCode();
    }
}
