package defpackage;

import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adif {
    public static final String a;
    public final JSONObject b;
    public final int c;

    static {
        String valueOf = String.valueOf(adif.class.getCanonicalName());
        a = zga.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    public adif(JSONObject jSONObject, int i) {
        this.b = jSONObject;
        this.c = i;
    }
}
