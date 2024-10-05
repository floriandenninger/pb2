package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rbq extends rbi {
    public final rbp b;

    public rbq(Context context, Looper looper, qod qodVar, qoe qoeVar, qrz qrzVar) {
        super(context, looper, qodVar, qoeVar, qrzVar);
        this.b = new rbp(context, this.a);
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qrx, defpackage.qnv
    public final void l() {
        synchronized (this.b) {
            if (w()) {
                try {
                    rbp rbpVar = this.b;
                    synchronized (rbpVar.b) {
                        for (rbb rbbVar : rbpVar.b.values()) {
                            if (rbbVar != null) {
                                rbpVar.e.b().a(new LocationRequestUpdateData(2, null, rbbVar, null, null, null, null));
                            }
                        }
                        rbpVar.b.clear();
                    }
                    synchronized (rbpVar.d) {
                        for (ray rayVar : rbpVar.d.values()) {
                            if (rayVar != null) {
                                rbpVar.e.b().a(LocationRequestUpdateData.a(rayVar, null));
                            }
                        }
                        rbpVar.d.clear();
                    }
                    synchronized (rbpVar.c) {
                        for (rav ravVar : rbpVar.c.values()) {
                            if (ravVar != null) {
                                rbm b = rbpVar.e.b();
                                DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData = new DeviceOrientationRequestUpdateData(2, null, ravVar, null);
                                Parcel pn = b.pn();
                                ecr.g(pn, deviceOrientationRequestUpdateData);
                                b.pp(75, pn);
                            }
                        }
                        rbpVar.c.clear();
                    }
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.l();
        }
    }
}
