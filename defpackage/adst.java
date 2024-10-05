package defpackage;

import android.os.Build;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adst implements adsq {
    public static final String a = zga.a("MDX.ProgressApi");
    public final yrw b;
    public final anib c;
    private final anhy d;

    public adst(yrw yrwVar, anhy anhyVar, anib anibVar) {
        this.b = yrwVar;
        this.d = anhyVar;
        this.c = anibVar;
    }

    public static /* synthetic */ void b() {
        zga.c(a, "IOException while calling the TV Sign-in progress API");
        afsi.b(2, 21, "IOException while calling the TV Sign-in progress API");
    }

    @Override // defpackage.adsq
    public final void a(final ScreenId screenId, final String str) {
        if (screenId == null) {
            zga.c(a, "Either the screenID or the event is null when trying to send a progress event.");
        } else {
            ynm.i(this.d, new ynl() { // from class: adsr
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    final adst adstVar = adst.this;
                    String str2 = str;
                    ScreenId screenId2 = screenId;
                    String str3 = (String) obj;
                    String str4 = Build.MODEL;
                    final ysj c = ysk.c("https://www.youtube.com/api/lounge/screens/em");
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("deviceId", str3);
                        jSONObject.put("deviceDescription", str4);
                        jSONObject.put("event", str2);
                        HashMap hashMap = new HashMap();
                        hashMap.put("screenId", screenId2.c);
                        hashMap.put("method", "updateSignInStatus");
                        hashMap.put("params", jSONObject.toString());
                        c.b = ysi.d(hashMap, "ISO-8859-1");
                        ynm.m(adstVar.c.submit(new Callable() { // from class: adss
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                adst.this.b.a(c.a());
                                return null;
                            }
                        }), adha.n);
                    } catch (UnsupportedEncodingException | JSONException unused) {
                        zga.c(adst.a, "Error while creating the POST payload for the TV Sign-in progress API");
                        afsi.b(2, 21, "Error while creating the POST payload for the TV Sign-in progress API");
                    }
                }
            });
        }
    }
}
