package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qos extends qow {
    protected final qpb a;

    public qos(int i, qpb qpbVar) {
        super(i);
        this.a = qpbVar;
    }

    @Override // defpackage.qow
    public final void d(Status status) {
        try {
            this.a.k(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.qow
    public final void e(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.a.k(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.qow
    public final void f(qpu qpuVar) {
        try {
            this.a.j(qpuVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    @Override // defpackage.qow
    public final void g(qpm qpmVar, boolean z) {
        qpb qpbVar = this.a;
        qpmVar.a.put(qpbVar, Boolean.valueOf(z));
        qpbVar.e(new qpk(qpmVar, qpbVar));
    }
}
