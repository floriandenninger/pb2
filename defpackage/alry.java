package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alry implements Runnable {
    final /* synthetic */ alsc a;
    final /* synthetic */ alrz b;

    public alry(alrz alrzVar, alsc alscVar) {
        this.b = alrzVar;
        this.a = alscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.b.a) {
            alsa alsaVar = this.b.b;
            if (alsaVar != null) {
                alsc alscVar = this.a;
                synchronized (alscVar.a) {
                    alta.o(alscVar.c, "Task is not yet complete");
                    Exception exc = alscVar.e;
                    if (exc == null) {
                        obj = alscVar.d;
                    } else {
                        throw new alsb(exc);
                    }
                }
                alsaVar.a(obj);
            }
        }
    }
}
