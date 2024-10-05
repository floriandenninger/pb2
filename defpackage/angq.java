package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class angq implements Executor {
    public static final angq a;
    private static final /* synthetic */ angq[] b;

    static {
        angq angqVar = new angq();
        a = angqVar;
        b = new angq[]{angqVar};
    }

    private angq() {
    }

    public static angq[] values() {
        return (angq[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
