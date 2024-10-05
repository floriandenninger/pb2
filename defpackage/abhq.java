package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abhq extends abhm {
    public final /* synthetic */ abht d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abhq(abht abhtVar, aazc aazcVar, ypa ypaVar, zaw zawVar, acra acraVar) {
        super(abhtVar, aazcVar, ypaVar, zawVar, acraVar);
        this.d = abhtVar;
    }

    @Override // defpackage.ajtz
    public final void lt(ajce ajceVar) {
        aayw d = this.d.j.d();
        d.d(ajceVar);
        m(d, ajceVar.a(), null);
    }

    public final void m(aaru aaruVar, ajcd ajcdVar, Runnable runnable) {
        this.d.j.b(aaruVar, new abhn(), new abhp(this, runnable, ajcdVar, aaruVar));
    }
}
