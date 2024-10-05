package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yxp extends yxv {
    final long[] a = new long[8];
    final long[] b = new long[8];
    private final String c;
    private final String d;

    public yxp(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    private final long e(yxw yxwVar, int i) {
        return yyc.m(a(yxwVar.c, i), yxwVar) ? 1L : 0L;
    }

    private final long f(yxw yxwVar, int i) {
        return yyc.a(a(yxwVar.c, i), yxwVar);
    }

    final String a(int i, int i2) {
        return (i2 == 1 || yxu.f(i)) ? this.d : this.c;
    }

    @Override // defpackage.yxv
    public final void b(yxw yxwVar) {
        yxt.m(this.a, yxwVar.c, e(yxwVar, 0));
        yxt.m(this.b, yxwVar.c, e(yxwVar, 1));
    }

    @Override // defpackage.yxv
    public final void c(yxw yxwVar) {
        yxt.m(this.a, yxwVar.c, f(yxwVar, 0));
        yxt.m(this.b, yxwVar.c, f(yxwVar, 1));
    }
}
