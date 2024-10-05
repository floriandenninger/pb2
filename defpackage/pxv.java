package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pxv implements Runnable {
    final /* synthetic */ pwl a;

    public pxv(pwl pwlVar) {
        this.a = pwlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pwg pwgVar = this.a.a.a;
        if (pwgVar != null) {
            try {
                pwgVar.a();
            } catch (RemoteException e) {
                qbi.g("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
