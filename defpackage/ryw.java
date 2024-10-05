package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ryw implements rza {
    public final ryz a;
    public boolean b;
    private rzc c;
    private final ryx d;
    private final ryy e;
    private dsm f;

    public ryw() {
        this.f = dsm.f();
        this.c = rzc.a();
        this.b = true;
        this.a = new ryz();
        this.d = new ryx();
        this.e = new ryy();
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryw.q():void");
    }

    @Override // defpackage.rze
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        Double d = (Double) obj;
        if (this.b) {
            q();
        }
        return this.e.a(d.doubleValue());
    }

    @Override // defpackage.rze
    public final /* bridge */ /* synthetic */ float b(Object obj, Object obj2) {
        if (this.b) {
            q();
        }
        return this.e.a((obj != null ? ((Double) obj).doubleValue() : 0.0d) + (obj2 != null ? ((Double) obj2).doubleValue() : 0.0d));
    }

    @Override // defpackage.rze
    public final float c() {
        if (this.b) {
            q();
        }
        return this.e.a;
    }

    @Override // defpackage.rze
    public final /* bridge */ /* synthetic */ int d(Object obj) {
        Double d = (Double) obj;
        ryv ryvVar = this.a.e;
        if (ryvVar == null) {
            this.d.a();
            ryvVar = this.d.e;
        }
        if (d.doubleValue() < ((Double) ryvVar.a).doubleValue()) {
            return -1;
        }
        return d.doubleValue() > ((Double) ryvVar.b).doubleValue() ? 1 : 0;
    }

    @Override // defpackage.rze
    public final int e() {
        ryz ryzVar = this.a;
        return Math.abs(((Integer) ryzVar.a.a).intValue() - ((Integer) ryzVar.a.b).intValue());
    }

    @Override // defpackage.rze
    public final ryv f() {
        return this.a.a;
    }

    public final ryv g() {
        if (this.b) {
            q();
        }
        return this.a.e;
    }

    @Override // defpackage.rze
    public final /* bridge */ /* synthetic */ rza h() {
        sbt.g(this.a.a, "Copying a scale with no range.");
        return new ryw(this);
    }

    @Override // defpackage.rza
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        Double d = (Double) obj;
        ryx ryxVar = this.d;
        if (d != null) {
            ryxVar.b(d);
            double doubleValue = d.doubleValue();
            if (!Double.isNaN(ryxVar.c)) {
                double abs = Math.abs(doubleValue - ryxVar.c);
                if (abs != 0.0d && abs < ryxVar.d) {
                    ryxVar.d = Math.abs(doubleValue - ryxVar.c);
                }
            }
            ryxVar.c = doubleValue;
        }
        this.b = true;
    }

    @Override // defpackage.rza
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        this.b = this.d.b((Double) obj);
    }

    @Override // defpackage.rza
    public final void k() {
        ryz ryzVar = this.a;
        ryzVar.f = false;
        ryzVar.c = 1.0f;
        ryzVar.d = 0.0f;
        ryzVar.e = null;
        this.b = true;
        ryx ryxVar = this.d;
        ryxVar.c = Double.NaN;
        ryxVar.a = Double.MAX_VALUE;
        ryxVar.b = -1.7976931348623157E308d;
        ryxVar.d = Double.MAX_VALUE;
        this.e.a = 0.0f;
    }

    @Override // defpackage.rza
    public final void l(ryv ryvVar) {
        sbt.g(ryvVar, "Attempt to set a null range.");
        this.a.a = ryvVar;
        this.b = true;
    }

    @Override // defpackage.rza
    public final void m(rzc rzcVar) {
        sbt.g(rzcVar, "rangeBandConfig");
        if (rzcVar.equals(this.c)) {
            return;
        }
        this.c = rzcVar;
        this.b = true;
    }

    @Override // defpackage.rze
    public final /* bridge */ /* synthetic */ boolean n(Object obj) {
        return true;
    }

    public final boolean o() {
        return this.a.b;
    }

    @Override // defpackage.rza
    public final void p(dsm dsmVar) {
        sbt.g(dsmVar, "stepSizeConfig");
        this.f = dsmVar;
    }

    private ryw(ryw rywVar) {
        this.f = dsm.f();
        this.c = rzc.a();
        this.b = true;
        this.f = rywVar.f;
        this.c = rywVar.c;
        this.a = new ryz(rywVar.a);
        this.d = new ryx(rywVar.d);
        this.e = new ryy(rywVar.e);
    }
}
