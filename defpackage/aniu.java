package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aniu extends anhb implements RunnableFuture {
    private volatile anhx a;

    public aniu(anfy anfyVar) {
        this.a = new anis(this, anfyVar);
    }

    public static aniu f(anfy anfyVar) {
        return new aniu(anfyVar);
    }

    public static aniu g(Callable callable) {
        return new aniu(callable);
    }

    public static aniu h(Runnable runnable, Object obj) {
        return new aniu(Executors.callable(runnable, obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final String b() {
        anhx anhxVar = this.a;
        if (anhxVar == null) {
            return super.b();
        }
        String valueOf = String.valueOf(anhxVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.anfm
    protected final void qf() {
        anhx anhxVar;
        if (p() && (anhxVar = this.a) != null) {
            anhxVar.h();
        }
        this.a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        anhx anhxVar = this.a;
        if (anhxVar != null) {
            anhxVar.run();
        }
        this.a = null;
    }

    public aniu(Callable callable) {
        this.a = new anit(this, callable);
    }
}
