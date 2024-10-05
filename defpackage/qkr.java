package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qkr extends ecp implements IInterface {
    public qkr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void a() {
        pq(1, pn());
    }

    public final void f(String str) {
        Parcel pn = pn();
        pn.writeString(str);
        pq(12, pn);
    }
}
