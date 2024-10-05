package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yyz implements amis {
    public final yyp a;
    public final yyx b;

    public yyz(yyp yypVar) {
        this.a = yypVar;
        yyx yyxVar = new yyx("SPAWN", yypVar.f, 2);
        this.b = yyxVar;
        yypVar.a(yyxVar);
    }

    @Override // defpackage.amis, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.a();
        yyr.j(this.a);
    }
}
