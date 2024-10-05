package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgy extends afrd {
    private VideoAdTrackingModel a;

    private xgy() {
    }

    public xgy(VideoAdTrackingModel videoAdTrackingModel) {
        this.a = videoAdTrackingModel;
    }

    @Override // defpackage.afrd
    public final int a() {
        return 1;
    }

    @Override // defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        VideoAdTrackingModel videoAdTrackingModel = this.a;
        VideoAdTrackingModel videoAdTrackingModel2 = VideoAdTrackingModel.a;
        m(jSONObject, "videoAdTrackingProto", Base64.encodeToString(videoAdTrackingModel.b.toByteArray(), 2));
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new VideoAdTrackingModel((aoyi) ((aone) aoyi.a.createBuilder().mergeFrom(Base64.decode(h(jSONObject, "videoAdTrackingProto"), 2), aomw.b())).build());
        } catch (aoob unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
