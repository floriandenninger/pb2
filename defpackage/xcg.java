package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.AdIntro;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xcg extends xfx {
    private AdIntro a;

    public xcg() {
        super(null);
    }

    @Override // defpackage.afrd
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xfx
    protected final String c() {
        return "videoAd";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xfx, defpackage.afrd
    public final void d(JSONObject jSONObject) {
        super.d(jSONObject);
        AdIntro adIntro = this.a;
        Parcelable.Creator creator = AdIntro.CREATOR;
        m(jSONObject, "playerResponse", Base64.encodeToString(adIntro.b.H(), 2));
    }

    public xcg(AdIntro adIntro) {
        super(adIntro);
        this.a = adIntro;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        PlayerResponseModel h;
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        String h2 = h(jSONObject, "originalVideoId");
        byte[] decode = Base64.decode(jSONObject.getString("requestTrackingParams"), 0);
        String h3 = h(jSONObject, "contentPlayerAdParams");
        String h4 = h(jSONObject, "adBreakId");
        boolean z = jSONObject.getBoolean("isForOffline");
        String h5 = h(jSONObject, "adCpn");
        long j = jSONObject.getLong("expirationTimeMillis");
        String h6 = h(jSONObject, "playerResponse");
        if (TextUtils.isEmpty(h6)) {
            h = PlayerResponseModel.g();
        } else {
            h = PlayerResponseModel.h(Base64.decode(h6, 2), 0L);
        }
        return new AdIntro(h2, decode, h3, h4, z, h5, j, h);
    }
}
