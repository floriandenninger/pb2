package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abua implements Runnable {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final abwp d;

    public abua(abwp abwpVar, boolean z, boolean z2, boolean z3) {
        this.d = abwpVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final abwp abwpVar = this.d;
        if (abwpVar != null) {
            if (this.a) {
                if (abwpVar.b.S) {
                    zga.b("The stream failed to transition to an active state after an initial period.");
                    abwpVar.b.s.post(new Runnable() { // from class: abwo
                        @Override // java.lang.Runnable
                        public final void run() {
                            abwp.this.b.i.m();
                        }
                    });
                    return;
                }
                return;
            }
            if (!this.b) {
                if (this.c) {
                    abwpVar.b.i.d();
                    return;
                }
                return;
            }
            abxc abxcVar = abwpVar.b.i;
            int i = abxcVar.a;
            if (i == 6) {
                abxcVar.f(6);
            } else if (i == 5) {
                abxcVar.f(5);
            } else {
                zga.l("LiveSC: ignoring notifyStreamBroadcastStatusIsReady");
                abxcVar.h();
            }
        }
    }
}
