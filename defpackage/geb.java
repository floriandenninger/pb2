package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class geb implements akbl {
    final /* synthetic */ aqet a;
    final /* synthetic */ acra b;

    public geb(aqet aqetVar, acra acraVar) {
        this.a = aqetVar;
        this.b = acraVar;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        aqet aqetVar = this.a;
        acra acraVar = this.b;
        if (acraVar == null || aqetVar == null) {
            return;
        }
        acraVar.q(new acqx(aqetVar.f), null);
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        aqet aqetVar = this.a;
        acra acraVar = this.b;
        if (acraVar != null) {
            acraVar.v(aqetVar, aqetVar.f, null);
        }
    }
}
