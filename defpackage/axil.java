package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.vrcore.logging.api.VREventParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axil extends ecp implements axim {
    public axil(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
    }

    @Override // defpackage.axim
    public final void a(VREventParcelable vREventParcelable) {
        Parcel pn = pn();
        ecr.g(pn, vREventParcelable);
        pq(2, pn);
    }
}
