package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rpe implements rpu {
    public final Object a = new Object();
    public final rpf b;
    private final Executor c;

    public rpe(Executor executor, rpf rpfVar) {
        this.c = executor;
        this.b = rpfVar;
    }

    @Override // defpackage.rpu
    public final void a(rpt rptVar) {
        if (((rpx) rptVar).c) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new rpd(this));
            }
        }
    }
}
