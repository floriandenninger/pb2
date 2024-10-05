package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qai implements Runnable {
    final /* synthetic */ dvc a;
    final /* synthetic */ qaj b;
    private final /* synthetic */ int c;

    public qai(qaj qajVar, dvc dvcVar, int i) {
        this.c = i;
        this.b = qajVar;
        this.a = dvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            try {
                this.b.a.g(qar.a(this.a));
                return;
            } catch (RemoteException e) {
                qbi.i("#007 Could not call remote method.", e);
                return;
            }
        }
        try {
            this.b.a.g(qar.a(this.a));
        } catch (RemoteException e2) {
            qbi.i("#007 Could not call remote method.", e2);
        }
    }
}
