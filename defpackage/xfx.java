package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class xfx extends afrd {
    private final PlayerAd a;

    /* JADX INFO: Access modifiers changed from: protected */
    public xfx(PlayerAd playerAd) {
        this.a = playerAd;
    }

    protected abstract String c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afrd
    public void d(JSONObject jSONObject) {
        PlayerAd playerAd = this.a;
        int i = PlayerAd.p;
        m(jSONObject, "originalVideoId", playerAd.g);
        jSONObject.put("requestTrackingParams", Base64.encodeToString(this.a.h, 0));
        m(jSONObject, "contentPlayerAdParams", this.a.i);
        m(jSONObject, "adBreakId", this.a.j);
        jSONObject.put("isForOffline", this.a.k);
        m(jSONObject, "adCpn", this.a.m);
        jSONObject.put("expirationTimeMillis", this.a.n);
        m(jSONObject, "adType", c());
    }
}
