package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yyq {
    final ayph a;
    final int b;
    final ArrayList c;

    public yyq(int i, ayph ayphVar) {
        amkq.E(true);
        this.b = i;
        this.a = ayphVar;
        this.c = new ArrayList(32);
    }

    private final void d(String str, Runnable runnable, boolean z) {
        if (runnable != null) {
            yyp yypVar = new yyp(str, runnable);
            yypVar.h = z;
            this.c.add(yypVar);
        }
    }

    public final void a(String str, Runnable runnable) {
        d(str, runnable, false);
    }

    public final void b(String str, Runnable runnable) {
        d(str, runnable, true);
    }

    public final void c(String str, Runnable runnable, boolean z) {
        if (z) {
            a(str, runnable);
        }
    }
}
