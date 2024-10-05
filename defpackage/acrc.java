package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import com.google.protos.youtube.api.innertube.PhoneDialerEndpointOuterClass$PhoneDialerEndpoint;
import com.google.protos.youtube.api.innertube.StoriesShareCommandOuterClass$StoriesShareCommand;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WebviewEndpointOuterClass$WebviewEndpoint;
import com.google.protos.youtube.api.innertube.YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrc implements aahd {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static final String e = "acrc";
    private final aahd f;
    private final acqz g;
    private final Set h;
    private final Set i;

    static {
        String name = acrc.class.getName();
        a = String.valueOf(name).concat(".flags");
        b = String.valueOf(name).concat(".log_click");
        c = String.valueOf(name).concat(".click_client_data");
        d = String.valueOf(name).concat(".csn");
    }

    public acrc(aahd aahdVar, acqz acqzVar) {
        this(aahdVar, acqzVar, Collections.emptySet(), Collections.emptySet());
    }

    public static asht f(apxf apxfVar, Map map) {
        aone createBuilder = asht.a.createBuilder();
        apxg apxgVar = apxfVar.e;
        if (apxgVar == null) {
            apxgVar = apxg.a;
        }
        if (apxgVar.pY(asit.a)) {
            apxg apxgVar2 = apxfVar.e;
            if (apxgVar2 == null) {
                apxgVar2 = apxg.a;
            }
            createBuilder.mergeFrom((aonm) apxgVar2.pX(asit.a));
        }
        Object s = yjj.s(map, c);
        if (s instanceof asht) {
            createBuilder.mergeFrom((aonm) s);
        }
        if (apxfVar.pY(WebviewEndpointOuterClass$WebviewEndpoint.webviewEndpoint)) {
            aone createBuilder2 = ashp.a.createBuilder();
            String str = ((WebviewEndpointOuterClass$WebviewEndpoint) apxfVar.pX(WebviewEndpointOuterClass$WebviewEndpoint.webviewEndpoint)).b;
            createBuilder2.copyOnWrite();
            ashp ashpVar = (ashp) createBuilder2.instance;
            str.getClass();
            ashpVar.b |= 1;
            ashpVar.c = str;
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashp ashpVar2 = (ashp) createBuilder2.build();
            ashpVar2.getClass();
            ashtVar.d = ashpVar2;
            ashtVar.b |= 1;
        } else if (apxfVar.pY(UrlEndpointOuterClass.urlEndpoint)) {
            aone createBuilder3 = ashp.a.createBuilder();
            String str2 = ((avuo) apxfVar.pX(UrlEndpointOuterClass.urlEndpoint)).c;
            createBuilder3.copyOnWrite();
            ashp ashpVar3 = (ashp) createBuilder3.instance;
            str2.getClass();
            ashpVar3.b |= 1;
            ashpVar3.c = str2;
            createBuilder.copyOnWrite();
            asht ashtVar2 = (asht) createBuilder.instance;
            ashp ashpVar4 = (ashp) createBuilder3.build();
            ashpVar4.getClass();
            ashtVar2.d = ashpVar4;
            ashtVar2.b |= 1;
        }
        asht ashtVar3 = (asht) createBuilder.build();
        if (asht.a.equals(ashtVar3)) {
            return null;
        }
        return ashtVar3;
    }

    public static Map g(Object obj) {
        return i(obj, true);
    }

    public static Map h(Object obj, asht ashtVar) {
        Map i = i(obj, true);
        i.put(c, ashtVar);
        return i;
    }

    public static Map i(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        if (z) {
            hashMap.put(b, Boolean.TRUE);
        }
        return hashMap;
    }

    public static Map j(Map map) {
        return k(map, true);
    }

    public static Map k(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (z) {
            hashMap.put(b, Boolean.TRUE);
        }
        return hashMap;
    }

    private static apxf l(apxf apxfVar, String str) {
        aong aongVar = (aong) apxfVar.toBuilder();
        if (TextUtils.isEmpty(str)) {
            aongVar.d(aupg.b);
            return (apxf) aongVar.build();
        }
        if (!aongVar.pY(aupg.b)) {
            aongVar.e(aupg.b, aupf.a);
        }
        aone builder = ((aupf) aongVar.pX(aupg.b)).toBuilder();
        builder.copyOnWrite();
        aupf aupfVar = (aupf) builder.instance;
        str.getClass();
        aupfVar.b |= 1;
        aupfVar.c = str;
        aongVar.e(aupg.b, (aupf) builder.build());
        return (apxf) aongVar.build();
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void a(apxf apxfVar) {
        aahc.a(this, apxfVar);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void b(List list) {
        aahc.b(this, list);
    }

    @Override // defpackage.aahd
    public final void c(apxf apxfVar, Map map) {
        Object a2;
        Object a3;
        acra acraVar;
        acra mM = this.g.mM();
        if (mM == null) {
            mM = acra.l;
        }
        if (map != null && (acraVar = (acra) map.get("com.google.android.libraries.youtube.logging.interaction_logger")) != null) {
            mM = acraVar;
        }
        if (apxfVar != null && ((apxfVar.pY(UrlEndpointOuterClass.urlEndpoint) || apxfVar.pY(WebviewEndpointOuterClass$WebviewEndpoint.webviewEndpoint) || apxfVar.pY(AppStoreEndpointOuterClass.appStoreEndpoint) || apxfVar.pY(AndroidApplicationEndpointOuterClass.androidAppEndpoint) || apxfVar.pY(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint) || apxfVar.pY(PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.phoneDialerEndpoint) || apxfVar.pY(YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.ypcFixInstrumentEndpoint) || apxfVar.pY(StoriesShareCommandOuterClass$StoriesShareCommand.storiesShareCommand) || (((a3 = aahe.a(apxfVar)) != null && this.i.contains(a3.getClass())) || ((Boolean) yjj.t(map, b, false)).booleanValue())) && (apxfVar.b & 1) != 0)) {
            mM.I(3, new acqx(apxfVar.c), f(apxfVar, map));
        }
        if (apxfVar != null && (a2 = aahe.a(apxfVar)) != null && this.h.contains(a2.getClass())) {
            String str = map != null ? (String) map.get(d) : null;
            if (TextUtils.isEmpty(str)) {
                apxfVar = l(apxfVar, mM.k());
            } else {
                apxfVar = l(apxfVar, str);
            }
        }
        if ((((Integer) yjj.t(map, a, 0)).intValue() & 1) == 0) {
            apxfVar = mM.h(apxfVar);
        }
        if (map != null && !map.containsKey("com.google.android.libraries.youtube.logging.interaction_logger")) {
            try {
                amrw amrwVar = new amrw();
                amrwVar.i(map);
                amrwVar.g("com.google.android.libraries.youtube.logging.interaction_logger", mM);
                map = amrwVar.c();
            } catch (NullPointerException unused) {
            }
        }
        if (map == null) {
            map = amrz.k("com.google.android.libraries.youtube.logging.interaction_logger", mM);
        }
        this.f.c(apxfVar, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void d(List list, Map map) {
        aahc.c(this, list, map);
    }

    @Override // defpackage.aahd
    public final /* synthetic */ void e(List list, Object obj) {
        aahc.d(this, list, obj);
    }

    public acrc(aahd aahdVar, acqz acqzVar, Set set, Set set2) {
        if (aahdVar instanceof acrc) {
            this.f = ((acrc) aahdVar).f;
        } else {
            aahdVar.getClass();
            this.f = aahdVar;
        }
        acqzVar.getClass();
        this.g = acqzVar;
        set.getClass();
        this.h = set;
        set2.getClass();
        this.i = set2;
    }
}
