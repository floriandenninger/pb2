package defpackage;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class yvm extends yvo {
    private final JSONObject a;
    private final cnl b;
    private final boolean c;

    public yvm(String str, JSONObject jSONObject, cnl cnlVar, cnk cnkVar) {
        this(str, jSONObject, cnlVar, cnkVar, false);
    }

    @Override // defpackage.yvo
    public final String lb() {
        return this.c ? "application/json" : "application/json; charset=utf-8";
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        try {
            return cnm.b(new JSONObject(new String(cnhVar.b, ach.m(cnhVar.c, "utf-8"))), ach.k(cnhVar));
        } catch (UnsupportedEncodingException | JSONException e) {
            return cnm.a(new cnj(e));
        }
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
        this.b.kZ((JSONObject) obj);
    }

    @Override // defpackage.yvo
    public final byte[] qm() {
        try {
            return this.a.toString().getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            zga.d("Unable to encode JSON request", e);
            return null;
        }
    }

    public yvm(String str, JSONObject jSONObject, cnl cnlVar, cnk cnkVar, boolean z) {
        super(2, str, cnkVar);
        this.a = jSONObject;
        this.b = cnlVar;
        this.c = z;
    }
}
