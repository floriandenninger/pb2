package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ailx extends Thread {
    final /* synthetic */ ailz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ailx(ailz ailzVar) {
        super("playerProxyUnregister");
        this.a = ailzVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ptk ptkVar;
        try {
            Thread.sleep(500L);
            ptkVar = this.a.a;
        } catch (InterruptedException unused) {
            ptkVar = this.a.a;
        } catch (Throwable th) {
            this.a.a.c(0);
            throw th;
        }
        ptkVar.c(0);
    }
}
