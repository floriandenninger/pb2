package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aykj implements Runnable {
    final /* synthetic */ aybr a;
    final /* synthetic */ ayae b;
    final /* synthetic */ aykk c;

    public aykj(aykk aykkVar, aybr aybrVar, ayae ayaeVar) {
        this.c = aykkVar;
        this.a = aybrVar;
        this.b = ayaeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aykk aykkVar = this.c;
        aykx aykxVar = aykkVar.c;
        if (aykkVar != aykxVar.s) {
            return;
        }
        aykxVar.m(this.a);
        if (this.b != ayae.SHUTDOWN) {
            this.c.c.G.b(2, "Entering {0} state with picker: {1}", this.b, this.a);
            this.c.c.q.a(this.b);
        }
    }
}
