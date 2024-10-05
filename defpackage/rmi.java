package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rmi {
    public static final qnw a;
    private static final pse b;
    private static final qar c;

    static {
        pse pseVar = new pse();
        b = pseVar;
        rmh rmhVar = new rmh();
        c = rmhVar;
        a = new qnw("MobStoreFile.API", rmhVar, pseVar, null, null, null, null);
    }

    public static qob a(Context context) {
        return new qob(context, a, qnu.f, qoa.a);
    }
}
