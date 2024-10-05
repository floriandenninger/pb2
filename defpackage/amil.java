package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amil implements Runnable, amis {
    private amir a;
    private amir b;
    private final boolean c = uqq.n();
    private boolean d;
    private boolean e;

    public amil(amir amirVar) {
        this.a = amirVar;
        this.b = amirVar;
    }

    private final void b() {
        this.d = true;
        this.a.g(this.c && !this.e && uqq.n());
        this.a = null;
    }

    public final void a(anhy anhyVar) {
        if (this.d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (!this.e) {
            this.e = true;
            anhyVar.d(this, angq.a);
            return;
        }
        throw new IllegalStateException("Signal is already attached to future");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d || !this.e) {
            uqq.l(ajfg.e);
        } else {
            b();
        }
    }

    @Override // defpackage.amis, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        amir amirVar = this.b;
        this.b = null;
        try {
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                b();
            }
        } finally {
            amjw.i(amirVar);
        }
    }
}
