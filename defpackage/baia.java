package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baia implements Executor {
    private final Executor a;

    public baia(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        bahz bahzVar = new bahz(runnable, Thread.currentThread());
        this.a.execute(bahzVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = bahzVar.b;
        if (inlineExecutionProhibitedException != null) {
            throw inlineExecutionProhibitedException;
        }
        bahzVar.a = null;
    }
}
