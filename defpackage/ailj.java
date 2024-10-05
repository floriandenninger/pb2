package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ailj implements aftl {
    final /* synthetic */ ailk a;
    private final aryi b;
    private final ykl c;
    private final String d;

    public ailj(ailk ailkVar, aryi aryiVar, ykl yklVar, String str) {
        this.a = ailkVar;
        this.b = aryiVar;
        this.c = yklVar;
        this.d = str;
    }

    @Override // defpackage.aftl
    public final void a() {
        this.a.g();
        aile.a(this.c, aild.h(this.b, this.d));
    }

    @Override // defpackage.aftl
    public final void b() {
        this.a.g();
        aile.b(this.c);
    }

    @Override // defpackage.aftl
    public final void c(Exception exc) {
        this.a.g();
        aile.a(this.c, aild.h(this.b, this.d));
    }
}
