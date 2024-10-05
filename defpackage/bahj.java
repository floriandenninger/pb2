package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bahj implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    public bahj(Executor executor, int i, boolean z, int i2) {
        this.a = executor;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new bahf(this, runnable));
    }
}
