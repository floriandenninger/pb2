package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class juy {
    public final fjs a;
    public final azrw b;
    public final Executor c;
    public final ExecutorService d;

    public juy(fjs fjsVar, azrw azrwVar, Executor executor, ExecutorService executorService) {
        this.a = fjsVar;
        this.b = azrwVar;
        this.c = executor;
        this.d = executorService;
    }

    public final agsl a() {
        return ((agof) this.b.get()).a().i();
    }

    public final Future b(String str, ykl yklVar) {
        return this.d.submit(new juu(this, str, yklVar, 0));
    }
}
