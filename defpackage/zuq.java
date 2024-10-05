package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zuq implements Runnable {
    public final /* synthetic */ zur a;
    private final /* synthetic */ int b;

    public /* synthetic */ zuq(zur zurVar, int i) {
        this.b = i;
        this.a = zurVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hsz hszVar;
        if (this.b == 0) {
            zur zurVar = this.a;
            zvb zvbVar = zurVar.c;
            if (zvbVar != null) {
                zvbVar.a(Boolean.valueOf(zurVar.a.f));
                return;
            }
            return;
        }
        zur zurVar2 = this.a;
        if (zurVar2.a.c() == null || (hszVar = zurVar2.d) == null) {
            return;
        }
        boolean z = false;
        if (zurVar2.b && zurVar2.a.c().q()) {
            z = true;
        }
        hszVar.a(Boolean.valueOf(z));
    }
}
