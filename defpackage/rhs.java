package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhs implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ rid b;
    private final /* synthetic */ int c;

    public rhs(rid ridVar, long j, int i) {
        this.c = i;
        this.b = ridVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.b.y(this.a, true);
            this.b.l().r(new AtomicReference());
        } else {
            this.b.M().j.b(this.a);
            this.b.aF().j.b("Session timeout duration set", Long.valueOf(this.a));
        }
    }
}
