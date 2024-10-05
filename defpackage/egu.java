package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class egu implements Runnable {
    final /* synthetic */ ypa a;
    final /* synthetic */ ehb b;
    private final /* synthetic */ int c;

    public egu(ehb ehbVar, ypa ypaVar, int i) {
        this.c = i;
        this.b = ehbVar;
        this.a = ypaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            try {
                afso afsoVar = (afso) this.b.r.get();
                this.a.g(afsoVar);
                ((fap) this.b.s.get()).g();
                afsoVar.b();
                return;
            } catch (IOException e) {
                zga.d("Failed to read offline browse from store", e);
                return;
            }
        }
        if (i == 1) {
            afso afsoVar2 = (afso) this.b.t.get();
            this.a.g(afsoVar2);
            afsoVar2.b();
            return;
        }
        if (i == 2) {
            this.a.g((zju) this.b.ac.get());
            return;
        }
        if (i == 3) {
            this.a.h(this.b, ehb.class);
            return;
        }
        afsm afsmVar = (afsm) this.b.i.get();
        afsi.a(afsmVar);
        this.a.g(this.b.l.get());
        if (evr.aH((aadw) this.b.au.get())) {
            acpf acpfVar = (acpf) this.b.j.get();
            afsmVar.b = acpfVar.a((afqj) this.b.k.get());
            afsmVar.g();
            acpfVar.b();
            acpfVar.d((Executor) this.b.am.get());
        }
        this.b.c();
    }
}
