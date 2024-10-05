package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fhj {
    public final shf b;
    public long c;
    private final aypn e;
    private final Executor f;
    public final AtomicInteger a = new AtomicInteger(0);
    private final ayqw d = new ayqw();

    public fhj(aypn aypnVar, Executor executor, shf shfVar) {
        this.e = aypnVar;
        this.f = executor;
        this.b = shfVar;
        this.c = shfVar.d();
    }

    public final void a() {
        this.d.c();
        this.a.set(0);
        this.d.d(this.e.E(azre.b(this.f)).X(new ayrs() { // from class: fhi
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                fhj.this.a.incrementAndGet();
            }
        }));
        this.c = this.b.d();
    }
}
