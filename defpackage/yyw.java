package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yyw implements ynf {
    @Override // defpackage.ynf
    public final Runnable a(Runnable runnable) {
        yyp a = yyr.a();
        return a != null ? new yyv(a, runnable) : runnable;
    }

    @Override // defpackage.ynf
    public final Callable b(Callable callable) {
        yyp a = yyr.a();
        return a != null ? new yyu(a, callable) : callable;
    }

    @Override // defpackage.ynf
    public final void c(Throwable th) {
    }

    @Override // defpackage.ynf
    public final void d() {
    }

    @Override // defpackage.ynf
    public final void e(Throwable th) {
    }
}
