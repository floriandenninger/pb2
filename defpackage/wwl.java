package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wwl implements wwm {
    private static final amrz a = amvo.b;
    private static final amsx b = amsx.w("CLICK_MS", "CONN", "LACT", "WT", "AD_TOS", "AD_WAT", "FINAL");
    private final wod c;
    private final Map d;

    public wwl(wod wodVar, Map map) {
        this.c = wodVar;
        this.d = map;
    }

    @Override // defpackage.wwm
    public final xeq a(xgh xghVar, xev xevVar, xcp xcpVar, aoye aoyeVar) {
        long j;
        String a2;
        Uri ai = wbs.ai(aoyeVar.c);
        Set d = afxf.d(Arrays.asList(ai), a);
        HashMap hashMap = new HashMap();
        Iterator it = d.iterator();
        while (true) {
            xcp xcpVar2 = null;
            if (it.hasNext()) {
                String str = (String) it.next();
                wuy wuyVar = (wuy) this.d.get(str);
                if (wuyVar == null) {
                    if (!b.contains(str)) {
                        String valueOf = String.valueOf(str);
                        whu.l(null, valueOf.length() != 0 ? "Ping migration null MacroAdapter for macro ".concat(valueOf) : new String("Ping migration null MacroAdapter for macro "));
                    }
                } else {
                    wux wuxVar = (wux) wuyVar.getClass().getAnnotation(wux.class);
                    if (wuxVar == null) {
                        xcpVar2 = xcp.a;
                    } else {
                        Class a3 = wuxVar.a();
                        if (xcpVar.d(a3)) {
                            xcpVar2 = xcpVar;
                        } else if (xevVar.k.d(a3)) {
                            xcpVar2 = xevVar.k;
                        } else if (xghVar.g.d(a3)) {
                            xcpVar2 = xghVar.g;
                        }
                    }
                    if (xcpVar2 != null) {
                        a2 = wuyVar.b(xcpVar2);
                        if (a2 == null) {
                            String valueOf2 = String.valueOf(str);
                            throw new wxe(valueOf2.length() != 0 ? "Ping migration MacroAdapter returns null value for ".concat(valueOf2) : new String("Ping migration MacroAdapter returns null value for "));
                        }
                    } else {
                        a2 = wuyVar.a();
                    }
                    hashMap.put(str, a2);
                }
            } else {
                Uri b2 = this.c.b(ai, hashMap);
                xhj xhjVar = new xhj(aoyeVar.e);
                boolean z = aoyeVar.f;
                if (xevVar.k.d(xdm.class)) {
                    j = ((Long) xevVar.k.c(xdm.class)).longValue();
                } else {
                    whu.l(null, "Ping migration null expiration time for layout");
                    j = Long.MAX_VALUE;
                }
                return new xeq(b2, xhjVar, z, j, amru.o(hashMap.keySet()));
            }
        }
    }
}
