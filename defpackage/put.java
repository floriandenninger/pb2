package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class put extends ecp implements puv {
    public put(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // defpackage.puv
    public final String a(qvf qvfVar, String str) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pn.writeString(str);
        Parcel po = po(8, pn);
        String readString = po.readString();
        po.recycle();
        return readString;
    }

    @Override // defpackage.puv
    public final String f(qvf qvfVar, byte[] bArr) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pn.writeByteArray(bArr);
        Parcel po = po(12, pn);
        String readString = po.readString();
        po.recycle();
        return readString;
    }

    @Override // defpackage.puv
    public final String g() {
        Parcel po = po(1, pn());
        String readString = po.readString();
        po.recycle();
        return readString;
    }

    @Override // defpackage.puv
    public final void h(qvf qvfVar) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pp(9, pn);
    }

    @Override // defpackage.puv
    public final void i(String str, String str2) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        pp(2, pn);
    }
}
