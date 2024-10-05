package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.innertube.model.ads.Survey;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aamq extends afrd {
    private Survey a;

    public aamq() {
    }

    public aamq(Survey survey) {
        this.a = survey;
    }

    @Override // defpackage.afrd
    public final int a() {
        return 2;
    }

    @Override // defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        Survey survey = this.a;
        aamq aamqVar = Survey.a;
        jSONObject.put("data_pb", Base64.encodeToString(survey.b.toByteArray(), 0));
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 2) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new Survey((owm) aonm.parseFrom(owm.a, Base64.decode(jSONObject.getString("data_pb"), 0), aomw.b()));
        } catch (aoob e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Unable to parse proto: ".concat(valueOf) : new String("Unable to parse proto: "));
        }
    }
}
