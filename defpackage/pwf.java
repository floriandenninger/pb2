package defpackage;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pwf extends ecq implements pwg {
    private final prh a;

    public pwf(prh prhVar, byte[] bArr, byte[] bArr2) {
        super("com.google.android.gms.ads.internal.client.IAdListener");
        this.a = prhVar;
    }

    @Override // defpackage.pwg
    public final void a() {
    }

    public pwf() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                prh prhVar = this.a;
                if (prhVar != null) {
                    prhVar.b();
                    break;
                }
                break;
            case 2:
                parcel.readInt();
                break;
            case 3:
                break;
            case 4:
                prh prhVar2 = this.a;
                if (prhVar2 != null) {
                    prhVar2.d();
                    break;
                }
                break;
            case 5:
                prh prhVar3 = this.a;
                if (prhVar3 != null) {
                    prhVar3.e();
                    break;
                }
                break;
            case 6:
                prh prhVar4 = this.a;
                if (prhVar4 != null) {
                    prhVar4.a();
                    break;
                }
                break;
            case 7:
                prh prhVar5 = this.a;
                if (prhVar5 != null) {
                    prhVar5.f();
                    break;
                }
                break;
            case 8:
                AdErrorParcel adErrorParcel = (AdErrorParcel) ecr.a(parcel, AdErrorParcel.CREATOR);
                prh prhVar6 = this.a;
                if (prhVar6 != null) {
                    prhVar6.c(adErrorParcel.b());
                    break;
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
