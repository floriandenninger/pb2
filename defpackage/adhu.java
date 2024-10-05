package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhu implements adtu {
    public Map a = Collections.emptyMap();
    private final String b;
    private final int c;

    public adhu(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.adtu
    public final void a(IOException iOException) {
        String str = adhv.a;
        String str2 = this.b;
        zga.f(str, str2.length() != 0 ? "Error posting to ".concat(str2) : new String("Error posting to "), iOException);
    }

    @Override // defpackage.adtu
    public final void i(ysq ysqVar) {
        Map emptyMap;
        yso ysoVar = ysqVar.d;
        int i = ysqVar.a;
        if (i != 200) {
            String str = adhv.a;
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(str2.length() + 43);
            sb.append("POST ");
            sb.append(str2);
            sb.append(" failed. Response code is: ");
            sb.append(i);
            zga.m(str, sb.toString());
            if (ysoVar == null) {
                zga.c(adhv.a, "Response body is null");
                return;
            }
            try {
                ByteBuffer e = ysoVar.e();
                String str3 = adhv.a;
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb2.append("Error from server: ");
                sb2.append(valueOf);
                zga.c(str3, sb2.toString());
                return;
            } catch (IOException e2) {
                String str4 = adhv.a;
                String str5 = this.b;
                zga.f(str4, str5.length() != 0 ? "Error posting to ".concat(str5) : new String("Error posting to "), e2);
                return;
            }
        }
        if (ysoVar != null) {
            try {
                String c = ysoVar.c();
                int i2 = this.c;
                try {
                    JSONObject jSONObject = new JSONObject(c);
                    if (!jSONObject.has("screens")) {
                        emptyMap = Collections.emptyMap();
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray("screens");
                        if (jSONArray == null) {
                            emptyMap = Collections.emptyMap();
                        } else {
                            HashMap hashMap = new HashMap();
                            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                try {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                    if (jSONObject2.has("screenId") && jSONObject2.has("loungeToken")) {
                                        hashMap.put(new ScreenId(jSONObject2.getString("screenId")), new adft(jSONObject2.getString("loungeToken"), i2));
                                    }
                                } catch (JSONException unused) {
                                    String str6 = adhv.a;
                                    StringBuilder sb3 = new StringBuilder(32);
                                    sb3.append("Error parsing screen ");
                                    sb3.append(i3);
                                    zga.m(str6, sb3.toString());
                                }
                            }
                            emptyMap = hashMap;
                        }
                    }
                } catch (JSONException e3) {
                    zga.f(adhv.a, "Error parsing screen status ", e3);
                    emptyMap = Collections.emptyMap();
                }
                this.a = emptyMap;
                return;
            } catch (IOException e4) {
                String str7 = adhv.a;
                String str8 = this.b;
                zga.f(str7, str8.length() != 0 ? "Error posting to ".concat(str8) : new String("Error posting to "), e4);
                return;
            }
        }
        String str9 = adhv.a;
        String str10 = this.b;
        zga.c(str9, str10.length() != 0 ? "Response body is null from ".concat(str10) : new String("Response body is null from "));
    }
}
