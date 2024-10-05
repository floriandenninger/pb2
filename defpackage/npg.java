package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class npg extends ajxi {
    final /* synthetic */ npj a;
    private final aasm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npg(npj npjVar, aasm aasmVar, ypa ypaVar, ajvb ajvbVar, zaw zawVar, acra acraVar) {
        super(aasmVar, ypaVar, ajvbVar, zawVar, acraVar, ajti.a, ajti.a, null, null);
        this.a = npjVar;
        this.f = aasmVar;
    }

    @Override // defpackage.ajxi, defpackage.ajvd
    public final ajvc a(Object obj, ajxe ajxeVar, ajwx ajwxVar) {
        if (obj instanceof apzx) {
            npj npjVar = this.a;
            xoy b = npjVar.o.b((apzx) obj, this.f, this.d, npjVar.p, npjVar.n);
            npj npjVar2 = this.a;
            b.a = npjVar2;
            final nqc nqcVar = npjVar2.l;
            nqcVar.getClass();
            b.b = new xow() { // from class: npf
                @Override // defpackage.xow
                public final void a() {
                    nqc.this.a();
                }
            };
            b.i(this.a.m);
            return b;
        }
        if (obj instanceof aalz) {
            npk b2 = this.a.q.b(this.f, this.d);
            b2.i((aalz) obj);
            return b2;
        }
        return super.a(obj, ajxeVar, ajwxVar);
    }
}
