package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kby implements Runnable {
    public final /* synthetic */ kcd a;
    private final /* synthetic */ int b;

    public /* synthetic */ kby(kcd kcdVar, int i) {
        this.b = i;
        this.a = kcdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.e();
        } else {
            this.a.d();
        }
    }
}
