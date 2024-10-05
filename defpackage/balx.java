package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class balx extends baln {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int b;

    public balx(bajp bajpVar, bajr bajrVar) {
        super(bajpVar, bajrVar);
        this.b = 100;
    }

    @Override // defpackage.ball, defpackage.bajp
    public final int a(long j, long j2) {
        return this.a.a(j, j2) / 100;
    }

    @Override // defpackage.baln, defpackage.bajp
    public final long b(long j, int i) {
        return this.a.c(j, i * 100);
    }

    @Override // defpackage.baln, defpackage.bajp
    public final long c(long j, long j2) {
        return this.a.c(j, aynu.y(j2, 100));
    }

    @Override // defpackage.baln, defpackage.bajp
    public final long d(long j, long j2) {
        return this.a.d(j, j2) / 100;
    }

    @Override // defpackage.baln, defpackage.bajp
    public final long e() {
        return this.a.e() * 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof balx) {
            balx balxVar = (balx) obj;
            if (this.a.equals(balxVar.a) && this.d == balxVar.d) {
                int i = balxVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + 100 + this.a.hashCode();
    }
}
