package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ehs implements amdx, axqj {
    private final efz a;
    private final ehy b;
    private final ehs c;

    public ehs() {
    }

    public ehs(efz efzVar, ehy ehyVar) {
        this.c = this;
        this.a = efzVar;
        this.b = ehyVar;
    }

    @Override // defpackage.amdx
    public final edy a() {
        return new edy(this.a, this.b, this.c);
    }
}
