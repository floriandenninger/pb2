package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rdb extends rdh {
    final /* synthetic */ String a = "Error with data collection. Data lost.";
    final /* synthetic */ Object b;
    final /* synthetic */ rdq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdb(rdq rdqVar, Object obj) {
        super(rdqVar, false);
        this.c = rdqVar;
        this.b = obj;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.c.f;
        qip.an(rcfVar);
        rcfVar.logHealthData(5, this.a, qve.a(this.b), qve.a(null), qve.a(null));
    }
}
