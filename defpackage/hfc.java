package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hfc implements Runnable {
    public final /* synthetic */ hfh a;
    private final /* synthetic */ int b;

    public /* synthetic */ hfc(hfh hfhVar, int i) {
        this.b = i;
        this.a = hfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.n.i(0);
        } else {
            this.a.l();
        }
    }
}
