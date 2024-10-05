package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yss {
    private final ysw a;
    private long b = 0;

    public yss(ysw yswVar) {
        new CopyOnWriteArraySet();
        this.a = yswVar;
    }

    public final synchronized void a(long j) {
        this.b = j;
    }

    public final boolean b() {
        return this.b == 0 || this.a.a() < this.b;
    }
}
