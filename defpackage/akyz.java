package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akyz implements Runnable {
    public final /* synthetic */ akze a;
    private final /* synthetic */ int b;

    public /* synthetic */ akyz(akze akzeVar, int i) {
        this.b = i;
        this.a = akzeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            akze akzeVar = this.a;
            synchronized (akzeVar.l) {
                akzeVar.w();
            }
            return;
        }
        akze akzeVar2 = this.a;
        akzeVar2.H();
        akzeVar2.G();
    }
}
