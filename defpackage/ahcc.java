package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahcc implements afia {
    private final AtomicLong c = new AtomicLong();
    public final AtomicLong a = new AtomicLong();
    public final AtomicInteger b = new AtomicInteger();

    @Override // defpackage.afia
    public final void a(afio afioVar) {
        if (afioVar.a == 1) {
            this.a.addAndGet(afioVar.c);
            this.b.addAndGet(afioVar.b);
        }
    }

    @Override // defpackage.afia
    public final /* synthetic */ void b(Exception exc) {
    }

    @Override // defpackage.afia
    public final /* synthetic */ void c(int i) {
    }

    public final long e() {
        return this.c.get();
    }

    public final void f() {
        this.c.set(0L);
        this.a.set(0L);
        this.b.set(0);
    }

    @Override // defpackage.afia
    public final void rP(long j) {
        this.c.addAndGet(j);
    }
}
