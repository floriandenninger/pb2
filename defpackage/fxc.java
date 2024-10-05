package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fxc extends afvw {
    private final String a;
    private final String b;

    public fxc(String str, String str2, String str3) {
        super(2, str, (cnk) null);
        this.a = str2;
        this.b = str3;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        int i = cnhVar.a;
        if (i == 200 || i == 204) {
            String str = fxd.a;
            return cnm.b(null, null);
        }
        zga.c(fxd.a, "ERROR status code from external message response");
        return cnm.a(new cnq(cnhVar));
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
    }

    @Override // defpackage.yvo
    public final byte[] qm() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", this.a);
            HashMap hashMap = new HashMap();
            hashMap.put("screenId", this.b);
            hashMap.put("method", "updateRemoteTransactionStatus");
            hashMap.put("params", jSONObject.toString());
            return ysi.d(hashMap, "ISO-8859-1").c();
        } catch (UnsupportedEncodingException | JSONException e) {
            zga.f(fxd.a, "Error while creating POST payload for the RemoteTransaction progress API.", e);
            return null;
        }
    }
}
