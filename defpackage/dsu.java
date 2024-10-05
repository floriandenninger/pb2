package defpackage;

import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dsu implements Runnable {
    final /* synthetic */ dkp a;

    public dsu(dkp dkpVar) {
        this.a = dkpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        djx djxVar;
        dkp dkpVar = this.a;
        ComponentTree componentTree = dkpVar.r;
        if (componentTree == null || (djxVar = componentTree.t) == null) {
            return;
        }
        int c = djxVar.c();
        for (int i = 0; i < c; i++) {
            diy diyVar = djxVar.f(i).e;
            if (diyVar != null) {
                if (did.e == null) {
                    did.e = new dkd();
                }
                did.e.a = dkpVar;
                did.e.b = null;
                diyVar.a(did.e);
                did.e.a = null;
                did.e.b = null;
            }
        }
    }
}
