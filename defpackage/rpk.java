package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rpk implements rpu {
    public final Object a = new Object();
    public final rpl b;
    private final Executor c;

    public rpk(Executor executor, rpl rplVar) {
        this.c = executor;
        this.b = rplVar;
    }

    @Override // defpackage.rpu
    public final void a(rpt rptVar) {
        if (rptVar.k() || ((rpx) rptVar).c) {
            return;
        }
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new rpj(this, rptVar));
        }
    }
}
