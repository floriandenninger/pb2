package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crs implements Runnable {
    final /* synthetic */ crv a;

    public crs(crv crvVar) {
        this.a = crvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        crv crvVar = this.a;
        while (true) {
            boolean z = crvVar.c;
            try {
                crvVar.c((cru) crvVar.b.remove());
                crt crtVar = crvVar.d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
