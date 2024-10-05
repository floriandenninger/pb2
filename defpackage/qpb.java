package defpackage;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qpb extends BasePendingResult implements qpc {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpb(qnw qnwVar, qof qofVar) {
        super(qofVar);
        qip.az(qofVar, "GoogleApiClient must not be null");
        qip.az(qnwVar, "Api must not be null");
        pse pseVar = qnwVar.b;
    }

    private final void b(RemoteException remoteException) {
        k(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void c(qnq qnqVar);

    public /* bridge */ /* synthetic */ void d(Object obj) {
        throw null;
    }

    public final void j(qnq qnqVar) {
        try {
            c(qnqVar);
        } catch (DeadObjectException e) {
            b(e);
            throw e;
        } catch (RemoteException e2) {
            b(e2);
        }
    }

    public final void k(Status status) {
        qip.ap(!status.c(), "Failed result must not be success");
        n(a(status));
    }
}
