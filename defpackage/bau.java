package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bau implements bcy {
    public final bcy a;
    public boolean b;
    final /* synthetic */ bav c;

    public bau(bav bavVar, bcy bcyVar) {
        this.c = bavVar;
        this.a = bcyVar;
    }

    @Override // defpackage.bcy
    public final int a(pmt pmtVar, asw aswVar, int i) {
        if (this.c.q()) {
            return -3;
        }
        if (this.b) {
            aswVar.setFlags(4);
            return -4;
        }
        int a = this.a.a(pmtVar, aswVar, i);
        if (a != -5) {
            bav bavVar = this.c;
            long j = bavVar.c;
            if (j == Long.MIN_VALUE || ((a != -4 || aswVar.d < j) && !(a == -3 && bavVar.jJ() == Long.MIN_VALUE && !aswVar.c))) {
                return a;
            }
            aswVar.clear();
            aswVar.setFlags(4);
            this.b = true;
            return -4;
        }
        pms pmsVar = pmtVar.b;
        pse.c(pmsVar);
        int i2 = pmsVar.D;
        if (i2 == 0) {
            if (pmsVar.E != 0) {
                i2 = 0;
            }
            return -5;
        }
        bav bavVar2 = this.c;
        if (bavVar2.b != 0) {
            i2 = 0;
        }
        int i3 = bavVar2.c == Long.MIN_VALUE ? pmsVar.E : 0;
        pmr b = pmsVar.b();
        b.A = i2;
        b.B = i3;
        pmtVar.b = b.a();
        return -5;
    }

    @Override // defpackage.bcy
    public final int b(long j) {
        if (this.c.q()) {
            return -3;
        }
        return this.a.b(j);
    }

    @Override // defpackage.bcy
    public final boolean d() {
        return !this.c.q() && this.a.d();
    }

    @Override // defpackage.bcy
    public final void jK() {
        this.a.jK();
    }
}
