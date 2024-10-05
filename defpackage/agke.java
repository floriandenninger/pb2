package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agke implements aeph {
    private final aair a;
    private final aajb b;
    private final agzr c;

    public agke(aair aairVar, aajb aajbVar, agzr agzrVar) {
        this.a = aairVar;
        this.b = aajbVar;
        this.c = agzrVar;
    }

    @Override // defpackage.aeph
    public final aepg a(String str) {
        aqpd aqpdVar;
        try {
            aqoz aqozVar = (aqoz) this.a.f(aalt.f(146, str)).g(aqoz.class).X();
            if (aqozVar == null && this.c.h()) {
                aajb aajbVar = this.b;
                ArrayList arrayList = new ArrayList();
                aajd aajdVar = agkj.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
                sb.append("%");
                sb.append(str);
                sb.append("%");
                whl.F(aajdVar, 7, sb.toString(), aajbVar, arrayList);
                List list = (List) this.a.e(whl.D(aajbVar, arrayList)).X();
                if (list.isEmpty()) {
                    return null;
                }
                aqozVar = (aqoz) this.a.f((String) list.get(0)).g(aqoz.class).X();
            }
            if (aqozVar != null && !aqozVar.getLicenses().isEmpty()) {
                try {
                    Iterator it = aqozVar.getLicenses().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            aqpdVar = null;
                            break;
                        }
                        aqpdVar = (aqpd) it.next();
                        if (aqpdVar.i.equals(str)) {
                            break;
                        }
                    }
                    if (aqpdVar != null) {
                        return new aepg(str, aqpdVar.k.I(), aqpdVar.j, aqpdVar.g, aqpdVar.l);
                    }
                    return null;
                } catch (RuntimeException e) {
                    afsi.c(2, 28, "Couldn't retrieve OfflineDrmData", e);
                }
            }
            return null;
        } catch (RuntimeException unused) {
            zga.b("[Offline] Stale drm store");
            return null;
        }
    }
}
