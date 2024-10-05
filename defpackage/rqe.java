package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rqe {

    @Deprecated
    public static final qnw a;
    private static final pse b;
    private static final qar c;

    static {
        pse pseVar = new pse();
        b = pseVar;
        rqc rqcVar = new rqc();
        c = rqcVar;
        a = new qnw("UsageReporting.API", rqcVar, pseVar, null, null, null, null);
    }

    public static qob a(Context context) {
        return new qob(context, a, new rqd(), qoa.a);
    }
}
