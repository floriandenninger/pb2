package defpackage;

import android.content.Context;
import com.facebook.litho.ComponentTree;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhn implements Runnable {
    final /* synthetic */ ComponentTree a;
    private final /* synthetic */ int b;

    public dhn(ComponentTree componentTree, int i) {
        this.b = i;
        this.a = componentTree;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dlg dlgVar;
        Context context;
        dkt a;
        if (this.b == 0) {
            this.a.i();
            return;
        }
        ComponentTree componentTree = this.a;
        synchronized (componentTree) {
            djx djxVar = componentTree.t;
            if (djxVar == null && (djxVar = componentTree.u) == null) {
                return;
            }
            taz u = componentTree.u();
            if (u != null) {
                dhe dheVar = componentTree.h;
                dlgVar = did.l(dheVar, u, u.a(dheVar, 8));
            } else {
                dlgVar = null;
            }
            if (!djxVar.e.isEmpty()) {
                int size = djxVar.e.size();
                for (int i = 0; i < size; i++) {
                    dha dhaVar = ((dju) ((dup) djxVar.e.get(i)).a).b;
                    if (dha.z(dhaVar) && (a = dhx.a((context = djxVar.c.b), dhaVar)) != null) {
                        a.b(context, dhaVar);
                    }
                }
            }
            if (dlgVar != null) {
                taz.d(dlgVar);
            }
        }
    }
}
