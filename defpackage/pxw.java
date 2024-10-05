package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pxw implements Runnable {
    final /* synthetic */ pws a;

    public pxw(pws pwsVar) {
        this.a = pwsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pwg pwgVar = this.a.a;
        if (pwgVar != null) {
            try {
                pwgVar.a();
            } catch (RemoteException e) {
                qbi.g("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
