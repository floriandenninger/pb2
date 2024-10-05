package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qiz extends qjg {
    final /* synthetic */ double a;
    final /* synthetic */ qjk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qiz(qjk qjkVar, double d) {
        super(qjkVar);
        this.b = qjkVar;
        this.a = d;
    }

    @Override // defpackage.qjg
    public final void b() {
        qla qlaVar = this.b.b;
        qlb c = c();
        double d = this.a;
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Volume cannot be ");
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        }
        JSONObject jSONObject = new JSONObject();
        long a = qlaVar.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "SET_VOLUME");
            jSONObject.put("mediaSessionId", qlaVar.f());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("level", d);
            jSONObject.put("volume", jSONObject2);
        } catch (JSONException unused) {
        }
        qlaVar.c(jSONObject.toString(), a);
        qlaVar.o.a(a, c);
    }
}
