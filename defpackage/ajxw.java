package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajxw implements ajxy {
    private final aahd a;
    private final Map b;
    private final acqz c;

    public ajxw(aahd aahdVar, Map map, acqz acqzVar) {
        aahdVar.getClass();
        this.a = aahdVar;
        this.b = map;
        this.c = acqzVar;
    }

    public static void b(ci ciVar, atdc atdcVar, aahd aahdVar, ajut ajutVar, Map map, acqz acqzVar, aalw aalwVar, lru lruVar) {
        ajxw ajxwVar = new ajxw(aahdVar, map, acqzVar != null ? acqzVar : new acqz() { // from class: ajxv
            @Override // defpackage.acqz
            public final acra mM() {
                return acra.l;
            }
        });
        if (akbc.k(atdcVar, null, lruVar, aalwVar)) {
            aone builder = atdcVar.toBuilder();
            amru j = akbc.j(atdcVar, null, lruVar, aalwVar);
            builder.copyOnWrite();
            ((atdc) builder.instance).c = atdc.emptyProtobufList();
            builder.aD(j);
            atdcVar = (atdc) builder.build();
        }
        atdc atdcVar2 = atdcVar;
        ajxz ajxzVar = new ajxz();
        ajxz.aM(ajxzVar, atdcVar2, ajutVar, acqzVar, null, true);
        ajxzVar.ag = ajxwVar;
        ajxzVar.qi(ciVar.getSupportFragmentManager(), null);
    }

    public static void c(ci ciVar, atdc atdcVar, aahd aahdVar, ajut ajutVar, Map map) {
        b(ciVar, atdcVar, aahdVar, ajutVar, map, null, null, null);
    }

    @Override // defpackage.ajxy
    public final void a(atda atdaVar) {
        apxf dk;
        if (atdaVar == null) {
            return;
        }
        if (adyu.dl(atdaVar) != null) {
            dk = adyu.dl(atdaVar);
        } else {
            dk = adyu.dk(atdaVar);
        }
        HashMap hashMap = new HashMap();
        Map map = this.b;
        if (map != null) {
            hashMap.putAll(map);
        }
        if (dk != null) {
            acra mM = this.c.mM();
            if (mM != null) {
                mM.I(3, new acqx(dk.c), acrc.f(dk, hashMap));
            }
            this.a.c(dk, hashMap);
        }
    }
}
