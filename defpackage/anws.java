package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anws {
    private static anws c;
    public Boolean a = null;
    public Boolean b = null;

    private anws() {
    }

    public static synchronized anws a() {
        anws anwsVar;
        synchronized (anws.class) {
            if (c == null) {
                c = new anws();
            }
            anwsVar = c;
        }
        return anwsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(Context context) {
        if (this.a == null) {
            this.a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        this.a.booleanValue();
        return this.a.booleanValue();
    }
}
