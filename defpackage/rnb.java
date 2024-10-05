package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rnb {
    public static final qnw a;
    public static final pse b;
    static final qar c;

    static {
        pse pseVar = new pse();
        b = pseVar;
        rmy rmyVar = new rmy();
        c = rmyVar;
        a = new qnw("People.API_1P", rmyVar, pseVar, null, null, null, null);
    }

    @Deprecated
    public static rmx a(Context context, rna rnaVar) {
        return new rmx(context, rnaVar);
    }

    @Deprecated
    public static qob b(Context context, rna rnaVar) {
        return new qob(context, a, rnaVar, qoa.a);
    }

    @Deprecated
    public static qob c(Context context, rna rnaVar) {
        return new qob(context, a, rnaVar, qoa.a);
    }
}
