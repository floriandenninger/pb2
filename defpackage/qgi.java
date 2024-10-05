package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgi extends ecp implements qgj {
    public qgi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // defpackage.qgj
    public final int a(Intent intent, int i, int i2) {
        Parcel pn = pn();
        ecr.g(pn, intent);
        pn.writeInt(i);
        pn.writeInt(i2);
        Parcel po = po(2, pn);
        int readInt = po.readInt();
        po.recycle();
        return readInt;
    }

    @Override // defpackage.qgj
    public final IBinder f(Intent intent) {
        Parcel pn = pn();
        ecr.g(pn, intent);
        Parcel po = po(3, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        po.recycle();
        return readStrongBinder;
    }

    @Override // defpackage.qgj
    public final void g() {
        pp(1, pn());
    }

    @Override // defpackage.qgj
    public final void h() {
        pp(4, pn());
    }
}
