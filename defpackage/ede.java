package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ede extends ecp implements IInterface {
    public ede(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSession");
    }

    public final void a(byte[] bArr) {
        Parcel pn = pn();
        pn.writeByteArray(bArr);
        pq(1, pn);
    }
}
