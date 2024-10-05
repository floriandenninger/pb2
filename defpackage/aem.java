package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aem {
    static final aem a = new aem(null, null);
    final Runnable b;
    final Executor c;
    aem next;

    public aem(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
