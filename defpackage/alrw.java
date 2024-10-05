package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alrw implements alsd {
    public final Object a = new Object();
    public final alrx b;
    private final Executor c;

    public alrw(Executor executor, alrx alrxVar) {
        this.c = executor;
        this.b = alrxVar;
    }

    @Override // defpackage.alsd
    public final void a(alsc alscVar) {
        if (alscVar.c()) {
            return;
        }
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new alrv(this, alscVar));
        }
    }
}
