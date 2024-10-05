package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpb extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final String a;
    final int b;
    final boolean c;

    public azpb(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread azpaVar = this.c ? new azpa(runnable, str) : new Thread(runnable, str);
        azpaVar.setPriority(this.b);
        azpaVar.setDaemon(true);
        return azpaVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17);
        sb.append("RxThreadFactory[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public azpb(String str, int i) {
        this(str, i, false);
    }

    public azpb(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
