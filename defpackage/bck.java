package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bck implements bcy {
    public final int a;
    final /* synthetic */ bcn b;

    public bck(bcn bcnVar, int i) {
        this.b = bcnVar;
        this.a = i;
    }

    @Override // defpackage.bcy
    public final int a(pmt pmtVar, asw aswVar, int i) {
        bcn bcnVar = this.b;
        int i2 = this.a;
        if (bcnVar.x()) {
            return -3;
        }
        bcnVar.s(i2);
        int d = bcnVar.k[i2].d(pmtVar, aswVar, i, bcnVar.r);
        if (d != -3) {
            return d;
        }
        bcnVar.t(i2);
        return d;
    }

    @Override // defpackage.bcy
    public final int b(long j) {
        bcn bcnVar = this.b;
        int i = this.a;
        if (bcnVar.x()) {
            return 0;
        }
        bcnVar.s(i);
        bcx bcxVar = bcnVar.k[i];
        int b = bcxVar.b(j, bcnVar.r);
        bcxVar.w(b);
        if (b != 0) {
            return b;
        }
        bcnVar.t(i);
        return 0;
    }

    @Override // defpackage.bcy
    public final boolean d() {
        bcn bcnVar = this.b;
        return !bcnVar.x() && bcnVar.k[this.a].y(bcnVar.r);
    }

    @Override // defpackage.bcy
    public final void jK() {
        bcn bcnVar = this.b;
        bcnVar.k[this.a].o();
        bcnVar.u();
    }
}
