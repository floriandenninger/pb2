package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rge implements ServiceConnection {
    public final String a;
    final /* synthetic */ rgf b;

    public rge(rgf rgfVar, String str) {
        this.b = rgfVar;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ptt pttVar;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof ptt) {
                    pttVar = (ptt) queryLocalInterface;
                } else {
                    pttVar = new ptt(iBinder);
                }
                if (pttVar == null) {
                    this.b.a.aF().f.a("Install Referrer Service implementation was not found");
                    return;
                } else {
                    this.b.a.aF().k.a("Install Referrer Service connected");
                    this.b.a.aG().g(new rgd(this, pttVar, this));
                    return;
                }
            } catch (RuntimeException e) {
                this.b.a.aF().f.b("Exception occurred while calling Install Referrer API", e);
                return;
            }
        }
        this.b.a.aF().f.a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.aF().k.a("Install Referrer Service disconnected");
    }
}
