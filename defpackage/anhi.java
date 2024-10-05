package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anhi implements Runnable {
    final /* synthetic */ Future a;

    public anhi(Future future) {
        this.a = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.cancel(false);
    }
}
