package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tgd {
    public final shf a;
    private final tfn b;

    public tgd() {
    }

    public tgd(tfn tfnVar, shf shfVar) {
        this.b = tfnVar;
        this.a = shfVar;
    }

    public final void a(tgc tgcVar, View view) {
        b(tgcVar, tgj.b(view));
    }

    public final void b(final tgc tgcVar, final tgb tgbVar) {
        this.b.c(new tfm() { // from class: thc
            @Override // defpackage.tfm
            public final List a() {
                tgd tgdVar = tgd.this;
                tgb tgbVar2 = tgbVar;
                tgc tgcVar2 = tgcVar;
                amkq.O(tgbVar2 != null, "View is not instrumented.");
                aoae aoaeVar = tgbVar2.e;
                if (!aoaeVar.b.isEmpty()) {
                    Iterator it = aoaeVar.b.iterator();
                    while (it.hasNext()) {
                        ((tgr) it.next()).c(tgbVar2);
                    }
                }
                amkq.T(tgbVar2.d(), "VE is not impressed: %s {attached=%s}", tgbVar2, Boolean.valueOf(tgbVar2.a.m()));
                amkq.Q(tgbVar2.f() == 1, "VE is not visible: %s", tgbVar2);
                andp a = tfe.a();
                ArrayList arrayList = new ArrayList();
                sgf.O(tgbVar2, arrayList);
                return amru.r(new thj(a, arrayList, tgcVar2, tgdVar.a.c(), false));
            }
        });
    }
}
