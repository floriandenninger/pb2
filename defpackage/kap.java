package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kap implements kbj {
    private final List a;
    private final Map b;

    public kap(List list, Map map) {
        this.a = list;
        this.b = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kbj
    public final amru a(jua juaVar) {
        aone createBuilder = auov.a.createBuilder();
        ArrayList arrayList = new ArrayList();
        amxe it = ((amru) this.a).iterator();
        while (it.hasNext()) {
            kbj kbjVar = (kbj) this.b.get((kal) it.next());
            kbjVar.getClass();
            amru a = kbjVar.a(juaVar);
            if (!a.isEmpty()) {
                arrayList.add((auoy) ((kbh) a.get(0)).a);
            }
        }
        createBuilder.aL(arrayList);
        return amru.r(new kbh((auov) createBuilder.build()));
    }
}
