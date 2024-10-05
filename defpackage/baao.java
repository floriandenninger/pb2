package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baao extends baam {
    public final Runnable a;

    public baao(Runnable runnable, long j, baan baanVar) {
        super(j, baanVar);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } finally {
            this.h.f();
        }
    }

    public final String toString() {
        return "Task[" + azth.g(this.a) + '@' + azth.h(this.a) + ", " + this.g + ", " + this.h + ']';
    }
}
