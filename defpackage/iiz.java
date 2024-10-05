package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iiz implements Runnable {
    public final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;

    public /* synthetic */ iiz(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    public iiz(Runnable runnable, int i, byte[] bArr) {
        this.b = i;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            Runnable runnable = this.a;
            int i2 = ijo.bC;
            runnable.run();
            return;
        }
        if (i == 1) {
            Process.setThreadPriority(10);
            this.a.run();
            return;
        }
        if (i == 2) {
            Runnable runnable2 = this.a;
            sja.a.set(true);
            runnable2.run();
        } else {
            if (i == 3) {
                uqq.m(this.a);
                return;
            }
            Runnable runnable3 = this.a;
            Process.setThreadPriority(10);
            runnable3.run();
        }
    }
}
