package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class umf implements anhh {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ umg c;
    private final String d;

    public umf(umg umgVar, boolean z, long j) {
        this.c = umgVar;
        this.a = z;
        this.b = j;
        this.d = uou.y(umgVar.c);
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int min = Math.min(((amru) obj).size(), 10);
        umg umgVar = this.c;
        umgVar.a.c(this.d, "OK", min, umgVar.b, this.a);
        this.c.a.e(System.currentTimeMillis() - this.b, this.d, "OK", min, this.c.b, this.a);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        String U = tyo.U(th);
        umg umgVar = this.c;
        umgVar.a.c(this.d, U, -1, umgVar.b, this.a);
        this.c.a.e(System.currentTimeMillis() - this.b, this.d, U, -1, this.c.b, this.a);
    }
}
