package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rdg extends rdh {
    final /* synthetic */ String a = "fcm";
    final /* synthetic */ String b = "_ln";
    final /* synthetic */ Object c;
    final /* synthetic */ rdq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdg(rdq rdqVar, Object obj) {
        super(rdqVar);
        this.d = rdqVar;
        this.c = obj;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.d.f;
        qip.an(rcfVar);
        rcfVar.setUserProperty(this.a, this.b, qve.a(this.c), true, this.f);
    }
}
