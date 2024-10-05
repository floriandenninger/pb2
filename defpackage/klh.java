package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class klh extends fmf {
    private final klg e;
    private final fna f;

    public klh(fna fnaVar, klg klgVar) {
        super(fnaVar, klgVar);
        this.f = fnaVar;
        this.e = klgVar;
    }

    @Override // defpackage.fmf
    public final void b(boolean z) {
        super.b(false);
        this.f.x(false, false);
    }

    @Override // defpackage.fmf
    public final void j(long j, long j2, long j3, long j4) {
        super.j(j, j2, j3, j4);
        long j5 = j3 - j;
        this.e.e(a(j5), a(j5), a(j3));
    }

    @Override // defpackage.fmf
    public final void k(boolean z) {
        super.k(true);
        this.f.x(true, true);
        this.f.p(false);
    }
}
