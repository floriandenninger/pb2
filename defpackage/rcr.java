package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rcr extends rdh {
    final /* synthetic */ Boolean a;
    final /* synthetic */ rdq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcr(rdq rdqVar, Boolean bool) {
        super(rdqVar);
        this.b = rdqVar;
        this.a = bool;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.b.f;
        qip.an(rcfVar);
        rcfVar.setMeasurementEnabled(this.a.booleanValue(), this.f);
    }
}
