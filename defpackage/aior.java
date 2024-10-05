package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aior {
    final aild a;
    final ajby b;
    final ypa c;
    final Set d;
    final aiov e;
    final Set f;
    final aigv g;

    public aior(aigv aigvVar, aild aildVar, ajby ajbyVar, ypa ypaVar, Set set, aiov aiovVar, Set set2) {
        this.g = aigvVar;
        this.a = aildVar;
        this.b = ajbyVar;
        this.c = ypaVar;
        this.d = set;
        this.e = aiovVar;
        this.f = set2;
    }

    public final void a() {
        this.c.g(this.g);
        this.c.g(this.a);
        aypn aypnVar = this.e.a;
        final ajby ajbyVar = this.b;
        ajbyVar.getClass();
        final int i = 1;
        aypnVar.X(new ayrs() { // from class: aioq
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    ajbyVar.b((ahef) obj);
                } else {
                    ajbyVar.c((ahej) obj);
                }
            }
        });
        aypn aypnVar2 = this.e.i;
        final ajby ajbyVar2 = this.b;
        ajbyVar2.getClass();
        final int i2 = 0;
        aypnVar2.X(new ayrs() { // from class: aioq
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    ajbyVar2.b((ahef) obj);
                } else {
                    ajbyVar2.c((ahej) obj);
                }
            }
        });
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            aigb.b((aiga) it.next());
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((aifm) it2.next()).a();
        }
    }
}
