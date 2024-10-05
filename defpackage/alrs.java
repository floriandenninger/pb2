package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alrs implements Runnable {
    final /* synthetic */ alrt a;

    public alrs(alrt alrtVar) {
        this.a = alrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            alru alruVar = this.a.b;
            alqa alqaVar = ((alps) alruVar).a;
            alsf alsfVar = ((alps) alruVar).b;
            synchronized (alqaVar.d) {
                alqaVar.c.remove(alsfVar);
            }
        }
    }
}
