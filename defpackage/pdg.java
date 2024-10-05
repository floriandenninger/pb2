package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pdg implements pde {
    private final int a;
    private final int b;
    private final pgx c;

    public pdg(pdb pdbVar) {
        pgx pgxVar = pdbVar.a;
        this.c = pgxVar;
        pgxVar.z(12);
        this.a = pgxVar.j();
        this.b = pgxVar.j();
    }

    @Override // defpackage.pde
    public final int a() {
        return this.b;
    }

    @Override // defpackage.pde
    public final int b() {
        int i = this.a;
        return i == 0 ? this.c.j() : i;
    }

    @Override // defpackage.pde
    public final boolean c() {
        return this.a != 0;
    }
}
