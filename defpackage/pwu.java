package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwu extends ecp implements IInterface {
    public pwu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder a(qvf qvfVar, AdSizeParcel adSizeParcel, String str, pzu pzuVar, int i) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        ecr.g(pn, adSizeParcel);
        pn.writeString(str);
        ecr.i(pn, pzuVar);
        pn.writeInt(213880000);
        pn.writeInt(i);
        Parcel po = po(2, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        po.recycle();
        return readStrongBinder;
    }
}
