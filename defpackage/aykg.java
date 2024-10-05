package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aykg {
    private Executor a;
    private final aynz b;

    public aykg(aynz aynzVar) {
        this.b = aynzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final synchronized Executor a() {
        if (this.a == null) {
            ?? b = this.b.b();
            b.getClass();
            this.a = b;
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        Executor executor = this.a;
        if (executor != null) {
            this.b.c(executor);
            this.a = null;
        }
    }
}
