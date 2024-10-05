package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baqn implements Callable {
    final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;

    public baqn(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        if (this.b != 0) {
            this.a.run();
            return null;
        }
        this.a.run();
        return null;
    }
}
