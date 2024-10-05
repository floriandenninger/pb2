package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bakr extends balu {
    private final bakp b;

    public bakr(bakp bakpVar, bajp bajpVar) {
        super(bajj.h, bajpVar);
        this.b = bakpVar;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int a(long j) {
        bakp bakpVar = this.b;
        return bakpVar.Q(j, bakpVar.Z(j));
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int c() {
        return 366;
    }

    @Override // defpackage.balu, defpackage.bajh
    public final int d() {
        return 1;
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return this.b.g;
    }

    @Override // defpackage.balk
    public final int u(long j) {
        return this.b.ai(this.b.Z(j)) ? 366 : 365;
    }

    @Override // defpackage.balu
    protected final int v(long j, int i) {
        if (i > 365 || i <= 0) {
            return u(j);
        }
        return 365;
    }
}
