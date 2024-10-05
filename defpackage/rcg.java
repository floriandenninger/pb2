package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rcg extends ecp implements rci {
    public rcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.rci
    public final void a(Bundle bundle) {
        Parcel pn = pn();
        ecr.g(pn, bundle);
        pp(1, pn);
    }
}
