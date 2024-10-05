package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pxg {
    private final String a;

    public pxg(pxf pxfVar) {
        String str;
        try {
            Parcel po = pxfVar.po(1, pxfVar.pn());
            str = po.readString();
            po.recycle();
        } catch (RemoteException e) {
            qbi.d(e);
            str = null;
        }
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
