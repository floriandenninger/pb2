package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwe extends ecp implements pwg {
    public pwe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // defpackage.pwg
    public final void a() {
        Parcel pn = pn();
        pn.writeInt(1);
        pp(2, pn);
    }
}
