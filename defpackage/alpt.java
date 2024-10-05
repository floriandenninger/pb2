package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alpt extends alpq {
    final /* synthetic */ alpq a;
    final /* synthetic */ alqa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpt(alqa alqaVar, alsf alsfVar, alpq alpqVar) {
        super(alsfVar);
        this.b = alqaVar;
        this.a = alpqVar;
    }

    @Override // defpackage.alpq
    public final void a() {
        alqa alqaVar = this.b;
        alpq alpqVar = this.a;
        if (alqaVar.k != null || alqaVar.e) {
            if (alqaVar.e) {
                alqaVar.b.add(alpqVar);
                return;
            } else {
                alpqVar.run();
                return;
            }
        }
        alqaVar.b.add(alpqVar);
        alqaVar.j = new alpz(alqaVar);
        alqaVar.e = true;
        if (alqaVar.a.bindService(alqaVar.f, alqaVar.j, 1)) {
            return;
        }
        alqaVar.e = false;
        Iterator it = alqaVar.b.iterator();
        while (it.hasNext()) {
            ((alpq) it.next()).b(new alqb());
        }
        alqaVar.b.clear();
    }
}
