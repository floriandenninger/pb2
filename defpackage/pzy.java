package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pzy extends ecq implements pzz {
    private final qbm a;
    private final qbd b;

    public pzy() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // defpackage.pzz
    public final void a() {
        qbd qbdVar = this.b;
        if (qbdVar != null) {
            qvf a = qve.a(this.a);
            Parcel pn = qbdVar.pn();
            ecr.i(pn, a);
            qbdVar.pp(8, pn);
        }
    }

    @Override // defpackage.pzz
    public final void f() {
        qbd qbdVar = this.b;
        if (qbdVar != null) {
            qvf a = qve.a(this.a);
            Parcel pn = qbdVar.pn();
            ecr.i(pn, a);
            qbdVar.pp(6, pn);
        }
    }

    @Override // defpackage.pzz
    public final void g(int i) {
        qbd qbdVar = this.b;
        if (qbdVar != null) {
            qvf a = qve.a(this.a);
            Parcel pn = qbdVar.pn();
            ecr.i(pn, a);
            pn.writeInt(i);
            qbdVar.pp(9, pn);
        }
    }

    @Override // defpackage.pzz
    public final void h(AdErrorParcel adErrorParcel) {
    }

    @Override // defpackage.pzz
    public final void i() {
    }

    @Override // defpackage.pzz
    public final void j() {
        qbd qbdVar = this.b;
        if (qbdVar != null) {
            qvf a = qve.a(this.a);
            Parcel pn = qbdVar.pn();
            ecr.i(pn, a);
            qbdVar.pp(3, pn);
        }
    }

    @Override // defpackage.pzz
    public final void k() {
        qbd qbdVar = this.b;
        if (qbdVar != null) {
            qvf a = qve.a(this.a);
            Parcel pn = qbdVar.pn();
            ecr.i(pn, a);
            qbdVar.pp(4, pn);
        }
    }

    @Override // defpackage.pzz
    public final void l(String str, String str2) {
    }

    @Override // defpackage.pzz
    public final void m(pyx pyxVar, String str) {
    }

    public pzy(qbm qbmVar, qbd qbdVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        this.a = qbmVar;
        this.b = qbdVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qbe qbeVar;
        switch (i) {
            case 1:
                a();
                parcel2.writeNoException();
                return true;
            case 2:
                f();
                parcel2.writeNoException();
                return true;
            case 3:
                g(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
            case 8:
            case 11:
            case 15:
            case 20:
                parcel2.writeNoException();
                return true;
            case 5:
                k();
                parcel2.writeNoException();
                return true;
            case 6:
                j();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof qaa) {
                    } else {
                        new qaa(readStrongBinder);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                parcel.readString();
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (queryLocalInterface2 instanceof pyx) {
                    } else {
                        new pyx(readStrongBinder2);
                    }
                }
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 13:
                qbd qbdVar = this.b;
                if (qbdVar != null) {
                    qvf a = qve.a(this.a);
                    Parcel pn = qbdVar.pn();
                    ecr.i(pn, a);
                    qbdVar.pp(5, pn);
                }
                parcel2.writeNoException();
                return true;
            case 14:
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    qbeVar = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    if (queryLocalInterface3 instanceof qbe) {
                        qbeVar = (qbe) queryLocalInterface3;
                    } else {
                        qbeVar = new qbe(readStrongBinder3);
                    }
                }
                qbd qbdVar2 = this.b;
                if (qbdVar2 != null) {
                    qvf a2 = qve.a(this.a);
                    Parcel po = qbeVar.po(1, qbeVar.pn());
                    String readString = po.readString();
                    po.recycle();
                    Parcel po2 = qbeVar.po(2, qbeVar.pn());
                    int readInt = po2.readInt();
                    po2.recycle();
                    RewardItemParcel rewardItemParcel = new RewardItemParcel(readString, readInt);
                    Parcel pn2 = qbdVar2.pn();
                    ecr.i(pn2, a2);
                    ecr.g(pn2, rewardItemParcel);
                    qbdVar2.pp(7, pn2);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 18:
                qbd qbdVar3 = this.b;
                if (qbdVar3 != null) {
                    qvf a3 = qve.a(this.a);
                    Parcel pn3 = qbdVar3.pn();
                    ecr.i(pn3, a3);
                    qbdVar3.pp(11, pn3);
                }
                parcel2.writeNoException();
                return true;
            case 19:
                parcel2.writeNoException();
                return true;
            case 21:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 22:
                parcel.readInt();
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 23:
                parcel2.writeNoException();
                return true;
            case 24:
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
