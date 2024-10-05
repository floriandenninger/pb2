package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qiw extends qjg {
    final /* synthetic */ qjk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qiw(qjk qjkVar) {
        super(qjkVar);
        this.a = qjkVar;
    }

    @Override // defpackage.qjg
    public final void b() {
        qla qlaVar = this.a.b;
        qlb c = c();
        JSONObject jSONObject = new JSONObject();
        long a = qlaVar.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "PAUSE");
            jSONObject.put("mediaSessionId", qlaVar.f());
        } catch (JSONException unused) {
        }
        qlaVar.c(jSONObject.toString(), a);
        qlaVar.k.a(a, c);
    }
}
