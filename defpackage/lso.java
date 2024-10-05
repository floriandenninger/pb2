package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lso {
    private final gbh a;
    private final akcy b;
    private final dd c;
    private final slr d;

    public lso(gbh gbhVar, akcy akcyVar, dd ddVar, slr slrVar) {
        this.a = gbhVar;
        this.b = akcyVar;
        this.c = ddVar;
        this.d = slrVar;
    }

    public final void a() {
        this.b.f();
    }

    public final void b() {
        this.a.c(false);
        a();
        ce f = this.c.f("FilterDialogFragment");
        if (f instanceof bv) {
            ((bv) f).dismiss();
        }
        this.d.a();
    }
}
