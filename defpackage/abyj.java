package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abyj implements Runnable {
    public final /* synthetic */ acio a;
    private final /* synthetic */ int b;

    public /* synthetic */ abyj(acio acioVar, int i) {
        this.b = i;
        this.a = acioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a(1, null);
        } else {
            if (i == 1) {
                this.a.a(4, null);
                return;
            }
            acio acioVar = this.a;
            acioVar.c.aG(22);
            acioVar.c.r();
        }
    }
}
