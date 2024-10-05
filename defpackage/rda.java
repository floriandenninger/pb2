package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rda extends rdh {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    final /* synthetic */ rdq d;
    final /* synthetic */ rch e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rda(rdq rdqVar, String str, String str2, boolean z, rch rchVar) {
        super(rdqVar);
        this.d = rdqVar;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.e = rchVar;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.d.f;
        qip.an(rcfVar);
        rcfVar.getUserProperties(this.a, this.b, this.c, this.e);
    }

    @Override // defpackage.rdh
    protected final void b() {
        this.e.a(null);
    }
}
