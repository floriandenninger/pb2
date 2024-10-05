package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gmr implements Runnable {
    public final /* synthetic */ gna a;
    private final /* synthetic */ int b;

    public /* synthetic */ gmr(gna gnaVar, int i) {
        this.b = i;
        this.a = gnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.d();
        } else {
            this.a.b();
        }
    }
}
