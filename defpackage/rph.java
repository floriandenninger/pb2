package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rph implements rpu {
    public final Object a = new Object();
    public final rpi b;
    private final Executor c;

    public rph(Executor executor, rpi rpiVar) {
        this.c = executor;
        this.b = rpiVar;
    }

    @Override // defpackage.rpu
    public final void a(rpt rptVar) {
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new rpg(this, rptVar));
        }
    }
}
