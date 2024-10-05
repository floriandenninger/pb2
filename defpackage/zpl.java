package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zpl implements Runnable {
    public final /* synthetic */ zpw a;
    private final /* synthetic */ int b;

    public /* synthetic */ zpl(zpw zpwVar, int i) {
        this.b = i;
        this.a = zpwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            zpw zpwVar = this.a;
            if (zpwVar.G) {
                return;
            }
            zpwVar.G = true;
            zpwVar.b.postDelayed(zpwVar.I, 66L);
            return;
        }
        zpw zpwVar2 = this.a;
        zpwVar2.G = false;
        zpwVar2.c();
    }
}
