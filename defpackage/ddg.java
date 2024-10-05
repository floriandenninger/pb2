package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddg implements Executor {
    private final /* synthetic */ int a;

    public ddg(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            runnable.run();
        } else if (i != 1) {
            runnable.run();
        } else {
            ddn.k(runnable);
        }
    }
}
