package defpackage;

import android.util.Pair;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqk implements acqz {
    public static final amrz a = amrz.l("downloads_page_downloads_item_section_identifier", acsb.c(51721), "downloads_page_recommendations_item_section_identifier", acsb.c(51722));
    public final acra b;
    public int g = 0;
    public final Map d = new HashMap();
    public final Map c = new HashMap();
    public final Map e = new HashMap();
    public final Map f = new HashMap();

    public jqk(acra acraVar) {
        this.b = acraVar;
    }

    public static boolean e(auwg auwgVar) {
        return (auwgVar.c == 6 ? (apxf) auwgVar.d : apxf.a).pY(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
    }

    public static final boolean f(auwg auwgVar) {
        aulm aulmVar = (auwgVar.c == 3 ? (auwi) auwgVar.d : auwi.a).c;
        if (aulmVar == null) {
            aulmVar = aulm.a;
        }
        ajce o = ahbj.o(aulmVar);
        return o != null && ((Boolean) mcy.ap(o, jpt.p, false)).booleanValue();
    }

    public final acsc a(String str, aooy aooyVar) {
        auwi auwiVar;
        apxf apxfVar;
        if (aooyVar instanceof auwh) {
            return acsb.c(42355);
        }
        if (aooyVar instanceof auwg) {
            auwg auwgVar = (auwg) aooyVar;
            boolean z = true;
            if (!e(auwgVar) && !f(auwgVar)) {
                z = false;
            }
            amkq.E(z);
            aqnf aqnfVar = aqnf.FILTER_TYPE_UNSPECIFIED;
            if (!e(auwgVar)) {
                if (auwgVar.c == 3) {
                    auwiVar = (auwi) auwgVar.d;
                } else {
                    auwiVar = auwi.a;
                }
                aulm aulmVar = auwiVar.c;
                if (aulmVar == null) {
                    aulmVar = aulm.a;
                }
                ajce o = ahbj.o(aulmVar);
                if (o != null) {
                    aqnfVar = mcy.al(o);
                }
            } else {
                if (auwgVar.c == 6) {
                    apxfVar = (apxf) auwgVar.d;
                } else {
                    apxfVar = apxf.a;
                }
                aqnfVar = aqnf.b(((aqng) apxfVar.pX(DownloadsPageEndpointOuterClass.downloadsPageEndpoint)).c);
                if (aqnfVar == null) {
                    aqnfVar = aqnf.FILTER_TYPE_UNSPECIFIED;
                }
            }
            int ordinal = aqnfVar.ordinal();
            if (ordinal == 2) {
                return acsb.c(48083);
            }
            if (ordinal == 3) {
                return acsb.c(48084);
            }
            return acsb.c(48082);
        }
        if (aooyVar instanceof aqcj) {
            return acsb.c(42357);
        }
        if (aooyVar instanceof aqdb) {
            if ("downloads_page_downloads_item_section_identifier".equals(str)) {
                return acsb.c(42356);
            }
            if ("downloads_page_recommendations_item_section_identifier".equals(str)) {
                return acsb.c(51723);
            }
            return null;
        }
        if (aooyVar instanceof atop) {
            return acsb.c(69464);
        }
        return null;
    }

    public final awav b(String str, aooy aooyVar) {
        acsc a2;
        if (!this.c.containsKey(str) || (a2 = a(str, aooyVar)) == null) {
            return null;
        }
        Pair create = Pair.create((awav) this.c.get(str), aooyVar);
        if (!this.f.containsKey(str) || !((Set) this.f.get(str)).contains(aooyVar)) {
            if (this.e.containsKey(str)) {
                Map map = (Map) this.e.get(str);
                if (map.containsKey(aooyVar)) {
                    return this.b.j(create, a2, ((Integer) map.get(aooyVar)).intValue());
                }
            }
            return null;
        }
        return this.b.i(create, a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.awav c(defpackage.acsc r3, defpackage.aooy r4) {
        /*
            r2 = this;
            int r3 = r3.a
            r0 = 0
            r1 = 51723(0xca0b, float:7.248E-41)
            if (r3 == r1) goto L9
            return r0
        L9:
            boolean r3 = r4 instanceof defpackage.aqdb
            if (r3 == 0) goto L24
            aqdb r4 = (defpackage.aqdb) r4
            avwi r3 = r4.u
            if (r3 != 0) goto L15
            avwi r3 = defpackage.avwi.a
        L15:
            int r3 = r3.b
            r3 = r3 & 1
            if (r3 == 0) goto L24
            avwi r3 = r4.u
            if (r3 != 0) goto L21
            avwi r3 = defpackage.avwi.a
        L21:
            java.lang.String r3 = r3.c
            goto L25
        L24:
            r3 = r0
        L25:
            if (r3 == 0) goto L34
            acra r4 = r2.b
            r0 = 7111(0x1bc7, float:9.965E-42)
            acsc r0 = defpackage.acsb.c(r0)
            awav r3 = r4.i(r3, r0)
            return r3
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqk.c(acsc, aooy):awav");
    }

    public final void d(String str, aooy aooyVar) {
        Set set;
        if (!this.f.containsKey(str)) {
            set = new HashSet();
            this.f.put(str, set);
        } else {
            set = (Set) this.f.get(str);
        }
        set.add(aooyVar);
    }

    @Override // defpackage.acqz
    public final acra mM() {
        return this.b;
    }
}
