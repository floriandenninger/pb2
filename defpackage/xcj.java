package defpackage;

import android.os.Parcelable;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.AdVideoEnd;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xcj extends xfx {
    private AdVideoEnd a;

    public xcj() {
        super(null);
    }

    @Override // defpackage.afrd
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xfx
    protected final String c() {
        return "adVideoEnd";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xfx, defpackage.afrd
    public final void d(JSONObject jSONObject) {
        super.d(jSONObject);
        AdVideoEnd adVideoEnd = this.a;
        Parcelable.Creator creator = AdVideoEnd.CREATOR;
        PlayerAd playerAd = adVideoEnd.d;
        if (playerAd instanceof LocalVideoAd) {
            o(jSONObject, "videoAd", playerAd);
        } else {
            zga.b("Encountered an AdVideoEnd with a player ad for reporting that was not a VideoAd.");
        }
        m(jSONObject, "adVideoEndRenderer", Base64.encodeToString(this.a.b.toByteArray(), 2));
        jSONObject.put("adPodSkipTarget", this.a.c);
    }

    public xcj(AdVideoEnd adVideoEnd) {
        super(adVideoEnd);
        this.a = adVideoEnd;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        PlayerAd playerAd;
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        if (LocalVideoAd.a.g(jSONObject, "videoAd") != null) {
            playerAd = (PlayerAd) LocalVideoAd.a.g(jSONObject, "videoAd");
        } else {
            zga.b("Encountered an AdVideoEnd with a player ad for reporting that was not a VideoAd.");
            playerAd = null;
        }
        PlayerAd playerAd2 = playerAd;
        try {
            return new AdVideoEnd(h(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), h(jSONObject, "contentPlayerAdParams"), h(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), PlayerConfigModel.b, h(jSONObject, "adCpn"), (aoyx) ((aone) aoyx.a.createBuilder().mergeFrom(Base64.decode(h(jSONObject, "adVideoEndRenderer"), 2), aomw.b())).build(), playerAd2, jSONObject.getInt("adPodSkipTarget"));
        } catch (aoob unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
