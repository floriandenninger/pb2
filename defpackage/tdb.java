package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tdb implements tdc {
    public final /* synthetic */ tdd a;
    public final /* synthetic */ tdc b;
    private final /* synthetic */ int c;

    public /* synthetic */ tdb(tdd tddVar, tdc tdcVar, int i) {
        this.c = i;
        this.a = tddVar;
        this.b = tdcVar;
    }

    @Override // defpackage.tdc
    public final void a(int i) {
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                this.b.a(this.a.f());
                return;
            } else {
                this.b.a(this.a.e());
                return;
            }
        }
        tdd tddVar = this.a;
        tdc tdcVar = this.b;
        rwh.U();
        int i3 = 13;
        if (tddVar.a.f()) {
            edo a = tddVar.a();
            if ((1 & a.b) != 0 && tddVar.a.b() >= a.c) {
                i3 = 2;
            }
        } else {
            i3 = tddVar.a.g();
        }
        tdcVar.a(i3);
    }
}
