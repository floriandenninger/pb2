package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abnw implements Runnable {
    public final /* synthetic */ abnz a;
    private final /* synthetic */ int b;

    public /* synthetic */ abnw(abnz abnzVar, int i) {
        this.b = i;
        this.a = abnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.f();
        } else {
            this.a.k(true);
        }
    }
}
