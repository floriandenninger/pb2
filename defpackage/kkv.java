package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kkv implements xhx {
    public final xkz a;
    public final acra b;
    public final xcl c;
    public xku d;
    public klj e;
    public klk f;
    public xlb h;
    public xkv i;
    public xkx j;
    public xla k;
    public boolean l;
    public final xks g = new xks();
    public boolean m = false;

    public kkv(xkz xkzVar, acra acraVar, xcl xclVar) {
        this.a = xkzVar;
        this.b = acraVar;
        this.c = xclVar;
    }

    @Override // defpackage.xhx
    public final void nM(xla xlaVar) {
        this.k = xlaVar;
        this.a.f = xlaVar;
        xkx xkxVar = this.j;
        if (xkxVar != null) {
            xkxVar.a = xlaVar;
        }
    }

    @Override // defpackage.xhx
    public final void qH(xjq xjqVar) {
        boolean D = wbs.D(xjqVar, 2);
        this.d.e(xjqVar.e, D);
        klj kljVar = this.e;
        xjw xjwVar = xjqVar.g;
        xjo xjoVar = xjwVar.a;
        if (!xjoVar.equals(kljVar.b.a)) {
            klk klkVar = kljVar.a;
            CharSequence charSequence = xjoVar.b;
            CharSequence charSequence2 = xjoVar.c;
            avgg avggVar = xjoVar.d;
            if (avggVar == null) {
                avggVar = null;
            }
            klkVar.b(charSequence, charSequence2, avggVar);
        }
        kljVar.b = xjwVar;
        this.g.e(Boolean.valueOf(D), xjqVar.b);
        this.h.e(xjqVar.c, D);
        this.i.e(xjqVar.h, D);
        this.j.e(xjqVar.i, D);
    }
}
