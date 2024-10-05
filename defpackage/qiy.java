package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qiy extends qjg {
    final /* synthetic */ qfi a;
    final /* synthetic */ qjk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qiy(qjk qjkVar, qfi qfiVar) {
        super(qjkVar);
        this.b = qjkVar;
        this.a = qfiVar;
    }

    @Override // defpackage.qjg
    public final void b() {
        qla qlaVar = this.b.b;
        qlb c = c();
        qfi qfiVar = this.a;
        JSONObject jSONObject = new JSONObject();
        long a = qlaVar.a();
        long j = qfiVar.a;
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", qlaVar.f());
            jSONObject.put("currentTime", qko.a(j));
        } catch (JSONException unused) {
        }
        qlaVar.c(jSONObject.toString(), a);
        qlaVar.h = Long.valueOf(j);
        qlaVar.n.a(a, new qky(qlaVar, c, 1));
    }
}
