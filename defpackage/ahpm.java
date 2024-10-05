package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahpm implements Runnable {
    public final /* synthetic */ ahpq a;
    public final /* synthetic */ acsa b;
    private final /* synthetic */ int c;

    public /* synthetic */ ahpm(ahpq ahpqVar, acsa acsaVar, int i) {
        this.c = i;
        this.a = ahpqVar;
        this.b = acsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            ahpq ahpqVar = this.a;
            ahpqVar.a.D(this.b);
        } else {
            ahpq ahpqVar2 = this.a;
            ahpqVar2.a.n(this.b);
        }
    }
}
