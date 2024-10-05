package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pyr extends ecp implements pyt {
    public pyr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // defpackage.pyt
    public final double a() {
        Parcel po = po(3, pn());
        double readDouble = po.readDouble();
        po.recycle();
        return readDouble;
    }

    @Override // defpackage.pyt
    public final int f() {
        Parcel po = po(5, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // defpackage.pyt
    public final int g() {
        Parcel po = po(4, pn());
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // defpackage.pyt
    public final Uri h() {
        Parcel po = po(2, pn());
        Uri uri = (Uri) ecr.a(po, Uri.CREATOR);
        po.recycle();
        return uri;
    }

    @Override // defpackage.pyt
    public final qvf i() {
        qvf qvdVar;
        Parcel po = po(1, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            qvdVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof qvf) {
                qvdVar = (qvf) queryLocalInterface;
            } else {
                qvdVar = new qvd(readStrongBinder);
            }
        }
        po.recycle();
        return qvdVar;
    }
}
