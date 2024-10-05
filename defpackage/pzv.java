package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.initialization.MediationConfigurationParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class pzv extends ecq implements pzw {
    public pzv() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qvf qvdVar;
        qvf qvfVar;
        pzz pzxVar;
        qvf qvdVar2;
        qvf qvdVar3;
        qvf qvfVar2;
        pzz pzxVar2;
        pzz pzzVar;
        qvf qvdVar4;
        qvf qvfVar3;
        pzz pzxVar3;
        qvf qvdVar5;
        qvf qvdVar6;
        qvf qvfVar4;
        pzz pzxVar4;
        qvf qvdVar7;
        qvf qvfVar5;
        pzz pzzVar2 = null;
        qvf qvfVar6 = null;
        qvf qvfVar7 = null;
        qvf qvfVar8 = null;
        qvf qvfVar9 = null;
        pzz pzzVar3 = null;
        qbd qbdVar = null;
        pzz pzzVar4 = null;
        pzz pzzVar5 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    qvfVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof qvf) {
                        qvdVar = (qvf) queryLocalInterface;
                    } else {
                        qvdVar = new qvd(readStrongBinder);
                    }
                    qvfVar = qvdVar;
                }
                AdSizeParcel adSizeParcel = (AdSizeParcel) ecr.a(parcel, AdSizeParcel.CREATOR);
                AdRequestParcel adRequestParcel = (AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof pzz) {
                        pzxVar = (pzz) queryLocalInterface2;
                    } else {
                        pzxVar = new pzx(readStrongBinder2);
                    }
                    pzzVar2 = pzxVar;
                }
                i(qvfVar, adSizeParcel, adRequestParcel, readString, pzzVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                qvf f = f();
                parcel2.writeNoException();
                ecr.i(parcel2, f);
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    qvdVar2 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof qvf) {
                        qvdVar2 = (qvf) queryLocalInterface3;
                    } else {
                        qvdVar2 = new qvd(readStrongBinder3);
                    }
                }
                AdRequestParcel adRequestParcel2 = (AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof pzz) {
                        pzzVar5 = (pzz) queryLocalInterface4;
                    } else {
                        pzzVar5 = new pzx(readStrongBinder4);
                    }
                }
                k(qvdVar2, adRequestParcel2, readString2, pzzVar5);
                parcel2.writeNoException();
                return true;
            case 4:
                r();
                parcel2.writeNoException();
                return true;
            case 5:
                g();
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    qvfVar2 = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface5 instanceof qvf) {
                        qvdVar3 = (qvf) queryLocalInterface5;
                    } else {
                        qvdVar3 = new qvd(readStrongBinder5);
                    }
                    qvfVar2 = qvdVar3;
                }
                AdSizeParcel adSizeParcel2 = (AdSizeParcel) ecr.a(parcel, AdSizeParcel.CREATOR);
                AdRequestParcel adRequestParcel3 = (AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    pzzVar = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof pzz) {
                        pzxVar2 = (pzz) queryLocalInterface6;
                    } else {
                        pzxVar2 = new pzx(readStrongBinder6);
                    }
                    pzzVar = pzxVar2;
                }
                j(qvfVar2, adSizeParcel2, adRequestParcel3, readString3, readString4, pzzVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    qvfVar3 = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface7 instanceof qvf) {
                        qvdVar4 = (qvf) queryLocalInterface7;
                    } else {
                        qvdVar4 = new qvd(readStrongBinder7);
                    }
                    qvfVar3 = qvdVar4;
                }
                AdRequestParcel adRequestParcel4 = (AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof pzz) {
                        pzxVar3 = (pzz) queryLocalInterface8;
                    } else {
                        pzxVar3 = new pzx(readStrongBinder8);
                    }
                    pzzVar4 = pzxVar3;
                }
                l(qvfVar3, adRequestParcel4, readString5, readString6, pzzVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                o();
                parcel2.writeNoException();
                return true;
            case 9:
                p();
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    qvdVar5 = null;
                } else {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface9 instanceof qvf) {
                        qvdVar5 = (qvf) queryLocalInterface9;
                    } else {
                        qvdVar5 = new qvd(readStrongBinder9);
                    }
                }
                parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    if (queryLocalInterface10 instanceof qbd) {
                        qbdVar = (qbd) queryLocalInterface10;
                    } else {
                        qbdVar = new qbd(readStrongBinder10);
                    }
                }
                parcel.readString();
                B(qvdVar5, qbdVar);
                parcel2.writeNoException();
                return true;
            case 11:
                h((AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                s();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean t = t();
                parcel2.writeNoException();
                ecr.e(parcel2, t);
                return true;
            case 14:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 == null) {
                    qvfVar4 = null;
                } else {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface11 instanceof qvf) {
                        qvdVar6 = (qvf) queryLocalInterface11;
                    } else {
                        qvdVar6 = new qvd(readStrongBinder11);
                    }
                    qvfVar4 = qvdVar6;
                }
                AdRequestParcel adRequestParcel5 = (AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface12 instanceof pzz) {
                        pzxVar4 = (pzz) queryLocalInterface12;
                    } else {
                        pzxVar4 = new pzx(readStrongBinder12);
                    }
                    pzzVar3 = pzxVar4;
                }
                m(qvfVar4, adRequestParcel5, readString7, readString8, pzzVar3, (NativeAdOptionsParcel) ecr.a(parcel, NativeAdOptionsParcel.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 17:
                Bundle a = a();
                parcel2.writeNoException();
                ecr.h(parcel2, a);
                return true;
            case 18:
                Bundle b = b();
                parcel2.writeNoException();
                ecr.h(parcel2, b);
                return true;
            case 19:
                Bundle c = c();
                parcel2.writeNoException();
                ecr.h(parcel2, c);
                return true;
            case 20:
                AdRequestParcel adRequestParcel6 = (AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR);
                String readString9 = parcel.readString();
                parcel.readString();
                w(adRequestParcel6, readString9);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface13 instanceof qvf) {
                        qvfVar9 = (qvf) queryLocalInterface13;
                    } else {
                        qvfVar9 = new qvd(readStrongBinder13);
                    }
                }
                n(qvfVar9);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ecr.e(parcel2, false);
                return true;
            case 23:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface14 instanceof qvf) {
                    } else {
                        new qvd(readStrongBinder14);
                    }
                }
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    if (queryLocalInterface15 instanceof qbd) {
                    } else {
                        new qbd(readStrongBinder15);
                    }
                }
                parcel.createStringArrayList();
                u();
                parcel2.writeNoException();
                return true;
            case 24:
                pyx A = A();
                parcel2.writeNoException();
                ecr.i(parcel2, A);
                return true;
            case 25:
                q(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                pxn d = d();
                parcel2.writeNoException();
                ecr.i(parcel2, d);
                return true;
            case 27:
                qac e = e();
                parcel2.writeNoException();
                ecr.i(parcel2, e);
                return true;
            case 28:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface16 instanceof qvf) {
                        qvfVar8 = (qvf) queryLocalInterface16;
                    } else {
                        qvfVar8 = new qvd(readStrongBinder16);
                    }
                }
                AdRequestParcel adRequestParcel7 = (AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface17 instanceof pzz) {
                    } else {
                        new pzx(readStrongBinder17);
                    }
                }
                v(qvfVar8, adRequestParcel7, readString10);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface18 instanceof qvf) {
                    } else {
                        new qvd(readStrongBinder18);
                    }
                }
                z();
                parcel2.writeNoException();
                return true;
            case 31:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface19 instanceof qvf) {
                        qvfVar7 = (qvf) queryLocalInterface19;
                    } else {
                        qvfVar7 = new qvd(readStrongBinder19);
                    }
                }
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    if (queryLocalInterface20 instanceof pzq) {
                    } else {
                        new pzq(readStrongBinder20);
                    }
                }
                E(qvfVar7, parcel.createTypedArrayList(MediationConfigurationParcel.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface21 instanceof qvf) {
                        qvfVar6 = (qvf) queryLocalInterface21;
                    } else {
                        qvfVar6 = new qvd(readStrongBinder21);
                    }
                }
                AdRequestParcel adRequestParcel8 = (AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR);
                String readString11 = parcel.readString();
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface22 instanceof pzz) {
                    } else {
                        new pzx(readStrongBinder22);
                    }
                }
                x(qvfVar6, adRequestParcel8, readString11);
                parcel2.writeNoException();
                return true;
            case 33:
                C();
                parcel2.writeNoException();
                ecr.h(parcel2, null);
                return true;
            case 34:
                D();
                parcel2.writeNoException();
                ecr.h(parcel2, null);
                return true;
            case 35:
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 == null) {
                    qvfVar5 = null;
                } else {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface23 instanceof qvf) {
                        qvdVar7 = (qvf) queryLocalInterface23;
                    } else {
                        qvdVar7 = new qvd(readStrongBinder23);
                    }
                    qvfVar5 = qvdVar7;
                }
                AdSizeParcel adSizeParcel3 = (AdSizeParcel) ecr.a(parcel, AdSizeParcel.CREATOR);
                AdRequestParcel adRequestParcel9 = (AdRequestParcel) ecr.a(parcel, AdRequestParcel.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface24 instanceof pzz) {
                    } else {
                        new pzx(readStrongBinder24);
                    }
                }
                F(qvfVar5, adSizeParcel3, adRequestParcel9, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ecr.i(parcel2, null);
                return true;
            case 37:
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface25 instanceof qvf) {
                    } else {
                        new qvd(readStrongBinder25);
                    }
                }
                y();
                parcel2.writeNoException();
                return true;
        }
    }
}
