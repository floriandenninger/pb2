package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayjb implements Runnable {
    final /* synthetic */ ayjp a;
    private final /* synthetic */ int b;

    public ayjb(ayjp ayjpVar, int i) {
        this.b = i;
        this.a = ayjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            if (this.a.p.a == ayae.IDLE) {
                this.a.d.a(2, "CONNECTING as requested");
                this.a.b(ayae.CONNECTING);
                this.a.h();
                return;
            }
            return;
        }
        if (i == 1) {
            ayjp ayjpVar = this.a;
            ayjpVar.i = null;
            ayjpVar.d.a(2, "CONNECTING after backoff");
            this.a.b(ayae.CONNECTING);
            this.a.h();
            return;
        }
        this.a.d.a(2, "Terminated");
        ayjp ayjpVar2 = this.a;
        ayjj ayjjVar = ayjpVar2.a;
        ayjjVar.b.j.v.remove(ayjpVar2);
        ayay.b(ayjjVar.b.j.H.c, ayjpVar2);
        ayjjVar.b.j.h();
    }
}
