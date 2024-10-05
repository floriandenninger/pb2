package defpackage;

import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ifn implements ifw, ekh {
    private boolean e = false;
    public final Set a = new HashSet();
    private final Set c = new HashSet();
    private final Set d = new HashSet();
    public final Map b = new HashMap();

    @Override // defpackage.ekh
    public final void a(ekg ekgVar) {
        if (this.e) {
            this.c.add(ekgVar);
        } else {
            this.a.add(ekgVar);
        }
    }

    @Override // defpackage.ifw
    public final void b() {
        this.b.clear();
        this.e = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ekg) it.next()).b();
        }
        this.e = false;
        this.a.addAll(this.c);
        this.a.removeAll(this.d);
        this.c.clear();
        this.d.clear();
    }

    @Override // defpackage.ifw
    public final void c(apxf apxfVar, ViewGroup viewGroup) {
        if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            xgb xgbVar = (xgb) this.b.get((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
            if (xgbVar == null) {
                return;
            }
            ViewGroup viewGroup2 = xgbVar.d;
            if (viewGroup2 != null) {
                if (amkq.b(viewGroup, viewGroup2)) {
                    return;
                } else {
                    e(apxfVar);
                }
            }
            xgbVar.d = viewGroup;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ekg) it.next()).v(xgbVar);
            }
        }
    }

    @Override // defpackage.ifw
    public final void d(apxf apxfVar, aryr aryrVar) {
        if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (this.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                ((xgb) this.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint)).c.a.c(aryrVar);
            }
        }
    }

    @Override // defpackage.ifw
    public final void e(apxf apxfVar) {
        if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            xgb xgbVar = (xgb) this.b.get((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
            if (xgbVar == null || xgbVar.d == null) {
                return;
            }
            if (xgbVar.e) {
                whu.l(null, "Trying to detach view for reel page before it is exited");
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ekg) it.next()).h(xgbVar);
            }
            xgbVar.d = null;
        }
    }

    @Override // defpackage.ifw
    public final void f(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apxf apxfVar = (apxf) it.next();
            if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                auji aujiVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.q;
                if (aujiVar == null) {
                    aujiVar = auji.a;
                }
                if (aujiVar.b && !this.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                    xgb xgbVar = new xgb(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                    arrayList.add(xgbVar);
                    this.b.put(reelWatchEndpointOuterClass$ReelWatchEndpoint, xgbVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((ekg) it2.next()).j(arrayList);
        }
    }

    @Override // defpackage.ifw
    public final void g(apxf apxfVar) {
        if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (this.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                xgb xgbVar = (xgb) this.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                if (xgbVar.d == null) {
                    whu.l(null, "Reel page was entered with no attached view");
                }
                xgbVar.e = true;
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((ekg) it.next()).l(xgbVar);
                }
            }
        }
    }

    @Override // defpackage.ifw
    public final void h(apxf apxfVar, int i) {
        if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (this.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
                xgb xgbVar = (xgb) this.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                xgbVar.e = false;
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((ekg) it.next()).m(i, xgbVar);
                }
            }
        }
    }
}
