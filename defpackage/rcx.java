package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rcx extends rdh {
    final /* synthetic */ rdq a;
    final /* synthetic */ rch b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcx(rdq rdqVar, rch rchVar) {
        super(rdqVar);
        this.a = rdqVar;
        this.b = rchVar;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.a.f;
        qip.an(rcfVar);
        rcfVar.generateEventId(this.b);
    }

    @Override // defpackage.rdh
    protected final void b() {
        this.b.a(null);
    }
}
