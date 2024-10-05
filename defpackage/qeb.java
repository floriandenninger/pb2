package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qeb extends ecq implements IInterface {
    public qeb() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    public void a(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            throw new UnsupportedOperationException();
        }
        if (i != 2) {
            return false;
        }
        a(parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
