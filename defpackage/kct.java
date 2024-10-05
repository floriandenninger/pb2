package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kct implements flh {
    private static final flh b = new kcs();
    public azrw a;

    private final flh c() {
        flj fljVar;
        azrw azrwVar = this.a;
        return (azrwVar == null || (fljVar = ((kch) azrwVar).get()) == null) ? b : fljVar;
    }

    @Override // defpackage.flh
    public final void a() {
        c().a();
    }

    @Override // defpackage.flh
    public final void b() {
        c().b();
    }

    @Override // defpackage.flh
    public final void l() {
        c().l();
    }
}
