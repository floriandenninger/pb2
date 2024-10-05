package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzf implements rza {
    public rzb a;
    private ryv b;
    private float c;
    private rzc d;
    private boolean e;
    private float f;
    private float g;
    private float h;

    public rzf() {
        this.a = new rzb();
        this.b = new ryv(0, 1);
        this.c = 1.0f;
        this.d = rzc.b();
        this.e = true;
    }

    @Override // defpackage.rze
    public final float a(Object obj) {
        if (this.e) {
            g();
        }
        if (this.a.b(obj) != null) {
            return ((Integer) this.b.a).intValue() + 0.0f + this.g + (this.f * r3.intValue());
        }
        return 0.0f;
    }

    @Override // defpackage.rze
    public final float b(Object obj, Object obj2) {
        return a(obj);
    }

    @Override // defpackage.rze
    public final float c() {
        if (this.e) {
            g();
        }
        return this.h;
    }

    @Override // defpackage.rze
    public final int d(Object obj) {
        if (this.a.b(obj) == null || this.b == null) {
            return -1;
        }
        float a = a(obj);
        if (a < Math.min(((Integer) this.b.a).intValue(), ((Integer) this.b.b).intValue())) {
            return -1;
        }
        return a > ((float) Math.max(((Integer) this.b.a).intValue(), ((Integer) this.b.b).intValue())) ? 1 : 0;
    }

    @Override // defpackage.rze
    public final int e() {
        return Math.abs(((Integer) this.b.a).intValue() - ((Integer) this.b.b).intValue());
    }

    @Override // defpackage.rze
    public final ryv f() {
        return this.b;
    }

    protected final void g() {
        float f;
        float e = this.a.a() > 0 ? this.c * (e() / this.a.a()) : 0.0f;
        rzc rzcVar = this.d;
        int i = rzcVar.b - 1;
        if (i == 1) {
            f = (float) rzcVar.a;
        } else if (i == 3 || i == 4) {
            f = ((float) rzcVar.a) * e;
        } else {
            throw new IllegalStateException("rangeBandType is bad, must not be NO_RANGE_BAND or FIXED_DOMAIN_RANGE_BAND");
        }
        this.f = e;
        this.h = f;
        this.g = e / 2.0f;
        if (((Integer) this.b.a).intValue() > ((Integer) this.b.b).intValue()) {
            this.f = -this.f;
            this.g = -this.g;
        }
        this.e = false;
    }

    @Override // defpackage.rze
    public final /* bridge */ /* synthetic */ rza h() {
        return new rzf(this);
    }

    @Override // defpackage.rza
    public final void i(Object obj) {
        rzb rzbVar = this.a;
        if (!rzbVar.a.containsKey(obj)) {
            rzbVar.a.put(obj, Integer.valueOf(rzbVar.b.size()));
            rzbVar.b.add(obj);
        }
        this.e = true;
    }

    @Override // defpackage.rza
    public final void j(Object obj) {
        i(obj);
    }

    @Override // defpackage.rza
    public final void k() {
        rzb rzbVar = this.a;
        rzbVar.a.clear();
        rzbVar.b.clear();
        this.e = true;
    }

    @Override // defpackage.rza
    public final void l(ryv ryvVar) {
        this.b = ryvVar;
        this.e = true;
    }

    @Override // defpackage.rza
    public final void m(rzc rzcVar) {
        sbt.g(rzcVar, "rangeBandConfig");
        int i = rzcVar.b;
        boolean z = false;
        if (i != 3 && i != 1) {
            z = true;
        }
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "STYLE_ASSIGNED_PERCENT_OF_STEP" : "FIXED_PERCENT_OF_STEP" : "FIXED_DOMAIN" : "FIXED_PIXEL" : "NONE";
        sbt.a(z, str.length() != 0 ? "OrdinalScales cannot have a rangeBandType of ".concat(str) : new String("OrdinalScales cannot have a rangeBandType of "));
        this.d = rzcVar;
        this.e = true;
    }

    @Override // defpackage.rze
    public final boolean n(Object obj) {
        return this.a.b(obj) != null;
    }

    @Override // defpackage.rza
    public final void p(dsm dsmVar) {
        sbt.g(dsmVar, "stepSizeConfig");
        int i = dsmVar.c;
        sbt.a(true, "Ordinal scales only support StepSizeConfig of type Auto");
    }

    protected rzf(rzf rzfVar) {
        this.a = new rzb();
        this.b = new ryv(0, 1);
        this.c = 1.0f;
        this.d = rzc.b();
        this.e = true;
        rzb rzbVar = rzfVar.a;
        rzb rzbVar2 = new rzb();
        rzbVar2.a.putAll(rzbVar.a);
        rzbVar2.b.addAll(rzbVar.b);
        this.a = rzbVar2;
        this.b = rzfVar.b.a();
        this.c = rzfVar.c;
        this.d = rzfVar.d;
    }
}
