package defpackage;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdn extends Binder {
    private final Bundle a;

    public tdn(Bitmap bitmap) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (bitmap != null) {
            bundle.putParcelable("bitmap", bitmap);
        }
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            if (parcel2 != null) {
                parcel2.writeNoException();
                parcel2.writeBundle(this.a);
                return true;
            }
            i = 1;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
