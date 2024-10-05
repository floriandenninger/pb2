package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class balh extends ball {
    private static final long serialVersionUID = -485345310999208286L;
    final bajp a;
    final boolean b;
    final bajn c;

    public balh(bajp bajpVar, bajn bajnVar) {
        super(bajpVar.f());
        if (bajpVar.h()) {
            this.a = bajpVar;
            this.b = bali.P(bajpVar);
            this.c = bajnVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final int i(long j) {
        int b = this.c.b(j);
        long j2 = b;
        if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
            return b;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    private final int j(long j) {
        int a = this.c.a(j);
        long j2 = a;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return a;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.ball, defpackage.bajp
    public final int a(long j, long j2) {
        return this.a.a(j + (this.b ? r0 : j(j)), j2 + j(j2));
    }

    @Override // defpackage.bajp
    public final long b(long j, int i) {
        int j2 = j(j);
        long b = this.a.b(j + j2, i);
        if (!this.b) {
            j2 = i(b);
        }
        return b - j2;
    }

    @Override // defpackage.bajp
    public final long c(long j, long j2) {
        int j3 = j(j);
        long c = this.a.c(j + j3, j2);
        if (!this.b) {
            j3 = i(c);
        }
        return c - j3;
    }

    @Override // defpackage.bajp
    public final long d(long j, long j2) {
        return this.a.d(j + (this.b ? r0 : j(j)), j2 + j(j2));
    }

    @Override // defpackage.bajp
    public final long e() {
        return this.a.e();
    }

    @Override // defpackage.bajp
    public final boolean g() {
        return this.b ? this.a.g() : this.a.g() && this.c.l();
    }
}
