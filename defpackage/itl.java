package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.FlowStepRendererOuterClass;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class itl {
    public final aahd a;
    public final axpg b;
    public final ajdw c;
    public final aakv d;
    public final ayqi e;
    public final itj f;
    public final iti g;
    public final Optional h;
    public final acra i;
    public final Map j;
    public final azrh k;
    public final String l;
    public final aulq m;
    public final String n;
    public Optional o;
    public ayqx p;

    public itl(aahd aahdVar, axpg axpgVar, ajdw ajdwVar, aahv aahvVar, afsy afsyVar, ayqi ayqiVar, aqxd aqxdVar, itj itjVar, iti itiVar, Optional optional, acra acraVar) {
        this.o = Optional.empty();
        this.a = aahdVar;
        this.b = axpgVar;
        this.c = ajdwVar;
        this.d = aahvVar.a(afsyVar.c());
        this.e = ayqiVar;
        this.f = itjVar;
        this.g = itiVar;
        this.h = optional;
        this.i = acraVar;
        HashMap hashMap = new HashMap();
        this.j = hashMap;
        this.k = azrh.aN(new Object());
        b(hashMap, aqxdVar.e);
        this.l = aqxdVar.c;
        aulq aulqVar = aqxdVar.d;
        this.m = aulqVar == null ? aulq.a : aulqVar;
        this.n = aqxdVar.f;
        if ((aqxdVar.b & 8) != 0) {
            apxf apxfVar = aqxdVar.g;
            this.o = Optional.of(apxfVar == null ? apxf.a : apxfVar);
        }
    }

    public static void b(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aulq aulqVar = (aulq) it.next();
            if (aulqVar.pY(FlowStepRendererOuterClass.flowStepRenderer)) {
                aqxj aqxjVar = (aqxj) aulqVar.pX(FlowStepRendererOuterClass.flowStepRenderer);
                map.put(aqxjVar.c, aqxjVar);
            }
        }
    }

    public final View a() {
        return this.c.a();
    }

    public final void c() {
        Object obj = this.p;
        if (obj == null) {
            return;
        }
        ayrz.c((AtomicReference) obj);
        this.p = null;
    }
}
