package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rcu extends rdh {
    final /* synthetic */ String a;
    final /* synthetic */ rdq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcu(rdq rdqVar, String str) {
        super(rdqVar);
        this.b = rdqVar;
        this.a = str;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.b.f;
        qip.an(rcfVar);
        rcfVar.endAdUnitExposure(this.a, this.g);
    }
}
