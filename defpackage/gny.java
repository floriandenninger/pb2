package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gny extends ajij {
    private final ygc c;
    private final gfz d;

    public gny(ygc ygcVar, slv slvVar, axpg axpgVar, acra acraVar, akcy akcyVar, gfz gfzVar) {
        super(slvVar, axpgVar, acraVar, akcyVar);
        this.c = ygcVar;
        this.d = gfzVar;
    }

    @Override // defpackage.ajij, defpackage.swv
    public final /* bridge */ /* synthetic */ ayph b(Object obj, swu swuVar) {
        return b((auty) obj, swuVar);
    }

    @Override // defpackage.ajij
    /* renamed from: d */
    public final ayph b(auty autyVar, swu swuVar) {
        fgo fgoVar;
        if ((autyVar.c & 32) != 0) {
            ygc ygcVar = this.c;
            if ((ygcVar instanceof gnx) && (fgoVar = ((gnx) ygcVar).c) != null && fgoVar.k()) {
                return ayph.f();
            }
        }
        return super.b(autyVar, swuVar);
    }

    @Override // defpackage.ajij, defpackage.slt
    public final void e() {
        this.d.m(3);
    }

    @Override // defpackage.ajij, defpackage.slt
    public final void f() {
        this.d.g(3);
    }
}
