package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayjm implements Runnable {
    final /* synthetic */ ayjn a;
    private final /* synthetic */ int b;

    public ayjm(ayjn ayjnVar, int i) {
        this.b = i;
        this.a = ayjnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ayjn ayjnVar = this.a;
            ayjnVar.c.l.remove(ayjnVar.a);
            if (this.a.c.p.a == ayae.SHUTDOWN && this.a.c.l.isEmpty()) {
                this.a.c.e();
                return;
            }
            return;
        }
        ayjn ayjnVar2 = this.a;
        ayjp ayjpVar = ayjnVar2.c;
        ayjpVar.r = null;
        if (ayjpVar.q != null) {
            amkq.O(ayjpVar.o == null, "Unexpected non-null activeTransport");
            ayjn ayjnVar3 = this.a;
            ayjnVar3.a.j(ayjnVar3.c.q);
            return;
        }
        aygo aygoVar = ayjpVar.n;
        aygo aygoVar2 = ayjnVar2.a;
        if (aygoVar == aygoVar2) {
            ayjpVar.o = aygoVar2;
            this.a.c.n = null;
            this.a.c.b(ayae.READY);
        }
    }
}
