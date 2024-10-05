package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import j$.nio.charset.StandardCharsets;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adib implements adie {
    public static final String a;
    private final yrw b;
    private final adhz c;

    static {
        String valueOf = String.valueOf(adib.class.getCanonicalName());
        a = zga.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    public adib(yrw yrwVar, adhz adhzVar) {
        this.b = yrwVar;
        this.c = adhzVar;
    }

    @Override // defpackage.adie
    public final Map a(Collection collection) {
        ysk a2;
        String str;
        if (collection == null || collection.isEmpty()) {
            return amvo.b;
        }
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            adfw adfwVar = (adfw) it.next();
            adft adftVar = adfwVar.a;
            if (adftVar != null) {
                hashMap.put(adftVar, adfwVar);
            }
            if (adfwVar.b.isPresent()) {
                hashMap.put((adft) adfwVar.b.get(), adfwVar);
            }
        }
        yjk.e();
        adhz adhzVar = this.c;
        if (adhzVar.c.ai) {
            ysj c = ysk.c(String.valueOf(adhzVar.a()).concat("get_screen_availability"));
            try {
                JSONArray jSONArray = new JSONArray();
                for (adft adftVar2 : hashMap.keySet()) {
                    adfw adfwVar2 = (adfw) hashMap.get(adftVar2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("loungeToken", adftVar2.c);
                    String str2 = adfwVar2.c;
                    if (str2 != null) {
                        jSONObject.put("deviceModel", str2);
                    }
                    switch (adftVar2.a) {
                        case 1:
                            str = "UNKNOWN";
                            break;
                        case 2:
                            str = "CAST_SCREEN_ID";
                            break;
                        case 3:
                            str = "CAST_LOUNGE_TOKEN";
                            break;
                        case 4:
                            str = "DIAL_PAIRING_CODE";
                            break;
                        case 5:
                            str = "DIAL_LOCAL_STORAGE";
                            break;
                        case 6:
                            str = "DIAL_ADDITIONAL_DATA_SCREEN_ID";
                            break;
                        case 7:
                            str = "DIAL_ADDITIONAL_DATA_LOUNGE_TOKEN";
                            break;
                        case 8:
                            str = "MANUAL_PAIRING_CODE";
                            break;
                        default:
                            str = "MANUAL_PAIRING_LOCAL_STORAGE";
                            break;
                    }
                    jSONObject.put("loungeTokenSource", str);
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("screens", jSONArray);
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) adhzVar.b.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.getState() != null) {
                    jSONObject2.put("networkStatus", activeNetworkInfo.getState().toString());
                }
                jSONObject2.put("appName", adyu.x(yjk.X(adhzVar.b), zgx.c(adhzVar.b), adhzVar.a));
                c.b = ysi.e(jSONObject2.toString().getBytes(StandardCharsets.UTF_8), "application/json");
            } catch (JSONException unused) {
            }
            a2 = c.a();
        } else {
            Set keySet = hashMap.keySet();
            ysj c2 = ysk.c(String.valueOf(adhzVar.a()).concat("get_screen_availability"));
            try {
                c2.b = ysi.d(Collections.singletonMap("lounge_token", TextUtils.join(",", keySet)), "ISO-8859-1");
            } catch (UnsupportedEncodingException unused2) {
            }
            a2 = c2.a();
        }
        adia adiaVar = new adia(a2.a, hashMap.keySet());
        adyu.w(this.b, a2, adiaVar);
        Set set = adiaVar.a;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            adfw adfwVar3 = (adfw) it2.next();
            HashSet hashSet = new HashSet();
            adft adftVar3 = adfwVar3.a;
            if (adftVar3 != null && set.contains(adftVar3)) {
                hashSet.add(adfwVar3.a);
            }
            if (adfwVar3.b.isPresent() && set.contains(adfwVar3.b.get())) {
                hashSet.add((adft) adfwVar3.b.get());
            }
            hashMap2.put(adfwVar3, hashSet);
        }
        return hashMap2;
    }
}
