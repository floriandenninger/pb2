package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rpn implements rpu {
    public final Object a = new Object();
    public final rpo b;
    private final Executor c;

    public rpn(Executor executor, rpo rpoVar) {
        this.c = executor;
        this.b = rpoVar;
    }

    @Override // defpackage.rpu
    public final void a(rpt rptVar) {
        if (rptVar.k()) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new rpm(this, rptVar));
            }
        }
    }
}
