package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rcj extends ecp implements rck {
    public rcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.rck
    public final int a() {
        Parcel po = po(2, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // defpackage.rck
    public final void f(String str, String str2, Bundle bundle, long j) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        ecr.g(pn, bundle);
        pn.writeLong(j);
        pp(1, pn);
    }
}
