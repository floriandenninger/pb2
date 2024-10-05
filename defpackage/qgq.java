package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgq extends ecq implements IInterface {
    final /* synthetic */ qgv a;

    public qgq() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgq(qgv qgvVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy");
        this.a = qgvVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                qvf a = qve.a(this.a);
                parcel2.writeNoException();
                ecr.i(parcel2, a);
                return true;
            case 2:
                this.a.i((Bundle) ecr.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                this.a.h((Bundle) ecr.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                this.a.e(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                long a2 = this.a.a();
                parcel2.writeNoException();
                parcel2.writeLong(a2);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(213880000);
                return true;
            case 7:
                this.a.g((Bundle) ecr.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                this.a.f((Bundle) ecr.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                this.a.j((Bundle) ecr.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
