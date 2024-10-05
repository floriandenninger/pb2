package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ht extends Binder implements hu {
    final /* synthetic */ ResultReceiver a;

    public ht() {
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // defpackage.hu
    public final void a(int i, Bundle bundle) {
        this.a.a();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public ht(ResultReceiver resultReceiver) {
        this.a = resultReceiver;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
