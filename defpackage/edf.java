package defpackage;

import android.os.Parcel;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class edf extends ecq implements edg {
    public edf() {
        super("com.google.android.apps.gsa.publicsearch.IPublicSearchServiceSessionCallback");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a(parcel.createByteArray(), (SystemParcelableWrapper) ecr.a(parcel, SystemParcelableWrapper.CREATOR));
        return true;
    }
}
