package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccc {
    private static ccc e;
    public final cbs a;
    public final cbt b;
    public final cca c;
    public final ccb d;

    private ccc(Context context, cfa cfaVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new cbs(applicationContext, cfaVar);
        this.b = new cbt(applicationContext, cfaVar);
        this.c = new cca(applicationContext, cfaVar);
        this.d = new ccb(applicationContext, cfaVar);
    }

    public static synchronized ccc a(Context context, cfa cfaVar) {
        ccc cccVar;
        synchronized (ccc.class) {
            if (e == null) {
                e = new ccc(context, cfaVar);
            }
            cccVar = e;
        }
        return cccVar;
    }
}
