package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgm implements fgp {
    public final fgq a;
    private final axpg b;

    public mgm(fgq fgqVar, axpg axpgVar) {
        this.b = axpgVar;
        this.a = fgqVar;
    }

    public final void a() {
        if (this.a.g().b()) {
            ((fzb) this.b.get()).h();
        } else {
            ((fzb) this.b.get()).l();
        }
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        a();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
