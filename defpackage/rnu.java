package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rnu {

    @Deprecated
    public static final qnw a;
    private static final pse b;
    private static final qar c;

    static {
        pse pseVar = new pse();
        b = pseVar;
        rnt rntVar = new rnt();
        c = rntVar;
        a = new qnw("Phenotype.API", rntVar, pseVar, null, null, null, null);
    }

    public static Uri a() {
        return uvg.a("com.google.android.gms.clearcut.public");
    }

    public static qob b(Context context) {
        return new qob(context, a, qnu.f, qoa.a);
    }
}
