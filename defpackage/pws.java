package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pws extends ecq implements pwt {
    public pwg a;

    public pws() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // defpackage.pwt
    public final AdSizeParcel a() {
        return null;
    }

    @Override // defpackage.pwt
    public final pxn f() {
        return null;
    }

    @Override // defpackage.pwt
    public final qvf g() {
        return null;
    }

    @Override // defpackage.pwt
    public final void h() {
    }

    @Override // defpackage.pwt
    public final void i(AdRequestParcel adRequestParcel, pwj pwjVar) {
    }

    @Override // defpackage.pwt
    public final void j() {
    }

    @Override // defpackage.pwt
    public final void k() {
    }

    @Override // defpackage.pwt
    public final void l(pwd pwdVar) {
    }

    @Override // defpackage.pwt
    public final void m(pwg pwgVar) {
        this.a = pwgVar;
    }

    @Override // defpackage.pwt
    public final void n(AdSizeParcel adSizeParcel) {
    }

    @Override // defpackage.pwt
    public final void o(pwy pwyVar) {
    }

    @Override // defpackage.pwt
    public final void p(pxd pxdVar) {
    }

    @Override // defpackage.pwt
    public final void q(boolean z) {
    }

    @Override // defpackage.pwt
    public final void r(pxj pxjVar) {
    }

    @Override // defpackage.pwt
    public final void s(qvf qvfVar) {
    }

    @Override // defpackage.pwt
    public final boolean t(AdRequestParcel adRequestParcel) {
        qbi.c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        qbg.a.post(new pxw(this));
        return false;
    }

    @Override // defpackage.pwt
    public final void u() {
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        pwg pwgVar = null;
        switch (i) {
            case 1:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                ecr.e(parcel2, false);
                return true;
            case 4:
                t((AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR));
                parcel2.writeNoException();
                ecr.e(parcel2, false);
                return true;
            case 5:
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof pwg) {
                        pwgVar = (pwg) queryLocalInterface;
                    } else {
                        pwgVar = new pwe(readStrongBinder);
                    }
                }
                this.a = pwgVar;
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof pwy) {
                    } else {
                        new pww(readStrongBinder2);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                return true;
            case 12:
                parcel2.writeNoException();
                ecr.h(parcel2, null);
                return true;
            case 13:
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (queryLocalInterface3 instanceof qaw) {
                    } else {
                        new qaw(readStrongBinder3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (queryLocalInterface4 instanceof qax) {
                    } else {
                        new qax(readStrongBinder4);
                    }
                }
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    if (queryLocalInterface5 instanceof pyj) {
                    } else {
                        new pyj(readStrongBinder5);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface6 instanceof pwd) {
                    } else {
                        new pwb(readStrongBinder6);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface7 instanceof pxa) {
                    } else {
                        new pxa(readStrongBinder7);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 22:
                ecr.j(parcel);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel2.writeNoException();
                ecr.e(parcel2, false);
                return true;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    if (queryLocalInterface8 instanceof qbc) {
                    } else {
                        new qbc(readStrongBinder8);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 26:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 29:
                parcel2.writeNoException();
                return true;
            case 30:
                parcel2.writeNoException();
                return true;
            case 31:
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case 32:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 33:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 34:
                ecr.j(parcel);
                parcel2.writeNoException();
                return true;
            case 35:
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface9 instanceof pwv) {
                    } else {
                        new pwv(readStrongBinder9);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                ecr.h(parcel2, bundle);
                return true;
            case 38:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 39:
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    if (queryLocalInterface10 instanceof pvk) {
                    } else {
                        new pvk(readStrongBinder10);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 41:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface11 instanceof pxj) {
                    } else {
                        new pxh(readStrongBinder11);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 43:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface12 instanceof pwj) {
                    } else {
                        new pwh(readStrongBinder12);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 44:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface13 instanceof qvf) {
                    } else {
                        new qvd(readStrongBinder13);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface14 instanceof pxd) {
                    } else {
                        new pxb(readStrongBinder14);
                    }
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
