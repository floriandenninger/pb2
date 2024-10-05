package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adic implements adtu {
    public adfw a = null;
    private final String b;
    private final int c;

    public adic(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.adtu
    public final void a(IOException iOException) {
        String str = adid.a;
        String str2 = this.b;
        zga.f(str, str2.length() != 0 ? "Failed getting response from ".concat(str2) : new String("Failed getting response from "), iOException);
    }

    @Override // defpackage.adtu
    public final void i(ysq ysqVar) {
        int i = ysqVar.a;
        if (i != 200) {
            String str = adid.a;
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(str2.length() + 31);
            sb.append("Got status of ");
            sb.append(i);
            sb.append(" from ");
            sb.append(str2);
            zga.c(str, sb.toString());
            return;
        }
        yso ysoVar = ysqVar.d;
        if (ysoVar == null) {
            zga.c(adid.a, "Body from response is null");
            return;
        }
        try {
            try {
                adif adifVar = new adif(new JSONObject(ysoVar.c()).getJSONObject("screen"), this.c);
                adfw adfwVar = null;
                try {
                    JSONObject jSONObject = adifVar.b;
                    if (jSONObject != null) {
                        if (!jSONObject.has("accessType")) {
                            String str3 = adif.a;
                            String valueOf = String.valueOf(adifVar.b);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 45);
                            sb2.append("We don't have an access type for MDx screen: ");
                            sb2.append(valueOf);
                            zga.c(str3, sb2.toString());
                        } else {
                            if (adifVar.b.has("screenId") && adifVar.b.has("deviceId")) {
                                String optString = adifVar.b.optString("name", null);
                                ScreenId screenId = new ScreenId(adifVar.b.getString("screenId"));
                                adfs adfsVar = new adfs(adifVar.b.getString("deviceId"));
                                adft adftVar = adifVar.b.has("loungeToken") ? new adft(adifVar.b.getString("loungeToken"), adifVar.c) : null;
                                String optString2 = adifVar.b.optString("clientName", null);
                                adgn adgnVar = optString2 != null ? new adgn(optString2) : null;
                                Optional empty = Optional.empty();
                                if (adifVar.b.has("dialAdditionalDataSupportLevel") && adifVar.b.getString("dialAdditionalDataSupportLevel").equals("full") && adifVar.b.has("shortLivedLoungeToken")) {
                                    JSONObject jSONObject2 = adifVar.b.getJSONObject("shortLivedLoungeToken");
                                    if (!jSONObject2.has("value") || !jSONObject2.has("refreshIntervalMs")) {
                                        zga.m(adif.a, "Ill-formed short lived lounge token. Not using.");
                                    } else {
                                        empty = Optional.of(new adgm(jSONObject2.getString("value"), adifVar.c, Duration.ofMillis(jSONObject2.getLong("refreshIntervalMs"))));
                                    }
                                }
                                adfv f = adfw.f();
                                f.c = new adgg(1);
                                f.c(screenId);
                                f.e(optString);
                                f.e = adgnVar;
                                f.a = adftVar;
                                f.b(adfsVar);
                                if (empty.isPresent()) {
                                    f.d((adgm) empty.get());
                                }
                                adfwVar = f.a();
                            }
                            String str4 = adif.a;
                            String valueOf2 = String.valueOf(adifVar.b);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 47);
                            sb3.append("We got a permanent screen without a screen id: ");
                            sb3.append(valueOf2);
                            zga.c(str4, sb3.toString());
                        }
                    }
                } catch (JSONException e) {
                    zga.f(adif.a, "Error parsing screen ", e);
                }
                this.a = adfwVar;
            } catch (JSONException e2) {
                String str5 = adid.a;
                String str6 = this.b;
                zga.f(str5, str6.length() != 0 ? "Error loading screen info from ".concat(str6) : new String("Error loading screen info from "), e2);
            }
        } catch (IOException | JSONException e3) {
            String str7 = adid.a;
            String str8 = this.b;
            zga.f(str7, str8.length() != 0 ? "Error loading from ".concat(str8) : new String("Error loading from "), e3);
        }
    }
}
