package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eha implements Runnable {
    final /* synthetic */ fdc a;
    final /* synthetic */ ehb b;

    public eha(ehb ehbVar, fdc fdcVar) {
        this.b = ehbVar;
        this.a = fdcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c((aifw) this.b.aB.get(), (afhz) this.b.G.get(), this.b.be);
        ehb ehbVar = this.b;
        ypa ypaVar = (ypa) ehbVar.h.get();
        Set<few> set = (Set) ehbVar.D.get();
        actg actgVar = (actg) ehbVar.E.get();
        for (few fewVar : set) {
            if (fewVar.c()) {
                fewVar.b(actgVar);
                ynz a = fewVar.a();
                if (a != null) {
                    ypaVar.d(a);
                }
            }
        }
        aarh b = ((aabt) ehbVar.aS.get()).b();
        ypaVar.d(new fdd(b.k));
        ypaVar.d(new fdv(b.l));
        ypaVar.d(new fdz(b.m));
        this.b.c();
    }
}
