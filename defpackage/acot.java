package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acot implements Runnable {
    public final /* synthetic */ acou a;
    private final /* synthetic */ int b;

    public /* synthetic */ acot(acou acouVar, int i) {
        this.b = i;
        this.a = acouVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.o();
        } else {
            this.a.d();
        }
    }
}
