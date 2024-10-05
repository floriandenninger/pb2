package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rob extends ecp implements IInterface {
    public rob(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void a(roa roaVar, String str) {
        Parcel pn = pn();
        ecr.i(pn, roaVar);
        pn.writeString(str);
        pp(5, pn);
    }
}
