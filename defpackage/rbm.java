package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rbm extends ecp implements IInterface {
    public rbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void a(LocationRequestUpdateData locationRequestUpdateData) {
        Parcel pn = pn();
        ecr.g(pn, locationRequestUpdateData);
        pp(59, pn);
    }
}
