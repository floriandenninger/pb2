package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acyy implements adrf {
    private final Handler a;
    private final String b;
    private final adny c;

    public acyy(adny adnyVar, Handler handler, String str) {
        this.c = adnyVar;
        this.a = handler;
        this.b = str;
    }

    @Override // defpackage.adrf
    public final void a(adqz adqzVar) {
        if (this.a.hasMessages(1)) {
            try {
                JSONObject jSONObject = adqzVar.b;
                adfv f = adfw.f();
                f.c(new ScreenId(jSONObject.getString("screenId")));
                f.b(new adfs(jSONObject.getString("deviceId")));
                f.e(this.b);
                f.c = new adgg(3);
                adfw a = f.a();
                this.a.removeMessages(1);
                this.c.a(a, -1);
                return;
            } catch (JSONException unused) {
                String str = acyz.a;
                String.format("No screen ID on %s: %s", adgf.MDX_SESSION_STATUS.an, adqzVar);
                return;
            }
        }
        String str2 = acyz.a;
    }
}
