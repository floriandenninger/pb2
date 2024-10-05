package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vfg {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Executor c;
    private final vcw d;
    private final anfz e;
    private final Map f;
    private final vhf g;

    public vfg(Executor executor, vcw vcwVar, vhf vhfVar, Map map) {
        executor.getClass();
        this.c = executor;
        vcwVar.getClass();
        this.d = vcwVar;
        this.g = vhfVar;
        this.f = map;
        amkq.E(!map.isEmpty());
        this.e = ufj.e;
    }

    public final synchronized vgz a(vff vffVar) {
        vgz vgzVar;
        Uri uri = vffVar.a;
        vgzVar = (vgz) this.a.get(uri);
        if (vgzVar == null) {
            Uri uri2 = vffVar.a;
            amkq.J(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String d = ammx.d(uri2.getLastPathSegment());
            int lastIndexOf = d.lastIndexOf(46);
            boolean z = true;
            amkq.J((lastIndexOf == -1 ? "" : d.substring(lastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri2);
            amkq.F(vffVar.b != null, "Proto schema cannot be null");
            amkq.F(vffVar.c != null, "Handler cannot be null");
            String a = vffVar.e.a();
            vhb vhbVar = (vhb) this.f.get(a);
            if (vhbVar == null) {
                z = false;
            }
            amkq.J(z, "No XDataStoreVariantFactory registered for ID %s", a);
            String d2 = ammx.d(vffVar.a.getLastPathSegment());
            int lastIndexOf2 = d2.lastIndexOf(46);
            if (lastIndexOf2 != -1) {
                d2 = d2.substring(0, lastIndexOf2);
            }
            vgz vgzVar2 = new vgz(vhbVar.a(vffVar, d2, this.c, this.d), anfq.i(anaf.O(vffVar.a), this.e, angq.a), vffVar.g, vffVar.h);
            amru amruVar = vffVar.d;
            if (!amruVar.isEmpty()) {
                vgzVar2.c(vfd.b(amruVar, this.c));
            }
            this.a.put(uri, vgzVar2);
            this.b.put(uri, vffVar);
            vgzVar = vgzVar2;
        } else {
            amkq.J(vffVar.equals((vff) this.b.get(uri)), "Arguments must match previous call for Uri: %s", uri);
        }
        return vgzVar;
    }
}
