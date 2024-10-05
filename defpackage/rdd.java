package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rdd extends rdh {
    final /* synthetic */ String a;
    final /* synthetic */ rdq b;
    final /* synthetic */ rch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdd(rdq rdqVar, String str, rch rchVar) {
        super(rdqVar);
        this.b = rdqVar;
        this.a = str;
        this.c = rchVar;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.b.f;
        qip.an(rcfVar);
        rcfVar.getMaxUserProperties(this.a, this.c);
    }

    @Override // defpackage.rdh
    protected final void b() {
        this.c.a(null);
    }
}
