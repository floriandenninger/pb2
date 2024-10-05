package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rcp extends rdh {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ rdq c;
    final /* synthetic */ rch d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcp(rdq rdqVar, String str, String str2, rch rchVar) {
        super(rdqVar);
        this.c = rdqVar;
        this.a = str;
        this.b = str2;
        this.d = rchVar;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.c.f;
        qip.an(rcfVar);
        rcfVar.getConditionalUserProperties(this.a, this.b, this.d);
    }

    @Override // defpackage.rdh
    protected final void b() {
        this.d.a(null);
    }
}
