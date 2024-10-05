package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahpo implements Runnable {
    public final /* synthetic */ ahpq a;
    public final /* synthetic */ acsa b;
    public final /* synthetic */ asht c;
    private final /* synthetic */ int d;

    public /* synthetic */ ahpo(ahpq ahpqVar, acsa acsaVar, asht ashtVar, int i) {
        this.d = i;
        this.a = ahpqVar;
        this.b = acsaVar;
        this.c = ashtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            ahpq ahpqVar = this.a;
            ahpqVar.a.u(this.b, this.c);
            return;
        }
        if (i != 1) {
            ahpq ahpqVar2 = this.a;
            ahpqVar2.a.w(this.b, this.c);
            return;
        }
        ahpq ahpqVar3 = this.a;
        ahpqVar3.a.q(this.b, this.c);
    }
}
