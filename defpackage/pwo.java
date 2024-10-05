package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwo extends ecq implements pwp {
    public pwg a;

    public pwo() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // defpackage.pwp
    public final pwm a() {
        return new pwl(this);
    }

    @Override // defpackage.pwp
    public final void f(String str, pzg pzgVar, pzd pzdVar) {
    }

    @Override // defpackage.pwp
    public final void g(pzk pzkVar) {
    }

    @Override // defpackage.pwp
    public final void h(pwg pwgVar) {
        this.a = pwgVar;
    }

    @Override // defpackage.pwp
    public final void i(NativeAdOptionsParcel nativeAdOptionsParcel) {
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        pwg pweVar;
        switch (i) {
            case 1:
                pwm a = a();
                parcel2.writeNoException();
                ecr.i(parcel2, a);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    pweVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof pwg) {
                        pweVar = (pwg) queryLocalInterface;
                    } else {
                        pweVar = new pwe(readStrongBinder);
                    }
                }
                this.a = pweVar;
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    if (queryLocalInterface2 instanceof pyz) {
                    } else {
                        new pyz(readStrongBinder2);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    if (queryLocalInterface3 instanceof pza) {
                    } else {
                        new pza(readStrongBinder3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    if (queryLocalInterface4 instanceof pzg) {
                    } else {
                        new pze(readStrongBinder4);
                    }
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    if (queryLocalInterface5 instanceof pzd) {
                    } else {
                        new pzb(readStrongBinder5);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface6 instanceof pxa) {
                    } else {
                        new pxa(readStrongBinder6);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    if (queryLocalInterface7 instanceof pzh) {
                    } else {
                        new pzh(readStrongBinder7);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    if (queryLocalInterface8 instanceof pzk) {
                    } else {
                        new pzi(readStrongBinder8);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    if (queryLocalInterface9 instanceof pzr) {
                    } else {
                        new pzr(readStrongBinder9);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                return true;
        }
    }
}
