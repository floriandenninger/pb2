package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgw {
    public static final qkw a = new qkw("SessionManager");
    public final qgn b;
    private final Context c;

    public qgw(qgn qgnVar, Context context) {
        this.b = qgnVar;
        this.c = context;
    }

    public final qfy a() {
        qip.as("Must be called from the main thread.");
        qgv b = b();
        if (b == null || !(b instanceof qfy)) {
            return null;
        }
        return (qfy) b;
    }

    public final qgv b() {
        qip.as("Must be called from the main thread.");
        try {
            return (qgv) qve.b(this.b.a());
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void d(boolean z) {
        qip.as("Must be called from the main thread.");
        try {
            a.a("End session for %s", this.c.getPackageName());
            this.b.g(z);
        } catch (RemoteException unused) {
        }
    }

    public final void c(qgx qgxVar, Class cls) {
        if (qgxVar == null) {
            throw new NullPointerException("SessionManagerListener can't be null");
        }
        qip.as("Must be called from the main thread.");
        try {
            this.b.h(new qgo(qgxVar, cls));
        } catch (RemoteException unused) {
        }
    }
}
