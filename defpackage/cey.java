package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
final class cey implements Executor {
    public static final cey a;
    private static final /* synthetic */ cey[] b;

    static {
        cey ceyVar = new cey();
        a = ceyVar;
        b = new cey[]{ceyVar};
    }

    private cey() {
    }

    public static cey[] values() {
        return (cey[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
