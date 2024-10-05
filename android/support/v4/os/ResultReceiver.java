package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.bg;
import defpackage.hs;
import defpackage.ht;
import defpackage.hu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bg(15);
    hu a;

    public ResultReceiver(Parcel parcel) {
        hu hsVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            hsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof hu)) {
                hsVar = new hs(readStrongBinder);
            } else {
                hsVar = (hu) queryLocalInterface;
            }
        }
        this.a = hsVar;
    }

    public void a() {
    }

    public final void b(int i, Bundle bundle) {
        hu huVar = this.a;
        if (huVar != null) {
            try {
                huVar.a(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new ht(this);
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}
