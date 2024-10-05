package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qgv {
    private final qgq a;
    public final qgl g;

    static {
        new qkw("Session");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public qgv(Context context, String str, String str2) {
        qgq qgqVar = new qgq(this);
        this.a = qgqVar;
        this.g = qhh.d(context, str, str2, qgqVar);
    }

    public long a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Bundle bundle) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(Bundle bundle) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void h(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void i(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(Bundle bundle) {
        throw null;
    }

    public final qvf m() {
        qgl qglVar = this.g;
        if (qglVar != null) {
            try {
                return qglVar.g();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(int i) {
        qgl qglVar = this.g;
        if (qglVar != null) {
            try {
                qglVar.h(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final boolean o() {
        qip.as("Must be called from the main thread.");
        qgl qglVar = this.g;
        if (qglVar != null) {
            try {
                return qglVar.i();
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
