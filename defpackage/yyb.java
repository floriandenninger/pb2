package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yyb extends yxv {
    final yya a = new yya();
    final yya b = new yya();
    private final long[] c;
    private final long[] d;

    public yyb(long[] jArr, long[] jArr2) {
        this.c = jArr;
        this.d = jArr2;
    }

    @Override // defpackage.yxv
    public final void b(yxw yxwVar) {
        this.a.c(yxwVar, yxt.d(this.c, yxwVar.c) != 0);
        this.b.c(yxwVar, yxt.d(this.d, yxwVar.c) != 0);
    }

    @Override // defpackage.yxv
    public final void c(yxw yxwVar) {
        this.a.b(yxwVar, yxt.d(this.c, yxwVar.c));
        this.b.b(yxwVar, yxt.d(this.d, yxwVar.c));
    }
}
