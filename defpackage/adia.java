package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adia implements adtu {
    public Set a = amvs.a;
    private final String b;
    private final Set c;

    public adia(String str, Set set) {
        this.b = str;
        this.c = set;
    }

    @Override // defpackage.adtu
    public final void a(IOException iOException) {
        String str = adib.a;
        String str2 = this.b;
        zga.f(str, str2.length() != 0 ? "Error loading screen status from ".concat(str2) : new String("Error loading screen status from "), iOException);
    }

    @Override // defpackage.adtu
    public final void i(ysq ysqVar) {
        Set set;
        int i = ysqVar.a;
        yso ysoVar = ysqVar.d;
        if (i != 200) {
            String str = adib.a;
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(str2.length() + 41);
            sb.append("POST ");
            sb.append(str2);
            sb.append(" failed. Status code is: ");
            sb.append(i);
            zga.m(str, sb.toString());
            return;
        }
        if (ysoVar != null) {
            try {
                String c = ysoVar.c();
                Map map = (Map) Collection.EL.stream(this.c).collect(Collectors.toMap(acxx.h, acxx.i));
                try {
                    JSONArray optJSONArray = new JSONObject(c).optJSONArray("screens");
                    if (optJSONArray == null) {
                        set = amvs.a;
                    } else {
                        Set hashSet = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            try {
                                JSONObject jSONObject = optJSONArray.getJSONObject(i2);
                                String optString = jSONObject.optString("status", "");
                                String optString2 = jSONObject.optString("loungeToken", "");
                                if ("online".equals(optString) && !TextUtils.isEmpty(optString2) && map.containsKey(optString2)) {
                                    hashSet.add((adft) map.get(optString2));
                                }
                            } catch (JSONException unused) {
                                String str3 = adib.a;
                                StringBuilder sb2 = new StringBuilder(32);
                                sb2.append("Error parsing screen ");
                                sb2.append(i2);
                                zga.m(str3, sb2.toString());
                            }
                        }
                        set = hashSet;
                    }
                } catch (JSONException e) {
                    zga.f(adib.a, "Error parsing screen status ", e);
                    set = amvs.a;
                }
                this.a = set;
                return;
            } catch (IOException e2) {
                String str4 = adib.a;
                String str5 = this.b;
                zga.f(str4, str5.length() != 0 ? "Error loading screen status from ".concat(str5) : new String("Error loading screen status from "), e2);
                return;
            }
        }
        String str6 = adib.a;
        String str7 = this.b;
        StringBuilder sb3 = new StringBuilder(str7.length() + 27);
        sb3.append("Response body from ");
        sb3.append(str7);
        sb3.append(" is null");
        zga.c(str6, sb3.toString());
    }
}
