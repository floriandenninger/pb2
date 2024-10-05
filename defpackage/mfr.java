package defpackage;

import com.google.protos.youtube.api.innertube.HomeAdsPanelRendererOuterClass;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfr {
    public final Map a = new HashMap();
    public final Map b = new WeakHashMap();
    public final ArrayDeque c = new ArrayDeque();
    public final ainy d;
    private final azrw e;
    private mfp f;

    public mfr(azrw azrwVar, ainy ainyVar) {
        this.e = azrwVar;
        this.d = ainyVar;
    }

    public final mfp a() {
        mfp mfpVar = this.f;
        if (mfpVar != null) {
            return mfpVar;
        }
        mfp mfpVar2 = (mfp) this.e.get();
        this.f = mfpVar2;
        mfpVar2.a.ai = this;
        return mfpVar2;
    }

    public final void b(List list, auov auovVar) {
        Map map = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aulq aulqVar = (aulq) it.next();
            if (aulqVar.pY(HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer)) {
                arrayList.add((aren) aulqVar.pX(HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer));
            }
        }
        map.put(auovVar, arrayList);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            aulq aulqVar2 = (aulq) it2.next();
            if (aulqVar2.pY(HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer)) {
                aren arenVar = (aren) aulqVar2.pX(HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer);
                this.a.put(arenVar.c, arenVar);
            }
        }
    }

    public final void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aren arenVar = (aren) it.next();
            this.a.put(arenVar.c, arenVar);
        }
    }
}
