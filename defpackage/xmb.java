package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xmb implements tea {
    private final Object a;
    private final aoxy b;
    private final aahd c;
    private final Map d;

    public xmb(Object obj, aoxy aoxyVar, aahd aahdVar) {
        HashMap aJ;
        this.a = obj;
        this.b = aoxyVar;
        this.c = aahdVar;
        aoyh aoyhVar = aoxyVar.d;
        aoyhVar = aoyhVar == null ? aoyh.a : aoyhVar;
        if (aoyhVar == null) {
            aJ = null;
        } else {
            aJ = amkq.aJ(aoyhVar.b.size());
            for (Map.Entry entry : Collections.unmodifiableMap(aoyhVar.b).entrySet()) {
                aJ.put((String) entry.getKey(), ((aoyg) entry.getValue()).b);
            }
        }
        this.d = aJ != null ? afxf.c(aJ) : null;
    }

    private final void c(List list, tdt tdtVar) {
        xbp c = xbp.c(tdtVar, this.d);
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{c});
        whl.J(this.c, list, hashMap);
    }

    @Override // defpackage.tea
    public final void a(tdt tdtVar, View view) {
        c(this.b.b, tdtVar);
    }

    @Override // defpackage.tea
    public final void b(tdt tdtVar, View view) {
        c(this.b.c, tdtVar);
    }
}
