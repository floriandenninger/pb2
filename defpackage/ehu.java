package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ehu implements axpr, axpw, axqj {
    private final efz a;
    private azrw b;
    private final ehu c;

    public ehu(efz efzVar) {
        this.c = this;
        this.a = efzVar;
        this.b = axqq.b(new ejz(1));
    }

    @Override // defpackage.axpr
    public final eeb a() {
        return new eeb(this.a, this.c);
    }

    @Override // defpackage.axpw
    public final aoae b() {
        return (aoae) this.b.get();
    }

    public ehu() {
    }
}
