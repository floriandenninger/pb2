package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pzx extends ecp implements pzz {
    public pzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // defpackage.pzz
    public final void a() {
        pp(1, pn());
    }

    @Override // defpackage.pzz
    public final void f() {
        pp(2, pn());
    }

    @Override // defpackage.pzz
    public final void g(int i) {
        Parcel pn = pn();
        pn.writeInt(i);
        pp(3, pn);
    }

    @Override // defpackage.pzz
    public final void h(AdErrorParcel adErrorParcel) {
        Parcel pn = pn();
        ecr.g(pn, adErrorParcel);
        pp(23, pn);
    }

    @Override // defpackage.pzz
    public final void i() {
        pp(8, pn());
    }

    @Override // defpackage.pzz
    public final void j() {
        pp(6, pn());
    }

    @Override // defpackage.pzz
    public final void k() {
        pp(5, pn());
    }

    @Override // defpackage.pzz
    public final void l(String str, String str2) {
        Parcel pn = pn();
        pn.writeString(str);
        pn.writeString(str2);
        pp(9, pn);
    }

    @Override // defpackage.pzz
    public final void m(pyx pyxVar, String str) {
        Parcel pn = pn();
        ecr.i(pn, pyxVar);
        pn.writeString(str);
        pp(10, pn);
    }
}
