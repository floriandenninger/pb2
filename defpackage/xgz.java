package defpackage;

import android.os.Parcelable;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.VideoTrackingAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgz extends xfx {
    private VideoTrackingAd a;

    private xgz() {
        super(null);
    }

    @Override // defpackage.afrd
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xfx
    protected final String c() {
        return "videoTrackingAd";
    }

    @Override // defpackage.xfx, defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        super.d(jSONObject);
        VideoTrackingAd videoTrackingAd = this.a;
        Parcelable.Creator creator = VideoTrackingAd.CREATOR;
        m(jSONObject, "videoAdTrackingRenderer", Base64.encodeToString(videoTrackingAd.a.toByteArray(), 2));
    }

    public xgz(VideoTrackingAd videoTrackingAd) {
        super(videoTrackingAd);
        this.a = videoTrackingAd;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new VideoTrackingAd(h(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), h(jSONObject, "contentPlayerAdParams"), jSONObject.getBoolean("isForOffline"), PlayerConfigModel.b, jSONObject.getInt("duration"), (avwa) ((aone) avwa.a.createBuilder().mergeFrom(Base64.decode(h(jSONObject, "videoAdTrackingRenderer"), 2), aomw.b())).build());
        } catch (aoob unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
