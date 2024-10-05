package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cna extends ecp implements IInterface {
    public cna(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    public final int a(int i, String str, String str2) {
        Parcel pn = pn();
        pn.writeInt(i);
        pn.writeString(str);
        pn.writeString(str2);
        Parcel po = po(1, pn);
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }
}
