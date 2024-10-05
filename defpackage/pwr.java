package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwr extends ecp implements pwt {
    public pwr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // defpackage.pwt
    public final AdSizeParcel a() {
        Parcel po = po(12, pn());
        AdSizeParcel adSizeParcel = (AdSizeParcel) ecr.a(po, AdSizeParcel.CREATOR);
        po.recycle();
        return adSizeParcel;
    }

    @Override // defpackage.pwt
    public final pxn f() {
        pxn pxlVar;
        Parcel po = po(26, pn());
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

    @Override // defpackage.pwt
    public final qvf g() {
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

    @Override // defpackage.pwt
    public final void h() {
        pp(2, pn());
    }

    @Override // defpackage.pwt
    public final void i(AdRequestParcel adRequestParcel, pwj pwjVar) {
        Parcel pn = pn();
        ecr.g(pn, adRequestParcel);
        ecr.i(pn, pwjVar);
        pp(43, pn);
    }

    @Override // defpackage.pwt
    public final void j() {
        pp(5, pn());
    }

    @Override // defpackage.pwt
    public final void k() {
        pp(6, pn());
    }

    @Override // defpackage.pwt
    public final void l(pwd pwdVar) {
        Parcel pn = pn();
        ecr.i(pn, pwdVar);
        pp(20, pn);
    }

    @Override // defpackage.pwt
    public final void m(pwg pwgVar) {
        Parcel pn = pn();
        ecr.i(pn, pwgVar);
        pp(7, pn);
    }

    @Override // defpackage.pwt
    public final void n(AdSizeParcel adSizeParcel) {
        Parcel pn = pn();
        ecr.g(pn, adSizeParcel);
        pp(13, pn);
    }

    @Override // defpackage.pwt
    public final void o(pwy pwyVar) {
        Parcel pn = pn();
        ecr.i(pn, pwyVar);
        pp(8, pn);
    }

    @Override // defpackage.pwt
    public final void p(pxd pxdVar) {
        Parcel pn = pn();
        ecr.i(pn, pxdVar);
        pp(45, pn);
    }

    @Override // defpackage.pwt
    public final void q(boolean z) {
        Parcel pn = pn();
        ecr.e(pn, z);
        pp(34, pn);
    }

    @Override // defpackage.pwt
    public final void r(pxj pxjVar) {
        Parcel pn = pn();
        ecr.i(pn, pxjVar);
        pp(42, pn);
    }

    @Override // defpackage.pwt
    public final void s(qvf qvfVar) {
        Parcel pn = pn();
        ecr.i(pn, qvfVar);
        pp(44, pn);
    }

    @Override // defpackage.pwt
    public final boolean t(AdRequestParcel adRequestParcel) {
        Parcel pn = pn();
        ecr.g(pn, adRequestParcel);
        Parcel po = po(4, pn);
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }

    @Override // defpackage.pwt
    public final void u() {
        Parcel pn = pn();
        ecr.e(pn, false);
        pp(22, pn);
    }
}
