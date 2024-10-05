package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dai implements Runnable {
    final /* synthetic */ daj a;

    public dai(daj dajVar) {
        this.a = dajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        daj dajVar = this.a;
        if (dajVar.b.a) {
            dajVar.a.b();
        }
    }
}
