package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaml extends afrd {
    private AdBreakRendererModel a;

    public aaml() {
    }

    public aaml(AdBreakRendererModel adBreakRendererModel) {
        this.a = adBreakRendererModel;
    }

    @Override // defpackage.afrd
    public final int a() {
        return 1;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new AdBreakRendererModel((aowc) aonm.parseFrom(aowc.a, Base64.decode(h(jSONObject, "adBreakRendererProto"), 2), aomw.b()));
        } catch (aoob unused) {
            throw new JSONException("Invalid protobuf");
        }
    }

    @Override // defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        m(jSONObject, "adBreakRendererProto", Base64.encodeToString(this.a.b.toByteArray(), 2));
    }
}
