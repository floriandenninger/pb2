package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwq extends ecp implements IInterface {
    public pwq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder a(qvf qvfVar, String str, pzu pzuVar) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pn.writeString(str);
        ecr.i(pn, pzuVar);
        pn.writeInt(213880000);
        Parcel po = po(1, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        po.recycle();
        return readStrongBinder;
    }
}
