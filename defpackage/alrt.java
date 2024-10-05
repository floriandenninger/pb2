package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alrt implements alsd {
    public final Object a = new Object();
    public final alru b;
    private final Executor c;

    public alrt(Executor executor, alru alruVar) {
        this.c = executor;
        this.b = alruVar;
    }

    @Override // defpackage.alsd
    public final void a(alsc alscVar) {
        synchronized (this.a) {
        }
        this.c.execute(new alrs(this));
    }
}
