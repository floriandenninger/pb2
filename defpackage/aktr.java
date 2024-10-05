package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aktr {
    public akvs a;
    public akvc b;
    private volatile boolean c = false;

    public final void a() {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (!this.c) {
                akvs akvsVar = this.a;
                if (!akvsVar.k) {
                    synchronized (akvsVar.h) {
                        if (!akvsVar.k) {
                            akvsVar.k = true;
                            avui avuiVar = akvsVar.l.b().s;
                            if (avuiVar == null) {
                                avuiVar = avui.a;
                            }
                            if (avuiVar.f) {
                                akvsVar.b.g(akvsVar);
                                akvsVar.e.p(akvsVar);
                                akvsVar.f.a(akvsVar);
                                akvsVar.i = akvsVar.c.c().d();
                            }
                        }
                    }
                }
                this.b.a();
                this.c = true;
            }
        }
    }
}
