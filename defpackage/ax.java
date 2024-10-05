package defpackage;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ax extends Binder implements ay {
    public final /* synthetic */ abu a;
    private Handler b;

    public ax() {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public ax(abu abuVar, byte[] bArr) {
        this.a = abuVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        switch (i) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                this.b.post(new acr(this, readInt));
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                this.b.post(new acs(this, 1));
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                }
                this.b.post(new acs(this, 0));
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                this.b.post(new acs(this, 2));
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                this.b.post(new bqc(1, (byte[]) null));
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
