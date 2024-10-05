package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qow {
    public final int c;

    public qow(int i) {
        this.c = i;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public abstract void f(qpu qpuVar);

    public abstract void g(qpm qpmVar, boolean z);
}
