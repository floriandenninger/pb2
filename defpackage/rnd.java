package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rnd extends ecp implements IInterface {
    public rnd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final void a(rnc rncVar, boolean z, int i) {
        Parcel pn = pn();
        ecr.i(pn, rncVar);
        ecr.e(pn, z);
        pn.writeString(null);
        pn.writeString(null);
        pn.writeInt(i);
        Parcel po = po(11, pn);
        po.recycle();
    }
}
