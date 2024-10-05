package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahpi implements Runnable {
    public final /* synthetic */ ahpq a;
    public final /* synthetic */ Runnable b;
    private final /* synthetic */ int c;

    public /* synthetic */ ahpi(ahpq ahpqVar, Runnable runnable, int i) {
        this.c = i;
        this.a = ahpqVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            ahpq ahpqVar = this.a;
            ahpqVar.b.add(this.b);
        } else {
            ahpq ahpqVar2 = this.a;
            ahpqVar2.c.add(this.b);
        }
    }
}
