package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qsu extends ecq implements IInterface {
    private qrx a;
    private final int b;

    public qsu(qrx qrxVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = qrxVar;
        this.b = i;
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        qip.az(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.m(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) ecr.a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            parcel.readInt();
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            ConnectionInfo connectionInfo = (ConnectionInfo) ecr.a(parcel, ConnectionInfo.CREATOR);
            qrx qrxVar = this.a;
            qip.az(qrxVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            qip.an(connectionInfo);
            qrxVar.E = connectionInfo;
            if (qrxVar.R()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
                qta.a().b(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a);
            }
            a(readInt, readStrongBinder, connectionInfo.a);
        }
        parcel2.writeNoException();
        return true;
    }

    public qsu() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}
