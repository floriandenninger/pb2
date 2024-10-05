package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bakq extends balu {
    private final bakp b;

    public bakq(bakp bakpVar, bajp bajpVar) {
        super(bajj.j, bajpVar);
        this.b = bakpVar;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int a(long j) {
        bakp bakpVar = this.b;
        int Z = bakpVar.Z(j);
        return bakpVar.O(j, Z, bakpVar.U(j, Z));
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int c() {
        return 31;
    }

    @Override // defpackage.balu, defpackage.bajh
    public final int d() {
        return 1;
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return this.b.f;
    }

    @Override // defpackage.balk
    public final int u(long j) {
        return this.b.R(j);
    }

    @Override // defpackage.balu
    protected final int v(long j, int i) {
        bakp bakpVar = this.b;
        if (i > 28 || i <= 0) {
            return bakpVar.R(j);
        }
        return 28;
    }
}
