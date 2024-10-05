package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fcz implements actd {
    private final /* synthetic */ int a;

    public fcz(int i) {
        this.a = i;
    }

    @Override // defpackage.actd
    public final /* synthetic */ Map a(Object obj) {
        adz adzVar = null;
        switch (this.a) {
            case 0:
                return ((aapk) obj).a();
            case 1:
                fcr fcrVar = (fcr) obj;
                return amrz.l("yt_lt", true != fcrVar.a ? "cold" : "frozen", "yt_fi", true == fcrVar.b ? "0" : "1");
            case 2:
                return Collections.singletonMap("yt_intent", ((fct) obj).a());
            case 3:
                adz adzVar2 = new adz(1);
                adzVar2.put("mod_ad", "1");
                return adzVar2;
            case 4:
                xag xagVar = (xag) obj;
                adz adzVar3 = new adz(1);
                aign aignVar = aign.NEW;
                xaf xafVar = xaf.AD_INTERRUPT_ACQUIRED;
                int ordinal = xagVar.a().ordinal();
                if (ordinal == 1) {
                    adzVar = new adz(5);
                    adzVar.put("mod_ad_pr", "1");
                    if (!TextUtils.isEmpty(xagVar.c().l())) {
                        adzVar.put("ad_at", xagVar.c().l());
                    }
                    adzVar.put("ad_docid", zhq.h(xagVar.c().n()));
                    adzVar.put("yt_abt", Integer.toString(xagVar.b().d));
                    for (askp askpVar : xagVar.c().B()) {
                        adzVar.put(askpVar.e, askpVar.c == 2 ? (String) askpVar.d : "");
                    }
                } else if (ordinal == 3) {
                    adzVar3.put("yt_abt", Integer.toString(xagVar.b().d));
                    return adzVar3;
                }
                return adzVar;
            case 5:
                adz adzVar4 = new adz(1);
                String str = ((xap) obj).a;
                adzVar4.put("ad_cpn", null);
                return adzVar4;
            case 6:
                xau xauVar = (xau) obj;
                adz adzVar5 = new adz(1);
                String str2 = xauVar.a;
                adzVar5.put("ad_cpn", null);
                String str3 = xauVar.b;
                adzVar5.put("cpn", null);
                return adzVar5;
            case 7:
                xad xadVar = (xad) obj;
                adz adzVar6 = new adz();
                adzVar6.put("ad_cr", xadVar.a().k);
                adzVar6.put("ad_cpn", xadVar.b() != null ? xadVar.b().m : "");
                return adzVar6;
            case 8:
                HashMap hashMap = new HashMap();
                String str4 = ((xbc) obj).a;
                hashMap.put("pb_h", null);
                return hashMap;
            case 9:
                HashMap hashMap2 = new HashMap();
                String str5 = ((xba) obj).a;
                hashMap2.put("pb_h", null);
                return hashMap2;
            default:
                new HashMap();
                int i = wzh.d;
                int i2 = ((xbb) obj).a;
                throw null;
        }
    }
}
