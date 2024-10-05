package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class affb implements Runnable {
    final /* synthetic */ affc a;

    public affb(affc affcVar) {
        this.a = affcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        affc affcVar = this.a;
        if (!affcVar.i || (runnable = affcVar.g) == null || affcVar.h == null) {
            return;
        }
        runnable.run();
        this.a.h.postDelayed(this, 2000L);
    }
}
