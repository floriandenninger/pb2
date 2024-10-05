package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgu extends Service {
    private qgj a;

    static {
        new qkw("ReconnectionService");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        qgj qgjVar = this.a;
        if (qgjVar != null) {
            try {
                return qgjVar.f(intent);
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        qvf qvfVar;
        qft b = qft.b(this);
        qvf qvfVar2 = null;
        try {
            qvfVar = b.d().b.f();
        } catch (RemoteException unused) {
            qvfVar = null;
        }
        qip.as("Must be called from the main thread.");
        try {
            qvfVar2 = b.g.a.a();
        } catch (RemoteException unused2) {
        }
        qgj b2 = qhh.b(this, qvfVar, qvfVar2);
        this.a = b2;
        if (b2 != null) {
            try {
                b2.g();
            } catch (RemoteException unused3) {
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        qgj qgjVar = this.a;
        if (qgjVar != null) {
            try {
                qgjVar.h();
            } catch (RemoteException unused) {
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        qgj qgjVar = this.a;
        if (qgjVar != null) {
            try {
                return qgjVar.a(intent, i, i2);
            } catch (RemoteException unused) {
            }
        }
        return 2;
    }
}
