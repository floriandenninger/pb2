package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class veb implements vel {
    public final vea a;
    private final shf b;
    private final long c;
    private long d;

    public veb(vea veaVar, shf shfVar, long j, TimeUnit timeUnit) {
        this.a = veaVar;
        this.b = shfVar;
        this.c = timeUnit.toMillis(j);
        this.d = shfVar.c();
    }

    @Override // defpackage.vel
    public final void a(int i) {
        this.a.a(i);
        if (this.b.c() - this.d >= this.c) {
            this.a.b();
            this.d = this.b.c();
        }
    }

    @Override // defpackage.vel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }
}
