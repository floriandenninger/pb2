package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oxa {
    private static volatile oxa a;
    private final Context b;

    private oxa(Context context) {
        this.b = context;
    }

    public static oxa a() {
        oxa oxaVar = a;
        if (oxaVar != null) {
            return oxaVar;
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (a == null) {
            synchronized (oxa.class) {
                if (a == null) {
                    a = new oxa(context);
                }
            }
        }
    }

    public final owx c() {
        return new owz(this.b);
    }
}
