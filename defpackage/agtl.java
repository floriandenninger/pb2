package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agtl implements ynl {
    public final /* synthetic */ agto a;
    private final /* synthetic */ int b;

    public /* synthetic */ agtl(agto agtoVar, int i) {
        this.b = i;
        this.a = agtoVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            agto agtoVar = this.a;
            atra atraVar = (atra) obj;
            if (atraVar == null) {
                return;
            }
            String d = ((agof) agtoVar.e.get()).d();
            agsg agsgVar = (agsg) agtoVar.c.get();
            agsgVar.B(d, atraVar.d);
            agsgVar.I(d, atraVar.c);
            return;
        }
        if (i == 1) {
            agto agtoVar2 = this.a;
            ammv ammvVar = (ammv) obj;
            if (ammvVar == null || !ammvVar.h()) {
                return;
            }
            ((agof) agtoVar2.e.get()).a().m().D(((agnv) ammvVar.c()).m(), 0L);
            return;
        }
        agsw m = ((agof) this.a.e.get()).a().m();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            m.D(((agnv) it.next()).m(), 0L);
        }
    }
}
