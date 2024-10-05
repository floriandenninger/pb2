package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acnm implements Runnable {
    public final /* synthetic */ acnp a;
    private final /* synthetic */ int b;

    public /* synthetic */ acnm(acnp acnpVar, int i) {
        this.b = i;
        this.a = acnpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            acnp acnpVar = this.a;
            yjk.e();
            if (acnpVar.i != null && !acnpVar.j) {
                baod baodVar = acnpVar.i;
                baqu baquVar = (baqu) baodVar;
                baquVar.a.a.a(true);
                synchronized (baquVar.a.b) {
                    baqv baqvVar = ((baqu) baodVar).a;
                }
            }
            acnpVar.j = true;
            return;
        }
        acnp acnpVar2 = this.a;
        yjk.e();
        if (acnpVar2.i != null && acnpVar2.j) {
            baod baodVar2 = acnpVar2.i;
            baqu baquVar2 = (baqu) baodVar2;
            baquVar2.a.a.a(false);
            synchronized (baquVar2.a.b) {
                baqv baqvVar2 = ((baqu) baodVar2).a;
            }
        }
        acnpVar2.j = false;
    }
}
