package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qza {
    public static final qnw a;
    public static final pse b;
    public static final qar c;

    static {
        pse pseVar = new pse();
        b = pseVar;
        qyz qyzVar = new qyz();
        c = qyzVar;
        a = new qnw("Help.API", qyzVar, pseVar, null, null, null, null);
    }

    public static qzn a(Activity activity) {
        return new qzn(activity);
    }

    public static qzn b(Context context) {
        return new qzn(context);
    }
}
