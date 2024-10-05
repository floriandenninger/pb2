package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qvv extends ecp implements IInterface {
    public qvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a() {
        Parcel po = po(6, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }
}
