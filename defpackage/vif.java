package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vif extends vig implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b;

    public vif(vho vhoVar) {
        super(vhoVar);
        this.b = new CancellationSignal();
    }

    @Override // defpackage.vig
    protected final void a(vho vhoVar) {
        try {
            this.b.setOnCancelListener(this);
            CancellationSignal cancellationSignal = this.b;
            vhx vhxVar = vhoVar.c.e;
            synchronized (vhxVar.a.h) {
                int i = vhxVar.a.k;
                if (i != 0) {
                    amkq.P(i > 0, "Refcount went negative!", i);
                    vhxVar.a.k++;
                } else {
                    throw new CancellationException("database is closed");
                }
            }
            try {
                Cursor rawQueryWithFactory = vhoVar.c.a.rawQueryWithFactory(new vio(vhoVar.a), vhoVar.b, null, null, cancellationSignal);
                try {
                    if (!isCancelled() && rawQueryWithFactory != null) {
                        rawQueryWithFactory.getCount();
                    }
                    if (o(rawQueryWithFactory)) {
                        return;
                    }
                    uqq.q(rawQueryWithFactory);
                } catch (Throwable th) {
                    try {
                        e(th);
                        if (o(rawQueryWithFactory)) {
                            return;
                        }
                        uqq.q(rawQueryWithFactory);
                    } catch (Throwable th2) {
                        if (!o(rawQueryWithFactory)) {
                            uqq.q(rawQueryWithFactory);
                        }
                        throw th2;
                    }
                }
            } finally {
                vhoVar.c.e.a();
            }
        } catch (OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}
