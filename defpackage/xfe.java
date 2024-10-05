package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xfe extends xfx {
    private LocalVideoAd a;

    public xfe() {
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
        LocalVideoAd localVideoAd = this.a;
        Parcelable.Creator creator = LocalVideoAd.CREATOR;
        m(jSONObject, "videoAdRenderer", Base64.encodeToString(localVideoAd.b.toByteArray(), 2));
        m(jSONObject, "playerResponse", Base64.encodeToString(this.a.c.H(), 2));
        jSONObject.put("adPodSkipIndex", this.a.d);
    }

    public xfe(LocalVideoAd localVideoAd) {
        super(localVideoAd);
        this.a = localVideoAd;
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
        try {
            avvy avvyVar = (avvy) avvy.a.getParserForType().n(Base64.decode(h(jSONObject, "videoAdRenderer"), 2), aomw.b());
            String h6 = h(jSONObject, "playerResponse");
            if (TextUtils.isEmpty(h6)) {
                h = PlayerResponseModel.g();
            } else {
                h = PlayerResponseModel.h(Base64.decode(h6, 2), 0L);
            }
            return new LocalVideoAd(h2, decode, h3, h4, z, h5, j, avvyVar, h, jSONObject.getInt("adPodSkipIndex"));
        } catch (aoob unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
