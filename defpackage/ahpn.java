package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahpn implements Runnable {
    public final /* synthetic */ ahpq a;
    public final /* synthetic */ acsa b;
    public final /* synthetic */ acsa c;
    private final /* synthetic */ int d;

    public /* synthetic */ ahpn(ahpq ahpqVar, acsa acsaVar, acsa acsaVar2, int i) {
        this.d = i;
        this.a = ahpqVar;
        this.b = acsaVar;
        this.c = acsaVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            ahpq ahpqVar = this.a;
            ahpqVar.a.F(this.b, this.c);
            return;
        }
        ahpq ahpqVar2 = this.a;
        ahpqVar2.a.o(this.b, this.c);
    }
}
