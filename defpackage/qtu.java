package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qtu {
    private static final qtu a = new qtu();
    private trp b = null;

    public static trp b(Context context) {
        return a.a(context);
    }

    public final synchronized trp a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new trp(context, (short[]) null);
        }
        return this.b;
    }
}
