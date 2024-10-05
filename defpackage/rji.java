package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rji implements ServiceConnection, qro, qrp {
    public volatile boolean a;
    public volatile rfl b;
    final /* synthetic */ rjj c;

    /* JADX INFO: Access modifiers changed from: protected */
    public rji(rjj rjjVar) {
        this.c = rjjVar;
    }

    @Override // defpackage.qro
    public final void a(int i) {
        qip.as("MeasurementServiceConnection.onConnectionSuspended");
        this.c.aF().j.a("Service connection suspended");
        this.c.aG().g(new rjh(this, 1));
    }

    @Override // defpackage.qro
    public final void b() {
        qip.as("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                qip.an(this.b);
                this.c.aG().g(new rjg(this, (rfg) this.b.D(), 0));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // defpackage.qrp
    public final void c(ConnectionResult connectionResult) {
        qip.as("MeasurementServiceConnection.onConnectionFailed");
        rgt rgtVar = this.c.w;
        rfp rfpVar = rgtVar.h;
        rfp rfpVar2 = (rfpVar == null || !rfpVar.m()) ? null : rgtVar.h;
        if (rfpVar2 != null) {
            rfpVar2.f.b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.aG().g(new rjh(this, 0));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        rfg rfeVar;
        qip.as("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder != null) {
                rfg rfgVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (queryLocalInterface instanceof rfg) {
                            rfeVar = (rfg) queryLocalInterface;
                        } else {
                            rfeVar = new rfe(iBinder);
                        }
                        rfgVar = rfeVar;
                        this.c.aF().k.a("Bound to IMeasurementService interface");
                    } else {
                        this.c.aF().c.b("Got binder with a wrong descriptor", interfaceDescriptor);
                    }
                } catch (RemoteException unused) {
                    this.c.aF().c.a("Service connect failed to get IMeasurementService");
                }
                if (rfgVar == null) {
                    this.a = false;
                    try {
                        qtj.a().b(this.c.I(), this.c.b);
                    } catch (IllegalArgumentException unused2) {
                    }
                } else {
                    this.c.aG().g(new rjg(this, rfgVar, 1));
                }
                return;
            }
            this.a = false;
            this.c.aF().c.a("Service connected with null binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qip.as("MeasurementServiceConnection.onServiceDisconnected");
        this.c.aF().j.a("Service disconnected");
        this.c.aG().g(new rjf(this, componentName));
    }
}
