package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qor extends qoq {
    protected final rpv a;

    public qor(int i, rpv rpvVar) {
        super(i);
        this.a = rpvVar;
    }

    protected abstract void c(qpu qpuVar);

    @Override // defpackage.qow
    public final void d(Status status) {
        this.a.c(new qnx(status));
    }

    @Override // defpackage.qow
    public final void e(Exception exc) {
        this.a.c(exc);
    }

    @Override // defpackage.qow
    public final void f(qpu qpuVar) {
        try {
            c(qpuVar);
        } catch (DeadObjectException e) {
            d(qow.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(qow.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.qow
    public void g(qpm qpmVar, boolean z) {
    }
}
