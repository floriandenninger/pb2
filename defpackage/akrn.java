package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akrn implements Runnable {
    public final /* synthetic */ akrq a;
    private final /* synthetic */ int b;

    public /* synthetic */ akrn(akrq akrqVar, int i) {
        this.b = i;
        this.a = akrqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.f();
        } else {
            this.a.e();
        }
    }
}
