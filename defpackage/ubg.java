package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubg implements uau {
    private final ubr a;
    private final twx b;
    private final tzh c;

    public ubg(twx twxVar, ubr ubrVar, tzh tzhVar) {
        this.b = twxVar;
        this.a = ubrVar;
        this.c = tzhVar;
    }

    @Override // defpackage.uau
    public final void a(String str, aooy aooyVar, Throwable th) {
        tzk.g("BatchUpdateThreadStateCallback", "Failed to updated thread state for account: %s.", str);
        if (aooyVar != null) {
            for (aois aoisVar : ((aoit) aooyVar).d) {
                tzf c = this.c.c(17);
                ((tzj) c).l = str;
                c.h(aoisVar.c);
                c.i();
            }
        }
    }

    @Override // defpackage.uau
    public final void b(String str, aooy aooyVar, aooy aooyVar2) {
        tzk.e("BatchUpdateThreadStateCallback", "Successfully updated thread state for account: %s.", str);
        ArrayList arrayList = new ArrayList();
        for (aois aoisVar : ((aoit) aooyVar).d) {
            tzf a = this.c.a(aoic.SUCCEED_TO_UPDATE_THREAD_STATE);
            ((tzj) a).l = str;
            a.h(aoisVar.c);
            a.i();
            aokw aokwVar = aoisVar.d;
            if (aokwVar == null) {
                aokwVar = aokw.a;
            }
            int o = aobq.o(aokwVar.f);
            if (o != 0 && o == 3) {
                arrayList.addAll(aoisVar.c);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            this.a.b(this.b.b(str), arrayList, null);
        } catch (tww e) {
            tzk.c("BatchUpdateThreadStateCallback", e, "Account not found in scheduled callback.", new Object[0]);
        }
    }
}
