package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qou extends qoq {
    private final qre a;
    private final rpv b;
    private final qqy d;

    public qou(int i, qre qreVar, rpv rpvVar, qqy qqyVar) {
        super(i);
        this.b = rpvVar;
        this.a = qreVar;
        this.d = qqyVar;
        if (i == 2 && qreVar.c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.qoq
    public final boolean a(qpu qpuVar) {
        return this.a.c;
    }

    @Override // defpackage.qoq
    public final Feature[] b(qpu qpuVar) {
        return this.a.b;
    }

    @Override // defpackage.qow
    public final void d(Status status) {
        this.b.c(this.d.a(status));
    }

    @Override // defpackage.qow
    public final void e(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.qow
    public final void f(qpu qpuVar) {
        try {
            this.a.a(qpuVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(qow.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.qow
    public final void g(qpm qpmVar, boolean z) {
        rpv rpvVar = this.b;
        qpmVar.b.put(rpvVar, Boolean.valueOf(z));
        rpvVar.a.q(new qpl(qpmVar, rpvVar));
    }
}
