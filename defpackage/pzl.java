package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pzl extends ecp implements IInterface {
    public pzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final pxn a() {
        pxn pxlVar;
        Parcel po = po(11, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            pxlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof pxn) {
                pxlVar = (pxn) queryLocalInterface;
            } else {
                pxlVar = new pxl(readStrongBinder);
            }
        }
        po.recycle();
        return pxlVar;
    }

    public final pyq f() {
        pyq pyqVar;
        Parcel po = po(14, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            pyqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof pyq) {
                pyqVar = (pyq) queryLocalInterface;
            } else {
                pyqVar = new pyq(readStrongBinder);
            }
        }
        po.recycle();
        return pyqVar;
    }
}
