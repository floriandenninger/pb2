package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoy implements Runnable {
    final /* synthetic */ apc a;

    public aoy(apc apcVar) {
        this.a = apcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        apc apcVar = this.a;
        if (apcVar.c == 0) {
            apcVar.d = true;
            apcVar.f.e(aod.ON_PAUSE);
        }
        this.a.c();
    }
}
