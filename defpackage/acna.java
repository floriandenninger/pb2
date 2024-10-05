package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.SessionDescription;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acna implements anhh {
    final /* synthetic */ acnd a;

    public acna(acnd acndVar) {
        this.a = acndVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String string = new JSONObject(jSONObject.getJSONObject("answer").getString("desc")).getString("sdp");
            this.a.c(new SessionDescription(SessionDescription.Type.ANSWER, string));
            this.a.q = string;
        } catch (JSONException e) {
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("Could not parse sdp. Response from server=");
            sb.append(valueOf);
            zga.f("PeerConnectionClient", sb.toString(), e);
            this.a.A.a();
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        zga.f("PeerConnectionClient", "Failed to receive remote description.", th);
        this.a.A.a();
    }
}
