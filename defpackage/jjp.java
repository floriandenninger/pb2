package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jjp extends jhl {
    private static atrc h(agnu agnuVar) {
        atrb atrbVar;
        if (agnuVar == null) {
            return null;
        }
        String q = fhe.q(agnuVar.a);
        q.getClass();
        amkq.O(!q.isEmpty(), "key cannot be empty");
        aone createBuilder = atrf.a.createBuilder();
        createBuilder.copyOnWrite();
        atrf atrfVar = (atrf) createBuilder.instance;
        atrfVar.c |= 1;
        atrfVar.d = q;
        atrc atrcVar = new atrc(createBuilder);
        aomf byteString = agnuVar.b.toByteString();
        aone aoneVar = atrcVar.a;
        aoneVar.copyOnWrite();
        atrf atrfVar2 = (atrf) aoneVar.instance;
        atrfVar2.c |= 8;
        atrfVar2.g = byteString;
        int bO = anaf.bO(agnuVar.b.h);
        if (bO == 0) {
            bO = 1;
        }
        int i = bO - 1;
        if (i == 1) {
            atrbVar = atrb.OFFLINE_VIDEO_POLICY_ACTION_OK;
        } else if (i == 3) {
            atrbVar = atrb.OFFLINE_VIDEO_POLICY_ACTION_DISABLE;
        } else {
            atrbVar = atrb.OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN;
        }
        aone aoneVar2 = atrcVar.a;
        aoneVar2.copyOnWrite();
        atrf atrfVar3 = (atrf) aoneVar2.instance;
        atrfVar3.e = atrbVar.e;
        atrfVar3.c |= 2;
        Long valueOf = Long.valueOf(agnuVar.b());
        aone aoneVar3 = atrcVar.a;
        long longValue = valueOf.longValue();
        aoneVar3.copyOnWrite();
        atrf atrfVar4 = (atrf) aoneVar3.instance;
        atrfVar4.c |= 4;
        atrfVar4.f = longValue;
        atpg atpgVar = agnuVar.b.l;
        if (atpgVar == null) {
            atpgVar = atpg.a;
        }
        aone aoneVar4 = atrcVar.a;
        aoneVar4.copyOnWrite();
        atrf atrfVar5 = (atrf) aoneVar4.instance;
        atpgVar.getClass();
        atrfVar5.h = atpgVar;
        atrfVar5.c |= 16;
        Long valueOf2 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(agnuVar.d));
        aone aoneVar5 = atrcVar.a;
        long longValue2 = valueOf2.longValue();
        aoneVar5.copyOnWrite();
        atrf atrfVar6 = (atrf) aoneVar5.instance;
        atrfVar6.c |= 32;
        atrfVar6.i = longValue2;
        atqq atqqVar = agnuVar.b;
        if (atqqVar.c == 15) {
            atpf atpfVar = (atpf) atqqVar.d;
            aone aoneVar6 = atrcVar.a;
            aoneVar6.copyOnWrite();
            atrf atrfVar7 = (atrf) aoneVar6.instance;
            atpfVar.getClass();
            atrfVar7.j = atpfVar;
            atrfVar7.c |= 64;
        }
        return atrcVar;
    }

    private static void i(aalc aalcVar, agnv agnvVar) {
        atrc h = h(agnvVar.j);
        if (h != null) {
            aalcVar.k(h);
        }
    }

    @Override // defpackage.jhl
    protected final amsx a(agsw agswVar) {
        atrc h;
        amsv i = amsx.i();
        for (agnv agnvVar : agswVar.j()) {
            if (agnvVar != null && (h = h(agnvVar.j)) != null) {
                i.c(h);
            }
        }
        return i.g();
    }

    @Override // defpackage.jhl
    protected final void b(aalc aalcVar, agnv agnvVar) {
        i(aalcVar, agnvVar);
    }

    @Override // defpackage.jhl
    protected final void e(aalc aalcVar, String str) {
        aalcVar.g(fhe.q(str));
    }

    @Override // defpackage.jhl
    protected final void g(aalc aalcVar, agnv agnvVar) {
        i(aalcVar, agnvVar);
    }
}
