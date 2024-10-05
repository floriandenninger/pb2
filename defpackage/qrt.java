package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qrt implements ServiceConnection {
    final /* synthetic */ qrx a;
    private final int b;

    public qrt(qrx qrxVar, int i) {
        this.a = qrxVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qsv qsvVar;
        int i;
        int i2;
        if (iBinder == null) {
            qrx qrxVar = this.a;
            synchronized (qrxVar.t) {
                i = qrxVar.x;
            }
            if (i == 3) {
                qrxVar.D = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = qrxVar.s;
            handler.sendMessage(handler.obtainMessage(i2, qrxVar.F.get(), 16));
            return;
        }
        synchronized (this.a.u) {
            qrx qrxVar2 = this.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof qsv)) {
                qsvVar = new qsv(iBinder);
            } else {
                qsvVar = (qsv) queryLocalInterface;
            }
            qrxVar2.G = qsvVar;
        }
        this.a.P(0, this.b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.u) {
            this.a.G = null;
        }
        Handler handler = this.a.s;
        handler.sendMessage(handler.obtainMessage(6, this.b, 1));
    }
}
