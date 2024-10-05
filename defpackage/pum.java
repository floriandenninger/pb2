package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pum extends puc {
    private final puo d;

    public pum(int i, String str, String str2, puc pucVar, puo puoVar) {
        super(i, str, str2, pucVar);
        this.d = puoVar;
    }

    @Override // defpackage.puc
    public final JSONObject b() {
        JSONObject b = super.b();
        puo puoVar = ((Boolean) pyi.x.e()).booleanValue() ? this.d : null;
        if (puoVar == null) {
            b.put("Response Info", "null");
        } else {
            b.put("Response Info", puoVar.a());
        }
        return b;
    }

    @Override // defpackage.puc
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
