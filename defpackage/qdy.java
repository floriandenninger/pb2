package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qdy {
    public static final qnw a;
    public static final pse b;
    private static final qar c;

    static {
        pse pseVar = new pse();
        b = pseVar;
        qdx qdxVar = new qdx();
        c = qdxVar;
        a = new qnw("Auth.PROXY_API", qdxVar, pseVar, null, null, null, null);
    }

    public static qob a(Context context) {
        return new qob(context, a, qdz.a, qoa.a);
    }
}
