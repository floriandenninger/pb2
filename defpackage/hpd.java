package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hpd extends hoo {
    static final amml a = new hpc();
    static final amml b = new hom(0);

    @Override // defpackage.hoo
    public final void a(axdk axdkVar, aqqp aqqpVar) {
        if (axdkVar.n().b == 1) {
            axep n = axdkVar.n();
            Map unmodifiableMap = Collections.unmodifiableMap((n.b == 1 ? (axem) n.c : axem.a).b);
            ArrayList arrayList = new ArrayList(unmodifiableMap.keySet());
            Collections.sort(arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Long l = (Long) arrayList.get(i);
                Double d = (Double) unmodifiableMap.get(l);
                if (d != null) {
                    aone createBuilder = aqqo.a.createBuilder();
                    long longValue = l.longValue();
                    createBuilder.copyOnWrite();
                    aqqo aqqoVar = (aqqo) createBuilder.instance;
                    aqqoVar.b |= 1;
                    aqqoVar.c = longValue;
                    double doubleValue = d.doubleValue();
                    createBuilder.copyOnWrite();
                    aqqo aqqoVar2 = (aqqo) createBuilder.instance;
                    aqqoVar2.b |= 2;
                    aqqoVar2.d = doubleValue;
                    aqqo aqqoVar3 = (aqqo) createBuilder.build();
                    aqqpVar.copyOnWrite();
                    ((aqqu) aqqpVar.instance).g(aqqoVar3);
                }
            }
        }
    }
}
