package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qiv extends qjg {
    final /* synthetic */ int[] a;
    final /* synthetic */ qjk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qiv(qjk qjkVar, int[] iArr) {
        super(qjkVar, true);
        this.b = qjkVar;
        this.a = iArr;
    }

    @Override // defpackage.qjg
    public final void b() {
        qla qlaVar = this.b.b;
        qlb c = c();
        int[] iArr = this.a;
        JSONObject jSONObject = new JSONObject();
        long a = qlaVar.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", qlaVar.f());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        qlaVar.c(jSONObject.toString(), a);
        qlaVar.y.a(a, c);
    }
}
