package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yna implements ThreadFactory {
    public final int a;
    public final String b;
    private final ThreadFactory c;

    public yna(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.c.newThread(new ymz(this, runnable));
    }

    public yna(String str) {
        this(10, str);
    }
}
