package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yyu implements Callable {
    private final Callable a;
    private final yyp b;
    private final yyx c;

    public yyu(yyp yypVar, Callable callable) {
        this.a = callable;
        this.b = yypVar;
        yyx yyxVar = new yyx("SPAWN", yypVar.f, 2);
        this.c = yyxVar;
        yypVar.a(yyxVar);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        yyr.k(this.b);
        this.c.b();
        try {
            return this.a.call();
        } finally {
        }
    }
}
