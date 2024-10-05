package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anik implements Runnable {
    final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;

    public anik(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.run();
        } else {
            this.a.run();
        }
    }

    public final String toString() {
        return this.b != 0 ? this.a.toString() : this.a.toString();
    }
}
