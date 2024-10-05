package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yyv implements Runnable {
    private final Runnable a;
    private final yyp b;
    private final yyx c;

    public yyv(yyp yypVar, Runnable runnable) {
        this.a = runnable;
        this.b = yypVar;
        yyx yyxVar = new yyx("SPAWN", yypVar.f, 2);
        this.c = yyxVar;
        yypVar.a(yyxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        yyr.k(this.b);
        this.c.b();
        try {
            this.a.run();
        } finally {
        }
    }
}
