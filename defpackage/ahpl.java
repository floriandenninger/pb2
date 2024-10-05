package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahpl implements Runnable {
    public final /* synthetic */ ahpq a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahpl(ahpq ahpqVar, int i) {
        this.b = i;
        this.a = ahpqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.E();
        } else {
            this.a.A();
        }
    }
}
